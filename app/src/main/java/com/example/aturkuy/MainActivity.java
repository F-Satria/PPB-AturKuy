package com.example.aturkuy;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button firstFragment, secondFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

// get the reference of Button's
        firstFragment = (Button) findViewById(R.id.fragment1);
        secondFragment = (Button) findViewById(R.id.fragment2);

// perform setOnClickListener event on First Button
        firstFragment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
// load First Fragment
                loadFragment(new FragmentAK());

            }
        });

// perform setOnClickListener event on Second Button
        secondFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

// load Second Fragment
                loadFragment(new FragmentNAK());
            }
        });
    }


    private void loadFragment(Fragment fragment) {

// create a FragmentManager
        FragmentManager fm = getFragmentManager();

// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction ft = fm.beginTransaction();

// replace the FrameLayout with new Fragment
        ft.replace(R.id.list, fragment);
        ft.commit(); // save the changes

    }
}