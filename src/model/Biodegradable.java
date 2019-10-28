package model;
public class Biodegradable extends Waste implements Usable{
    
    // Atributes
    private boolean canComposting;

    // Constructor
    public Biodegradable(String id, String name, String origin, String color, int decomp_time, Product newProduct, boolean canComposting) {
        super(id, name, origin, color, decomp_time, newProduct);
        this.canComposting = canComposting;
    }

    // Getters & Setters
    /**
     * @return boolean that indicates if the waste can do composting.
     */
    public boolean getCanComposting() {
        return this.canComposting;
    }

    /**
     * @param canComposting is a boolean that corresponds to the canComposting to set.
     */
    public void setCanComposting(boolean canComposting) {
        this.canComposting = canComposting;
    }

    // Methods
    /**
     * This method calculates the nocive effect of a biodegradable waste.
     * <b>pre:</b> The "calcNociveEffect" method has already been created in Waste class.
     * <b>post:</b> It is known the value of the nocive effect of a waste.
     * @return double that corresponds to the nocive effect of the waste.
     */
    public double calcNociveEffect() {
        double nocive_effect = super.calcNociveEffect();
        nocive_effect -= (nocive_effect*0.01);
        return nocive_effect;
    }

    /**
     * This method determines if a biodegradable waste is usable or not.
     * @return boolean that indicates if the waste is usable or not.
     */
    public boolean isUsable() {
        boolean isUsable = false;
        if (super.getDecomp_time()<365 && canComposting==true)
            isUsable = true;
        return isUsable;
    }

}