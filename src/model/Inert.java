package model;
public class Inert extends Waste {

    // Atributes
    private String advice;

    // Constructor
    public Inert(String id, String name, String origin, String color, int decomp_time, Product newProduct, String advice) {
        super(id, name, origin, color, decomp_time, newProduct);
        this.advice = advice;
    }

    // Getters & Setters
    /**
     * @return String that corresponds to the advice.
     */
    public String getAdvice() {
        return this.advice;
    }

    /**
     * @param advice is a String that corresponds to the advice to set.
     */
    public void setAdvice(String advice) {
        this.advice = advice;
    }
}