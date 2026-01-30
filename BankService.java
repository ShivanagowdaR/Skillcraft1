class BankService {
    public static void main(String[] args) {
        int balance = 5000;
        int deposit = 2000;
        int withdraw = 1500;

        balance = balance + deposit;
        System.out.println("After Deposit Balance = " + balance);

        balance = balance - withdraw;
        System.out.println("After Withdraw Balance = " + balance);
    }
}
