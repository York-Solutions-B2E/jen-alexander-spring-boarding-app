package com.happytailsbackend.controller;

import com.happytailsbackend.OwnerDTO;
import com.happytailsbackend.service.OwnerService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OwnerController {

    private final OwnerService ownerService;
    @Autowired
    public OwnerController(OwnerService ownerService) {
        System.out.println("Creating Owner Controller");
        this.ownerService = ownerService;
    }

    @GetMapping("/owners")
    public ResponseEntity<List<OwnerDTO>> getAllOwners() {
        System.out.println("in getAllOwners in ownerController");
        List<OwnerDTO> ownerDTO = ownerService.getAllOwners();
        if (ownerDTO.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(ownerDTO, HttpStatus.OK);
    }



}
