package com.tjz.cloudsystem;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 14791
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCreateCacheAnnotation
public class CloudSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudSystemApplication.class, args);
    }

}
