package com.example.minhafruteira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ListagemFrutasActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_frutas);

        List<Fruta> lista = (List<Fruta>) getIntent().getSerializableExtra("lista");

        StringBuilder mensagem = new StringBuilder();

        for(int i = 0; i < lista.size(); i++){
            Fruta fruta = lista.get(i);
            mensagem.append(fruta.nome).append("\n");
            mensagem.append(fruta.preco).append("\n");
            mensagem.append("---------------").append("\n");
        }

        TextView retornoItens = findViewById(R.id.ItensCadastradosTextView);
        retornoItens.setText(mensagem.toString());

    }
}