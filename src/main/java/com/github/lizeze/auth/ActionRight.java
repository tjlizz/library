package com.github.lizeze.auth;

import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author ：lzz
 * @BelongsProject: com.github.lizeze.auth
 * @date ：Created in 2020/8/7 10:47
 * @description ：
 * @modified By：
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ActionRight {

    String actionCode() default " ";


}
