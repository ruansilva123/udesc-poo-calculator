package pooproject.udesc.poo.calculator;

import pooproject.udesc.poo.calculator.Validators;


public class Services {
    
    private Float number1;
    private Float number2;
    private Validators validator = new Validators();
    
    public Services(Float number1, Float number2) {
        this.number1 = number1;
        this.number2 = number2;

        this.validator.validateInputLimit(this.number1);
        this.validator.validateInputLimit(this.number2);
    }
    
    public Float sum() {
        return this.number1 + this.number2;
    }
    
    public Float subtraction() {
        return this.number1 - this.number2;
    }
    
    public Float multiplication() {
        return this.number1 * this.number2;
    }
    
    public Float division() {
        this.validator.validateDivider(this.number2);
        return this.number1 / this.number2;
    }
}