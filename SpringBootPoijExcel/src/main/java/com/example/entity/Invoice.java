package com.example.entity;

/*
    created by Atiye Mousavi
    Date: 1/5/2023
    Time: 10:21 PM
*/


import com.poiji.annotation.ExcelCell;
import com.poiji.annotation.ExcelCellName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Invoice {

    @Id
    @GeneratedValue
    private Integer id;

    @ExcelCellName("Name") // ("Name") is the column name in excel
    private String name;

    @ExcelCell(1)    // (1) indicates excel column # 1
    private Double amount;

    @ExcelCell(2)   // (2) indicates excel column # 2
    private String number;

    @ExcelCellName("RecievedDate") // ("RecievedDate") is the column name in excel
    private String receivedDate;

}