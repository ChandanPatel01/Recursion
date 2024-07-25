class Rec{
  public static void printNum(int n){
    if(n==0){  // Based block       
        return;
    }
        System.out.println(n);    // print 1 number
        printNum(n-1);   // recursion fun call func
  }
      public static void main(String[] args) {
        System.out.println("Start");  //1   
        int n=5;//3
        System.out.println("Mid");//2
        printNum(n);
        System.out.println("End"); //last
      }

}