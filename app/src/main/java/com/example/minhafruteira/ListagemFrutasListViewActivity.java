package com.example.minhafruteira;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListagemFrutasListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listagem_frutas_list_view);

        Fruta fruta1 = new Fruta();
        fruta1.setPreco(3f);
        fruta1.setNome("Banana");

        Fruta fruta2 = new Fruta();
        fruta2.setPreco(5f);
        fruta2.setNome("Maça");

        Fruta fruta3 = new Fruta();
        fruta3.setPreco(5f);
        fruta3.setNome("uva");

        Fruta fruta4 = new Fruta();
        fruta4.setPreco(5f);
        fruta4.setNome("tomate");

        List<Fruta> lista = new ArrayList<>();
        lista.add(fruta1);
        lista.add(fruta2);
        lista.add(fruta3);
        lista.add(fruta4);

        FrutaAdapter frutaAdapter = new FrutaAdapter(this, lista);
        ListView listView = findViewById(R.id.ListViewFrutas);
        listView.setAdapter(frutaAdapter);
    }
}