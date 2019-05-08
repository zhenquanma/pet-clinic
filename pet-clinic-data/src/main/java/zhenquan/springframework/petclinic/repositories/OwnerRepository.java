package zhenquan.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zhenquan.springframework.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
