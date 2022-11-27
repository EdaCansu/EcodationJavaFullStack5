package com.edacansu.exception;


import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalHandlingException {

    @ExceptionHandler(EdaCansuException.class)
    public String handlingNotFoundException(){
        return "Böyle bir data yoktur";
    }

    @ExceptionHandler(NullPointerException.class)
    public String handlingNullPointerException(){
        return "Null değer girildi";
    }

}
