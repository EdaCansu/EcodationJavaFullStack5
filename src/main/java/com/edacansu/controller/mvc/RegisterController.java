package com.edacansu.controller.mvc;


import com.edacansu.bean.ModelMapperBean;
import com.edacansu.bean.PasswordEncodeBean;
import com.edacansu.business.dto.RegisterDto;
import com.edacansu.data.entity.RegisterEntity;
import com.edacansu.data.repository.IRegisterRepository;
import com.edacansu.exception.EdaCansuException;
import com.edacansu.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

//Lombok
@RequiredArgsConstructor
@Log4j2

@Controller
//@RequestMapping("/controller")
public class RegisterController {

    //Inject
    private final ModelMapperBean modelMapperBean;
    private final PasswordEncodeBean passwordEncodeBean;
    private final IRegisterRepository repository;

    //FILE-WRITER / FILE-READER


    //Speed Data
    //http:localhost:8080/validation/speeddata
    @GetMapping("/validation/speeddata")
    public String CreateRegisterSpeedData(Model model){
        int counter = 1;
        for(long i=1; i<=5 ; i++) {
            UUID uuid = UUID.randomUUID();
            RegisterEntity registerEntity = RegisterEntity.builder()
                    .name("adı " + i)
                    .surname("soyadı " + i)
                    .password(passwordEncodeBean.passwordEncoderMethod().encode(uuid.toString()))
                    .emailAddress(uuid + "@deneme.com")
                    .build();
            repository.save(registerEntity);
            counter++;
        }
        model.addAttribute("key_dataset",counter + "tane veri eklendi");
        return "redirect:/register/list";
    }



    //LIST
    //http:localhost:8080/register/list
    @GetMapping("/register/list")
    public String validationListRegister(Model model){
        Iterable<RegisterEntity> list = repository.findAll();
        model.addAttribute("register_list", list);
        list.forEach((temp)-> {
            System.out.println(temp);
        });
        return"register/register_list";
    }


    //CREATE
    //http:localhost:8080/validation/create
    @GetMapping("/validation/create")
    public String validationCreateGetRegister(Model model){
        model.addAttribute("key_register_validation", new RegisterDto());
        return "register/register_create";
    }

    @PostMapping("/validation/create")
    public String validationCreatePostRegister(@Valid @ModelAttribute("key_register_validation") RegisterDto registerDto, BindingResult bindingResult, Model model) throws EdaCansuException {
       if(bindingResult.hasErrors()){
           log.error("HATA: "+ bindingResult);
           return "register/register_create";
       }
       //DATABASE
        model.addAttribute("register_success", "Kullanıcı kayıt edildi." + registerDto);
       log.info("Success: "+ registerDto);
       registerDto.setPassword(passwordEncodeBean.passwordEncoderMethod().encode(registerDto.getPassword()));
       RegisterEntity registerEntity= modelMapperBean.modelMapperMethod().map(registerDto,RegisterEntity.class);
       if(registerEntity!=null)
       repository.save(registerEntity);
       else
           throw new EdaCansuException("Kayıt eklenemedi..");
       return "redirect:/register/list";
    }

    /*
    {
    "name" : null,
    "surname" : null,
    "emailAdress": null,
    "password": null
    }
    */



    //FIND
    //http:localhost:8080/register/find/1
    @GetMapping({"/register/find/{id}", "register/find"})
    public String validationFindRegister(@PathVariable(name = "id", required = false) Long id, Model model){
        Optional<RegisterEntity> findRegister = repository.findById(id);
        if(findRegister.isPresent()){
            model.addAttribute("register_find", findRegister.get());
        }else{
            model.addAttribute("register_find_not_find", id + "nolu data bulamadı");
        }
        return"register/register_find";
    }

    //UPDATE
    //http:localhost:8080/register/update/1
    @GetMapping("/register/update/{id}")
    public String validationUpdateGetRegister(@PathVariable(name = "id") Long id, Model model){
        //FILE
        //DATABASE
        return "register/register_update";
    }

    @PostMapping("/register/update/{id}")
    public String validationUpdatePostRegister(@PathVariable(name = "id") Long id,@Valid @ModelAttribute("update_register") RegisterDto registerDto, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            log.error("HATA: "+ bindingResult);
            return "register/register_create";
        }
        //DATABASE
        model.addAttribute("register_success", "Kullanıcı kayıt edildi." + registerDto);
        log.info("Success: "+ registerDto);
        return "redirect:/register/list";
    }


    //DELETE
    //http:localhost:8080/register/delete/1
    @GetMapping("/register/delete/{id}")
    public String validationDeleteRegister(@PathVariable(name = "id", required = false) Long id, Model model){
        RegisterEntity registerEntityFind = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id + "id bulunamadı"));
        if(registerEntityFind!=null){
            repository.deleteById(id);
        }else{
            model.addAttribute("register_delete_not_find", id + "nolu data bulunamadı");
        }
        return"redirect:/register/list";
    }

}
