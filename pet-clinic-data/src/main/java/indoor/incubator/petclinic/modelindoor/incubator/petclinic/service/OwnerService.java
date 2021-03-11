package indoor.incubator.petclinic.modelindoor.incubator.petclinic.service;

import indoor.incubator.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(String lastName);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
