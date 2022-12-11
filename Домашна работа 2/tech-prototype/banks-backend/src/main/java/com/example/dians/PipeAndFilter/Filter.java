package com.example.dians.PipeAndFilter;

public interface Filter<T> {
    T execute(T input);
}
