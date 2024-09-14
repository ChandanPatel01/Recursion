import java.util.Scanner;
public class prac {
    public static void main(String[] args) {
         int num3;
    Scanner sc=new Scanner(System.in);
   
   
    do{
        System.out.print("Please Enter the number: ");
        int  num1=sc.nextInt();
        System.out.print("Please Enter the number: ");
        int num2=sc.nextInt();
       num3=num1+num2;
       System.out.println(num3);  
    }
    while(true);

    }
    
}
