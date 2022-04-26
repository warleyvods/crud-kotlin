package com.example.crudkotlin.service

import com.example.crudkotlin.entity.Pessoa
import com.example.crudkotlin.repository.PessoaRepository
import org.springframework.stereotype.Service

@Service
class PessoaService(val pessoaRepository: PessoaRepository) {

    fun save(pessoa: Pessoa) = pessoaRepository.save(pessoa)

    fun findById(id: Long) = pessoaRepository.findById(id)

    fun listAll() = pessoaRepository.findAll();

}
