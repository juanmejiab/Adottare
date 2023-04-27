package edu.com.upb.adottare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        setUpNavegacion();
    }

        private void setUpNavegacion(){
            BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
            NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
            NavigationUI.setupWithNavController(
                    bottomNavigationView,
                    navHostFragment.getNavController()
            );
        }
}