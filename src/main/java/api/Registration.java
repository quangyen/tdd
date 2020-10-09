package api;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Registration {
    private Subject subject;
    private Student student;
    private ClassRoom classRoom;
}
