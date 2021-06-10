package com.projetinho.service.impl;

import com.projetinho.controller.dto.AddressDTO;
import com.projetinho.service.AddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Override
    public AddressDTO create(AddressDTO addressDTO) {
        return addressDTO;
    }

}