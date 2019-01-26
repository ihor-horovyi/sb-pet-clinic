package horovyi.petclinic.services;

import horovyi.petclinic.model.Owner;

/**
 * Created by ihor.horovyi on 01/24/19
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lstName);

}
