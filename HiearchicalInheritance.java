import java.util.Scanner;

public class HiearchicalInheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("open account press\n1.saving account\n2.current account");
        int choice=sc.nextInt();
        if(choice==1){
            SavingAccount s=new SavingAccount();
            s.setName();
            s.setIfcs();
            s.setBranch();
            s.setAccountNumber();
            s.setMaxTransaction();
            s.setAccountType();
            s.setMinBalance();
            System.out.println("Account details :");
            System.out.println("Name: "+s.getName());
            System.out.println("Account type: "+s.getAccountType());
            System.out.println("Account number :"+s.getAccountNumber());
            System.out.println("IFSC: "+s.getIfcs());
            System.out.println("Branch: "+s.getBranch());
            System.out.println("Maximum Transaction :"+s.getMaxTransaction());
            System.out.println("Minimum balance: "+s.getMinBalance());
        }else{
            CurrentAccount s=new CurrentAccount();
            s.setName();
            s.setIfcs();
            s.setBranch();
            s.getAccountType();
            s.setAccountNumber();
            s.setMaxTransaction();
            s.setMinBalance();
            System.out.println("Account details :");
            System.out.println("Name: "+s.getName());
            System.out.println("Account type: "+s.getAccountType());
            System.out.println("Account number :"+s.getAccountNumber());
            System.out.println("IFSC: "+s.getIfcs());
            System.out.println("Branch: "+s.getBranch());
            System.out.println("Maximum Transaction :"+s.getMaxTransaction());
            System.out.println("Minimum balance: "+s.getMinBalance());
        }
    }
}
class Account{
    Scanner sc=new Scanner(System.in);
    public String getIfcs() {
        return Ifcs;
    }

    public void setIfcs( ) {
        System.out.println("Enter IFSC CODE: ");
        Ifcs = sc.next();
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch() {
        System.out.println("Enter branch :");
        this.branch = sc.next();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber( ) {
        System.out.println("Enter AccountNumber :");
        this.accountNumber = sc.next();
    }

    String Ifcs;
    String branch;
    String accountNumber;


}
class SavingAccount extends Account{
    Scanner sc=new Scanner(System.in);

    public String getMaxTransaction() {
        return maxTransaction;
    }

    public String getName() {
        return name;
    }

    public void setName( ) {
        System.out.println("Enter name: ");
        this.name = sc.next();
    }

    String name;

    public void setMaxTransaction() {
        System.out.println("Enter Maximum Transaction limit: ");
        this.maxTransaction = sc.next();
    }

    public String getMinBalance() {
        return minBalance;
    }

    public void setMinBalance() {
        System.out.println("Enter minimum balance: ");
        this.minBalance = sc.next();
    }
    String  accountType;
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType( ) {

        this.accountType = "SAVING ACCOUNT";
    }



    String maxTransaction;
    String minBalance;
}
class CurrentAccount extends Account{
    Scanner sc=new Scanner(System.in);
    String  accountType;
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType( ) {

        this.accountType = "CURRENT ACCOUNT";
    }


    public String getMaxTransaction() {
        return maxTransaction;
    }

    public void setMaxTransaction( ) {
        System.out.println("Enter maximum transaction: ");
        this.maxTransaction = sc.next();
    }

    public String getMinBalance() {
        return minBalance;
    }
    public String getName() {
        return name;
    }

    public void setName( ) {
        System.out.println("Enter name: ");
        this.name = sc.next();
    }

    String name;
    public void setMinBalance( ) {
        System.out.println("Enter minimum balance: ");
        this.minBalance = sc.next();
    }

    String maxTransaction;
    String minBalance;
}