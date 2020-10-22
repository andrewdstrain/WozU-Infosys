package com.example.demo;

import com.example.demo.service.CalculatorService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Calculator {
    private CalculatorService calculatorService;

    public Number add(Number a, Number b) {
        Mockito.when(calculatorService.add(2, 4)).thenReturn(6);
        return calculatorService.add(2, 4);
    }
}
