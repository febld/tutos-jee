package feb.java.rest.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController /* ==> raccourci pour @Controller + @ResponseBody */
public class GreetingController {

    private static final String template = "Bonjour %s !";

    private final AtomicLong counter = new AtomicLong();

    /* Annotations alternatives :
     * @PostMapping  : pour requête POST
     * @RequestMapping(method=GET)
     *
     */
    @GetMapping( "/greeting" )
    public Greeting greeting( @RequestParam( value = "name", defaultValue = "Monde" ) String name ) {

        return new Greeting( counter.incrementAndGet(), String.format( template, name ) );
    }
}
