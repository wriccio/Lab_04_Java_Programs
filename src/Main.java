//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) { // 2. Opens the method
        // Variable Declarations and Initialization
        double vehiclePrice = 39500.00;
        double taxRate = 0.05;

        // Calculations
        double salesTax = vehiclePrice * taxRate;
        double totalPrice = vehiclePrice + salesTax;

        // Output Statements
        System.out.println("To Purchase a Toyota Camry Hybrid Nightshade Edition");
        System.out.println("The price of the vehicle is: $" + vehiclePrice);
        System.out.println("5% sales tax is: $" + salesTax);
        System.out.println("Total price including tax is: $" + totalPrice);
    } // 2. Closes the method
} // 1. Closes the class (Check if this line is missing in your file!)