package com.example.mipiano;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int csound;
    private int dsound;
    private int esound;
    private int fsound;
    private int gsound;
    private int asound;
    private int bsound;
    private int ccsound;
    private int cssound;
    private int csssound;
    private int dssound;
    private int gssound;
    private int assound;
    private int fssound;

    private SoundPool mSoundPool;

    private float LEFT_VOL = 1.0f;
    private float RIGHT_VOL = 1.0f;
    private int PRIORITY = 1;
    private int LOOP = 0;
    private float RATE = 1.0f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public MainActivity( int csound){
        this.csound = csound;

        mSoundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);

        csound = mSoundPool.load(getApplicationContext(), R.raw.c, 1);
        dsound = mSoundPool.load(getApplicationContext(), R.raw.d, 1);
        esound = mSoundPool.load(getApplicationContext(), R.raw.e, 1);
        fsound = mSoundPool.load(getApplicationContext(), R.raw.f, 1);
        gsound = mSoundPool.load(getApplicationContext(), R.raw.g, 1);
        asound = mSoundPool.load(getApplicationContext(), R.raw.a, 1);
        bsound = mSoundPool.load(getApplicationContext(), R.raw.b, 1);
        cssound = mSoundPool.load(getApplicationContext(), R.raw.c_hash, 1);
        csssound = mSoundPool.load(getApplicationContext(), R.raw.c_hash, 1);
        ccsound = mSoundPool.load(getApplicationContext(), R.raw.c2, 1);
        assound = mSoundPool.load(getApplicationContext(), R.raw.a_hash, 1);
        fssound = mSoundPool.load(getApplicationContext(), R.raw.f_hash, 1);
        gssound = mSoundPool.load(getApplicationContext(), R.raw.g_hash, 1);
        dssound = mSoundPool.load(getApplicationContext(), R.raw.d_hash, 1);
    }


    public void playC (View v){
        mSoundPool.play(csound, LEFT_VOL, RIGHT_VOL, PRIORITY, LOOP, RATE);
    }

    public void playD (View v){
        mSoundPool.play(dsound, LEFT_VOL, RIGHT_VOL, PRIORITY, LOOP, RATE);
    }

    public void playE (View v){
        mSoundPool.play(esound, LEFT_VOL, RIGHT_VOL, PRIORITY, LOOP, RATE);
    }

    public void playF (View v){
        mSoundPool.play(fsound, LEFT_VOL, RIGHT_VOL, PRIORITY, LOOP, RATE);
    }

    public void playG (View v){
        mSoundPool.play(gsound, LEFT_VOL, RIGHT_VOL, PRIORITY, LOOP, RATE);
    }

    public void playA (View v){
        mSoundPool.play(asound, LEFT_VOL, RIGHT_VOL, PRIORITY, LOOP, RATE);
    }

    public void playB (View v){
        mSoundPool.play(bsound, LEFT_VOL, RIGHT_VOL, PRIORITY, LOOP, RATE);
    }

    public void playCC (View v){
        mSoundPool.play(ccsound, LEFT_VOL, RIGHT_VOL, PRIORITY, LOOP, RATE);
    }

    public void playCS (View v){
      mSoundPool.play(cssound, LEFT_VOL, RIGHT_VOL, PRIORITY, LOOP, RATE);
    }

    public void playDS (View v){
        mSoundPool.play(dssound, LEFT_VOL, RIGHT_VOL, PRIORITY, LOOP, RATE);
    }

    public void playFS (View v){
        mSoundPool.play(fssound, LEFT_VOL, RIGHT_VOL, PRIORITY, LOOP, RATE);
    }

    public void playGS (View v){
        mSoundPool.play(gssound, LEFT_VOL, RIGHT_VOL, PRIORITY, LOOP, RATE);
    }

    public void playAS (View v){
        mSoundPool.play(assound, LEFT_VOL, RIGHT_VOL, PRIORITY, LOOP, RATE);
    }

    public void playCSS (View v){
        mSoundPool.play(csssound, LEFT_VOL, RIGHT_VOL, PRIORITY, LOOP, RATE);
    }


    }
