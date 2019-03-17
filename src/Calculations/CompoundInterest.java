package Calculations;

public class CompoundInterest {
 
    public double ci_calculate(double principal,double time,double rate)
    {
        Double result;
        result=principal*(Math.pow(1+(rate/100), time));
        return result;
    }
}
