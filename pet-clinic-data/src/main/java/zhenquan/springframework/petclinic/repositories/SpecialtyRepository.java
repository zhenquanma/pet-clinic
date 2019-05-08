package zhenquan.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zhenquan.springframework.petclinic.model.Specialty;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
