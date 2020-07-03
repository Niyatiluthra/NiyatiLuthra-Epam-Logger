package org.example.interestCalculation;

public class SimpleInterest implements Interest{
    @Override
    public Double calculateInterest(Double principalAmount, Double rateOfInterest, Double time) {
        return Double.parseDouble(String.format("%.2f", principalAmount*time*rateOfInterest/100));
    }
}
