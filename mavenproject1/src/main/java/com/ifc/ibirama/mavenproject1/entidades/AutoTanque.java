/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifc.ibirama.mavenproject1.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;
import java.util.Objects;

/**
 *
 * @author aluno
 */@PrimaryKeyJoinColumn(name="id")
public class AutoTanque extends Viatura{
     @Id
     @Column(name="aut_id")
    private Integer id;
     @Column(name="aut_litragem", unique =false , nullable=false)
    private Float litragem;
    
    public AutoTanque(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getLitragem() {
        return litragem;
    }

    public void setLitragem(Float litragem) {
        this.litragem = litragem;
    }

     @Override
    public int hashCode(){
        return getClass().hashCode();
    }
   
    
}
