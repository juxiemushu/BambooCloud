package com.bamboo.account.configuration.druid;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author WuWei
 * @date 2020/9/11 3:30 下午
 */

@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "spring.datasource.druid")
public class DruidDataSourceProperties {

    /**
     * 数据库连接池名称，如果不设置，会随机生成
     * "DataSource-" + System.identityHashCode(this)
     */
    private String name;

    /**
     * 数据库类型，如果没有值，Druid默认会解析数据库url，获取dbType
     */
    private String dbType;

    /**
     * 数据库连接 URL
     */
    private String url;

    /**
     * 数据库连接驱动
     */
    private String driverClassName;

    /**
     * 数据库账户名称
     */
    private String username;

    /**
     * 数据库账户密码
     */
    private String password;

    /**
     * 连接池初始化时的物理连接数量
     */
    private Integer initialSize;

    /**
     * 连接池中最小连接数量
     */
    private Integer minIdle;

    /**
     * 连接池中最大连接数量
     */
    private Integer maxActive;

    /**
     * 获取数据库连接时的最大等待时间，单位是毫秒
     */
    private Long maxWait;

    /**
     * 获取数据库连接时是否使用非公平锁
     */
    private Boolean useUnfairLock;

    /**
     * 获取数据库连接时校验连接是否有效的 SQL，一般是一个查询语句，如 SELECT 1
     */
    private String validationQuery;

    /**
     * 获取数据库连接校验连接是否有效时，执行 SQL 的超时时间
     */
    private Integer validationQueryTimeout;

    /**
     * 申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效
     */
    private Boolean testWhileIdle;

    /**
     * 归还连接时执行validationQuery检测连接是否有效
     */
    private Boolean testOnBorrow;

    /**
     * 申请连接时执行 validationQuery 检测连接是否有效
     */
    private Boolean testOnReturn;

    /**
     * 是否缓存preparedStatement，MySQL 下建议关闭
     */
    private Boolean poolPreparedStatements;

    /**
     * 如果开启缓存preparedStatement，值必须设置为大于0，默认为-1
     */
    private Integer maxPoolPreparedStatementPerConnectionSize;

    /**
     * 空闲连接存活时间，空闲连接超过指定时间即断开
     */
    private Long timeBetweenEvictionRunsMillis;

    /**
     * 是否异步初始化
     */
    private Boolean asyncInit;

    /**
     * 过滤器
     */
    private String filters;

    /**
     * 密码回调类路径
     */
    private String passwordCallback;

    /**
     * 数据库连接属性键值对，配置格式：key1=val1;key2=val2;key3=val3，获取配置信息时会根据';'和'='拆分
     */
    private String connectionProperties;

}
