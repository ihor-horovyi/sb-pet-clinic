package horovyi.petclinic.services.map;

import horovyi.petclinic.model.Speciality;
import horovyi.petclinic.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by ihor.horovyi 2019-02-21
 */
@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }
}
