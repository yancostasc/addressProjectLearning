package com.projetinho.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressDTO {

    private final String complemento;

    private final String bairro;

    private final String localidade;

    private final String uf;

    private final int cep;

    private final int logradouro;

    private final int ibge;

    private final int gia;

    private final int ddd;

    private final int siafi;

}
