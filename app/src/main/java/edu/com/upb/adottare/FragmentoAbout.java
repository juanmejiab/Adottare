package edu.com.upb.adottare;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentoAbout extends Fragment {
    public FragmentoAbout() {
        // Required empty public constructor
    }

    public static FragmentoAbout newInstance(String param1, String param2) {
        FragmentoAbout fragment = new FragmentoAbout();
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
        return inflater.inflate(R.layout.fragment_fragmento_about, container, false);
    }
}