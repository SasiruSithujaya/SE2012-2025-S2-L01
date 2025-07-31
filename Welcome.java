import java.util.Scanner;
public class Welcome{
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);

        System.out.print("Enter your First Name: ");
        String firstName = name.nextLine();

        System.out.print("Enter your Last Name: ");
        String lastName = name.nextLine();

        System.out.println("Welcome to the Second Year " + firstName + " " + lastName );
       
        name.close();
    }
}