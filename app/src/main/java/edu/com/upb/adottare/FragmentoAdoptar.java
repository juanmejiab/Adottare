package edu.com.upb.adottare;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentoAdoptar extends Fragment {

    Button btnMostrarGato;
    Button btnMostrarLoro;
    Button btnMostrarPerro;
    Button btnMostrarCacatua;
    public FragmentoAdoptar() {
        // Required empty public constructor
    }


    public static FragmentoAdoptar newInstance(String param1, String param2) {
        FragmentoAdoptar fragment = new FragmentoAdoptar();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_fragmento_adoptar, container, false);

        btnMostrarGato = (Button) vista.findViewById(R.id.btnAdoptaGato);
        btnMostrarGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setReorderingAllowed(true);

                transaction.replace(R.id.adopcion, FragmentoGato.newInstance("",""));

                transaction.commit();


            }
        });

        btnMostrarLoro = (Button) vista.findViewById(R.id.btnAdoptaLoro);
        btnMostrarLoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setReorderingAllowed(true);

                transaction.replace(R.id.adopcion, FragmentoLoro.newInstance("",""));

                transaction.commit();


            }
        });

        btnMostrarPerro = (Button) vista.findViewById(R.id.btnAdoptaPerro);
        btnMostrarPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setReorderingAllowed(true);

                transaction.replace(R.id.adopcion, FragmentoPerro.newInstance("",""));

                transaction.commit();


            }
        });

        btnMostrarCacatua = (Button) vista.findViewById(R.id.btnAdoptaCacatua);
        btnMostrarCacatua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setReorderingAllowed(true);

                transaction.replace(R.id.adopcion, FragmentoCacatua.newInstance("",""));

                transaction.commit();


            }
        });

        return vista;
    }
}