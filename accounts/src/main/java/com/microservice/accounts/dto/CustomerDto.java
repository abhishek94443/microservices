package com.microservice.accounts.dto;




import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

public class CustomerDto {

   @Size(min =5, max=30,message = "the length od name should be between 5 and 30")
   @NotEmpty(message = "Name cannot be null or empty")
   private String name;

    @NotEmpty(message = "Email cannot be null or empty")
    @Email(message = "Email should be a valid value")
    private String email;


    @Pattern(regexp = "(^$|[0-9]{10})", message = "Number must be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}