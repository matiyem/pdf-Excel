package com.example.repository;

/*
    created by Atiye Mousavi
    Date: 1/5/2023
    Time: 11:45 AM
*/


import com.example.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}