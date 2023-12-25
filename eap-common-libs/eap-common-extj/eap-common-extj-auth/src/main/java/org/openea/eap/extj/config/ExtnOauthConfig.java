package org.openea.eap.extj.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import static org.openea.eap.extj.config.ExtnOauthConfig.PREFIX;


/**
 * @deprecated
 */
@Data
@ConfigurationProperties(prefix = PREFIX)
public class ExtnOauthConfig {

    public static final String PREFIX = "oauth";

    /**
     * 服务器域名
     */
    @Value("${config.ApiDomain:http://127.0.0.1:30000}")
    protected String extnDomain;

    /**
     * 是否开启接口鉴权
     */
    @Value("${config.EnablePreAuth:false}")
    protected Boolean enablePreAuth;

    /**
     * 开启单点登录, 需额外代码支持
     */
    protected Boolean ssoEnabled = false;

    /**
     * 后端登录完整路径路径
     */
    protected String loginPath;

    /**
     * 默认发起的登录协议
     */
    protected String defaultSSO = "cas";

    /**
     * 轮询Ticket有效期, 秒
     */
    protected long ticketTimeout = 60;

    /**
     * 服务器域名
     */
    @Value("${config.FrontDomain:http://127.0.0.1:3000}")
    protected String extnFrontDomain;

    /**
     * 服务器域名
     */
    @Value("${config.AppDomain:http://127.0.0.1:8080}")
    protected String extnAppDomain;

}
