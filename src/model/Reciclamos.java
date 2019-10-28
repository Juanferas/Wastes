package model;
public class Reciclamos {

    // Relations
    private Product[] allProducts;
    private Waste[] allWastes;

    // Constructor
    public Reciclamos() {
        allProducts = new Product[0];
        allWastes = new Waste[0];
    }

    // Methods
    /**
     * This method modifies "allProducts" array in order to create and add a new product.
     * <b>pre:</b> An array that stores all the products has already been created.
     * <b>post:</b> A new product has been created and added to the array.
     * @param id is a String that corresponds to the id of a product.
     * @param name is a String that corresponds to the name of a product.
     * @param description is a String that corresponds to the description of a product.
     */
    public void addProduct(String id, String name, String description) {
        Product newAllProducts[] = new Product[allProducts.length + 1];
        for (int i = 0; i<allProducts.length; i++) {
            newAllProducts[i] = allProducts[i];
        }
        newAllProducts[allProducts.length] = new Product(id, name, description);
        allProducts = newAllProducts;
    }

    /**
     * This method modifies "allProducts" array in order to create and add a new product, and also passes the atributes of a biodegradable waste to the "addWaste" method.
     * <b>pre:</b> An array that stores all the products has already been created, as well as the "addWaste" method.
     * <b>post:</b> A new product has been created and added to the array, and the abributes of the waste have been correctly passed to the method.
     * @param id is a String that corresponds to the id of a product.
     * @param name is a String that corresponds to the name of a product.
     * @param description is a String that corresponds to the description of a product.
     * @param wid is a String that corresponds to the id of a waste.
     * @param wname is a String that corresponds to the name of a waste.
     * @param worigin is a String that corresponds to the origin of a waste.
     * @param wcolor is a String that corresponds to the color of a waste.
     * @param wdecomp_time is an int that corresponds to the decomposition time of a waste.
     * @param canComposting is a boolean that indicates if the waste can do composting or not.
     */
    public void addProduct(String id, String name, String description, String wid, String wname, String worigin, String wcolor, int wdecomp_time, boolean canComposting) {
        Product newAllProducts[] = new Product[allProducts.length + 1];
        for (int i = 0; i<allProducts.length; i++) {
            newAllProducts[i] = allProducts[i];
        }
        newAllProducts[allProducts.length] = new Product(id, name, description);
        allProducts = newAllProducts;
        addWaste(wid, wname, worigin, wcolor, wdecomp_time, (newAllProducts.length - 1), canComposting);
    }

    /**
     * This method modifies "allProducts" array in order to create and add a new product, and also passes the atributes of a inert waste to the "addWaste" method.
     * <b>pre:</b> An array that stores all the products has already been created, as well as the "addWaste" method.
     * <b>post:</b> A new product has been created and added to the array, and the abributes of the waste have been correctly passed to the method.
     * @param id is a String that corresponds to the id of a product.
     * @param name is a String that corresponds to the name of a product.
     * @param description is a String that corresponds to the description of a product.
     * @param wid is a String that corresponds to the id of a waste.
     * @param wname is a String that corresponds to the name of a waste.
     * @param worigin is a String that corresponds to the origin of a waste.
     * @param wcolor is a String that corresponds to the color of a waste.
     * @param wdecomp_time is an int that corresponds to the decomposition time of a waste.
     * @param advice is a String that corresponds to an advice to reduce the usage of an inert waste.
     */
    public void addProduct(String id, String name, String description, String wid, String wname, String worigin, String wcolor, int wdecomp_time, String advice) {
        Product newAllProducts[] = new Product[allProducts.length + 1];
        for (int i = 0; i<allProducts.length; i++) {
            newAllProducts[i] = allProducts[i];
        }
        newAllProducts[allProducts.length] = new Product(id, name, description);
        allProducts = newAllProducts;
        addWaste(wid, wname, worigin, wcolor, wdecomp_time, (newAllProducts.length - 1), advice);
    }

