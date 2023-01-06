package com.example.service;

/*
    created by Atiye Mousavi
    Date: 1/5/2023
    Time: 11:45 AM
*/


import com.example.entity.Invoice;

import java.util.List;

public interface IExcelDataService {

    List<Invoice> getExcelDataAsList();

    int saveExcelData(List<Invoice> invoices);
}
