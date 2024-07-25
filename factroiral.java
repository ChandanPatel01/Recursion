public class factroiral {
    public static int facNum(int n){ //1. --> 20,
        if(n==1 || n==0){
            return 1;
        }
        int fac=facNum(n-1); // recursion 
        int fact=n*fac;

        return fact;

    }
    public static void main(String[] args) {
        System.out.println("Start");
        int n=5;
        
        int ans= facNum(n);
        
        System.out.println("Your Fcat: "+ans);
       // System.out.println("End");
    }
    
}
