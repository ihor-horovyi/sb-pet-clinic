package horovyi.petclinic.services;

import horovyi.petclinic.model.Owner;

import java.util.Set;

/**
 * Created by ihor.horovyi on 01/24/19
 */
public interface OwnerService<T extends Owner> {

    T findByLastName(String lstName);

    T findById(Long id);

    T save(T model);

    Set<T> findAll();

}
