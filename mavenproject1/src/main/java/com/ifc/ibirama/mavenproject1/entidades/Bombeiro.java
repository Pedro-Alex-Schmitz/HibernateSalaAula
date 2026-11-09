/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifc.ibirama.mavenproject1.entidades;

import jakarta.persistence.CascadeType;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author aluno
 */
@Entity
@Table(name="Bombeiro")
public class Bombeiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bom_id")
    private Integer id;
    @Column(name = "bom_cpf", length = 11, unique = true, nullable = false)
    private String cpf;
    @Column(name = "bom_data_nascimento", nullable = false)
    private LocalDate dataNascimento;
    @Column(name = "bom_nome_completo", nullable = false, length = 45)
    private String nomeCompleto;
    @Column(name = "bom_nome_guerra", nullable = false, unique = true, length = 45)
    private String nomeGuerra;
    @OneToOne(mappedBy = "bombeiro")
    private Usuario usuario;
    
//    (mappedBy = "bombeiro",cascade = CascadeType.ALL)
//    @OneToMany(mappedBy = "bombeiro")
//    private Set<TelefoneContato> telefone = new HashSet<TelefoneContato>();
//     @ManyToMany
//    @JoinTable(name = "Bombeiro_has_Patente", joinColumns = @JoinColumn(name = "bom_id"),inverseJoinColumns = @JoinColumn(name = "pat_id"))
//    private Set<Patente> patente = new HashSet<Patente>();


            

    public Bombeiro() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeGuerra() {
        return nomeGuerra;
    }

    public void setNomeGuerra(String nomeGuerra) {
        this.nomeGuerra = nomeGuerra;
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
        final Bombeiro other = (Bombeiro) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.nomeCompleto, other.nomeCompleto)) {
            return false;
        }
        if (!Objects.equals(this.nomeGuerra, other.nomeGuerra)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.dataNascimento, other.dataNascimento);
    }

   
    @Override
    public int hashCode(){
        return getClass().hashCode();
    }

}


