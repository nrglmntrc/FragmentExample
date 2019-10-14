package com.nurgulmantarci.fragmentexample.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.nurgulmantarci.fragmentexample.R;
import com.nurgulmantarci.fragmentexample.data.ImageAssets;

public class AndroidMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);

        if(savedInstanceState==null){
            BodyPartFragment headFragment=new BodyPartFragment();
            headFragment.setImageıds(ImageAssets.getHeads());
            headFragment.setmListIndex(0);
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .add(R.id.head_container,headFragment)
                    .commit();

            BodyPartFragment bodyFragment=new BodyPartFragment();
            bodyFragment.setImageıds(ImageAssets.getBodies());;
            fragmentManager.beginTransaction()
                    .add(R.id.body_container,bodyFragment)
                    .commit();

            BodyPartFragment legFragment=new BodyPartFragment();
            legFragment.setImageıds(ImageAssets.getLegs());
            fragmentManager.beginTransaction()
                    .add(R.id.leg_container,legFragment)
                    .commit();
        }
    }
}
