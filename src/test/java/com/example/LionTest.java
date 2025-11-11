package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

class LionTest {

    @Test
    void invalidSexThrowsException() {
        Feline mockFeline = mock(Feline.class);
        Exception ex = assertThrows(Exception.class, () -> new Lion("Неверный", mockFeline));
        assertTrue(ex.getMessage().contains("Используйте допустимые значения пола"));
    }
}