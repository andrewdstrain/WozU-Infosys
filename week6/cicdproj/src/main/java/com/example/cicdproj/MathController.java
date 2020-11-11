package com.example.cicdproj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @GetMapping("/add/{x}/{y}")
    int addIntegers(@PathVariable int x, @PathVariable int y) {
        return x +  y;
    }

    @GetMapping("/multiply/{x}/{y}")
    int multiplyIntegers(@PathVariable int x, @PathVariable int y) {
        return x * y;
    }


}
