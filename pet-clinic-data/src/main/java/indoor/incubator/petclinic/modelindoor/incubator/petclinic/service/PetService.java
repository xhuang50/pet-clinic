package indoor.incubator.petclinic.modelindoor.incubator.petclinic.service;

import indoor.incubator.petclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(String lastName);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
