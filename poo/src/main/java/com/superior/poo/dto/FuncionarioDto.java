package com.superior.poo.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FuncionarioDto(
        @NotBlank(message = "Não pode estar em branco")
        @NotNull (message = "Não pode ser nulo") String nmFuncionario,
        @NotNull (message = "Não pode ser valor nulo")int telefoneFuncionario,
        @NotNull (message = "Não pode ser valor nulo")
        @DecimalMin(value = "0.01", message = "Valor deve ser acima de 0") double salarioFuncionario




) {}
