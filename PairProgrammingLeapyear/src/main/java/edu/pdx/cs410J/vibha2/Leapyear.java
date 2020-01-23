package edu.pdx.cs410J.vibha2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * This class is represents a <code>Student</code>.                                 
 */                                                                                 
public class Leapyear {

   public String isLeapYear(int year){
       String str="";
       String dateregex = "^([0-9]{4}$)";
       Pattern pattern1 = Pattern.compile(dateregex);
       Matcher matcher1 =  pattern1.matcher(Integer.toString(year));
       boolean correctyear = matcher1.matches();
       if(!correctyear)
       {
           throw new IllegalArgumentException(str + "Valid year needed");
       }
      else if(year%400==0)
      {
          str=("Leap Year");
      }
      else if(year%100==0 && year%400!=0)
      {
          str=("Not a Leap Year");
      }
      else if(year%4==0 && year%100!=0)
      {
          str=("Leap Year");
      }
      else if(year%4!=0)
      {
          str= ("Not a Leap Year");
      }
return str;
   }

  /**
   * Main program that parses the command line, creates a
   * <code>Student</code>, and prints a description of the PairProgrammingLeapyear to
   * standard out by invoking its <code>toString</code> method.
   */
  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);


  }
}