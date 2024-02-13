package dto.request;

import lombok.*;


@NoArgsConstructor
@Setter
@Getter
public class RegisterRequest {
    private String email;
    private String password;


}
