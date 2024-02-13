package dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
public class UserLoginRequest {
    private String email;
    private String password;
}
