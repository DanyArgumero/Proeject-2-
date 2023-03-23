package com.example.JobTest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long Id_User;


    @Column(name = "name")
    private String Name;
    private String ComplementaryName;
    private String LastName;
    private String Country;

    private String Email;

    /**
     * Función getter para retornar el Id del usuario
     *
     * @return Id_User
     */
    public Long getId_User() {
        return Id_User;
    }

    /**
     * Función setter para modificar el Id del usuario
     *
     * @param id_User
     */
    public void setId_User(Long id_User) {
        Id_User = id_User;
    }

    /**
     * Función setter que retorna el nombre del usuario
     *
     * @return String Name
     */
    public String getName() {
        return Name;
    }

    /**
     * Función setter para modificar el nombre del usuario
     *
     * @param name
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * Función getter para retornar los nombres complementarios del usuario
     *
     * @return ComplementaryNAme
     */
    public String getComplementaryName() {
        return ComplementaryName;
    }

    /**
     * Función setter para modificar los nombres complementarios del usuario
     *
     * @param complementaryName
     */
    public void setComplementaryName(String complementaryName) {
        ComplementaryName = complementaryName;
    }

    /**
     * Función getter para retornar el apellido del usuario
     *
     * @return LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * Función setter para modificar los apellidos del usuario
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        LastName = lastName;
    }

    /**
     * Función getter para retornar el pais de trabajo del usuario
     * @return Country
     */
    public String getCountry() {
        return Country;
    }

    /**
     * Función setter para modificar el pais de trabajo del usuario
     * @param country
     */
    public void setCountry(String country) { Country = country; }

    /**
     * Función getter para retornar el correo electronico del usuario
     * @return Email
     */
    public String getEmail() { return Email; }

    /**
     * Función setter para construir el Email
     * @param email
     */
    public void setEmail(String email) {
        Email = email;
    }

}

