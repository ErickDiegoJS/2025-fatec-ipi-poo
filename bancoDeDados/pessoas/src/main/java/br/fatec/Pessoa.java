package br.fatec;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Pessoa {
    private int codigo;
    private String nome;
    private String fone;
    private String email;

    // boilerplate code
    // public int getCodigo() {
    //     return codigo;
    // }

    public Pessoa(String nome, String fone, String email){
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }
    public Pessoa(int codigo){
        this.codigo = codigo;
    }
}
