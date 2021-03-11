package indoor.incubator.petclinic.modelindoor.incubator.petclinic.service;

import indoor.incubator.petclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(String lastName);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
