package com.bankArchitecture.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
@Data
public class AccountsDto {

    @Schema(
        description = "Account number of Anant's account",
        example = "1234567890"
    )
    @NotEmpty(message = "Account number can not be null or empty")
    @Pattern(regexp="(^$|[0-9]{10})",message = "AccountNumber must be 10 digits")
    private Long accountNumber;

    @Schema(
            description = "Account type of Anant's account",
            example = "Savings"
    )
    @NotEmpty(message = "Account Type can not be null or empty")
    private String accountType;

    @Schema(
            description = "Anant's Bank Branch Address",
            example = "EON IT Park, Ganga Costellina Road, Pune"
    )
    @NotEmpty(message = "Branch Address can not be null or empty")
    private String branchAddress;
}
