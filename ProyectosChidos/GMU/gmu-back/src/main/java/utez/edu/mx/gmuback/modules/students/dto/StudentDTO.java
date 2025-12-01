package utez.edu.mx.gmuback.modules.students.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentDTO {
    private String fullname;
    private String matricula;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public StudentDTO() {
    }

    public StudentDTO(String fullname, String matricula) {
        this.fullname = fullname;
        this.matricula = matricula;
    }
}
