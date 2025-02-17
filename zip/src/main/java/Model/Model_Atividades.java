package Model;
import org.hibernate.mapping.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Model_Atividades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private Double preco;

    @OneToMany(mappedBy = "atividade")
    private List blocosHorarios;

    @ManyToMany(mappedBy = "atividades")
    private List participantes;

	private List bloco_horario;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public List getBlocosHorarios() {
        return bloco_horario;
    }

    public void setBlocosHorarios(List blocosHorarios) {
        this.bloco_horario = blocosHorarios;
    }

    public List getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List participantes) {
        this.participantes = participantes;
    }
}
