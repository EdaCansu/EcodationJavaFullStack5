package com.edacansu.exception;


import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.webjars.NotFoundException;

@RestController
public class GlobalHandlingException {

    @ExceptionHandler(EdaCansuException.class)
    public String handlingMySpecialException(){
        return "kendi exception";
    }

    @ExceptionHandler(NullPointerException.class)
    public String handlingNullPointerException(){
        return "Null değer girildi";
    }

    @ExceptionHandler(ChangeSetPersister.NotFoundException.class)
    public String handlingNotFoundException(){
        return "böyle bir obje yoktur";
    }


}
