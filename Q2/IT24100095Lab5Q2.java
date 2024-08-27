import java.util.Scanner;

public class IT24100095Lab5Q2 
{

    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of new members introduced: ");
        int newMembers = scanner.nextInt();

        
        if (newMembers < 0) {
            System.out.println("Error: The number of new members should be greater than or equal to 0.");
            return;
        }

        
        String prize;
        switch (newMembers) {
            case 0:
                prize = "No Prize";
                break;
            case 1:
                prize = "Pen";
                break;
            case 2:
                prize = "Umbrella";
                break;
            case 3:
                prize = "Bag";
                break;
            case 4:
                prize = "Travelling Chair";
                break;
            default:
                prize = "Headphone";
                break;
        }

      
        System.out.println("The prize for introducing " + newMembers + " new members is: " + prize);
    }
}
