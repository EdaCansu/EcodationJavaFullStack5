package com.edacansu.business.dto;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
//@SneakyThrows
//@RequiredArgsConstructor

public class RegisterDto {

    private Long id;

    @NotEmpty(message = "adı alanı boş geçemezsiniz")
    private String name;

    @NotEmpty(message = "soyadı alanı boş geçemezsiniz")
    private String surname;

    @NotEmpty(message = "email alanı boş geçemezsiniz")
    @Email(message = "emaili doğru formatta girmediniz")
    private String emailAddress;

    @NotEmpty(message = "şifre alanı boş geçemezsiniz")
    private String password;
    private Date createdDate;
}
