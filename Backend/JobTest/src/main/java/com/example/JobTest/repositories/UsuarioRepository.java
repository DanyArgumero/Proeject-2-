package com.example.JobTest.repositories;

import com.example.JobTest.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin()
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {

}
