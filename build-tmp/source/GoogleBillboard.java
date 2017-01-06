import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

int a = 2;
int b = 12;
int function = 0;
public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059921817413596629043572900334295260595630738132328627943490763233829880753195251019011573834187930702154089149934884167509";
public void setup()  
{
  int x = 2;
  int y = 12;
	String testString = e.substring(x,y);
	double testDigits = Double.parseDouble(testString);
  while (isPrime(testDigits) == false)
  {
    x++;
    y++;
    testString = e.substring(x,y);
    testDigits = Double.parseDouble(testString);
  }
  System.out.println(testString);
}
public void draw()
{
  String testStringTwo = e.substring(a,b);
  while (function < 5)
  {
    if (sum49(testStringTwo))
    {
      System.out.println(testStringTwo);
      function++;
    }
    a++;
    b++;
    testStringTwo = e.substring(a,b);
  }
  if (function == 5)
    noLoop();
}
public boolean isPrime(double dNum)  
{
  if (dNum <= 1)
    return false;
  else
  {
    for (int i = 2; i <= Math.sqrt(dNum); i++)
    {
      if (dNum % i == 0)
        return false;
    }
  }
  return true;
}
public boolean sum49(String sumString)
{
  int sum = 0;
  ArrayList <Double> digit = new ArrayList <Double>();
  for (int i = 0; i < sumString.length(); i++)
    digit.add(Double.parseDouble(sumString.substring(i, i+1)));
  for (Double test: digit)
    sum += test;
  if (sum == 49)
    return true;
  return false;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
