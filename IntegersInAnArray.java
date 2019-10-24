

public class IntegersInAnArray {

    public static void main(String[] args) {

        int [] myArray = new int[5];
        myArray[0] = 5;
        myArray[1] = 7;
        myArray[2] = 8;
        myArray[3] = 10;
        myArray[4] = 1;

        int sum = 0;

        for (int i =0 ; i <myArray.length ; i++){
            sum = sum + myArray[i];
        }

        System.out.println("sum =  " + sum);

        int min = myArray[0];

        for (int i =0 ; i <myArray.length ; i++){
            if (min <myArray[i]){
                min=myArray[i];
            }
        }

        System.out.println("Min = " + min);


        int max = myArray[0];

        for (int i =0 ; i <myArray.length ; i++){
            if (max >myArray[i]){
                max=myArray[i];
            }
        }

        System.out.println("Max = " + max);
    }
}
