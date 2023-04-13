
import java.util.Scanner;

class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float Salary = 0, DA = 0, HRA = 0, GrossSalary = 0;
        System.out.println("Enter Basic Salary Amount : ");
        Salary = sc.nextFloat();

        HRA = (89 * Salary) / 100;

        DA = (90 * Salary) / 100;

        GrossSalary = Salary + HRA + DA;

        System.out.println("Gross Salary  is : " + GrossSalary);

    }
}