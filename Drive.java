public class Drive {

    public static void main(String[] args) {
	int age = 21;

	if (age <0){
        System.out.println("invalid number");
    }else if ( age<16 ){
        System.out.println("You cannot drive");
    }else if (age<=17 && age >=16){
        System.out.println("you can drive but not vote");
    }else if (age<=21 && age>=18){
        System.out.println("You can vote but not drink");
    }else {
        System.out.println("You can do everything");
    }

    }
}
