import java.util.*;
import Calculations.*;

public class InterestCalculation {

   public static void main(String args[])
   {
       Scanner ob=new Scanner(System.in);
       double principal,time,rate;
       //static input
       System.out.println("Test Case 1:");
       principal=1000;
       time=2;
       rate=1.2;
       calculate(principal,time,rate);
       System.out.println("\nTest Case 2:");
       principal=3000;
       time=10;
       rate=5;
       calculate(principal,time,rate);
       /*
        * Taking input
        * Dynamic input
        */
       System.out.println("\n\nDynamic input");
       System.out.println("Enter Principal Amount:");
       principal=ob.nextDouble();
       System.out.println("Enter time duration:");
       time=ob.nextDouble();
       System.out.println("Enter rate of interest");
       rate=ob.nextDouble();
       calculate(principal,time,rate);
   }
      public static void calculate(double principal,double time,double rate)
       {
       SimpleInterest si=new SimpleInterest();
       //simple interest calculation
       double simple_interest=si.si_calculate(principal,time,rate);
       System.out.println("Simple interest="+simple_interest);
       CompoundInterest ci=new CompoundInterest();
       //compound interest calculation
       double compound_interest=ci.ci_calculate(principal,time,rate);
       System.out.println("Compound interest="+compound_interest);
       }
}