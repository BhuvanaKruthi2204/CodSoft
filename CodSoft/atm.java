import java.util.Scanner;
public class atm {
    int a=25000;
    Scanner sc=new Scanner(System.in);
    public void deposit()
    {
        System.out.print("Enter money to be deposited:");  
        int d=sc.nextInt();
        a=a+d;
        System.out.println("Deposit Successful!");
        
    }
    public void withdraw()
    {
        System.out.print("Enter money to be withdrawn:");
        int w=sc.nextInt();
        if(w>a)
        {
            System.out.println("Insufficient Balance!");
        }
        else
        {
            a=a-w;
            System.out.println("Withdraw Successful!");
        }
    }
    public void checkBalance()
    {
        System.out.print("Current Avaliable Balance:"+a);  
    }
    
	public static void main(String[] args) 
	{
        atm obj=new atm();
        while (true)
        {
		System.out.println("*****ATM*****");
		System.out.println("WELCOME!");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Check Balance");
        System.out.println("4.Exit");
		System.out.println("Choose the operation you want to perform:");
        Scanner scan=new Scanner(System.in);
		int  c=scan.nextInt();
		switch(c)
		{
		    case 1:obj.deposit();
		           break;
		    case 2:obj.withdraw();
		           break;
		    case 3:obj.checkBalance();
		           break;
            case 4: System.exit(0);
                    scan.close();
		           break;
		    default: System.out.println("Enter a valid option");
        }    
        }
	}

    
}
