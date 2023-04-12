package com.lumberjack.Services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class UIServiceTest {

    @Test
    void simpleLineOutputTest() {
        String text = "Teste do lineoutput";
        String result = UIService.lineOutput(text);
        assertEquals(32, result.length());
    }
}