package com.codewithrosso;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        calculator = new TaxCalculator(100_000);
    }
    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);

    }
}

