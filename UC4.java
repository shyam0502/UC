/**
 * OOPS Banner Application - Use Case 3
 * This application displays "OOPS" in a large banner made of asterisks (*)
 * Using String.join() method for better memory efficiency instead of + operator
 * 
 * @author Shyam
 * @version 3.0
 * @since 2026-03-02
 */
public class OOPSBannerApp {
    
    /**
     * The main method - prints a 7-line ASCII art banner of "OOPS"
     * Uses String.join() to create each line efficiently
     * @param args Command line arguments (not used in this version)
     */
    public static void main(String[] args) {
        
        // Header
        System.out.println("=================================");
        System.out.println("   OOPS BANNER - UC3 (String.join)");
        System.out.println("=================================");
        System.out.println();
        
        // Line 1: Top border of all letters
        String line1 = String.join(" ", " *** ", " *** ", "*****", "*****");
        System.out.println(line1);
        
        // Lines 2-6: Middle sections (all identical for these letters)
        String middleLine = String.join(" ", "*   *", "*   *", "*    *", "*    *");
        
        // Print the middle line 5 times
        System.out.println(middleLine);
        System.out.println(middleLine);
        System.out.println(middleLine);
        System.out.println(middleLine);
        System.out.println(middleLine);
        
        // Line 7: Bottom border of all letters
        String line7 = String.join(" ", " *** ", " *** ", "*****", "*****");
        System.out.println(line7);
        
        System.out.println();
        System.out.println("=================================");
    }
}