package pooproject.udesc.poo.calculator;


public class Validators {
    
    public Validators() { }
    
    // Custom exceptions block
    private class InvalidDivider extends RuntimeException {
        public InvalidDivider(Float number) {
            super(number.toString() + " is not a valid divider!");
        }
    }
    
    private class InvalidInputLimit extends RuntimeException {
        public InvalidInputLimit(Float number) {
            super(number.toString() + " exceed the limit of 999!");
        }
    }
    
    // Validators
    public void validateDivider(Float number) {
        if (number == 0) throw new InvalidDivider(number);
    }
    
    public void validateInputLimit(Float number) {
        if (number >= 1000) throw new InvalidInputLimit(number);
    }
}
