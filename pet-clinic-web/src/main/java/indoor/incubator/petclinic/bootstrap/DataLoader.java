package indoor.incubator.petclinic.bootstrap;

import indoor.incubator.petclinic.model.Owner;
import indoor.incubator.petclinic.model.Vet;
import indoor.incubator.petclinic.service.OwnerService;
import indoor.incubator.petclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Alica");
        owner1.setLastName("Apex");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Bela");
        owner2.setLastName("Benjamin");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Alex");
        vet1.setLastName("Alivet");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Beta");
        vet2.setLastName("Betavet");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
