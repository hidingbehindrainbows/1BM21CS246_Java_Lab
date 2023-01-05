import java.util.Scanner;
class Account
{
    String cust_name, type_of_account;
    int acc_no;
    double balance;
    public void deposit(int choice)
    {
        if(choice == 0)
        {
            type_of_account = "Savings";
        }
        else
        {
            type_of_account = "Currency";
        }
        Scanner one = new Scanner(System.in);
        System.out.println("Enter name: ");
        cust_name = one.next();
        System.out.println("Enter acc_no: ");
        acc_no = one.nextInt();
        System.out.println("Enter depositing amount: ");
        balance = one.nextDouble();
    }
    public void updateBal()
    {
        System.out.println("This is not available in the type of account you chose.");
    }
    public void withdraw()
    {
        System.out.println("This is not available in the type of account you chose.");	
    }
    void checkBal()
    {
        System.out.println("This is not available in the type of account you chose.");
    }
    void computeInterest()
    {
        System.out.println("This is not available in the type of account you chose.");
    }
    void depositInterest()
    {
        System.out.println("This is not available in the type of account you chose.");
    }
    @Override
    public String toString()
    {
	    return "Name:\t" + this.cust_name + "\nType of Account:\t"+ this.type_of_account+"\nAccount Number:\t"+ this.acc_no+"\nAmount of Money in Account:\t"+ this.balance;
    }
}
class Current extends Account
{
    double interest, cheque_book;
    Current()
    {
        System.out.println("You've chosen our special Account this gives you access to our Cheque Book which holds info about your last ten transactions.");
    }
    public void updateBal()
    {
        System.out.println("Enter amount of money you want to deposit");
        Scanner three = new Scanner(System.in);
        cheque_book = three.nextDouble();
        balance += cheque_book;
        System.out.println("New Balance:\t"+balance);
    }
    public void withdraw()
    {
        System.out.println("Enter amount of money you want to withdraw");
        Scanner two = new Scanner(System.in);
        cheque_book = two.nextDouble();
        balance -= cheque_book;
        System.out.println("New Balance:\t"+balance);	
    }
    public void computeInterest()
    {
        if(balance<50000)
        {
            interest = 1000;
            System.out.println("You have gone below our 50k limit and will be charged 1k for every month you don't pay to keep your account over the minimum limit.");
            balance = balance - interest;
            System.out.println("Your new balance is:\t"+balance);
            return;
        }
        interest = 100;
        balance = balance - interest;
        System.out.println("Your new balance is:\t"+balance);
        
    }
    public void depositInterest(double s)
    {
        interest = s;
        balance = balance + interest - 100;
        System.out.println("New Balance:\t"+balance);
    }   
}
class Saving extends Account
{
    Saving()
    {
        System.out.println("Since you have chose a savings account, you don't have any cheque book privilages.\nIf you wish to withdraw, please come irl.\nThere is no interest and your money increases by 50 every month\n");
    }
    double servicecharge;
    public void checkBal()
    {
        servicecharge = 50;
        balance +=servicecharge;
    }

}
class Banking
{
	public static void main(String args[])
	{
	  int choice;
        Account Account_obj;
        System.out.println("Please enter the type of account you want. 0 to choose Savings.");
        Scanner type = new Scanner(System.in);
        choice = type.nextInt();
        if(choice==0)
        {
            Saving ref = new Saving();
            Account_obj = ref;
        }
        else
        {
            Current ref = new Current();
            Account_obj = ref;
        }
        Account_obj.deposit(choice);
		System.out.println("Do you want to \n1)Display your account info\n2)Do you want to update your balance?\n3)Do you want to withdraw?\n");
        while(true)
        {
            System.out.println("Enter choice");
            Scanner main = new Scanner(System.in);
            choice = main.nextInt();
            switch(choice)
            {
                case 1 : System.out.println(Account_obj);
                    break;
                case 2 :Account_obj.updateBal();
                    Account_obj.computeInterest();
                    break;
                case 3 : 
                    Account_obj.withdraw();
                    Account_obj.checkBal();
                    Account_obj.depositInterest();
                    break;
                case 4: System.exit(0);
                    break;
                default : System.out.println("Invalid");
                    break;
            }
        }
	}
}