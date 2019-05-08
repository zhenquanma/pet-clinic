package zhenquan.springframework.petclinic.services;

import zhenquan.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
