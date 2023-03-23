package com.example.JobTest.services;

import com.example.JobTest.models.UsuarioModel;
import com.example.JobTest.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    /**
     * Método para traer todos los usuarios registrados en la bd
     * @return ArrayList<UsuarioModel>
     */
    public ArrayList<UsuarioModel> getUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    /**
     * Función que retorna un usuario con su identificador asignado
     * @param usuario
     * @return usuarioRepository
     */
    public UsuarioModel setUsuario(UsuarioModel usuario){
        String email = "";
        if(usuario.getCountry().equals("Colombia"))
           email = usuario.getName() + usuario.getLastName() + usuario.getId_User() +"@jvntecnologias.com";
        else if(usuario.getCountry().equals("Estados Unidos"))
           email = usuario.getName() + usuario.getLastName() + usuario.getId_User() +"@jvntecnologias.com.us";
        usuario.setEmail(email);
        return usuarioRepository.save(usuario);
    }

    /**
     * Método GET que retorna un solo usuario con dicho Id
     * @param Id
     * @return Usuario con el Id solicitado
     */
    public Optional<UsuarioModel> getbyId(Long Id){
        return usuarioRepository.findById(Id);
    }

    /**
     * Función eliminar usuario
     * @param Id
     * @return Confirmación o error de la eliminación del usuario
     */
    public boolean DeleteUser(Long Id) {
        try {
            usuarioRepository.deleteById(Id);
            return true;
        }catch (Exception err){
            return false;
        }
    }

    /**
     * Función para editar un usuario
     * @param usuario
     * @param Id
     * @return
     */
    public UsuarioModel UpdateUser(UsuarioModel usuario, Long Id){
        UsuarioModel usdb = usuarioRepository.findById(Id).get();
        return usuarioRepository.save(usdb);
    }
}
