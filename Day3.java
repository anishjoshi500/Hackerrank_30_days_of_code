import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); 
        int tipPercent = scan.nextInt(); 
        int taxPercent = scan.nextInt();
        scan.close();
        double taxer=(taxPercent/100.0)*(mealCost);
        double tipper=(tipPercent/100.0)*(mealCost);
        double summer= mealCost+taxer+tipper;
        int totalCost = (int) Math.round(summer);
        System.out.println("The total meal cost is "+totalCost+" dollars.");
    }
}
