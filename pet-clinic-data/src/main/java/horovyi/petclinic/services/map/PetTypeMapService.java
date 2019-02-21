package horovyi.petclinic.services.map;

import horovyi.petclinic.model.PetType;
import horovyi.petclinic.services.PetTypeService;

import java.util.Set;

/**
 * Created by ihor.horovyi 2019-02-21
 */
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }
}
