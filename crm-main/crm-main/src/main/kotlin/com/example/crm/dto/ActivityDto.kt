package com.example.crm.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class ActivityDto {


    @NotNull(message = "Full name is required")
    @NotBlank(message = "Full name is required")
    var fullName: String? = null

    @NotNull(message = "Email is required")
    @NotBlank(message = "Email is required")
    var email: String? = null
}