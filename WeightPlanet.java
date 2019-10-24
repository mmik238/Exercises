	
import java.util.Scanner;
public class WeightPlanet {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
    System.out.println("what is your weight?");
	int weight  = scanner.nextInt();

	double venus = 0.78;
	double mars = 0.39;
	double jupiter = 2.65;
	double saturn = 1.17;
	double uranus = 1.05;
	double neptune = 1.23;



        System.out.println("your rounded weight on Venus is :" + (int)(venus*weight) + " , on Mars : " +
                (int) (weight*mars) + " ,on Jupiter : " + (int)(weight*jupiter) + " , on Saturn : " +
                (int)(weight*saturn) + " , on Uranus : " + (int)(weight*uranus) + " ,on Natune : " +
                (int)(weight*neptune));


    }
}
