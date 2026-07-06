package com.microservice.accounts.dto;



import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data

@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @Schema(
            description = "Account Number of the Customer"
    )
    @NotEmpty(message = "Account Number cannot be empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account noumber must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Name of the Customer",
            example = "savings"
    )

    @NotEmpty(message = "Account type cannot be empty")
    private String accountType;

    @Schema(
            description = "Branch Address of the Bank"
    )
    @NotEmpty(message = "Branch Address cannot be empty")
    private String branchAddress;
}