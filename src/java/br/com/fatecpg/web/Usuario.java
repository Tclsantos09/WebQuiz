/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecpg.web;

import java.util.ArrayList;

/**
 *
 * @author thais.lopes
 */
public class Usuario {
<<<<<<< HEAD
    private String nome;
    private String username;
    
    public Usuario(String nome, String username) {
        this.nome = nome;
        this.username = username;
=======
    String nome;
    
    public Usuario(String nome) {
        this.nome = nome;
>>>>>>> 9c6b174a3495a5c69ea6cf466c76abe334eca3f8
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
<<<<<<< HEAD

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

=======
>>>>>>> 9c6b174a3495a5c69ea6cf466c76abe334eca3f8
}
