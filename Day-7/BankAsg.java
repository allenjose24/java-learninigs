public class BankAsg {
    private String accountHolderName="Allen";
    private int accountNumber = 54321678;
    private String IFSC = "SBI73210F";
    private double balance = 0;
    private String MICR = "TN34SBI654IO";

    public int getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public String getIFSC(){
        return IFSC;
    }
    public String getMICR(){
        return MICR;
    }

    public static void main(String[] args) {

        BankAsg ac1 = new BankAsg();
        System.out.println(ac1.getAccountNumber());
        System.out.println(ac1.getAccountHolderName());
        System.out.println(ac1.getBalance());
        System.out.println(ac1.getIFSC());
        System.out.println(ac1.getMICR());

        
    }
}
