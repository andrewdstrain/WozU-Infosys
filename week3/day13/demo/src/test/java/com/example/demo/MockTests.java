package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MockTests {
//    @Mock
    private List<Integer> list = new ArrayList<>();

    @Test
    void testList() {
        list.add(100);
        Mockito.when(list.get(4)).thenReturn(567);
        int actual = list.get(0);
        Assertions.assertEquals(100, actual);
    }
}
