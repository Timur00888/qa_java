package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ParameterizedTests {

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    void lionManeParameterized(String sex, boolean expected) throws Exception {
        Feline mockFeline = mock(Feline.class);
        when(mockFeline.getKittens()).thenReturn(1);
        Lion lion = new Lion(sex, mockFeline);
        assertEquals(expected, lion.doesHaveMane());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 5})
    void felineGetKittensParameterized(int count) {
        Feline feline = new Feline();
        assertEquals(count, feline.getKittens(count));
    }
}
