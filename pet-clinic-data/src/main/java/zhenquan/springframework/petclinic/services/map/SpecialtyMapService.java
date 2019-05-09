package zhenquan.springframework.petclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import zhenquan.springframework.petclinic.model.Specialty;
import zhenquan.springframework.petclinic.services.SpecialtyService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class SpecialtyMapService extends AbstactMapService<Specialty, Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}
