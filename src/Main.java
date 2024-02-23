public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(15000);
        try {
            while(true) {
                bankAccount.withDraw(6000);
                System.out.println("Со счета списано 6000 сом, остаток " + bankAccount.getAmount());
            }
        } catch (LimitException ex) {
            try {
                bankAccount.withDraw((int) ex.getRemainingAmount()); // 3000
            }catch (LimitException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(bankAccount.getAmount());
    }
}