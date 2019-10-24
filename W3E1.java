
import javax.sound.midi.Soundbank;
import  java.util.Scanner;
public class W3E1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your favorite movie quote");
        String quote = scanner.nextLine();

        String [] quoteSpaces = quote.split(" ");
        System.out.println("The total number of spaces of the above quote is : " + quoteSpaces.length);
    }
}
