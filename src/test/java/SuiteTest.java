import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = { LearnTest.class,ManageTest.class })
public class SuiteTest {
    public static final int CLASS_SEAT_MAXIMUM = 30;
}
