import java.io.*;
public class CustomException extends Exception{
  private int ex;
  CustomException(int a)
  {
    ex = a;
  }
  public String toString()
  {
    return "CustomException[" + ex +"] is less than zero";
  }
}


