package kietianshub.project.com.application;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        assert navigationView != null;
        navigationView.setNavigationItemSelectedListener(this);
        // initialize what screen is to be show first when app runs.
        if (count != 1) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new OnlineStoreFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_store);
        }
    }

    //for double press back to exit
    Boolean doubleBackPress = false;

    @Override
    public void onBackPressed() {
        if(count != 1){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new OnlineStoreFragment()).commit();
            getSupportActionBar().setTitle("Online Stores");
            count = 1;
        }else
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if (doubleBackPress == true) {
                super.onBackPressed();
            } else {
                doubleBackPress = true;
                final CoordinatorLayout coordinatorLayout = findViewById(R.id.coordinatorLayout);
                Snackbar.make(coordinatorLayout, "Press back again to exit", Snackbar.LENGTH_LONG).show();
                new android.os.Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        doubleBackPress = false;
                    }
                }, 2000);
            }
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_store:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new OnlineStoreFragment()).commit();
                getSupportActionBar().setTitle("Online Stores");
                count = 1;
                break;
            case R.id.nav_social_media:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new SocialNetworkAndMail()).commit();
                getSupportActionBar().setTitle("Social Network and Mails");
                count = 2;
                break;
            case R.id.nav_movie:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MovieTickets()).commit();
                getSupportActionBar().setTitle("Movie Tickets");
                count = 3;
                break;
            case R.id.nav_recharge:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Recharge()).commit();
                getSupportActionBar().setTitle("Recharge");
                count = 4;
                break;
            case R.id.nav_travel:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CabsAndHotels()).commit();
                getSupportActionBar().setTitle("Cabs And Hotels");
                count = 5;
                break;
            case R.id.nav_e_learning:
               getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Elearning()).commit();
                getSupportActionBar().setTitle("E-Learning");
                count = 6;
                break;
            case R.id.nav_entertainment:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Entertainment()).commit();
                getSupportActionBar().setTitle("Entertainment");
                count = 7;
                break;
            case R.id.nav_free_lancing:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new FreeLancing()).commit();
                getSupportActionBar().setTitle("Free Lancing");
                count = 8;
                break;
            case R.id.nav_sports:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Sports()).commit();
                getSupportActionBar().setTitle("Sports");
                count = 9;
                break;
            case R.id.nav_news:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new News()).commit();
                getSupportActionBar().setTitle("News");
                count = 10;
                break;
            case R.id.nav_medicare:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Medicare()).commit();
                getSupportActionBar().setTitle("Medicare");
                count = 11;
                break;
            case R.id.nav_college_contact:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new CollegeContacts()).commit();
                getSupportActionBar().setTitle("College Contacts");
                count = 12;
                break;


            case R.id.nav_suggestion:
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto: ag1507anshul@gmail.com"));
                intent.putExtra(Intent.EXTRA_SUBJECT, "Send Your Valuable Feedback :)");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }

                break;
            case R.id.nav_about:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new AboutUs()).commit();
                getSupportActionBar().setTitle("About Us");
                count = 13;
                break;

            case R.id.nav_exit:
                System.exit(0);
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

