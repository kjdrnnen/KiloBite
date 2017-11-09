import java.util.Scanner;
public class BMICalculator{
    public static void main(String[]args){
        System.out.println("This is a Body Mass Index (BMI) calculator.");
        System.out.println("For men and women over the age of 20, the National Heart Lung ");
        System.out.println("and Blood Institute recommends a BMI between 18.5 and 24.9.");
        System.out.println("Let's find out yours!\n");
        Scanner s = new Scanner(System.in);
        String status = "";
        double weight, feet, inches, height, BMI, difference = 0;
        System.out.print("Enter your weight(lbs.): ");
        weight = s.nextDouble();
        System.out.println("\nEnter your height:");
        System.out.print("\tFeet: ");
        feet = s.nextDouble();
        System.out.print("\tInches: ");
        inches = s.nextDouble();
        height = (feet*12+inches);
        BMI = (weight*703)/(height*height);
        BMI = (double)Math.round(BMI*10)/10;
        System.out.println("\nYour BMI is "+BMI+". ");
        if(BMI<18.5){
            status = "below";
            difference = BMI - 18.5;
        }
        else if(BMI>=18.5&&BMI<=24.9){
            status = "within";
        }
        else{
            status = "over";
            difference = BMI - 24.9;
        }
        System.out.println("Your BMI is "+status+" the recommended range.\n");
        difference = (double)Math.round(difference*10)/10;
        if(difference<0){
            System.out.println("You must increase your BMI by at least "+difference*-1);
            System.out.println("in order to be in the recommended range.");
        }
        if(difference>0){
            System.out.println("You must decrease your BMI by at least "+difference);
            System.out.println("in order to be in the recommended range.");
        }
    }
}
