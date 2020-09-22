package org.example;

import lombok.Data;

@Data
public class A {

    private String name;

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                '}';
    }
}
