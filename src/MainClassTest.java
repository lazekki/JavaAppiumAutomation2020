import org.junit.Test;

public class MainClassTest {

    MainClass mainClass = new MainClass();

    public void printTestResult(boolean testResult){
        if (testResult) {
            System.out.println("Test passed.");
        } else {
            System.out.println("Test failed. Expected number is 14, actual number is " + mainClass.getLocalNumber());
        }
    }

    @Test
    public void testGetLocalNumber() {
        boolean testResult = false;
        if (mainClass.getLocalNumber() == 14) {
            testResult = true;
        } else {
            testResult = false;
        }
        printTestResult(testResult);
    }

}
