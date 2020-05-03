package com.example.basicstudentinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntroFragment;

public class AppIntro extends com.github.paolorotolo.appintro.AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSlide(AppIntroFragment.newInstance("Texas Family" , "Small Steps EveryDay",R.drawable.first, ContextCompat.getColor(getApplicationContext(),R.color.Blue)));
        addSlide(AppIntroFragment.newInstance("All Feature In One App", "Grab The Opportunity",R.drawable.second, ContextCompat.getColor(getApplicationContext(),R.color.Green)));
        addSlide(AppIntroFragment.newInstance("Let's Start", "Enjoy The App",R.drawable.third, ContextCompat.getColor(getApplicationContext(),R.color.Red)));
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        startActivity(new Intent(AppIntro.this,MainActivity.class));
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        startActivity(new Intent(AppIntro.this,MainActivity.class));
        finish();
    }
}
