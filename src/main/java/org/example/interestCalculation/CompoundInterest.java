package org.example.interestCalculation;

public class CompoundInterest implements Interest{
    @Override
    public Double calculateInterest(Double principalAmount, Double rateOfInterest, Double time) {
        return Double.parseDouble(String.format("%.2f", principalAmount * Math.pow(1.0+rateOfInterest/100.0,time) - principalAmount));
    }
}
