package zhenquan.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zhenquan.springframework.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
