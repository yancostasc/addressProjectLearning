package com.projetinho.controller;

import com.projetinho.controller.dto.AddressDTO;
import com.projetinho.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class AddressController {

    @Autowired
    private final AddressService addressService;

    @GetMapping("cep/{cep}/json")
    public ResponseEntity<AddressDTO> getCep(@PathVariable("cep") String cep) {
        AddressDTO addressDTO = addressService.getCep(cep);
        return ResponseEntity.ok().body(addressDTO);
    }

}