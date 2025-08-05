package mocksuite.config;

import lombok.Getter;
import lombok.Setter;

/**
 * Configuration for logging settings
 */
@Getter
@Setter
public class LoggingConfig {
    private String level = "INFO";
    private boolean enableFileLogging = true;
    private String logDirectory = "logs";
    private String logFileName = "mocksuite.log";
    private int maxFileSize = 100; // MB
    private int maxHistory = 30; // days

    @Override
    public String toString() {
        return "LoggingConfig{" +
                "level='" + level + '\'' +
                ", enableFileLogging=" + enableFileLogging +
                ", logDirectory='" + logDirectory + '\'' +
                ", logFileName='" + logFileName + '\'' +
                ", maxFileSize=" + maxFileSize +
                ", maxHistory=" + maxHistory +
                '}';
    }
}
