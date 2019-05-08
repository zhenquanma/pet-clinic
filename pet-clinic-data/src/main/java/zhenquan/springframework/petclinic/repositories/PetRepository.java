package zhenquan.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zhenquan.springframework.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
