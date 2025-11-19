package utez.edu.mx.gmuback.modules.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import utez.edu.mx.gmuback.modules.students.dto.StudentDTO;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    private String username;
    private String email;
    private StudentDTO student;
}
