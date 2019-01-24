package horovyi.petclinic.services;

import horovyi.petclinic.model.Vet;

import java.util.Set;

public interface VetService <T extends Vet> {

    T findById(Long id);

    T save(T model);

    Set<T> findAll();

}
