package Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_categoria")
public class Categoria_Domain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descricao;

    public Categoria_Domain(String descricao, int id) {
        this.descricao = descricao;
        this.id = id;
    }

    public Categoria_Domain() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
