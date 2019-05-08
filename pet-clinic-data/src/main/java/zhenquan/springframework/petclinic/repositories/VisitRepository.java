package zhenquan.springframework.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import zhenquan.springframework.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
