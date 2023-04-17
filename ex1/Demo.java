class Demo
{
  static void sum(int a,int b) throws CustomException
  {
    if(a<0)
    {
      throw new CustomException(a); //calling constructor of user-defined exception class
    }
    else
    {
      System.out.println(a+b);
    }
  }

  public static void main(String[] args)
  {
    try
    {
      sum(-10, 10);
    }
    catch(CustomException ce)
    {
      System.out.println(ce); //it calls the toString() method of user-defined Exception
    }
  }
}
