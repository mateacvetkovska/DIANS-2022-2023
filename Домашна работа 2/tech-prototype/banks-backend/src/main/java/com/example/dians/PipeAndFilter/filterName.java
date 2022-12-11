package com.example.dians.PipeAndFilter;

public class filterName implements Filter<String>{
    @Override
    public String execute(String input) {
        return input.split(",")[3];
    }
}
