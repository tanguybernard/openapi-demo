package com.prez.demo

import org.openapitools.model.User
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
class FirstController {

    @RequestMapping("hello")
    fun firstEndpoint(): String = "Hello world"

    @RequestMapping("json")
    fun mapEndpoint(): HashMap<String, String> {
        val map = HashMap<String, String>()
        map["key"] = "value"
        map["name"] = "John Doe"

        return map
    }

    @RequestMapping("user")
    fun userEndpoint(): User  {
        return User(3, "John", "Doe2")
    }
}