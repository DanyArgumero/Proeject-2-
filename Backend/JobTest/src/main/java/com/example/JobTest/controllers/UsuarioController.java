package com.example.JobTest.controllers;

import com.example.JobTest.models.UsuarioModel;
import com.example.JobTest.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("http://localhost:3000/")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    /**
     * Método GET del API REST que retorna todos los usuarios de la base de datos
     * @return ArrayList<UsuarioModel>
     */
    @GetMapping()
    public ArrayList<UsuarioModel> getUsers(){
        return usuarioService.getUsuarios();
    }

    /**
     * Método GET del API REST que retorna un solo usuario por medio de su Id
     * @param Id
     * @return Usuario solicitado
     */
    @GetMapping(path = "/{Id}")
    public Optional<UsuarioModel> getbyId(@PathVariable("Id") Long Id){
        return this.usuarioService.getbyId(Id);
    }
    /**
     * Método POST del API REST que retorna una Estado HTTP
     * @param usuario
     * @return codigo de estado
     */
    @PostMapping()
    public UsuarioModel setUser(@RequestBody UsuarioModel usuario) {
        return this.usuarioService.setUsuario(usuario);
    }

    /**
     * Método DELETE del API REST que retorna una respuesta de si se elimino o no el usuario
     * @param Id
     * @return Respuesta de confirmación de eliminación del usuario
     */
    @DeleteMapping(path = "/{Id}")
    public String deletebyId(@PathVariable ("Id") Long Id){
        boolean ok = this.usuarioService.DeleteUser(Id);
        if (ok)
            return "Se elimino el usuario con id: " + Id;
        else
            return "No se pudo eliminar el usuario con id: " + Id;
    }

    @PutMapping(path = "/{Id}")
        public UsuarioModel UpdateUser(@RequestBody UsuarioModel usuario, @PathVariable ("Id") Long Id){
            return UpdateUser(usuario, Id);
    }
}
