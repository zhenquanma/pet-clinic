package zhenquan.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;
import zhenquan.springframework.petclinic.model.Visit;
import zhenquan.springframework.petclinic.services.VisitService;

import java.util.Set;

@Service
public class VisitMapService extends AbstactMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit object) {

        if(object == null || object.getPet() == null || object.getPet().getId() == null ||

                object.getPet().getOwner() == null || object.getPet().getOwner().getId() == null){

            throw new RuntimeException("Invalid visit");
        }

        return super.save(object);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
