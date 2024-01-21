package dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class CreateEntryRequest {
    private String body;
    private String title;
    private String username;

}
