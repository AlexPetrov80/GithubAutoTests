package api.models.getRepository.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Owner {
    private String gistsUrl;
    private String reposUrl;
    private String userViewType;
    private String followingUrl;
    private String starredUrl;
    private String login;
    private String followersUrl;
    private String type;
    private String url;
    private String subscriptionsUrl;
    private String receivedEventsUrl;
    private String avatarUrl;
    private String eventsUrl;
    private String htmlUrl;
    private Boolean siteAdmin;
    private Integer id;
    private String gravatarId;
    private String nodeId;
    private String organizationsUrl;
}
