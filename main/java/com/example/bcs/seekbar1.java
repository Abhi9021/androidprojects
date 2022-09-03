package com.example.bcs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioManager;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;

public class seekbar1 extends AppCompatActivity {
SeekBar skbrobj;
AudioManager am;
LinearLayout rltobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar1);
        rltobj=findViewById(R.id.rlt);
       skbrobj=findViewById(R.id.skbr);
       am=(AudioManager) getSystemService(Context.AUDIO_SERVICE);

       int Maxvalue=am.getStreamMaxVolume(am.STREAM_MUSIC);
       int Curvalue=am.getStreamVolume(am.STREAM_MUSIC);
       skbrobj.setMax(Maxvalue);
       skbrobj.setProgress(Curvalue);

       skbrobj.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           @Override
           public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
rltobj.setBackgroundColor(Color.RED);
           }

           @Override
           public void onStartTrackingTouch(SeekBar seekBar) {
rltobj.setBackgroundColor(Color.BLUE);
           }

           @Override
           public void onStopTrackingTouch(SeekBar seekBar) {
rltobj.setBackgroundColor(Color.GREEN);
           }
       });
    }
}