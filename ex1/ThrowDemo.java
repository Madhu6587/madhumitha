public class ThrowDemo {
  static void avg()
  {
  try
  {
  throw new ArithmeticException("Exception occured in ThrowDemo class");
  }
  catch(ArithmeticException e)
  {
  System.out.println("Exception caught"+ " " + e);
  }
  }
  public static void main(String[] args) {
  ThrowDemo.avg();
  }

  // static void check() throws ArithmeticException {
  //   System.out.println("Inside check function");
  //   throw new ArithmeticException("demo");
  // }

  // public static void main(String args[]) {
  //   try {
  //     check();
  //   } catch (ArithmeticException e) {
  //     System.out.println("caught" + e);
  //   }
  // }

}