import api.ClassRoom;
import api.Student;
import api.Subject;
import org.junit.Before;
import org.junit.Test;

public class LearnTest {
    private Student student;

    @Before
    public void setUp(){
        student = new Student();
    }

    @Test
    public void summit_validatedRegistration_success() {
        Subject subject = new Subject();
        ClassRoom room = ClassRoom.builder().maxSeat(SuiteTest.CLASS_SEAT_MAXIMUM).build();
        student.register(subject,room);
    }

    @Test
    public void summit_duplicateSubject_duplicateException() {
    }
}
