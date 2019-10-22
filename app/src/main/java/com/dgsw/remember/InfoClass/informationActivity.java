package com.dgsw.remember.InfoClass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Gravity;
import android.view.WindowManager;

import com.dgsw.remember.R;
import com.merhold.extensiblepageindicator.ExtensiblePageIndicator;


public class informationActivity extends AppCompatActivity {
    private infoFragmentAdapter mSimpleFragmentAdapter;
    private ViewPager mViewPager;
    private ExtensiblePageIndicator extensiblePageIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        setContentView(R.layout.activity_information);

        extensiblePageIndicator = (ExtensiblePageIndicator) findViewById(R.id.flexibleIndicator);
        mSimpleFragmentAdapter = new infoFragmentAdapter(getSupportFragmentManager());

        mSimpleFragmentAdapter.addFragment(infoFragment.newInstance(R.drawable.info_1));
        mSimpleFragmentAdapter.addFragment(infoFragment.newInstance(R.drawable.info_2));

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSimpleFragmentAdapter);
        extensiblePageIndicator.initViewPager(mViewPager);
    }
}
