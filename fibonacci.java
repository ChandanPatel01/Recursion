public class fibonacci {
    public static void fibPrint(int a,int b,int n){
        if(n==0){
            return;
        }
            int c=a+b;
            
            System.out.println(c);
           fibPrint(b, c, n-1);
           System.out.println(" c="+c);
          System.out.println("b="+b);
            System.out.println("n-1 :::"+(n-1));

    }
    public static void main(String[] args) {
        System.out.println("Start");
        int a=0;
        int b=1;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println("mid");
        int n=7;
        fibPrint(a,b,n-2);
        


        
    }
}
