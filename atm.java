import java.util.Scanner;
public class atm{
    public static void main(String[] args) {
        int balance=100000,withdraw,deposit;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Welcome to the SBI");
            System.out.println("Chose 1 for Withdraw ");
            System.out.println("Chose 2 for Deposit ");
            System.out.println("Chose 3 for balance enquiry");
            System.out.println("Chose 4 for Exit ");
            System.out.println("Chose 5 for which opreation perform ");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                System.out.println("Enter the Money for Withdraw :");
                withdraw=sc.nextInt();
                if(withdraw<=balance){
                  System.out.println("Please Collect Your Money:"+withdraw);
                  
                  balance=balance-withdraw;
                  System.out.println("Your Total Balance is :" +balance);
                }
                else{
                    System.out.println("Insuffient Balance:"+ balance);
                }
                break;

                case 2:
                System.out.println("Please Enter Your Deposit Money:");
                deposit=sc.nextInt();
                balance=balance+deposit;
                System.out.println("Your Money has been Succussfully Deposit");
                System.out.println("Your Total Balance: "+balance);
                System.out.println();
                break;
               
                case 3:
                System.out.println("Your Total Balance is :"+ balance);
                System.out.println();
                break;

                case 4:
                System.out.println("!! Thanks for Using our Sevices !! ");
                System.exit(0);


            }

        }

    }




}
