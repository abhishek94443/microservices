package com.microservice.accounts.dto;




import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",description = "Schema to hold customer and account information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the Customer",
            example = "abhishek dwivedi"
    )
   @Size(min =5, max=30,message = "the length od name should be between 5 and 30")
   @NotEmpty(message = "Name cannot be null or empty")
   private String name;

    @Schema(
            description = "Email of the Customer",
            example = "abhishekdwivedi94443@gmail.com"
    )
    @NotEmpty(message = "Email cannot be null or empty")
    @Email(message = "Email should be a valid value")
    private String email;


    @Schema(
            description = "Mobile Number of the Customer",
            example = "8516868928"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Account Details of the Customer"
    )
    private AccountsDto accountsDto;
}