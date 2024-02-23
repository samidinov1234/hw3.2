public class LimitException extends Exception{
    private double remainingAmount;  // 3000

    public double getRemainingAmount() { // getRemainingAmount = 3000
        return remainingAmount;
    }

    public LimitException(String message, double remainingAmount) { // message = Сумма больше чем на депозите, remainingAmount = 3000
        super(message);
        this.remainingAmount=remainingAmount;
    }
}
