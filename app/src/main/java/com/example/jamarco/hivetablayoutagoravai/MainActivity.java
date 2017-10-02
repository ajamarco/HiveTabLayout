package com.example.jamarco.hivetablayoutagoravai;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        //esta linha faz aparecer o nome do app no toolbar
        setSupportActionBar(mToolbar);

        //this line brings the back button in the toolbar
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(mViewPager);

        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);

    }

    private void setupViewPager(ViewPager viewPager){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new OneFragment(),"Places to Visit");
        adapter.addFragment(new TwoFragment(),"Hotels");
        adapter.addFragment(new ThreeFragment(),"Points of Interest");
        adapter.addFragment(new FourFragment(),"points of interest 2");
        viewPager.setAdapter(adapter);
    }
}
