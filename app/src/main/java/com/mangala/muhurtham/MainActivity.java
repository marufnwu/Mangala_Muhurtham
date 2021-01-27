package com.mangala.muhurtham;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.mangala.muhurtham.Fragments.HomeFragment;
import com.mangala.muhurtham.Fragments.MailboxFragment;
import com.mangala.muhurtham.Fragments.ProfileFragment;
import com.mangala.muhurtham.Fragments.SearchFragment;
import com.mangala.muhurtham.Fragments.UpgradeFragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        loadFragment(HomeFragment.newInstance());
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.navigation_home){
                  return loadFragment(HomeFragment.newInstance());
                }else if(item.getItemId()==R.id.navigation_search){
                  return loadFragment(SearchFragment.newInstance());
                }else if(item.getItemId()==R.id.navigation_mailbox){
                  return loadFragment(MailboxFragment.newInstance());
                }else if(item.getItemId()==R.id.navigation_upgrade){
                  return loadFragment(UpgradeFragment.newInstance());
                }else if(item.getItemId()==R.id.navigation_profile){
                  return loadFragment(ProfileFragment.newInstance());
                }else {
                    return false;
                }
            }
        });
    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.nav_host_fragment, fragment)
                    .commit();
            return true;
        }
        return false;
    }

}