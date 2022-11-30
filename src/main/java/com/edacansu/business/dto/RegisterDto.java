package com.edacansu.business.dto;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
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

    @NotEmpty(message = "{register.name.validation.constraints.NotNull.message}")
    private String name;

    @NotEmpty(message = "{register.surname.validation.constraints.NotNull.message}")
    private String surname;

    @NotEmpty(message = "{register.email.validation.constraints.NotNull.message}")
    @Email(message = "emaili doğru formatta girmediniz")
    private String emailAddress;

    @NotEmpty(message = "{register.password.validation.constraints.NotNull.message}")
    @Size(min = 6, max = 20, message = "Şifreniz en az 6 en fazla 20 karakterden oluşmalıdır.")
    private String password;

    private Date createdDate;
}
