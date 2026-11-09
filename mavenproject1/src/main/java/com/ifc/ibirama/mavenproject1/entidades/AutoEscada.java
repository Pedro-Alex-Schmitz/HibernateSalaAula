/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifc.ibirama.mavenproject1.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author aluno
 */@PrimaryKeyJoinColumn(name="id")
public class AutoEscada extends Viatura{
    @Id
    @Column(name="aue_id")
    private Integer id;
    @Column(name="aue_alturamaxima", unique =false , nullable=false)
    private Integer AlturaMaxima;
    public AutoEscada(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAlturaMaxima() {
        return AlturaMaxima;
    }

    public void setAlturaMaxima(Integer AlturaMaxima) {
        this.AlturaMaxima = AlturaMaxima;
    }
    
    @Override
    public int hashCode(){
        return getClass().hashCode();
    }        
    
}
