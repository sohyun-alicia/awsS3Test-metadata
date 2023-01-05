package com.example.awss3test;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequiredArgsConstructor
public class AWSController {

    private final AWSService awsService;

    @PostMapping("/aws/upload")
    public void uploadFile(MultipartFile file) {
        awsService.putObject(file);
    }
}
