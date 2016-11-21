package com.example.sergio.prom_t2ej26_fragments.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sergio.prom_t2ej26_fragments.R;

import org.w3c.dom.Text;

/**
 * Created by SergioTx on 20/11/2016.
 */

public class FragmentDetalle extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_detalle, container,false);
    }

    /*
     * para futuros problemas, mejor pasar un objeto libro y de ahí recoger los Strings
     */
    public void mostrarDetalle(String texto){
        TextView txt_detalle = (TextView) getView().findViewById(R.id.txt_detalle);
        txt_detalle.setText(texto);
    }
}