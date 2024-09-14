public class constructorChain {
    
    {
        System.out.println("this is chainning");
    }
      constructorChain(){
                this(100);
              System.out.println("A");
      }
         constructorChain(int a){

              System.out.println("B");
         }

         constructorChain(String a){
                    this("ram",1);
                 System.out.println("s");                   
         }

         constructorChain(double a){
                     this();
                System.out.println("d");
       }

         constructorChain(String a ,int b){
                   this(10.5);
                
                System.out.println("k");
       }


      public static void main(String[] args) {
        constructorChain obj = new constructorChain("dd");
        

      }
    
}
