package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping("/addition")
    public Addition sum(@RequestParam(value="a1", defaultValue="0") long a1, 
    		@RequestParam(value="a2", defaultValue="0") long a2) {
        return new Addition(a1, a2);
    }
    
    @RequestMapping("/subtract")
    public Subtraktion subtract(@RequestParam(value="a1", defaultValue="0") long a1, 
    		@RequestParam(value="a2", defaultValue="0") long a2) {
        return new Subtraktion(a1, a2);
    }
    
    
}