package com.example.awss3test;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.auth.credentials.ProfileCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

@Configuration
public class AWSConfig {
    ProfileCredentialsProvider credentialsProvider = ProfileCredentialsProvider.create("myTest");
    Region region = Region.AP_NORTHEAST_2;

    @Bean
    public S3Client s3() {
        return S3Client.builder()
                .region(region)
                .credentialsProvider(credentialsProvider)
                .build();
    }

}
