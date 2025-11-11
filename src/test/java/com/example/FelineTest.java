package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

class FelineTest {

    @Test
    void eatMeatReturnsCorrectFood() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    void getFamilyReturnsCats() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    void getKittensDefaultReturnsOne() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 5})
    void getKittensParameterized(int count) {
        Feline feline = new Feline();
        assertEquals(count, feline.getKittens(count));
    }
}