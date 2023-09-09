package com.example.minhafruteira;

import java.io.Serializable;

public class Fruta implements Serializable {

    public String nome;
    public float preco;

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
