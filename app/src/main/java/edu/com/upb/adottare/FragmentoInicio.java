package edu.com.upb.adottare;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentoInicio extends Fragment {

    public FragmentoInicio() {
        // Required empty public constructor
    }

    public static FragmentoInicio newInstance(String param1, String param2) {
        FragmentoInicio fragment = new FragmentoInicio();
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
        return inflater.inflate(R.layout.fragment_fragmento_inicio, container, false);
    }
}