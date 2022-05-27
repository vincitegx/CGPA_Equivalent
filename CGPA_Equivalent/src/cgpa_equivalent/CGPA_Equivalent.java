package cgpa_equivalent; 
import java.util.Scanner;
public class CGPA_Equivalent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cgpa;
        System.out.println("Enter your CGPA:");
        cgpa = input.nextDouble();
        if(cgpa < 0.00 || cgpa > 5.00){
            System.out.println("Sorry wrong input, check your cgpa again");
        }
        else if(cgpa > 4.49){
            System.out.println("Your class of degree is : Distinction");
        }
        else if(cgpa > 3.49){
            System.out.println("Your class of degree is : Second Class Upper");
        }
        else if(cgpa > 2.49){
            System.out.println("Your class of degree is : Second Class Lower");
        }
        else if(cgpa > 1.49){
            System.out.println("Your class of degree is : Third Class");
        }
        else if(cgpa >= 0.00){
            System.out.println("Your class of degree is : Fail");
        }
    }
    
}
