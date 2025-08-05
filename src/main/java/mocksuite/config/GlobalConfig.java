package mocksuite.config;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

/**
 * Configuration for global settings
 */
@Getter
@Setter
public class GlobalConfig {
    private String version = "0.1";
    private int managementPort = 8080;
    private String managementHost = "localhost";
    private boolean enableManagement = true;
    private LoggingConfig logging = new LoggingConfig();
    private Map<String, Object> globalProperties = new HashMap<>();

    @Override
    public String toString() {
        return "GlobalConfig{" +
                "version='" + version + '\'' +
                ", managementPort=" + managementPort +
                ", managementHost='" + managementHost + '\'' +
                ", enableManagement=" + enableManagement +
                ", logging=" + logging +
                ", globalProperties=" + globalProperties +
                '}';
    }
}
