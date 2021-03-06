package io.hauer.demo.api.v2

import org.springframework.web.bind.annotation.*

/**
 * @author Jan Hauer
 */

@RestController
@RequestMapping("/api/v2")
class AdvancedController {

    private var salutation = "Hello"

    data class SalutationVo(val text: String)

    @GetMapping
    fun greeting(@RequestParam(required = false, defaultValue = "World") name: String) = "$salutation $name!"

    @PutMapping
    fun setSalutation(@RequestBody vo: SalutationVo) {
        this.salutation = vo.text
    }

    @DeleteMapping
    fun deleteSalutaion() = {
        this.salutation = "Hello"
    }
}
