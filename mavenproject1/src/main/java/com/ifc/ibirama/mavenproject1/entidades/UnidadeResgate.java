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
public class UnidadeResgate extends Viatura {
     @Id
     @Column(name="unr_id")
    private Integer id;
     @Column(name="unr_capacidade", unique =false , nullable=false)
    private Integer capacidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UnidadeResgate other = (UnidadeResgate) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.capacidade, other.capacidade);
    }
    @Override
    public int hashCode(){
        return getClass().hashCode();
    }
    
}
