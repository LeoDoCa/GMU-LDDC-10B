package utez.edu.mx.gmuback.modules.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateUserDTO {
    private Long id;
    private String username;
    private String email;
}
