package com.example.minhafruteira;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TelaCadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Felipe", "executando OnStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Felipe", "executando OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Felipe", "executando OnStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Felipe", "executando OnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Felipe", "executando OnResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Felipe", "executando OnDestroy");
    }



    List<Fruta>  listFruta = new ArrayList<>();

    public void CadastrarFruta(View view) {

        TextView frutaEditText = findViewById(R.id.CadastroFrutaEditText);
        String frutaCadastro = frutaEditText.getText().toString();

        TextView precoEditText = findViewById(R.id.PrecoFrutaEditText);
        Float precoCadastro = Float.parseFloat(precoEditText.getText().toString());

        if (frutaCadastro.equals("") || precoEditText.getText().toString().equals("")){

            Toast.makeText(this, "Nome ou preco da fruta Inválido!", Toast.LENGTH_LONG);


        } else {

            Fruta lista = new Fruta();
            lista.nome = frutaCadastro;
            lista.preco = precoCadastro;
            listFruta.add(lista);

            Bundle bundle = new Bundle();
            bundle.putSerializable("lista", (Serializable) listFruta);

            Intent intent = new Intent(this, ListagemFrutasActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);


        }



    }
}