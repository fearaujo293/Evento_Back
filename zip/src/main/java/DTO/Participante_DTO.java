package DTO;

import java.util.Set;

public class Participante_DTO {
    private Integer id;
    private String nome;
    private String email;
    private Set<Atividade_DTO> atividades;

    public Participante_DTO() {
    }

    
    

    public Participante_DTO(Integer id, String nome, String email, Set<Atividade_DTO> atividades) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.atividades = atividades;
	}

	// Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Atividade_DTO> getAtividades() {
        return atividades;
    }

    public void setAtividades(Set<Atividade_DTO> atividades) {
        this.atividades = atividades;
    }
}