package ma.xproce.inventoryservice.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CreatorRequest {
    private String name;
    private String email;
}
