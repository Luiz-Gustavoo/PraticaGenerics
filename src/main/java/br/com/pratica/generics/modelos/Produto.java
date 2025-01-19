package br.com.pratica.generics.modelos;

public class Produto {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto(String nome) {
        this.nome = nome;
    }
}
