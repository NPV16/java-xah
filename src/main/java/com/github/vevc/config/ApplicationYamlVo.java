package com.github.vevc.config;

import lombok.Data;

/**
 * @author vevc
 */
@Data
public class ApplicationYamlVo {

    private SpringConfig spring = new SpringConfig();
    private AppConfigVo app = new AppConfigVo();

    public void setAppConfig(AppConfig appConfig) {
        this.getApp().setXrayVersion(appConfig.getXrayVersion());
        this.getApp().setHy2Version(appConfig.getHy2Version());
        this.getApp().setArgoVersion(appConfig.getArgoVersion());
        this.getApp().setDomain(appConfig.getDomain());
        this.getApp().setPort(appConfig.getPort());
        this.getApp().setUuid(appConfig.getUuid());
        this.getApp().setArgoDomain(appConfig.getArgoDomain());
        this.getApp().setArgoToken(appConfig.getArgoToken());
        this.getApp().setRealityPublicKey(appConfig.getRealityPublicKey());
        this.getApp().setRealityPrivateKey(appConfig.getRealityPrivateKey());
        this.getApp().setRealityShortId(appConfig.getRealityShortId());
        this.getApp().setRemarksPrefix(appConfig.getRemarksPrefix());
    }

    @Data
    public static class AppConfigVo {
        private String xrayVersion;
        private String hy2Version;
        private String argoVersion;
        private String domain;
        private String port;
        private String uuid;
        private String argoDomain;
        private String argoToken;
        private String realityPublicKey;
        private String realityPrivateKey;
        private String realityShortId;
        private String remarksPrefix;
    }

    @Data
    public static class SpringConfig {
        private Application application = new Application();
    }

    @Data
    public static class Application {
        private String name = "java-xah";
    }
}
