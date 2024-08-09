import java.util.Scanner;
public  class ATM extends costumer implements ATMINTERFACE  {
double amount;
double ATMmoney;
Scanner input=new Scanner(System.in);

    public ATM(double accountBallance,double ATMmoney) {
        super(accountBallance);
        this.ATMmoney=ATMmoney;}


    @Override
    public  void withdrawing(double amount) {
        if(amount>0&amount<=accountBallance&amount<=ATMmoney){
          accountBallance-=amount;
            System.out.println(" withdrawing:"+amount+"has been done");
        } else if (amount<=0) {
            System.out.println("should be positive:");
            double x=input.nextDouble();
            withdrawing(x);
        } else if (amount>ATMmoney) {
            System.out.println("your limit is:"+ATMmoney);
            double z= input.nextDouble();
            withdrawing(z);
        }
   }

    @Override
    public  void depositing(double amount) {
    if(amount>0){
        accountBallance+=amount;
        ATMmoney+=amount;
      System.out.println("depositing:"+amount+"has been done");
   }else{
     System.out.println("should be positive");
     double x=input.nextDouble();
     depositing(x);}
    }

    public  void checking_the_balance(double c ){
        System.out.println("your balance now is:"+accountBallance);
    }

    public double getATMmoney() {
        return ATMmoney;
    }

    public void setATMmoney(double ATMmoney) {
        this.ATMmoney = ATMmoney;
    }
}


