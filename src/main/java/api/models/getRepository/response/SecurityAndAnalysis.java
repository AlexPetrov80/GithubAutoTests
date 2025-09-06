package api.models.getRepository.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SecurityAndAnalysis {
    private SecretScanningPushProtection secretScanningPushProtection;
    private SecretScanningValidityChecks secretScanningValidityChecks;
    private SecretScanning secretScanning;
    private DependabotSecurityUpdates dependabotSecurityUpdates;
    private SecretScanningNonProviderPatterns secretScanningNonProviderPatterns;
}