    /**
     * This method modifies "allProducts" array in order to create and add a new product, and also passes the atributes of a recyclable waste to the "addWaste" method.
     * <b>pre:</b> An array that stores all the products has already been created, as well as the "addWaste" method.
     * <b>post:</b> A new product has been created and added to the array, and the abributes of the waste have been correctly passed to the method.
     * @param id is a String that corresponds to the id of a product.
     * @param name is a String that corresponds to the name of a product.
     * @param description is a String that corresponds to the description of a product.
     * @param wid is a String that corresponds to the id of a waste.
     * @param wname is a String that corresponds to the name of a waste.
     * @param worigin is a String that corresponds to the origin of a waste.
     * @param wcolor is a String that corresponds to the color of a waste.
     * @param wdecomp_time is an int that corresponds to the decomposition time of a waste.
     * @param type is a String that corresponds to the type of a recyclable waste.
     * @param wdescription is a String that corresponds to the description of a recyclable waste.
     */
    public void addProduct(String id, String name, String description, String wid, String wname, String worigin, String wcolor, int wdecomp_time, String type, String wdescription) {
        Product newAllProducts[] = new Product[allProducts.length + 1];
        for (int i = 0; i<allProducts.length; i++) {
            newAllProducts[i] = allProducts[i];
        }
        newAllProducts[allProducts.length] = new Product(id, name, description);
        allProducts = newAllProducts;
        addWaste(wid, wname, worigin, wcolor, wdecomp_time, (newAllProducts.length - 1), type, wdescription);
    }

    /**
     * This method modifies "allWastes" array in order to create and add a new biodegradable waste.
     * <b>pre:</b> An array that stores all the wastes has already been created.
     * <b>post:</b> A new waste has been created and added to the array.
     * @param id is a String that corresponds to the id of a waste.
     * @param name is a String that corresponds to the name of a waste.
     * @param origin is a String that corresponds to the origin of a waste.
     * @param color is a String that corresponds to the color of a waste.
     * @param decomp_time is an int that corresponds to the decomposition time of a waste.
     * @param product_position is an int that corresponds to the position of a product in the "allProducts" array.
     * @param canComposting is a boolean that indicates if the waste can do composting or not.
     */
    public void addWaste (String id, String name, String origin, String color, int decomp_time, int product_position, boolean canComposting) {
        Waste newAllWastes[] = new Waste[allWastes.length + 1];
        for (int i = 0; i<allWastes.length; i++) {
            newAllWastes[i] = allWastes[i];
        }
        newAllWastes[allWastes.length] = new Biodegradable(id, name, origin, color, decomp_time, allProducts[product_position], canComposting);
        allProducts[product_position].addWaste(newAllWastes[allWastes.length]);
        allWastes = newAllWastes;
    }

    /**
     * This method modifies "allWastes" array in order to create and add a new inert waste.
     * <b>pre:</b> An array that stores all the wastes has already been created.
     * <b>post:</b> A new waste has been created and added to the array.
     * @param id is a String that corresponds to the id of a waste.
     * @param name is a String that corresponds to the name of a waste.
     * @param origin is a String that corresponds to the origin of a waste.
     * @param color is a String that corresponds to the color of a waste.
     * @param decomp_time is an int that corresponds to the decomposition time of a waste.
     * @param product_position is an int that corresponds to the position of a product in the "allProducts" array.
     * @param advice is a String that corresponds to an advice to reduce the usage of a inert waste.
     */
    public void addWaste (String id, String name, String origin, String color, int decomp_time, int product_position, String advice) {
        Waste newAllWastes[] = new Waste[allWastes.length + 1];
        for (int i = 0; i<allWastes.length; i++) {
            newAllWastes[i] = allWastes[i];
        }
        newAllWastes[allWastes.length] = new Inert(id, name, origin, color, decomp_time, allProducts[product_position], advice);
        allProducts[product_position].addWaste(newAllWastes[allWastes.length]);
        allWastes = newAllWastes;
    }

