package horovyi.petclinic.bootstrap;

import horovyi.petclinic.model.Owner;
import horovyi.petclinic.model.Pet;
import horovyi.petclinic.model.PetType;
import horovyi.petclinic.model.Vet;
import horovyi.petclinic.services.OwnerService;
import horovyi.petclinic.services.PetTypeService;
import horovyi.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by ihor.horovyi 2019-01-30
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType savedDogPetType = savePetType("Dog");
        PetType catCatPetType = savePetType("Cat");
        System.out.println("Loaded pet types...");

        saveOwner("Ivan", "Ivanov", "My Dog", savedDogPetType);
        saveOwner("Petr", "Petrov", "My Cat", catCatPetType);
        System.out.println("Loaded owners...");

        saveVet("Mike", "Ekim");
        saveVet("Sem", "Mem");
        System.out.println("Loaded vets...");
    }

    private void saveOwner(String firstName, String lastName, String petName, PetType petType) {
        Owner owner = new Owner();
        owner.setFirstName(firstName);
        owner.setLastName(lastName);
        owner.setAddress("123 SomeAddress");
        owner.setCity("New York");
        owner.setTelephone("1241234312");

        Pet pet = createPet(petName, owner, petType);
        owner.getPets().add(pet);

        ownerService.save(owner);
    }

    private static Pet createPet(String name, Owner owner, PetType petType) {
        Pet pet = new Pet();
        pet.setName(name);
        pet.setBirthDate(LocalDate.now());
        pet.setOwner(owner);
        pet.setPetType(petType);
        return pet;
    }

    private void saveVet(String firstName, String lastName) {
        Vet vet = new Vet();
        vet.setFirstName(firstName);
        vet.setLastName(lastName);
        vetService.save(vet);
    }

    private PetType savePetType(String name) {
        PetType petType = new PetType();
        petType.setName(name);
        return petTypeService.save(petType);
    }
}
