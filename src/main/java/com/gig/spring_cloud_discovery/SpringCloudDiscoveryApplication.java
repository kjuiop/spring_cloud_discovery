package com.gig.spring_cloud_discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDiscoveryApplication.class, args);
    }

}

/**
 * @EnaleEurekaServer
 * 유레카 서버의 자격으로 등록해주는 어노테이션
 *
 * 유레카 설정파일을 application.yml 에 등록한다.
 *
 * eureka:
 *  client:
 *   register-with-eureka: false
 *   fetch-registry: false
 *
 * 기본값이 True 로 서버를 eureka 에 client 로 등록하기 때문에
 * 자기 자신을 서버에 등록하지 않는 것으로 설정
 */
