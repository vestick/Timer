package org.example.views;

public interface Printable <T> {
    default void getOutput(T data) {
        System.out.println(data);
    }
}
