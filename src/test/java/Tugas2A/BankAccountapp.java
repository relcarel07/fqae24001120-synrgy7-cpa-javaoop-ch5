package Tugas2A;

public class BankAccountapp {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(129939202);
        account.setDeposit(0);
        account.setWithdraw(100);
        account.setBalances(99);
        account.setCustomerName("Nasya Zafira");
        account.dataAccount();
    }
}
