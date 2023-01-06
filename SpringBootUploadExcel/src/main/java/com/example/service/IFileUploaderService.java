package com.example.service;

/*
    created by Atiye Mousavi
    Date: 1/5/2023
    Time: 11:46 AM
*/


import org.springframework.web.multipart.MultipartFile;

public interface IFileUploaderService {

    public void uploadFile(MultipartFile file);
}
