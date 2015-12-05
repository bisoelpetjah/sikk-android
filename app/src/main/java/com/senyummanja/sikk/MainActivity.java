package com.senyummanja.sikk;

import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.senyummanja.sikk.fragments.BerandaFragment_;
import com.senyummanja.sikk.fragments.KasusFragment_;
import com.senyummanja.sikk.fragments.PelakuFragment_;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by irvan on 12/4/15.
 */
@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @ViewById(R.id.toolbar)
    protected Toolbar toolbar;

    @ViewById(R.id.drawerLayout)
    protected DrawerLayout drawerLayout;

    @ViewById(R.id.navigationView)
    protected NavigationView navigationView;

    private ActionBarDrawerToggle drawerToggle;

    @AfterViews
    protected void initViews() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, 0, 0);
        drawerLayout.setDrawerListener(drawerToggle);
        drawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setCheckedItem(R.id.drawer_beranda);
        assignFragment(BerandaFragment_.builder().build());
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.drawer_beranda: {
                assignFragment(BerandaFragment_.builder().build());
                drawerLayout.closeDrawers();
                return true;
            }
            case R.id.drawer_kasus: {
                assignFragment(KasusFragment_.builder().build());
                drawerLayout.closeDrawers();
                return true;
            }
            case R.id.drawer_pelaku: {
                assignFragment(PelakuFragment_.builder().build());
                drawerLayout.closeDrawers();
                return true;
            }
        }
        return false;
    }

    private void assignFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content, fragment)
                .commit();
    }
}
