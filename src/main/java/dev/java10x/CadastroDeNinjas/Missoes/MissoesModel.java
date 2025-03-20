package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.Controller.Service.NinjaModel;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private String rank;


    public MissoesModel(Long id, String nomeMissao, String rank) {
        this.id = id;
        this.nomeMissao = nomeMissao;
        this.rank = rank;
    }

    @OneToMany(mappedBy = "missoes") // @OneToMany: uma missao pode ter varios ninjas.
    private List<MissoesModel> ninjas;
}
