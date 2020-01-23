package edu.pdx.cs410J.vibha2;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Unit tests for the Student class.  In addition to the JUnit annotations,
 * they also make use of the <a href="http://hamcrest.org/JavaHamcrest/">hamcrest</a>
 * matchers for more readable assertion statements.
 */
public class LeapyearTest
{

  @Test
  public void notaLeapYear(){
    Leapyear year=new Leapyear();
    assertThat(year.isLeapYear(2111),equalTo("Not a Leap Year"));
  }

}