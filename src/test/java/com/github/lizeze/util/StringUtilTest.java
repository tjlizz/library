package com.github.lizeze.util;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author zeze.li
 * @version 1.0.0
 * @ClassName AAATest.java
 * @Description TODO
 * @createTime 2020年08月01日 18:14:00
 */
public class StringUtilTest {


    @Test
    public void isEmptyOrNull() {

        assertTrue(StringUtil.isEmptyOrNull(""));
    }

}
