package jdev.mentoria.lojavirtual.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pessoa_juridica")
public class PessoaJuridica extends Pessoa {
    
    private static final long serialVersionUID = 1L;
    
    @Column(nullable = false)
    private String cnpj;
    
    @Column(nullable = true)
    private String inscEstadual;
    
    @Column(nullable = true)
    private String inscMunicipal;
    
    @Column(nullable = false)
    private String nomeFantasia;
    
    @Column(nullable = false)
    private String razaoSocial;
    
    @Column(nullable = true)
    private String categoria;

    // Getters and setters...
}
