class rec3{
    public static void naturalNumSum(int i,int n,int sum){
        if(i==n){
            sum=sum+i;
            System.out.println("Your Sum:"+ sum);
            return;
        }
        sum=sum+i;  
        naturalNumSum(i+1, n, sum); // recursion call
        System.out.print(" " + i);
        

    }
public static void main(String[] args) {
    System.out.println("Start");
    
    naturalNumSum(1, 5, 0); // actual argument
    System.out.println();
    System.out.println("End");
}
}
