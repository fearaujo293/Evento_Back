package Entidades;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "tb_bloco")
public class Horário_Domain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Instant inicio;
    private Instant fim;

    // Relacionamento Muitos para Um com Atividade
    @ManyToOne
    @JoinColumn(name = "atividade_id") // Nome da coluna na tabela tb_bloco
    private Atividade_Domain atividade;

    public Horário_Domain(int id, Instant inicio, Instant fim, Atividade_Domain atividade) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.atividade = atividade;
    }

    public Horário_Domain() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instant getInicio() {
        return inicio;
    }

    public void setInicio(Instant inicio) {
        this.inicio = inicio;
    }

    public Instant getFim() {
        return fim;
    }

    public void setFim(Instant fim) {
        this.fim = fim;
    }

    public Atividade_Domain getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade_Domain atividade) {
        this.atividade = atividade;
    }
}
