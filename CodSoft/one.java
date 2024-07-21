import java.util.Random;
import java.util.Scanner;
public class one
{
    public static void main(String[] args)
    {
       int a=0,b=0,s=0;
       Scanner sc;
       Random r= new Random();
       int x = r.nextInt(100)+1;
       MainLoop:
       for(int i=0;i<3;i++)
       {
        b+=1;
        System.out.println("Let's Play!"); 
        System.out.println("****ROUND:"+b+"****");
        for(int j=0;j<3;j++)
        {
            sc = new Scanner(System.in);
            System.out.println("Guess the number:");
            int y = sc.nextInt();
            if(y==x)
            {
                a+=1;
                System.out.println("That's Correct! You have guessed the number right");
                break MainLoop;
            }
            else if(y<x)
            {
                a+=1;
                System.out.println("Your Guess is too LOW! Try guessing again.");
            }
            else
            {
                a+=1;
               System.out.println("Your Guess is too HIGH! Try guessing again.");
            }
        }
        }
        System.out.println("Number of rounds played:"+b);
        System.out.println("Number of Guesses:"+a);
        s=100-((100/9)*(a-1));
        System.out.println("Your Score:"+s);
    }
}
