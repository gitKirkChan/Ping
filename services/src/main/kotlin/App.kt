package ping.main

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("ping.services")
open class App

fun main(args: Array<String>)
{
    SpringApplication.run(App::class.java, *args)
}