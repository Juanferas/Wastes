package model;
public class Recyclable extends Waste implements Usable{

    // Constants
    public static final String PAP = "Paper";
    public static final String CAR = "Cardboard";
    public static final String GLS = "Glass";
    public static final String PLS = "Plastic";
    public static final String MET = "Metals";

    // Atributes
    private String type;
    private String description;

    // Constructor
    public Recyclable(String id, String name, String origin, String color, int decomp_time, Product newProduct, String type, String description) {
        super(id, name, origin, color, decomp_time, newProduct);
        this.type = type;
        this.description = description;
    }

    // Getters & Setters
    /**
     * @return String that corresponds to the type.
     */
    public String getType() {
        return this.type;
    }

    /**
     * @param type is a String that corresponds to the type to set.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return String that corresponds to the description.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @param description is a String that corresponds to the description to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    // Methods
    /**
     * This method calculates the nocive effect of a recyclable waste.
     * <b>pre:</b> The "calcNociveEffect" method has already been created in Waste class.
     * <b>post:</b> It is known the value of the nocive effect of a waste.
     * @return double that corresponds to the nocive effect of the waste.
     */
    public double calcNociveEffect() {
        double nocive_effect = super.calcNociveEffect();
        nocive_effect -= (nocive_effect*0.02);
        return nocive_effect;
    }

    /**
     * This method determines if a recyclable waste is usable or not.
     * @return boolean that indicates if the waste is usable or not.
     */
    public boolean isUsable() {
        boolean isUsable = false;
        if (description!=null)
            isUsable = true;
        return isUsable;
    }
}