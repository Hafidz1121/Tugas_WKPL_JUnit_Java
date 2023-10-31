package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        // method untuk memvalidasi bahwa nilai aktual dan nilai yang diharapkan adalah sama
        assertEquals(6, Calculator.add(2, 4));
    }

    @Test
    void multiply() {
        // method untuk memvalidasi seluruh assertion dan menampilkan pesan sukses / gagal
        // jika terdapat gagal maka terdapat pesan kesahalan berserta jawaban yang benar
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }
}