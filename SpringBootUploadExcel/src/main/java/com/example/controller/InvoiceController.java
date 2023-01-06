package com.example.controller;

/*
    created by Atiye Mousavi
    Date: 1/5/2023
    Time: 11:41 AM
*/

import com.example.entity.Invoice;
import com.example.repository.InvoiceRepository;
import com.example.service.IExcelDataService;
import com.example.service.IFileUploaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class InvoiceController {

    @Autowired
    IFileUploaderService fileService;

    @Autowired
    IExcelDataService excelservice;

    @Autowired
    InvoiceRepository repo;

    @GetMapping("/")
    public String index() {
        return "uploadPage";
    }

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {

        fileService.uploadFile(file);

        redirectAttributes.addFlashAttribute("message",
                "You have successfully uploaded '"+ file.getOriginalFilename()+"' !");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "redirect:/";
    }

    @GetMapping("/saveData")
    public String saveExcelData(Model model) {

        List<Invoice> excelDataAsList = excelservice.getExcelDataAsList();
        int noOfRecords = excelservice.saveExcelData(excelDataAsList);
        model.addAttribute("noOfRecords",noOfRecords);
        return "success";
    }
}