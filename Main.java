import java.util.Scanner;
public class Main {
    static costumer c =new costumer();
    static ATM a=new ATM(c.getaccountBallance(),11000);
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
        System.out.println("if you want to begain process press 0");
        int proc= input.nextInt();
        if(proc==0){
            process();
        }else{
            System.out.println("ok, thanks");
        }}
public static void process(){
        Scanner input=new Scanner(System.in);
    System.out.println("choose process you need :\n(1)withdrawing\n(2)depositing\n(3)checking_the_balance\nif you want to exit press(4)");
    int y= input.nextInt();
    switch(y){
        case(1):
            System.out.println("you choose number (1)withdrawing");
            System.out.println("enter the number you need to withdraw");
            double withdrawingvalue= input.nextDouble();
            a.withdrawing(withdrawingvalue);
            replaying();
            break;
        case(2):
            System.out.println("you choose number (2)depositing");
            System.out.println("enter the number you need to deposite");
            double depositingvalue= input.nextDouble();
            a.depositing(depositingvalue);
            replaying();
            break;
        case(3):
            System.out.println("you choose number (3)checking the balance");
            a.checking_the_balance(a.getaccountBallance());
            replaying();
        default:
            System.out.println("the number be from 1,2,3");
            process();
    }

}
public static void replaying(){
        Scanner input= new Scanner(System.in);
    System.out.println("if you want to do another process press 5");
    int x =input.nextInt();
    if(x==5){
        process();}
    else{
        System.out.println("ok,thanks");
    }
    }
}