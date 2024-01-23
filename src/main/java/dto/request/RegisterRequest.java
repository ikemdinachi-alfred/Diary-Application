package dto.request;

import lombok.*;


@NoArgsConstructor
@Setter
@Getter
public class RegisterRequest {
    private String username;
    private String password;


}
