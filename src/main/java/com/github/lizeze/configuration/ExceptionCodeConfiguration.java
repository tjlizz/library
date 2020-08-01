/**
 * @author zeze.li
 * @version 1.0.0
 * @ClassName UnifyResponse.java
 * @Description 异常信息获取
 * @createTime 2020年08月01日 18:35:00
 */
package com.github.lizeze.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;


@ConfigurationProperties(prefix = "error")
@PropertySource(value = "classpath:config/exception-code.properties")
@Component
public class ExceptionCodeConfiguration {

    private Map<Integer, String> codes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return codes;
    }

    public void setCodes(Map<Integer, String> codes) {
        this.codes = codes;
    }


    public String getMessage(int code) {
        String message = codes.get(code);
        return message;
    }
}