    /**
     * This method modifies "allWastes" array in order to create and add a new recyclable waste.
     * <b>pre:</b> An array that stores all the wastes has already been created.
     * <b>post:</b> A new waste has been created and added to the array.
     * @param id is a String that corresponds to the id of a waste.
     * @param name is a String that corresponds to the name of a waste.
     * @param origin is a String that corresponds to the origin of a waste.
     * @param color is a String that corresponds to the color of a waste.
     * @param decomp_time is an int that corresponds to the decomposition time of a waste.
     * @param product_position is an int that corresponds to the position of a product in the "allProducts" array.
     * @param type is a String that corresponds to the type of a recyclable waste.
     * @param wdescription is a String that corresponds to the description of a recyclable waste.
     */
    public void addWaste (String id, String name, String origin, String color, int decomp_time, int product_position, String type, String description) {
        Waste newAllWastes[] = new Waste[allWastes.length + 1];
        for (int i = 0; i<allWastes.length; i++) {
            newAllWastes[i] = allWastes[i];
        }
        newAllWastes[allWastes.length] = new Recyclable(id, name, origin, color, decomp_time, allProducts[product_position], type, description);
        allProducts[product_position].addWaste(newAllWastes[allWastes.length]);
        allWastes = newAllWastes;
    }

    /**
     * This method searchs all the products that have been registered and add their names to a String.
     * <b>pre:</b> An array that stores all the products has already been created.
     * <b>post:</b> The name of the registered products are stored in a String.
     * @return String that contains the names of all the registered products.
     */
    public String showAllProducts() {
        String msj = "";
        for (int i = 0; i < allProducts.length; i++) {
            msj += "\n"+(i+1)+". "+allProducts[i].getName();
        }
        if (allProducts.length==0) {
            msj += "No products found";
        }
        return msj;
    }

    /**
     * This method stores the values of the attributes of a given waste in a String.
     * <b>pre:</b> Getters and setters of the attributes of Waste have already been created.
     * <b>post:</b> The info of a given waste has been stored in a String.
     * @param wasteForInfo is the Waste which we want to know its info. 
     * @return String that contains the info of the desired waste.
     */
    public String infoWaste(Waste wasteForInfo) {
        String info = "* id: " +wasteForInfo.getId()+" - name: "+wasteForInfo.getName()+" - origin: "+wasteForInfo.getOrigin()+" - color: "+wasteForInfo.getColor()+" - decomposistion time: "+wasteForInfo.getDecomp_time()+" days - associated product: "+wasteForInfo.getProduct().getName()+"(id: "+wasteForInfo.getProduct().getId()+" - description: "+wasteForInfo.getProduct().getDescription()+")\n";
        return info;
    }

    /**
     * This method stores the values of the attributes of a given product in a String.
     * <b>pre:</b> Getters and setters of the attributes of Product have already been created.
     * <b>post:</b> The info of a given prouct has been stored in a String.
     * @param productForInfo is the Product which we want to know its info. 
     * @return String that contains the info of the desired product.
     */
    public String infoProduct(Product productForInfo) {
        String info = "* id: " +productForInfo.getId()+" - name: "+productForInfo.getName()+" - description: "+productForInfo.getDescription();
        return info;
    }

    /**
     * This method searchs all the wastes that have been registered and add their names organized by their type of wate to a String.
     * <b>pre:</b> An array that stores all the wastes has already been created.
     * <b>post:</b> The name of the registered wastes are stored and organized in a String.
     * @return String that contains the names of all the registered wastes organized by type.
     */
    public String showAllWastesByType() {
        String msj = "";
        String biodegradableWastes = "---BIODEGRADABLES---\n";
        String inertWastes = "---INERTS---\n";
        String recyclableWastes = "---RECYCLABLES---\n";
        for (int i = 0; i<allWastes.length; i++) {
            if (allWastes[i] instanceof Biodegradable) {
                biodegradableWastes += infoWaste(allWastes[i]);
            }
            else if (allWastes[i] instanceof Inert) {
                inertWastes += infoWaste(allWastes[i]);
            }
            else if (allWastes[i] instanceof Recyclable) {
                recyclableWastes += infoWaste(allWastes[i]);
            }
        }
        if (biodegradableWastes.equals("---BIODEGRADABLES---\n")) {
            biodegradableWastes += "* No biodegradable wastes found.\n";
        }
        if (inertWastes.equals("---INERTS---\n")) {
            inertWastes += "* No inert wastes found.\n";
        }
        if (recyclableWastes.equals("---RECYCLABLES---\n")) {
            recyclableWastes += "* No recyclable wastes found.\n";
        }
        msj = "\n"+biodegradableWastes+"\n"+inertWastes+"\n"+recyclableWastes;
        return msj;
    }

