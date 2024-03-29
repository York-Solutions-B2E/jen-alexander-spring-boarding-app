package com.happytailsbackend.repository;

import com.happytailsbackend.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository  extends JpaRepository<Owner, Long> {

}
