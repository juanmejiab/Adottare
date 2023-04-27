package edu.com.upb.adottare;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentoLoro extends Fragment {

    Button btnVolver;
    Button btnAdoptar;
    public FragmentoLoro() {
        // Required empty public constructor
    }

    public static FragmentoLoro newInstance(String param1, String param2) {
        FragmentoLoro fragment = new FragmentoLoro();
        Bundle args = new Bundle();

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
        View vista = inflater.inflate(R.layout.fragment_fragmento_loro, container, false);

        btnVolver = (Button) vista.findViewById(R.id.btnVolverLoro);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setReorderingAllowed(true);

                transaction.replace(R.id.loro, FragmentoAdoptar.newInstance("",""));

                transaction.commit();


            }
        });

        btnAdoptar = (Button) vista.findViewById(R.id.btnIniciarProcesoLoro);
        btnAdoptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setReorderingAllowed(true);

                transaction.replace(R.id.loro, FragmentoDatos.newInstance("",""));

                transaction.commit();


            }
        });

        return vista;
    }
}