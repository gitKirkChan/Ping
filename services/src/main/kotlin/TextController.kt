package ping.services.endpoints

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
public class TextController
{
    @GetMapping(value = "/test")
    fun test() = "Hello Spring Boot! (again)"
}

