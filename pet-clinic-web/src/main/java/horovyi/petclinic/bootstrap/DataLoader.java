package horovyi.petclinic.bootstrap;

import horovyi.petclinic.model.Owner;
import horovyi.petclinic.model.Vet;
import horovyi.petclinic.services.OwnerService;
import horovyi.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by ihor.horovyi 2019-01-30
 */
@Component
public class DataLoader implements CommandLineRunner {

    private OwnerService ownerService;
    private VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Ivan");
        owner1.setLastName("Ivanov");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(1L);
        owner2.setFirstName("Petr");
        owner2.setLastName("Petrov");

        ownerService.save(owner2);

        System.out.println("Loading owners...");


        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Mike");
        vet1.setLastName("Ekim");

        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Sem");
        vet2.setLastName("Mem");

        vetService.save(vet2);

        System.out.println("Loading vets...");

    }
}
