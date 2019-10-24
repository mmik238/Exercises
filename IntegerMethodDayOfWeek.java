
public class IntegerMethodDayOfWeek {

    public static void main(String[] args) {

    String day = myMethod(2);
        System.out.println(day);



    }

    public static String myMethod (int a){

        switch (a){
            case 1 :
                return "Monday";

            case 2 :
                return "Tuesday";

            case 3 :
                return "Wednesday";

            case 4 :
                return "thursday";

            case 5 :
                return "Friday";

            case 6 :
                return "Saturday";

            case 7 :
                return "Sunday";

            default :
                return "Invalid value";



        }

    }

}
