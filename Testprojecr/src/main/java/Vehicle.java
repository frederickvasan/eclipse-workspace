public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private String color;
    
    // Constructor with all parameters
    public Vehicle(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }
    
    // Constructor with three parameters, chains to four-parameter constructor
    public Vehicle(String brand, String model, int year) {
        this(brand, model, year, "Unknown"); // Calls the constructor with all parameters
    }
    
    // Constructor with two parameters, chains to three-parameter constructor
    public Vehicle(String brand, String model) {
        this(brand, model, 2024); // Calls the three-parameter constructor
    }
    
    // Constructor with one parameter, chains to two-parameter constructor
    public Vehicle(String brand) {
        this(brand, "Unknown"); // Calls the two-parameter constructor
    }
    
    // Default constructor, chains to one-parameter constructor
    public Vehicle() {
        this("Unknown"); // Calls the one-parameter constructor
    }
    
    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
    }
} 