package horovyi.petclinic.services;

import horovyi.petclinic.model.Pet;

import java.util.Set;

public interface PetService <T extends Pet> {

    T findById(Long id);

    T save(T model);

    Set<T> findAll();

}
