package DTO;

import java.util.Set;

public class Atividade_DTO {
    private int id;
    private String nome;
    private String descricao;
    private Double preco;

    // Construtor com parâmetros
    public Atividade_DTO(int id, String nome, String descricao, Double preco,Set<Atividade_DTO>atividade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Construtor padrão
    public Atividade_DTO() {}

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
}
