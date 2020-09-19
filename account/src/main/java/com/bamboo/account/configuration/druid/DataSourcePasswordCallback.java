package com.bamboo.account.configuration.druid;

import com.alibaba.druid.filter.config.ConfigTools;
import com.alibaba.druid.util.DruidPasswordCallback;

import java.util.Properties;

/**
 * @author WuWei
 * @date 2020/9/12 5:42 下午
 */

public class DataSourcePasswordCallback extends DruidPasswordCallback {

    private static final String PASSWORD = "password";
    private static final String PUBLIC_KEY = "config.decrypt.key";

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
        String password = (String)properties.get(PASSWORD);
        String publicKey = (String)properties.get(PUBLIC_KEY);

        String dbPassword;
        try {
            dbPassword = ConfigTools.decrypt(publicKey, password);
            setPassword(dbPassword.toCharArray());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
