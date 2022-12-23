//package com.example.dians.insert;
//
//import com.example.dians.PipeAndFilter.Pipe;
//import com.example.dians.PipeAndFilter.toUpperCase;
//import com.example.dians.entity.Bank;
//import com.example.dians.service.BankService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//
//@Component
//public class LoadData implements CommandLineRunner {
//    private final String FILE_PATH = "C:\\Users\\ninam\\Downloads\\DIANS-2022-2023-main\\DIANS-2022-2023-main\\banks.csv";
//    private final BankService bankService;
//
//    @Autowired
//    public LoadData(BankService bankService) {
//        this.bankService = bankService;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH));
//
//        Pipe<String> pipe = new Pipe<>();
//        toUpperCase toUpperCase = new toUpperCase();
//        pipe.addFilter(toUpperCase);
//
//        String readLine = "";
//
//        while ((readLine = bufferedReader.readLine()) != null) {
//            String out = pipe.runFilter(readLine);
//            String latitude = out.split(",")[1];
//            String longitude = out.split(",")[2];
//            String bankName = out.split(",")[3];
//            String bankAddress = out.split(",")[4];
//            String bankCity =  out.split(",")[5];
//            bankService.saveBank(new Bank(bankName,bankAddress,bankCity,Double.parseDouble(longitude),Double.parseDouble(latitude)));
//        }
//
//        bufferedReader.close();
//
//
//    }
//}
