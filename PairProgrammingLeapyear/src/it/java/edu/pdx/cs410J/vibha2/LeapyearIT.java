package edu.pdx.cs410J.vibha2;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

/**
 * Integration tests for the <code>Student</code> class's main method.
 * These tests extend <code>InvokeMainTestCase</code> which allows them
 * to easily invoke the <code>main</code> method of <code>Student</code>.
 */
public class LeapyearIT extends InvokeMainTestCase {
  @Test
  public void invokingMainWithNoArgumentsHasExitCodeOf1() {
    String[] args={"2","2"};
    InvokeMainTestCase.MainMethodResult result = invokeMain(Leapyear.class,args);
    assertThat(result.getExitCode(), equalTo(1));
  }

  @Test
  public void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Leapyear.class,new String[] {});
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  public void witharguments() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Leapyear.class,new String[] {"2000"});
    assertThat(result.getTextWrittenToStandardOut(), containsString("Leap Year"));
  }



}
