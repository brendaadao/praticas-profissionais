package com.marido.aluguel.marido.com.marido.aluguel.marido.DAO;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.marido.aluguel.marido.com.marido.aluguel.marido.Domain.ServicoDomain;

public interface MaridoDAO extends MongoRepository<ServicoDomain, String>{

}
