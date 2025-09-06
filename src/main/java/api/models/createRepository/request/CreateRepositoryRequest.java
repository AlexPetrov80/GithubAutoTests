package api.models.createRepository.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRepositoryRequest {
    private Boolean jsonMemberPrivate;
    private Boolean isTemplate;
    private String name;
    private String description;
    private String homepage;
}