    /**
     * This method compares a given name with the ones of the existent wastes in order to find a match and return the found waste.
     * <b>pre:</b> An array that stores all the wastes has already been created.
     * <b>post:</b> A waste with the given name is found.
     * @param name is a string that corresponds to the name of a waste.
     * @return Waste that matches the given name.
     */
    public Waste searchWasteByName(String name) {
        Waste foundWaste = null;
        for (int i = 0; i <allWastes.length; i++) {
            if (allWastes[i].getName().equals(name)) {
                foundWaste = allWastes[i];
            }
        }
        return foundWaste;
    }
    
    /**
     * This method compares a given id with the ones of the existent products in order to find a match and return the found product.
     * <b>pre:</b> An array that stores all the products has already been created.
     * <b>post:</b> A product with the given id is found.
     * @param id is a string that corresponds to the id of a product.
     * @return Product that matches the given id.
     */
    public Product searchProductById(String id) {
        Product foundProduct = null;
        for (int i = 0; i <allProducts.length; i++) {
            if (allProducts[i].getId().equals(id)) {
                foundProduct = allProducts[i];
            }
        }
        return foundProduct;
    }

    /**
     * This method determines the number of products that have been created.
     * <b>pre:</b> An array that stores all the products has already been created.
     * <b>post:</b> The length of the array is determined.
     * @return int that indicates the number of products that have been created.
     */
    public int cantProducts() {
        return allProducts.length;
    }

    /**
     * This method searchs all the biodegradable and recyclable wastes that have been registered and add their names to a String.
     * <b>pre:</b> An array that stores all the wastes has already been created.
     * <b>post:</b> The name of the biodegradable and recyclable wastes are stored in a String.
     * @return String that contains the names of all the biodegradable and recyclable wastes.
     */
    public String showBioRecWastes() {
        String msj = "";
        int num = 1;
        for (int i = 0; i < allWastes.length; i++) {
            if (allWastes[i] instanceof Biodegradable || allWastes[i] instanceof Recyclable) {
                msj += "\n"+num+". " + allWastes[i].getName();
                num++;
            }
        }
        return msj;
    }

    /**
     * This method determines if a biodegradable or recyclable waste is usable or not.
     * <b>pre:</b> The method "isUsable" has already been implemented in Biodegradable and Recyclable classes.
     * <b>post:</b> It is known if the waste is usable or not.
     * @param pwaste is the waste which we want to know if it is usable.
     * @return String that indicates if the given waste is usable or not.
     */
    public String wasteIsUsable(Waste pwaste) {
        String msj = "";
        if ((pwaste instanceof Biodegradable && ((Biodegradable)pwaste).isUsable()==true) || (pwaste instanceof Recyclable && ((Recyclable)pwaste).isUsable()==true)) {
            msj = pwaste.getName()+" is usable.";
        }
        else {
            msj = pwaste.getName()+" is not usable.";
        }
        return msj;
    }

    /**
     * This method list the wastes of a given product and order them acording to their nocive effect.
     * <b>pre:</b> An array that stores all the products has already been created.
     * <b>post:</b> The name and nocive effect of the wastes associated to a product are stored in a String.
     * @param product_position is an int that corresponds to the position of the we want to list its wastes.
     * @return String that contains the wastes of a product ordered.
     */
    public String listWastesOfAProductInOrderOfItsNociveEffect(int product_position) {
        Waste temp;
        for (int i = 0; i<allProducts[product_position].getWastes().length; i++) {
            for (int j = i+1; j<allProducts[product_position].getWastes().length; j++) {
                if (allProducts[product_position].getWastes()[i].calcNociveEffect()<allProducts[product_position].getWastes()[j].calcNociveEffect()) {
                    temp = allProducts[product_position].getWastes()[i];
                    allProducts[product_position].getWastes()[i] = allProducts[product_position].getWastes()[j];
                    allProducts[product_position].getWastes()[j] = temp;
                }
            }
        }
        String wastes_nocive_effects = "\n---ASSOCIATED WASTES ORDERED BY ITS NOCIVE EFFECT---";
        for (int i = 0; i < allProducts[product_position].getWastes().length; i++) {
            wastes_nocive_effects += "\n* "+allProducts[product_position].getWastes()[i].getName()+" - nocive effect = "+allProducts[product_position].getWastes()[i].calcNociveEffect();
        }
        return wastes_nocive_effects;
    }
}