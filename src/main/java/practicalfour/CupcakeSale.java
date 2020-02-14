package practicalfour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Displays the totals of a cupcake sale.
 *
 * @author Solution Repository
 */
public class CupcakeSale {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Set up scanner and read values from file
    File file = null;
    Scanner input = null;
    try {
      file = new File("input/cupcakes.nomnomnom");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    String strawberrySales = input.next();
    input.nextLine();
    String redVelvetSales = input.next();
    input.nextLine();
    String raspberrySales = input.next();
    
    // Calculate sales
    double taxRate = .08;
    int strawberryTotal = strawberrySales.length();
    int redVelvetTotal = redVelvetSales.length();
    int raspberryTotal = raspberrySales.length();
    
    // Calculate total
    double total =  strawberryTotal + redVelvetTotal + raspberryTotal;
    double tax = taxRate * (strawberryTotal + redVelvetTotal + raspberryTotal);
    
    // Print total
    System.out.println(strawberryTotal + "\tstrawberry cupcakes");
    System.out.println(redVelvetTotal + "\tred velvet cupcakes");
    System.out.println(raspberryTotal + "\traspberry cupcakes");
    System.out.println((int)(taxRate * 100) + "%\tsales tax");
    System.out.println("----");
    System.out.print((total + tax));
  }
}