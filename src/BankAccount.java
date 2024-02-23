public class BankAccount {
    private double amount; // amount = 15000, 0+15000=15000

    public double getAmount() {
        return amount; // 3000
    }

    public void deposit(double sum) { // sum = 15000
        amount += sum;
    }

    public void withDraw(int sum) throws LimitException { // sum = 6000, sum = 3000
        if (sum > amount) { // 6000 > 15000, 6000 > 9000, 6000 > 3000, 3000>3000
            throw new LimitException("Сумма больше чем на депозите", getAmount()); // getAmount = 3000
        }
        amount -= sum; // 15000 - 6000 = 9000, 9000 - 6000 = 3000, 3000-3000
    }
}
