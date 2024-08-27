import java.util.Scanner;

public class IT24100095Lab5Q3 
{

    
    public static final double ROOM_CHARGE = 48000.0;
    public static final int NO_DISCOUNT = 0;
    public static final int DISCOUNT_10 = 10;
    public static final int DISCOUNT_20 = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

      
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than the end date.");
            return;
        }

       
        int daysReserved = endDate - startDate;

        
        int discountRate;
        if (daysReserved < 3) {
            discountRate = NO_DISCOUNT;
        }
 else if (daysReserved <= 4) {
            discountRate = DISCOUNT_10;
        } else {
            discountRate = DISCOUNT_20;
        }

        
        double totalAmount = daysReserved * ROOM_CHARGE * (1 - discountRate / 100.0);

       
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Total amount to be paid: Rs ", totalAmount);
    }
}