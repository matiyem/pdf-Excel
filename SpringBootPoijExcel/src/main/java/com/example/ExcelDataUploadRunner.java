package com.example;

/*
    created by Atiye Mousavi
    Date: 1/6/2023
    Time: 2:23 PM
*/


import com.example.repository.InvoiceRepository;
import com.example.service.ExcelPoijiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ExcelDataUploadRunner implements CommandLineRunner {

    @Autowired
    InvoiceRepository repo;

    @Autowired
    ExcelPoijiService excelPoijiService;

    @Override
    public void run(String... args) {

        repo.saveAll(excelPoijiService.getListfromExcelData());
    }

}