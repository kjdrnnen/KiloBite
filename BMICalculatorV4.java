import java.util.Scanner;
public class CleanedBMI
{
   static double weight, feet, inches, height, BMI, difference, BMItoPounds, roundedTGIR, poundsToCals;
   static String status = "";
   public static double getBMI(){
        Scanner s = new Scanner(System.in);
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
        BMItoPounds = (height*0.0254)*(height*0.0254)/0.453592;
        BMItoPounds = (double)Math.round(BMItoPounds*10)/10;
        return BMI;
   }
    public static String BMIRange(){
       if(BMI<18.5){
            status = "below range";
            difference = BMI - 18.5;
            difference = (double)Math.round(difference*10)/10;
       }
       else if(BMI>=18.5&&BMI<=24.9){
            status = "within range";
            difference = 0;
       }
       else{
            status = "over range";
            difference = BMI - 24.9;
            difference = (double)Math.round(difference*10)/10;
       }
       return status;
   }
   public static double weightToLoseOrGain(){
       if(difference<0){
            roundedTGIR = (difference*-1)*BMItoPounds;
       }
       if(difference>0){
            roundedTGIR = difference*BMItoPounds;
       }
       roundedTGIR = (double)Math.round(roundedTGIR*10)/10;
       return roundedTGIR;
   }
   public static double caloriesToBurnOrGain(){
       poundsToCals = roundedTGIR * 3500;
       return poundsToCals;
   }
}
