package pooproject.udesc.poo.calculator;

import pooproject.udesc.poo.calculator.Validators;


public class Services {
    
    private Integer number1;
    private Integer number2;
    private Validators validator = new Validators();
    
    public Services(Integer number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;

        this.validator.validateInputLimit(this.number1);
        this.validator.validateInputLimit(this.number2);
    }
    
    public Integer sum() {
        return this.number1 + this.number2;
    }
    
    public Integer subtraction() {
        return this.number1 - this.number2;
    }
    
    public Integer multiplication() {
        return this.number1 * this.number2;
    }
    
    public Integer division() {
        this.validator.validateDivider(this.number2);
        return (int)(this.number1 / this.number2);
    }
}