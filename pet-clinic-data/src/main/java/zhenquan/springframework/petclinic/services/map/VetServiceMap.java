package zhenquan.springframework.petclinic.services.map;

import org.springframework.stereotype.Service;
import zhenquan.springframework.petclinic.model.Specialty;
import zhenquan.springframework.petclinic.model.Vet;
import zhenquan.springframework.petclinic.services.SpecialtyService;
import zhenquan.springframework.petclinic.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstactMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {

        if(object.getSpecialities().size() > 0){
            object.getSpecialities().forEach(specialty -> {
                if(specialty.getId() == null){
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
