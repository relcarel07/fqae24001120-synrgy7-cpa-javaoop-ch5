package Tugas2A;

public class BankAccount {
    //attribute
    public int accountNumber;
    public int balances;
    public String customerName;
    public int deposit;
    public int withdraw;

    //method
    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;

    }

    //getter attribute account number
    public int getAccountNumber() {
        return accountNumber;
    }

    //setter attribute account number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //getter attribute balances
    public int getBalances() {
        return balances;
    }

    //setter attribute balances
    public void setBalances(int balances) {
        if (withdraw > 0) {
            if (withdraw > balances) {
                System.out.println("!!! SALDO TIDAK MENCUKUPI !!!\n\n");
                this.balances = balances;
            } else {
                this.balances = balances - withdraw;
            }
        } else if (deposit > 0) {
            this.balances = balances + deposit;
        } else {
            this.balances = balances;
        }
    }

    //getter attribute customer name
    public String getCustomerName() {
        return customerName;
    }

    //setter attribute customer name
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    void dataAccount() {
        System.out.println("Customer account number is " + this.accountNumber);
        System.out.println("Customer name is " + this.customerName);
        System.out.println("Customer deposit is " + this.deposit);
        System.out.println("Customer withdraw is " + this.withdraw);
        System.out.println("Customer total saldo is " + this.balances);
    }
}
