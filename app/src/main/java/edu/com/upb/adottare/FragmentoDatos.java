package edu.com.upb.adottare;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentoDatos extends Fragment {

    Button btnVolver;
    Button btnEnviar;

    public FragmentoDatos() {
        // Required empty public constructor
    }


    public static FragmentoDatos newInstance(String param1, String param2) {
        FragmentoDatos fragment = new FragmentoDatos();
        Bundle args = new Bundle();

        fragment.setArguments(args);
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
        View vista = inflater.inflate(R.layout.fragment_fragmento_datos, container, false);

        btnVolver = (Button) vista.findViewById(R.id.btnVolverForm);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setReorderingAllowed(true);

                transaction.replace(R.id.datos, FragmentoAdoptar.newInstance("",""));

                transaction.commit();


            }
        });

        btnEnviar = (Button) vista.findViewById(R.id.btnEnviarDatos);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setReorderingAllowed(true);

                transaction.replace(R.id.datos, FragmentoFinal.newInstance("",""));

                transaction.commit();


            }
        });

        return vista;
    }
}