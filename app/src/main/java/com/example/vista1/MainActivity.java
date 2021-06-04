package com.example.vista1;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.vista1.ui.history.History;
import com.example.vista1.ui.home.Home;
import com.example.vista1.ui.inventory.Inventory;
import com.example.vista1.ui.premium.premium;
import com.example.vista1.ui.tickets.Tickets;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.vista1.databinding.ActivityMainBinding;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
       // AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.navigation_home, R.id.navigation_premium,R.id.navigation_inventory,R.id.navigation_tickets, R.id.navigation_history).build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//        NavigationUI.setupWithNavController(binding.navView, navController);
        Fragment selectedFragment = null;
        FragmentTransaction ft;
        selectedFragment = new Home();
        ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.nav_host_fragment_activity_main, selectedFragment);
        ft.addToBackStack(null);
        ft.commit();
navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
        Fragment selectedFragment = null;
        FragmentTransaction ft;
        // Toast.makeText(MainActivity.this,"Tab "+ selectedIndex+" Selected.",Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {
            case R.id.navigation_home:
                selectedFragment = new Home();
                ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.nav_host_fragment_activity_main, selectedFragment);
                ft.addToBackStack(null);
                ft.commit();
                break;
            case R.id.navigation_tickets:
                selectedFragment =  new Tickets();
                ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.nav_host_fragment_activity_main, selectedFragment);
                ft.addToBackStack(null);
                ft.commit();
                break;
            case R.id.navigation_premium:
                selectedFragment =  new premium();
                ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.nav_host_fragment_activity_main, selectedFragment);
                ft.addToBackStack(null);
                ft.commit();
                break;
            case R.id.navigation_inventory:
                selectedFragment =  new Inventory();
                ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.nav_host_fragment_activity_main, selectedFragment);
                ft.addToBackStack(null);
                ft.commit();
                break;
            case R.id.navigation_history:
                selectedFragment =  new History();
                ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.nav_host_fragment_activity_main, selectedFragment);
                ft.addToBackStack(null);
                ft.commit();
                break;

//            default:
//                selectedFragment = new Home();
//                ft = getSupportFragmentManager().beginTransaction();
//                ft.replace(R.id.nav_host_fragment_activity_main, selectedFragment);
//                ft.addToBackStack(null);
//                ft.commit();
//                break;

        }
        return true;
    }
});
    }
    

}