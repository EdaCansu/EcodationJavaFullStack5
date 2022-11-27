package com.edacansu.controller.mvc;


import com.edacansu.business.dto.RegisterDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/controller")
public class RegisterController {


    //CREATE

    //LIST
    //http:localhost:8080/controller/register_list
    @GetMapping("register_list")
    public String thymeleaf5(Model model){
        List<RegisterDto> registerDtoList = new ArrayList<>();

        for(long i = 0; i <=10; i++){
            UUID uuid = UUID.randomUUID();
            registerDtoList.add(RegisterDto.builder()
                    .id(i)
                    .name("adı " + i)
                    .surname("soyadı "+ i)
                    .emailAddress("email@ "+i)
                    .password(uuid.toString())
                    .createdDate(new Date(System.currentTimeMillis()))
                    .build());
        }

        model.addAttribute("key_thymeleaf5", registerDtoList);
        return"register/register_list";
    }

    //FIND

    //UPDATE

    //DELETE

}