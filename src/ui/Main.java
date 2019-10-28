package ui;
import model.*;
import java.util.Scanner;
public class Main {

    Scanner lectorstr, lectorint;
    private Reciclamos recycle;

    public Main () {
        lectorstr = new Scanner(System.in);
        lectorint = new Scanner(System.in);
        recycle = new Reciclamos();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        int cicle = 0;
        while(cicle==0) {
            System.out.println("\nMenu:\n1.Add product.\n2.Add waste.\n3.Show wastes by type.\n4.Search waste info by name.\n5.Search product info by id.\n6.Show registered products.\n7.Know if a biodegradable or recyclable waste is usable.\n8.List wastes of a product ordered by its nocive effect.");
            int op = obj.lectorint.nextInt();
            switch(op) {
                case 1:
                    obj.addProduct();
                    break;
                case 2:
                    obj.addWaste();
                    break;
                case 3:
                    System.out.println(obj.recycle.showAllWastesByType());
                    break;
                case 4:
                    obj.searchWasteInfoByName();
                    break;
                case 5:
                    obj.searchProductInfoById();
                    break;
                case 6:
                    obj.showAllProducts();
                    break;
                case 7:
                    obj.wasteIsUsable();
                    break;
                case 8:
                    obj.listWastesOfAProductInOrderOfItsNociveEffect();
                    break;
            }
        }
    }

    /**
     * This method asks for the atributes of a product, to pass them to a method in Reciclamos class in order to create a new Product.
     * <b>pre:</b> An object of type Main has already been created, as well as the "addProduct" method in the Reciclamos class.
     * <b>post:</b> The information typed by the user hass been correctly passed to the method in Reciclamos class.
     */
    public void addProduct() {
        System.out.println("\nProduct id:");
        String pid = lectorstr.nextLine();
        System.out.println("Product name:");
        String pname = lectorstr.nextLine();
        System.out.println("Product description:");
        String pdescription = lectorstr.nextLine();
        recycle.addProduct(pid, pname, pdescription);
    }

    /**
     * This method asks for the atributes of a product, and receives the atributes of a biodegradable waste to pass them to a method in Reciclamos class in order to create a new Product and Waste and then associate them.
     * <b>pre:</b> An object of type Main has already been created, as well as the "addProduct" method in the Reciclamos class.
     * <b>post:</b> The information typed by the user hass been correctly passed to the method in Reciclamos class.
     */
    public void addProduct (String wid, String wname, String worigin, String wcolor, int wdecomp_time, boolean canComposting) {
        System.out.println("\nProduct id:");
        String pid = lectorstr.nextLine();
        System.out.println("Product name:");
        String pname = lectorstr.nextLine();
        System.out.println("Product description:");
        String pdescription = lectorstr.nextLine();
        recycle.addProduct(pid, pname, pdescription, wid, wname, worigin, wcolor, wdecomp_time, canComposting);
    }

    /**
     * This method asks for the atributes of a product, and receives the atributes of an inert waste to pass them to a method in Reciclamos class in order to create a new Product and Waste and then associate them.
     * <b>pre:</b> An object of type Main has already been created, as well as the "addProduct" method in the Reciclamos class.
     * <b>post:</b> The information typed by the user hass been correctly passed to the method in Reciclamos class.
     */
    public void addProduct (String wid, String wname, String worigin, String wcolor, int wdecomp_time, String advice) {
        System.out.println("\nProduct id:");
        String pid = lectorstr.nextLine();
        System.out.println("Product name:");
        String pname = lectorstr.nextLine();
        System.out.println("Product description:");
        String pdescription = lectorstr.nextLine();
        recycle.addProduct(pid, pname, pdescription, wid, wname, worigin, wcolor, wdecomp_time, advice);
    }

