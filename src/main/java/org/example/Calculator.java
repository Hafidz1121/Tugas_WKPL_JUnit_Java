package org.example;

import java.util.stream.DoubleStream;

public class Calculator {
    // method static dengan parameter double dan menggunakan varargs (variadic arguments)
    static double add(double... operands) {
        // mengembalikan nilai dengan mengambil array dalam parameter
        // dan mengonversi menjadi aliran (stream) serta menghitung jumlah semua angka dalam aliran tersebut
        return DoubleStream.of(operands).sum();
    }

    // method static dengan parameter double dan menggunakan varargs (variadic arguments)
    static double multiply(double... operands) {
        // mengembalikan nilai dengan mengambil array dalam parameter
        // dan mengkonversi menjadi aliran (stream) serta menghitung hasil perkalian semua angka dalam aliran tersebut
        return DoubleStream.of(operands).reduce(1, (a, b) -> a * b);
    }
}
