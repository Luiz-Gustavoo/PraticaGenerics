package br.com.pratica.generics.services;

import br.com.pratica.generics.modelos.Produto;

import java.util.List;

public class Avaliacao<T> {
    private T objeto;
    private double nota;

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public T getObjeto() {
        return objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public Avaliacao(T objeto, double nota) {
        this.objeto = objeto;
        this.nota = nota;
    }

    public static <T> double mediaAvaliacoes(List <Avaliacao<?>> listaAvalicao) { // "?" para receber qualquer tipo de avaliação
        double soma = 0;

        for(Avaliacao<?> avaliacao: listaAvalicao) {
            soma += avaliacao.getNota();

        }
        return soma / listaAvalicao.size();
    }
}
