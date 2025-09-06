package com.superior.poo.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ClienteDto (
    @NotNull(message = "Nome não pode ser nulo")
    @NotBlank(message = "Nome não pdoe estar em branco") String nmCliente,
    @NotNull(message = "Telefone não pode ser nulo") int telefoneCliente,
    @NotNull(message = "Idade não pode ser nulo") int idadeCliente,
    @NotNull(message = "Altura não pode set nulo")
    @DecimalMin(value = "0.01", message = "Pessoa não pode ser um micróbio") double alturaClienteCm,
    @NotNull(message = "Rua (endereço) não pode ser nulo")
    @NotBlank(message = "Rua (endereço) não pode estar em branco") String ruaCliente



    ){}
