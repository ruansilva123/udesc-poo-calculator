package pooproject.udesc.poo.calculator;


public class Validators {
    
    public Validators() { }
    
    // Custom exceptions block
    private class InvalidDivider extends RuntimeException {
        public InvalidDivider(Integer number) {
            super(number.toString() + " is not a valid divider!");
        }
    }
    
    private class InvalidInputLimit extends RuntimeException {
        public InvalidInputLimit(Integer number) {
            super(number.toString() + " exceed the limit of 999!");
        }
    }
    
    // Validators
    public void validateDivider(Integer number) {
        if (number == 0) throw new InvalidDivider(number);
    }
    
    public void validateInputLimit(Integer number) {
        if (number >= 1000) throw new InvalidInputLimit(number);
    }
}
