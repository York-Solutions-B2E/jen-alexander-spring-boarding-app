package com.happytailsbackend.service;

import com.happytailsbackend.OwnerDTO;
import com.happytailsbackend.model.Owner;
import com.happytailsbackend.repository.OwnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OwnerService {

    private final OwnerRepository ownerRepository;

    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public List<OwnerDTO> getAllOwners() {
        List<Owner> ownersEntity;
        ownersEntity = ownerRepository.findAll();

        return ownersEntity.stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());
    }


    private OwnerDTO convertEntityToDTO(Owner owner) {
        OwnerDTO ownerDTO = new OwnerDTO();
        ownerDTO.setName(owner.getName());
        ownerDTO.setEmail(owner.getEmail());
        ownerDTO.setPhone(owner.getPhone());
        return ownerDTO;
    }
}
