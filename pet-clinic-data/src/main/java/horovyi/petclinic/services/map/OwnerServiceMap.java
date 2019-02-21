package horovyi.petclinic.services.map;

import horovyi.petclinic.model.Owner;
import horovyi.petclinic.model.Pet;
import horovyi.petclinic.services.OwnerService;
import horovyi.petclinic.services.PetService;
import horovyi.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        if (object == null) {
            return null;
        }

        if (object.getPets() != null) {
            object.getPets().forEach(pet -> {
                if (pet.getPetType() == null) {
                    throw new RuntimeException("PetType is required");
                }
                if (pet.getPetType().getId() == null) {
                    pet.setPetType(petTypeService.save(pet.getPetType()));
                }
                if (pet.getId() == null) {
                    Pet savedPet = petService.save(pet);
                    pet.setId(savedPet.getId());
                }
            });
        }

        return super.save(object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lstName) {
        throw new UnsupportedOperationException("Method is not implemented");
    }
}
