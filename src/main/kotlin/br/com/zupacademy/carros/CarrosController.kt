package br.com.zupacademy.carros

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.validation.Valid

@Controller("/api/carros")
@Validated
class CarrosController {

    @Post
    fun criar(@Body @Valid carro: Carro): HttpResponse<Any>{
        return HttpResponse.ok(carro)
    }
}