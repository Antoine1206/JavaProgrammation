package section7;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;


    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        double add = firstNumber + secondNumber;
        return add;
    }
    public double getSubtractionResult(){
        double sous = firstNumber - secondNumber;
        return sous;
    }
    public double getMultiplicationResult(){
        double mult = firstNumber * secondNumber;
        return mult;
    }
    public double getDivisionResult(){
        if (secondNumber == 0){
            return 0;
        }
        double div = firstNumber / secondNumber;
        return div;
    }


}
