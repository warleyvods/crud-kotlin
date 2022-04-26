package com.example.crudkotlin.controller

import com.example.crudkotlin.entity.Pessoa
import com.example.crudkotlin.service.PessoaService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class PessoaController(val pessoaService: PessoaService, val pessoaService2: PessoaService2) {

    @PostMapping
    fun save(@RequestBody @Valid pessoa: Pessoa) = pessoaService.save(pessoa)

    @GetMapping("{id}")
    fun find(@PathVariable id: Long) = pessoaService.findById(id)

    @GetMapping
    fun findAll(): MutableList<Pessoa> = pessoaService.listAll()

}
