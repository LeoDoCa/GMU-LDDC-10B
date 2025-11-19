package utez.edu.mx.gmuback.modules.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserStudentDTO {
    String fullName;
    String username;
    String email;
}