    /**
     * This method asks for the atributes of a product, and receives the atributes of a recyclable waste to pass them to a method in Reciclamos class in order to create a new Product and Waste and then associate them.
     * <b>pre:</b> An object of type Main has already been created, as well as the "addProduct" method in the Reciclamos class.
     * <b>post:</b> The information typed by the user hass been correctly passed to the method in Reciclamos class.
     */
    public void addProduct (String wid, String wname, String worigin, String wcolor, int wdecomp_time, String type, String wdescription) {
        System.out.println("\nProduct id:");
        String pid = lectorstr.nextLine();
        System.out.println("Product name:");
        String pname = lectorstr.nextLine();
        System.out.println("Product description:");
        String pdescription = lectorstr.nextLine();
        recycle.addProduct(pid, pname, pdescription, wid, wname, worigin, wcolor, wdecomp_time, type, wdescription);
    }

    /**
     * This method asks for the atributes of a waste, to pass them to a method in Reciclamos class in order to create a new Waste.
     * <b>pre:</b> An object of type Main has already been created, as well as the "addWaste" method in the Reciclamos class.
     * <b>post:</b> The information typed by the user hass been correctly passed to the method in Reciclamos class.
     */
    public void addWaste () {
        System.out.println("\nType of waste:\n1.Biodegradable.\n2.Inert.\n3.Recyclable.");
        int typeWaste = lectorint.nextInt();
        System.out.println("Waste id:");
        String wid = lectorstr.nextLine();
        System.out.println("Waste name:");
        String wname = lectorstr.nextLine();
        System.out.println("Origin:\nIND: Industrials.\nDOM: Domiciliaries.\nMUN: Municipals.\nCON: Construction.\nHOS: Hospitalaries.");
        String worigin = lectorstr.nextLine();
        worigin = worigin.toUpperCase();
        System.out.println("Waste color:");
        String wcolor = lectorstr.nextLine();
        System.out.println("Waste decomposition time: (days)");
        int wdecomp_time = lectorint.nextInt();
        if (typeWaste==1) {
            System.out.println("Can make composting?(y/n)");
            boolean canComposting = false;
            String y_n = lectorstr.nextLine();
            if (y_n.equals("y")) {canComposting = true;}
            System.out.println("Do you want to associate it with an existing product or create a new one?\n1.Existent.\n2.Create a new one.");
            int ex_nw = lectorint.nextInt();
            if (ex_nw==1) {
                if (recycle.showAllProducts().equals("No products found")) {
                    System.out.println(recycle.showAllProducts());
                    ex_nw = 2;
                }
                else {
                    System.out.println("To which product do you want to associate it?"+recycle.showAllProducts());
                    int product_position = lectorint.nextInt()-1;
                    recycle.addWaste(wid, wname, worigin, wcolor, wdecomp_time, product_position, canComposting);
                }
            }
            if (ex_nw==2) {
                addProduct(wid, wname, worigin, wcolor, wdecomp_time, canComposting);
            }  
        }
        if (typeWaste==2) {
            System.out.println("Advice to reduce usage:");
            String advice = lectorstr.nextLine();
            System.out.println("Do you want to associate it with an existing product or create a new one?\n1.Existent.\n2.Create a new one.");
            int ex_nw = lectorint.nextInt();
            if (ex_nw==1) {
                if (recycle.showAllProducts().equals("No products found")) {
                    System.out.println(recycle.showAllProducts());
                    ex_nw = 2;
                }
                else {
                    System.out.println("To which product do you want to associate it?"+recycle.showAllProducts());
                    int product_position = lectorint.nextInt()-1;
                    recycle.addWaste(wid, wname, worigin, wcolor, wdecomp_time, product_position, advice);
                }
            }
            if (ex_nw==2) {
                addProduct(wid, wname, worigin, wcolor, wdecomp_time, advice);
            }  
        }
        if (typeWaste==3) {
            System.out.println("Type of recyclable:\nPAP: Paper.\nCAR: Cardboard.\nGLS: Glass.\nPLS: Plastic.\nMET: Metal.");
            String type = lectorstr.nextLine();
            type = type.toUpperCase();
            System.out.println("description:");
            String wdescription = lectorstr.nextLine();
            System.out.println("Do you want to associate it with an existing product or create a new one?\n1.Existent.\n2.Create a new one.");
            int ex_nw = lectorint.nextInt();
            if (ex_nw==1) {
                if (recycle.showAllProducts().equals("No products found")) {
                    System.out.println(recycle.showAllProducts());
                    ex_nw = 2;
                }
                else {
                    System.out.println("To which product do you want to associate it?"+recycle.showAllProducts());
                    int product_position = lectorint.nextInt()-1;
                    recycle.addWaste(wid, wname, worigin, wcolor, wdecomp_time, product_position, type, wdescription);
                }
            }
            if (ex_nw==2) {
                addProduct(wid, wname, worigin, wcolor, wdecomp_time, type, wdescription);
            }  
        }
    }

