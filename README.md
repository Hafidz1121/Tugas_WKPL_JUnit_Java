# Tugas_WKPL_JUnit_Java
Tugas WKPL Berkaitan Dengan JUnit Java

Pada Junit Testing ini akan melakukan testing pada file ekstensi Java

Berikut adalah kode file Calculator.java
```java
public class Calculator {
    static double add(double... operands) {
        return DoubleStream.of(operands).sum();
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands).reduce(1, (a, b) -> a * b);
    }
}
````

Kemudian untuk kode file CalculatorTest.java
```java
class CalculatorTest {

    @Test
    void add() {
        assertEquals(6, Calculator.add(2, 4));
    }

    @Test
    void multiply() {
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }
}
```

Kemudiann untuk outputnya akan menghasilkan sebuah notifikasi "success" atau "fail" dan apabila terjadi sebuah error akan memberikan hasil yang seharusnya keluar (Actual Value)
