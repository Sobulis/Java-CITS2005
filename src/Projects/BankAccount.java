package Projects;

class BankExample{
    String ownerName;
    int balance;
    BankExample(){
        ownerName= null;
        balance=1000;
    }

    void depositMoney(int amount){
        if (amount < 0){
            System.out.println("You can't deposit a negative value");
            return;
        }
        balance+=amount;
    }
    int withdrawMoney(int amount){
        if (amount > balance){
            amount = balance;
        }
        balance -= amount;
        return amount;
    }
}

public class BankAccount {
    public static void main(String[] args){
        BankExample account1, account2;
        account1 = new BankExample();
        account2 = new BankExample();
        account1.ownerName = "Donald Knuth";
        account1.balance = 1000;
        account1.balance -= 15;
        account2.ownerName = "Alan Turing";
        account2.balance= 2000;
        account2.balance-=77;
        System.out.println(account1.ownerName + " has $" + account1.balance);
        System.out.println(account2.ownerName + " has $" + account2.balance);

        account1.depositMoney(200);
        account2.depositMoney(150);
        System.out.println(account1.ownerName + " has $" + account1.balance);
        System.out.println(account2.ownerName + " has $" + account2.balance);

        account1.withdrawMoney(2100); //So the account cannot be negative, the whole thing is withdrawn
        account2.withdrawMoney(900);
        System.out.println(account1.ownerName + " has $" + account1.balance);
        System.out.println(account2.ownerName + " has $" + account2.balance);


    }
}
