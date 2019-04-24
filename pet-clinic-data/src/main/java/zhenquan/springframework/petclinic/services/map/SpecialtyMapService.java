package zhenquan.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;
import zhenquan.springframework.petclinic.model.Speciality;
import zhenquan.springframework.petclinic.services.SpecialtiesService;

import java.util.Set;

@Service
public class SpecialtyMapService extends AbstactMapService<Speciality, Long> implements SpecialtiesService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
