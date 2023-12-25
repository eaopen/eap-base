package org.openea.eap.extj.config;

import cn.dev33.satoken.config.SaTokenConfig;
import cn.dev33.satoken.jwt.StpLogicJwtForSimple;
import cn.dev33.satoken.stp.StpLogic;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @deprecated
 */
@Configuration
@EnableConfigurationProperties(ExtnOauthConfig.class)
public class AuthAutoConfigration {


    @Primary
    @Bean
    @ConfigurationProperties(prefix = "oauth.login")
    public SaTokenConfig getExtnTokenConfig() {
        return new ExtnTokenConfig();
    }

    @Primary
    @Bean
    public StpLogic getExtnTokenJwtLogic() {
        return new StpLogicJwtForSimple();
    }
}
