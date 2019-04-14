package com.example.testfragmentdynamic;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // on instancie le fragment manager
        FragmentManager fragmentManager = getSupportFragmentManager();

        // on instancie la transaction grâce au fragmentManager
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // on récupère l'orientation du device
        int displayMode = getResources().getConfiguration().orientation;
        // selon l'orientation
        if (displayMode == 1){
            // Portrait on instancie fragment 1
            Fragment1 f1 = new Fragment1();
            // on remplace le contenu actuel par le fragment 1
            fragmentTransaction.replace(android.R.id.content,f1);
        }else {
            // Paysage on instancie fragment 2
            Fragment2 f2 = new Fragment2();
            // on remplace le contenu actuel par le fragment 2
            fragmentTransaction.replace(android.R.id.content,f2);
        }
        // on valide la transaction
        fragmentTransaction.commit();
    }

}
