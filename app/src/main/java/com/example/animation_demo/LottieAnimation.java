
package com.example.animation_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LottieAnimation extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie_animation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent = new Intent(LottieAnimation.this, CustomAnimation.class);
                startActivity(splashIntent);
                finish();
            }
        }, 10000);









    /*    To set Lottie Animation Using java file

        LottieAnimationView lottieAnim;

        lottieAnim = (LottieAnimation)findViewById(R.id.lottieAnimId);

        lottieAnim.setAnimation(R.raw.lottie_animation);
        lottieAnim.playAnimation();
        lottieAnim.loop(true); */
    }
}