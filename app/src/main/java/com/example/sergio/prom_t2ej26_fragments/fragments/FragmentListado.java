package com.example.sergio.prom_t2ej26_fragments.fragments;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sergio.prom_t2ej26_fragments.R;

/**
 * Created by Sergio on 16/11/2016.
 */

public class FragmentListado extends Fragment {

    private Libro[] datos = {
            new Libro("Autor1", "Titulo1", 1989),
            new Libro("Autor2", "Titulo2", 1959),
            new Libro("Autor3", "Titulo3", 1979),
            new Libro("Autor4", "Titulo4", 1919)
    };


    private ListView lst_lista;

    private LibrosListener listener;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_listado, container, false);
    }

    public void onActivityCreated(Bundle state) {
        super.onActivityCreated(state);

        lst_lista = (ListView) getView().findViewById(R.id.lst_lista);
        lst_lista.setAdapter(new AdaptadorLibros(this));
        lst_lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                if (listener != null) {
                    listener.onLibroSeleccionado((Libro) lst_lista.getAdapter().getItem(pos));
                }
            }
        });
    }

    class AdaptadorLibros extends ArrayAdapter<Libro> {
        Activity context;

        AdaptadorLibros(Fragment context) {
            super(context.getActivity(), R.layout.listitem_libro, datos);
            this.context = context.getActivity();
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View item = inflater.inflate(R.layout.listitem_libro, null);

            TextView lbl_titulo = (TextView) item.findViewById(R.id.lbl_titulo);
            lbl_titulo.setText(datos[position].getTitulo());
            TextView lbl_autor = (TextView) item.findViewById(R.id.lbl_autor);
            lbl_autor.setText(datos[position].getTitulo());
            TextView lbl_anio = (TextView) item.findViewById(R.id.lbl_anio);
            lbl_anio.setText(datos[position].getTitulo());

            return item;
        }
    }
    public interface LibrosListener{
        void onLibroSeleccionado(Libro l);
    }
    public void setLibrosListener(LibrosListener listener){
        this.listener = listener;
    }
}

