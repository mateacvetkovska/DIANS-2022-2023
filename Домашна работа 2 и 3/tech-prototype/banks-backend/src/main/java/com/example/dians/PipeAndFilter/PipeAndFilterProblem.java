package com.example.dians.PipeAndFilter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PipeAndFilterProblem {
    public static void main(String[] args) throws FileNotFoundException {
        Pipe<String> pipe = new Pipe<>();

        toLowerCase toLowerCase = new toLowerCase();
        toUpperCase toUpperCase = new toUpperCase();
        nameAndAddress nameAndAddress = new nameAndAddress();
        filterCity filterCity = new filterCity();
        filterName filterName = new filterName();

        //pipe.addFilter(toUpperCase);
        //pipe.addFilter(toLowerCase);
        //pipe.addFilter(nameAndAddress);
        //pipe.addFilter(filterCity);
        pipe.addFilter(filterName);

        Scanner scanner = new Scanner(new File("D:\\finki\\PETTI SEMESTAR\\DIZAJN I ARHITEKTURA NA SOFTVER\\homework1\\src\\main\\java\\PipeAndFilterPackage\\banks.csv"));
        scanner.useDelimiter(",");


        while (scanner.hasNextLine()){
            System.out.println(pipe.runFilter(scanner.nextLine()));
        }
    }
}
