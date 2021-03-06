package indoor.incubator.petclinic.service;

import indoor.incubator.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
