package com.github.stream;

import java.util.Objects;
import java.util.stream.Stream;

public class MetodosIsNullENonNull {
    public static void main(String[] args) {
        Stream.of("João", null, "Maria", null)
                .filter(Objects::nonNull)
                .forEach(System.out::println);
    }
}