    /**
     * This method asks for the name of a waste, in order to display its info on screen.
     * <b>pre:</b> An object of type Main has already been created, as well as the "searchWasteByName" method in the Reciclamos class.
     * <b>post:</b> The information of the desired waste shows on screen.
     */
    public void searchWasteInfoByName() {
        System.out.println("\nWaste name:");
        String wasteName = lectorstr.nextLine();
        if (recycle.searchWasteByName(wasteName) != null) {
            System.out.println("\n"+recycle.infoWaste(recycle.searchWasteByName(wasteName)));
        }
        else {
            System.out.println("\nWaste not found.");
        }
    }

    /**
     * This method asks for the id of a product, in order to display its info on screen.
     * <b>pre:</b> An object of type Main has already been created, as well as the "searchProductById" method in the Reciclamos class.
     * <b>post:</b> The information of the desired product shows on screen.
     */
    public void searchProductInfoById() {
        System.out.println("\nProduct id:");
        String productId = lectorstr.nextLine();
        if (recycle.searchProductById(productId) != null) {
            System.out.println("\n"+recycle.infoProduct(recycle.searchProductById(productId)));
        }
        else {
            System.out.println("\nProduct not found.");
        }
    }

    /**
     * This method shows all the products that have been registered.
     * <b>pre:</b> The "showAllProducts" method in the Reciclamos class.
     * <b>post:</b> The registered products are shown on screen.
     */
    public void showAllProducts() {
        String msj = recycle.showAllProducts();
        int cantProducts = recycle.cantProducts();
        for (int i = 0; i<cantProducts; i++) {
            String num = (i+1)+".";
            msj = msj.replace(num, "*");
        }
        System.out.println("\n---REGISTERED PRODUCTS---"+msj);
    }

    /**
     * This method asks the user to select a waste in order to know if it is usable.
     * <b>pre:</b> An object of type Main has already been created, as well as the "wasteIsUsable" method in the Reciclamos class.
     * <b>post:</b> It is known if the waste is usable or not.
     */
    public void wasteIsUsable() {
        System.out.println("\nBiodegradable & Recyclable wastes:"+recycle.showBioRecWastes());
        int num_waste = lectorint.nextInt();
        String[] parts = recycle.showBioRecWastes().split(". ");
        if (parts[num_waste].contains("\n")) {
            String[] wasteName = parts[num_waste].split("\n");
            System.out.println("\n"+recycle.wasteIsUsable(recycle.searchWasteByName(wasteName[0])));
        }
        else {
            System.out.println("\n"+recycle.wasteIsUsable(recycle.searchWasteByName(parts[num_waste])));
        }
    }

    /**
     * This method asks the user to select a product in order to list its wastes in order of its nocive effect.
     * <b>pre:</b> An object of type Main has already been created, as well as the "listWastesOfAProductInOrderOfItsNociveEffect" method in the Reciclamos class.
     * <b>post:</b> The associated wastes are shown on screen ordered.
     */
    public void listWastesOfAProductInOrderOfItsNociveEffect() {
        System.out.println("\nSelect a product:"+recycle.showAllProducts());
        int product_position = lectorint.nextInt()-1;
        System.out.println(recycle.listWastesOfAProductInOrderOfItsNociveEffect(product_position));
    }
}