package nesalmanov.ru.authservice.model.dto.request;

import lombok.Data;

@Data
public class UserRegisterRequest {

    private String username;
    private String password;

}
