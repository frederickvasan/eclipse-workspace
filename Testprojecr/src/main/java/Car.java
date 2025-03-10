public class Car extends Vehicle {
    private int numDoors;
    private String transmission;
    
    // Constructor with all parameters
    public Car(String brand, String model, int year, String color, 
               int numDoors, String transmission) {
        super(brand, model, year, color); // Calls parent class constructor
        this.numDoors = numDoors;
        this.transmission = transmission;
    }
    
    // Constructor with fewer parameters, chains to the full constructor
    public Car(String brand, String model, int year) {
        this(brand, model, year, "Unknown", 4, "Automatic");
    }
    
    // Default constructor
    public Car() {
        this("Unknown", "Unknown", 2024);
    }
    
    // Override displayInfo to include car-specific details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numDoors);
        System.out.println("Transmission: " + transmission);
    }
} 