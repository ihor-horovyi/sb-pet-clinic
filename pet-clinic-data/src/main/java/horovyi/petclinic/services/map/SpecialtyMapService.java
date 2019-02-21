package horovyi.petclinic.services.map;

import horovyi.petclinic.model.Specialty;
import horovyi.petclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by ihor.horovyi 2019-02-21
 */
@Service
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }
}
