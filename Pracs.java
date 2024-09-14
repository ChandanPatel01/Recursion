public class Pracs {
    int rollNo;
    String name;
    Pracs(int rollNo,String name){
        int localRollno=rollNo;  // Declared /initialized both 
        String localName=name;
      
        this.rollNo=rollNo;
        this.name=name;

        
   }
      void dispaly(){
        System.out.println("Roll No: "+rollNo+" Name: "+name);
      }

   public static void  main(String[]args){
          Pracs pv=new Pracs(10, "Chandan");
          pv.dispaly();
   }

    
}
