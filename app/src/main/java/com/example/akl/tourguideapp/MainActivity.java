package com.example.akl.tourguideapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView nvDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment fragments = new MainFragment();
        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().add(R.id.content_fragment,fragments).commit();

        drawerLayout = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.navigation_drawer_open,R.string.navigation_drawer_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        nvDrawer = findViewById(R.id.navigation);
        nvDrawer.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int size = nvDrawer.getMenu().size();
                for (int i = 0; i < size; i++) {
                    nvDrawer.getMenu().getItem(i).setChecked(false);
                }
                Fragment fragment = new Fragment();
                Class fragmentClass = null;
                switch (item.getItemId()){
                    case R.id.restaurants:
                        fragmentClass = RestaurantsFragment.class;
                        break;
                    case R.id.malls:
                        fragmentClass = MallsFragment.class;
                        break;
                    case R.id.art_museums:
                        fragmentClass = ArtMuseumsFragment.class;
                        break;
                    case R.id.history_museums:
                        fragmentClass = HistoryMuseumsFragment.class;
                        break;
                    default:
                        fragmentClass = MainFragment.class;
                }

                try {
                    fragment = (Fragment) fragmentClass.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().addToBackStack("").replace(R.id.content_fragment,fragment).commit();
                item.setChecked(true);
                setTitle(item.getTitle());
                drawerLayout.closeDrawers();
            return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
