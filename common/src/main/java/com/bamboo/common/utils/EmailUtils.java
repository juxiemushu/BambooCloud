package com.bamboo.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/**
 * @author WuWei
 * @date 2020/9/19 1:13 下午
 */

public class EmailUtils {

    private static final Pattern EMAIL_VERIFY_PATTERN = Pattern.compile("^\\s*?(.+)@(.+?)\\s*$");

    public static boolean isEmailAddress(String emailAddress) {
        if (StringUtils.isEmpty(emailAddress)) {
            return false;
        }
        return EMAIL_VERIFY_PATTERN.matcher(emailAddress).matches();
    }

    private static boolean notEmailAddress(String emailAddress) {
        return !isEmailAddress(emailAddress);
    }

}
