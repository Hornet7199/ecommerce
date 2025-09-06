package com.superior.poo.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProdutoDto (
    @NotBlank(message = "Não pode cadastrar produto sem nome") String nmProduto,
    String dsProduto,
    @NotNull(message = "Não é possível cadastrar o produto com valor nulo")
    @DecimalMin(value = "0.01", message = "Não é possível cadastrar o produto com valor abaixo de 0,01")
    double vlProduto,
    @NotNull(message = "Não pode cadastrar com flag vazia")
            @NotBlank(message = "Não pode cadastrar com flag em branco")
    String flAtivo
) {}