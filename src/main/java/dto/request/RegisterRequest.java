package dto.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class RegisterRequest {
    private String username;
    private String password;


}
