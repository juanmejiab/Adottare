package edu.com.upb.adottare;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Timer;
import java.util.TimerTask;

public class FragmentoFinal extends Fragment {

    public FragmentoFinal() {
        // Required empty public constructor
    }

    public static FragmentoFinal newInstance(String param1, String param2) {
        FragmentoFinal fragment = new FragmentoFinal();
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
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_fragmento_final, container, false);

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setReorderingAllowed(true);

                transaction.replace(R.id.lastScreen, FragmentoAbout.newInstance("",""));

                transaction.commit();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 3000);

        return vista;
    }
}