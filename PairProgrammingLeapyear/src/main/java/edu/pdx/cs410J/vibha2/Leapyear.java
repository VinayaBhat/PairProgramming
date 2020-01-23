package edu.pdx.cs410J.vibha2;

/**
 * This class is represents a <code>Student</code>.                                 
 */                                                                                 
public class Leapyear {

   public boolean isLeapYear(int year){
      if(year%400==0)
      {
          return true;
      }
      else if(year%100==0 && year%400!=0)
      {
          return false;
      }
      else if(year%4==0 && year%100!=0)
      {
          return true;
      }
      else if(year%4!=0)
      {
          return false;
      }

      return false;
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