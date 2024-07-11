import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int score=0;
        score=RandomGame(score);
        boolean b = true;
        while(b){
            System.out.println("if you want to play again press 1,if you don't press 0");
           int choice=input.nextInt();
           if(choice==1){
               score=RandomGame(score);
           }
           else{b=false;
               System.out.println("ok have great time,sir");}
           }
        System.out.println("your score is "+score);
        }



        public static int RandomGame(int score){
            Scanner input=new Scanner(System.in);
            Random random=new Random();
            System.out.println("choose the number of attempts to guess");
            int y=input.nextInt();
            System.out.println("you have "+y+" attempts or you will lose(guess from 1 to 100)");
            int RandomNumber=random.nextInt(100)+1;
            for(int i=0;i<y;i++){
                int x=input.nextInt();
                if(x==RandomNumber){
                    System.out.println("your guess is correct");
                    score++;
                    break;}
                else{
                    if(i==(y-1)){
                        System.out.println("Your attempts have been completed,you lose");
                        break;}
                    System.out.println("that's wrong,try again");
                    continue;}}
                 return score;}}