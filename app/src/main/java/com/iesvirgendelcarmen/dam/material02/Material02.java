package com.iesvirgendelcarmen.dam.material02;

import android.animation.Animator;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Toast;

;import static android.R.attr.scaleX;
import static android.R.attr.scaleY;
import static com.iesvirgendelcarmen.dam.material02.R.id.start;


public class Material02 extends AppCompatActivity {
    FloatingActionButton fab;
    Interpolator interpolador;
    boolean tocado =false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material02);
        fab=(FloatingActionButton)findViewById(R.id.fab);
        fab.setScaleX(0);
        fab.setScaleY(0);
        interpolador=AnimationUtils.loadInterpolator(getBaseContext(),android.R.interpolator.fast_out_slow_in);
        fab.animate().scaleX(1).scaleY(1).setInterpolator(interpolador).setDuration(600)
                .setStartDelay(1000).setListener(new Animator.AnimatorListener(){
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                //fab.animate().scaleX(0).scaleY(0).setInterpolator(interpolador).setDuration(600).start();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tocado =!tocado;
                v.animate().rotation(tocado ? 45f:0).setInterpolator(interpolador).start();
                //Toast.makeText(getApplication(),"FAB TOCADO", Toast.LENGTH_LONG).show();
            }
        });

    }
}
