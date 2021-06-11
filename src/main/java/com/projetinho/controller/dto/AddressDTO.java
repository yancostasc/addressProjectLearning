package com.projetinho.controller.dto;

import lombok.Data;

@Data
public class AddressDTO {
    private final String cep;
    private final String logradouro;
    private final String complemento;
    private final String bairro;
    private final String localidade;
    private final String uf;
    private final String ibge;
    private final String gia;
    private final String ddd;
    private final String siafi;
}