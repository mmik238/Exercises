
import java.util.Scanner;
public class W3E3 {

    public static void main (String [] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Please write your name");
        String name = scanner.nextLine();

        System.out.println("Please write your surname");
        String surname = scanner.nextLine();

        System.out.println("Please write your favorite color");
        String color = scanner.nextLine();

        // Αν έβαζα την String color = scanner.nextLine();  τελευτάια, δεν δούλευε.

        System.out.println("Please write your age");
        int age = scanner.nextInt();
        String ageToString = Integer.toString(age);



        String textFile = name + " " + surname + " "  + ageToString + " " + color;
        System.out.println(textFile);




    }

}
