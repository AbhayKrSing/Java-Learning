public class Type_promotion {
   public static void main(String[] args) {
      char a='1';
      int d=a;
      System.out.println(d);
      long b=80;
      float c=a+b;  //long-->float
      System.out.println(c);
  //note float cannot converted into long(because magnitute loss)
  //but long can converted into float(because only precision loss not magnitude)
   }
    

}