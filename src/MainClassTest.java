import org.junit.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

public class MainClassTest {

    MainClass mainClass = new MainClass();

    @Test
    public void testGetClassString() {
        boolean testResult = false;
        String testString = mainClass.getClassString();

        testResult = ((testString.indexOf("Hello") != -1) || (testString.indexOf("hello") != -1)) ?
                true : false;

        printTestResult(testResult, "Substring 'Hello' or 'hello' not found.");
    }

    @Test
    public void testGetClassNumber() {
        boolean testResult = false;
        if (mainClass.getClassNumber() > 45) {
            testResult = true;
            printTestResult(testResult, "");
        } else {
            testResult = false;
            printTestResult(testResult, "Expected class number should be more 45, actual class number is " + mainClass.getClassNumber());
        }
    }

    @Test
    public void testGetLocalNumber() {
        boolean testResult = false;
        if (mainClass.getLocalNumber() == 14) {
            testResult = true;
            printTestResult(testResult, "");
        } else {
            testResult = false;
            printTestResult(testResult, "Expected number is 14, actual number is " + mainClass.getLocalNumber());
        }
    }

    public void printTestResult(boolean testResult, String message){
        if (testResult) {
            System.out.println("Test passed. ");
        } else {
            System.out.println("Test failed. " + message);
        }
    }
}
