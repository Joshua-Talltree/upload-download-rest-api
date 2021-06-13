package com.restapi.uploaddownloadapi;

import com.restapi.uploaddownloadapi.config.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class UploadDownloadApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UploadDownloadApiApplication.class, args);
    }

}
