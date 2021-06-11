package com.projetinho.service;

import com.projetinho.controller.dto.AddressDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep" )
public interface AddressService {

    @GetMapping("{cep}/json")
    AddressDTO getCep(@PathVariable("cep") String cep);

}