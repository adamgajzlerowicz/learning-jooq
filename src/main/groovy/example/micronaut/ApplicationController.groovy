package example.micronaut;

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.http.MediaType

@CompileStatic
@Controller("/hello")
class ApplicationController {
    @Get("/")
    @Produces(MediaType.TEXT_PLAIN)
    String index() {
        "Hello World"
    }
}
