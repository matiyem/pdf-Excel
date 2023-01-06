package com.example;

import com.example.pdf.PDFGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringBootGeneratePdfApplication {

    public static void main(String[] args) {
        ApplicationContext ac= SpringApplication.run(SpringBootGeneratePdfApplication.class, args);
        PDFGenerator pDFGenerator = ac.getBean("pdfGenerator",PDFGenerator.class);

        pDFGenerator.generatePdfReport();
    }

}
