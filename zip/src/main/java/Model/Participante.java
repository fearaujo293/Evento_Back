package Model;
import org.hibernate.mapping.List;

import Services.Atividade;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    @ManyToMany
    @JoinTable(
        name = "participante_atividade",
        joinColumns = @JoinColumn(name = "participante_id"),
        inverseJoinColumns = @JoinColumn(name = "atividade_id")
    )
    private List atividades;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public List getAtividades() {
        return atividades;
    }

    public void setAtividades(List atividades) {
        this.atividades = atividades;
    }
}
