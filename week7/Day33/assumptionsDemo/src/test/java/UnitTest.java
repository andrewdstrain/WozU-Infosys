import model.Project;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UnitTest {
    Project project;
    Project allTheFields;

    @BeforeEach
    void beforeEach() {
        project = new Project();
        allTheFields = new Project("snoopy", "PROD", "Red Baron");
        System.setProperty("ENV", "DEV");
    }

    @Test
    void assumptionTest() {
        Assumptions.assumeTrue(allTheFields.getStages().equals(System.getProperty("ENV")), "Not in DEV");
        System.out.println("We're in dev!");

        Assertions.assertEquals("Red Baron", allTheFields.getTitle());
//        Assumptions.assumeTrue(false);  // Used to skip tests
//        System.out.println("This line will never print.");
    }
}
