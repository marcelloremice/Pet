public class Pet {
    //blueprint
    private String name;

    // Constructor to initialize the pet's name
    public Pet(String name) {
        this.name = name;
    }

    // Method to display pet information
    public void displayInfo() {
        System.out.println("Pet information: ");
        System.out.println("Name: " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}