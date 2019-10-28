package model;
public class Product {

    // Relations
    private Waste[] wastes;

    // Atributes
    private String id, name, description;

    // Constructor
    public Product(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        wastes = new Waste[0];
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

    /**
     * @return Waste[] that corresponds to the associated wastes.
     */
    public Waste[] getWastes() {
        return wastes;
    }

    /**
     * @param newWastes is a Waste[] that corresponds to the wastes to set.
     */
    public void setWastes(Waste[] newWastes) {
        wastes = newWastes;
    }

    // Methods
    public void addWaste(Waste newWaste) {
        Waste[] newWasteArray = new Waste[wastes.length+1];
        for (int i = 0; i<wastes.length; i++) {
            newWasteArray[i] = wastes[i];
        }
        newWasteArray[wastes.length] = newWaste;
        wastes = newWasteArray;
    }

}