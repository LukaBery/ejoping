package com.nhnacademy.twojopingbatch.common.config;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;
import java.time.Duration;

@Configuration
@RequiredArgsConstructor
public class MySqlConfig {
    private static final int CORE_COUNT = Runtime.getRuntime().availableProcessors();
    private static final int MAX_THREADS = 200;
    @Value("${spring.datasource.url}")
    private String mysqlUrl;

    @Value("${spring.datasource.username}")
    private String mysqlUsername;

    @Value("${spring.datasource.password}")
    private String mysqlPassword;

    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();

        // MySQL 연결 정보 설정
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl(mysqlUrl);
        dataSource.setUsername(mysqlUsername);
        dataSource.setPassword(mysqlPassword);

        // DBCP2 커넥션 풀 설정
        configureConnectionPool(dataSource);
        configureConnectionValidation(dataSource);
        configureConnectionManagement(dataSource);

        return dataSource;
    }
    private void configureConnectionPool(BasicDataSource dataSource) {
        dataSource.setInitialSize(CORE_COUNT * 2);
        dataSource.setMaxTotal(MAX_THREADS);
        dataSource.setMaxIdle(MAX_THREADS);
        dataSource.setMinIdle(MAX_THREADS / 10);
    }

    private void configureConnectionValidation(BasicDataSource dataSource) {
        dataSource.setTestOnBorrow(true);
        dataSource.setTestOnReturn(true);
        dataSource.setTestWhileIdle(true);

        dataSource.setValidationQuery("SELECT 1");
        dataSource.setValidationQueryTimeout(Duration.ofSeconds(3));
    }

    private void configureConnectionManagement(BasicDataSource dataSource) {
        dataSource.setMaxWait(Duration.ofSeconds(10));
        dataSource.setRemoveAbandonedTimeout(Duration.ofSeconds(30));
        dataSource.setRemoveAbandonedOnBorrow(true);

        dataSource.setTimeBetweenEvictionRunsMillis(300000); // 5분
        dataSource.setMinEvictableIdle(Duration.ofMinutes(10));
    }

    private int calculateOptimalMaxConnections() {
        int baseConnections = (CORE_COUNT * 4) + 1;
        return Math.min(baseConnections + 2, 100);
    }

}

