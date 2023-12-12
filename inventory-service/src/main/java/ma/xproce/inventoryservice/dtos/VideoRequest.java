package ma.xproce.inventoryservice.dtos;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class VideoRequest {
    private String name;
    private String url;
    private String description;
    private Date datePublication;
    private CreatorRequest creator;
}
