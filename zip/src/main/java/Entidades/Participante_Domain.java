package Entidades;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name = "tb_participante")

public class Participante_Domain{

	@Id @GeneratedValue( strategy = GenerationType.IDENTITY)
	private Integer id;
    private String nome;
    private String email;
    private Set<Atividade_Domain> atividades;

    public Participante_Domain() {
    }

    public Participante_Domain(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.atividades = new HashSet<>();
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

    public Set<Atividade_Domain> getAtividades() {
        return atividades;
    }

    public void setAtividades(Set<Atividade_Domain> atividades) {
        this.atividades = atividades;
    }

    public void addAtividade(Atividade_Domain atividade) {
        this.atividades.add(atividade);
    }

    public void removeAtividade(Atividade_Domain atividade) {
        this.atividades.remove(atividade);
    }
}
