package api.models.getRepository.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Permissions {
    private Boolean pull;
    private Boolean maintain;
    private Boolean admin;
    private Boolean triage;
    private Boolean push;
}
