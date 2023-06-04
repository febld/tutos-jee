package feb.java.serverapp;

import io.swagger.v3.oas.annotations.Parameter;

import feb.java.openapi.api.PetsApi;
import feb.java.openapi.model.Pet;
import feb.java.openapi.model.PetFullData;

import java.util.concurrent.atomic.AtomicLong;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.validation.constraints.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController /* ==> raccourci pour @Controller + @ResponseBody */
public class PetController implements PetsApi {

    private final HashMap<Long, feb.java.serverapp.domain.Pet> pets = new HashMap<>();

    private final AtomicLong counter = new AtomicLong();

    @Override
    public ResponseEntity<PetFullData> createPets( Pet apiPet ) {
        
        feb.java.serverapp.domain.Pet pet = new feb.java.serverapp.domain.Pet();
        Long id = counter.incrementAndGet();

        pet.setName( apiPet.getName() );
        pet.setRace( apiPet.getRace() );
        pet.setAge( apiPet.getAge() );
        pet.setSexe( apiPet.getSexe() );

        pets.put( id, pet );

        return ResponseEntity.ok( domainToApi( id, pet ) );
    }

    //@Override
    public ResponseEntity<List<PetFullData>> listPets( @Parameter(name = "limit", description = "") @Valid @RequestParam(value = "limit", required = false) Integer limit
    ) {
        List<PetFullData> result = new ArrayList<>();
        for ( Map.Entry<Long, feb.java.serverapp.domain.Pet> entry : pets.entrySet() ) {
            result.add( domainToApi( entry.getKey(), entry.getValue() ) );
        }
        return ResponseEntity.ok( result );
    }

    @Override
    public ResponseEntity<PetFullData> showPetById(
        @Parameter(name = "petId", description = "pet identifier", required = true) @PathVariable("petId") String petId
    ) {
        if ( pets.containsKey( Long.valueOf( petId ) ) ) {
            return ResponseEntity.ok( domainToApi( Long.valueOf( petId ), pets.get( Long.valueOf( petId ) ) ) );
        }
        else {
            return new ResponseEntity<>( HttpStatus.NOT_FOUND );
        }
    }


    /* Transformation objet Pet domain en objet Pet api
     */
    private PetFullData domainToApi( Long id, feb.java.serverapp.domain.Pet pet ) {

        PetFullData pfd = new PetFullData();

        pfd.setPetId( id );
        pfd.setName( pet.getName() );
        pfd.setRace( pet.getRace() );
        pfd.setAge( pet.getAge() );
        pfd.setSexe( pet.getSexe() );

        return pfd;
    }
}
