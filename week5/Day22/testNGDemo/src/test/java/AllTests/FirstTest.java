package AllTests;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.apache.tools.ant.taskdefs.SetPermissions.NonPosixMode.fail;
import static org.testng.Assert.fail;

public class FirstTest {
    @Test(priority = 1)
    void setup() {
        System.out.println("This is setup()");
        fail();
    }

    @Test(priority = 3)
    void testLogin() {
        System.out.println("This is testLogin()");
    }

    @Test(priority = 2)
    void teardown() {
        System.out.println("This is teardown()");
    }
}
