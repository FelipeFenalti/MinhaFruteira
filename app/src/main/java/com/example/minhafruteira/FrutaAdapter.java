package com.example.minhafruteira;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class FrutaAdapter extends ArrayAdapter<Fruta> {

    private List<Fruta> listFruta;

    public FrutaAdapter(@NonNull Context context, List<Fruta> lista) {
        super(context,  0, lista);
        listFruta = lista;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if(view == null){
            Context ctx = getContext();
            LayoutInflater li = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = li.inflate(R.layout.item_fruta,null);
        }
        Fruta fruta = listFruta.get(position);
        TextView textViewiewNome = view.findViewById(R.id.textViewNomeFruta);
        TextView textViewiewPreco = view.findViewById(R.id.textViewPrecoFruta);
        textViewiewNome.setText(fruta.getNome());
        textViewiewPreco.setText(fruta.getPreco()+ "");
        return view;
    }
}
