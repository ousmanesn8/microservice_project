package microservice.enseignant.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EnseignantIntrouvableException extends RuntimeException {
    public EnseignantIntrouvableException(String s) {
        super(s);
    }
}
