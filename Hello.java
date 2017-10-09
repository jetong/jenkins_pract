public class Hello {
  public static void main(String[] args){
    int a = 1;
    int b = 0;

    System.out.println("Hello World!");
    try{
      double result = a/b;
      System.out.println("a/b = " + result);
    }catch(ArithmeticException e){
      System.out.println("Exception caught: " + e.getMessage());
      System.exit(1);
    }
  }
}
