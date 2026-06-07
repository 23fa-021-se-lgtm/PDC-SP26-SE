import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a weight in kg : ");
        double weight = sc.nextDouble();

        double pound = weight * 2.2;
        System.out.println("weight in pounds: " + pound);

        sc.close();
    }
}