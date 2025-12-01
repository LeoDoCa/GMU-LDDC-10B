package utez.edu.mx.gmuback.utils;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class APIResponse {
    private String message;
    private Object data;
    private boolean error;
    private HttpStatus status;

    // Mandar un mensaje
    public APIResponse(String message, HttpStatus status) {
        this.message = message;
        this.status = status;
    }

    // Mandar un mensaje y un cuerpo de respuesta (data)
    public APIResponse(String message, Object data, HttpStatus status) {
        this.message = message;
        this.data = data;
        this.status = status;
    }

    // Mandar un mensaje de error
    public APIResponse(String message, boolean error, HttpStatus status) {
        this.message = message;
        this.error = true;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
