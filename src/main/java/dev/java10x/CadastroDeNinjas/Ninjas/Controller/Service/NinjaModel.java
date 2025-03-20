package dev.java10x.CadastroDeNinjas.Ninjas.Controller.Service;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;


@Entity //Entity transforma uma classe em uma entidade do banco de dados.
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id //Anotação usada para indicar que o atributo logo abaixo é um ID.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Gera o valor do ID em numeros automaticamente
    private Long id;
    private String nome;
    private String email;
    private int idade;
    @ManyToOne // @ManyToOne um ninja tem uma unica missão
    @JoinColumn(name = "missoes_id") // Junta as duas colunas com chave foreign key
    private MissoesModel missoes;

    public NinjaModel() {
    }
    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
