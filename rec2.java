public class rec2 {
    public static void printNumb(int n){
         if(n==6 ){
            return;
         }
         System.out.println(n);
         printNumb(n+1);   // recursion
    }
    public static void main(String[]args){
        System.out.println("Start");
        int n= 1    ;
        printNumb(n);
        System.out.println("end ");

    }
    
}
