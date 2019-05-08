package zhenquan.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zhenquan.springframework.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
