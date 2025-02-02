class Pet
    {
    // Instance variable to hold the pet's name
    private String name;

    // Constructor to initialize the pet's name
    public Pet(String name) {
        this.name = name;
    }

    // Method to display pet information
    public void displayInfo() {
        System.out.println("Pet information: He's a Mini Golden-doodle. Very playful and loves everyone. He tries to act like a big dog but he's not. He looks like a cute little teddy bear, and he is almost 2 years old in human years. He understands human emotions, and he helps me alot through rough patches. I love my dog Major Payne. ");
        System.out.println("Name: " + name);
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of the Pet class
        Pet myPet = new Pet("Major Payne");

        // Display the pet's information
        myPet.displayInfo();
    }
}