
public class salary {

    public static void main(String[] args) {
        int monthSalary = 900;
        int percentage = 9;
        int percentageOf=100;
        float calculatePercentage = (float)percentage/(float)percentageOf;
        int yearSalaryWithTaxes = monthSalary * 12;


        System.out.println("Total salary = " + yearSalaryWithTaxes + " $");

        System.out.println("Salary with paid taxes is : "+ ((int)(yearSalaryWithTaxes - yearSalaryWithTaxes*calculatePercentage))+ " $");

        System.out.println("the government gets its year : " + (int)(yearSalaryWithTaxes*calculatePercentage)+ " $");


    }
}
