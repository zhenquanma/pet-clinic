package zhenquan.springframework.petclinic.services;

import zhenquan.springframework.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    Owner findLastName(String lastName);

    Set<Owner> findAll();

    Owner save(Owner owner);
}
