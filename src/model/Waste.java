package model;
public abstract class Waste {

    // Relations
    private Product newProduct;

    // Constants
    public static final String IND = "Industrials";
    public static final String DOM = "Domiciliaries";
    public static final String MUN = "Municipals";
    public static final String CON = "Construction";
    public static final String HOS = "Hospitalaries";

    // Atributes
    private String id, name, origin, color;
    private int decomp_time;

    // Constructor
    public Waste(String id, String name, String origin, String color, int decomp_time, Product newProduct) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.color = color;
        this.decomp_time = decomp_time;
        this.newProduct = newProduct;
    }

    // Getters & Setters
    /**
     * @return String that corresponds to the id.
     */
    public String getId() {
        return this.id;
    }

    /**
     * @param id is a String that corresponds to the id to set.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return String that corresponds to the name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name is a String that corresponds to the name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String that corresponds to the origin.
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @param origin is a String that corresponds to the origin to set.
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * @return String that corresponds to the color.
     */
    public String getColor() {
        return this.color;
    }

    /**
     * @param color is a String that corresponds to the color to set.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return int that corresponds to the decomposition time.
     */
    public int getDecomp_time() {
        return this.decomp_time;
    }

    /**
     * @param decomp_time is an int that corresponds to the decomposition time to set.
     */
    public void setDecomp_time(int decomp_time) {
        this.decomp_time = decomp_time;
    }

    /**
     * @return Product that corresponds to the associated product.
     */
    public Product getProduct() {
        return this.newProduct;
    }

    /**
     * @param newProduct is a Product that corresponds to the product to set.
     */
    public void setProduct(Product newProduct) {
        this.newProduct = newProduct;
    }

    // Methods
    public double calcNociveEffect() {
        double nocive_effect = 0;
        if (origin.equalsIgnoreCase("Ind"))
            nocive_effect = decomp_time*0.1;
        else if (origin.equalsIgnoreCase("Dom"))
            nocive_effect = decomp_time*0.05;
        else if (origin.equalsIgnoreCase("Con"))
            nocive_effect = decomp_time*0.08;
        else if (origin.equalsIgnoreCase("Mun"))
            nocive_effect = decomp_time*0.12;
        else if (origin.equalsIgnoreCase("Hos"))
            nocive_effect = decomp_time*0.15;
        return nocive_effect;
    }
}