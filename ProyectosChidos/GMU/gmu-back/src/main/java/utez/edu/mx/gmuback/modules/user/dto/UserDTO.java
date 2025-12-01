package utez.edu.mx.gmuback.modules.user.dto;

import lombok.*;
import utez.edu.mx.gmuback.modules.students.dto.StudentDTO;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDTO {
    private String username;
    private String email;
    private StudentDTO student;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public StudentDTO getStudent() {
        return student;
    }

    public void setStudent(StudentDTO student) {
        this.student = student;
    }

    public UserDTO() {
    }

    public UserDTO(String username, String email, StudentDTO student) {
        this.username = username;
        this.email = email;
        this.student = student;
    }
}
