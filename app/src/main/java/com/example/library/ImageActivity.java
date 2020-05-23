package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageActivity extends AppCompatActivity
{
    Animation fade;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        final ImageView pic;
        final Button butt;
        pic =findViewById(R.id.pic);
        fade= AnimationUtils.loadAnimation(this,R.anim.animat);
        pic.setAnimation(fade);
        butt =findViewById(R.id.butt);
        butt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //pic.animate().alpha(0).setDuration(2000);
                //pic.animate().translationXBy(1050).setDuration(3000);
                //pic.animate().rotation(180).alpha(0).setDuration(3000);
                //pic.animate().scaleXBy(-0.5f).scaleYBy(-0.5f).setDuration(2000);

            }
        });
    }
}
