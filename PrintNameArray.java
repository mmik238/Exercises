

public class PrintNameArray {

    public static void main(String[] args) {

        String [] myArray = new String[4];

        myArray[0] = "John";
        myArray[1] = "Bill";
        myArray[2] = "Bob";
        myArray[3] = "James";

        for (String x : myArray){
            System.out.println(x);
        }

    }
}
