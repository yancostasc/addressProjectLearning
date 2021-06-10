package com.projetinho.controller;

import com.projetinho.controller.dto.AddressDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.projetinho.service.AddressService;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
    public @ResponseBody String teste(){
        return "teste";
    }

    /*
    @PostMapping("/projetinho/teste")
    public AddressDTO create(AddressDTO addressDTO) {
        return addressService.create(addressDTO);
    }
     */
}
