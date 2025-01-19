package br.com.pratica.generics.services;

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
}
