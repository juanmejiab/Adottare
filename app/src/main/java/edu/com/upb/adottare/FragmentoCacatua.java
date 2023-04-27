package edu.com.upb.adottare;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentoCacatua#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentoCacatua extends Fragment {

    Button btnVolver;
    Button btnAdoptar;
    public FragmentoCacatua() {
        // Required empty public constructor
    }


    public static FragmentoCacatua newInstance(String param1, String param2) {
        FragmentoCacatua fragment = new FragmentoCacatua();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_fragmento_cacatua, container, false);

        btnVolver = (Button) vista.findViewById(R.id.btnVolverCacatua);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setReorderingAllowed(true);

                transaction.replace(R.id.cacatua, FragmentoAdoptar.newInstance("",""));

                transaction.commit();


            }
        });

        btnAdoptar = (Button) vista.findViewById(R.id.btnIniciarProcesoCacatua);
        btnAdoptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setReorderingAllowed(true);

                transaction.replace(R.id.cacatua, FragmentoDatos.newInstance("",""));

                transaction.commit();


            }
        });

        return vista;
    }
}