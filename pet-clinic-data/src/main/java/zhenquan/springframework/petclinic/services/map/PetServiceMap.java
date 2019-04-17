package zhenquan.springframework.petclinic.services.map;

import zhenquan.springframework.petclinic.model.Pet;
import zhenquan.springframework.petclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstactMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
