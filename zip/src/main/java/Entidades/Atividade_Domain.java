package Entidades;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_atividade")
public class Atividade_Domain {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String descricao;
    private Double preco;

    // Relacionamento Muitos para Muitos com Categoria
    @ManyToMany
    @JoinTable(
        name = "atividade_categoria",
        joinColumns = @JoinColumn(name = "atividade_id"),
        inverseJoinColumns = @JoinColumn(name = "categoria_id")
    )
    private List<Categoria_Domain> categorias = new ArrayList<>();

    // Relacionamento Um para Muitos com Horário
    @OneToMany(mappedBy = "atividade", cascade = CascadeType.ALL)
    private List<Horário_Domain> horarios = new ArrayList<>();

    // Construtor com parâmetros
    public Atividade_Domain(int id, String nome, String descricao, Double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Construtor padrão
    public Atividade_Domain() {}

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public List<Categoria_Domain> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria_Domain> categorias) {
        this.categorias = categorias;
    }

    public List<Horário_Domain> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horário_Domain> horarios) {
        this.horarios = horarios;
    }
}
