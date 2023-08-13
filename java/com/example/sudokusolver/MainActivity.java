package com.example.sudokusolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[][] board = new int[9][9];
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        TextView[][] textView = new TextView[9][9];

        textView[0][0] = findViewById(R.id.textView00);
        textView[0][1] = findViewById(R.id.textView01);
        textView[0][2] = findViewById(R.id.textView02);
        textView[0][3] = findViewById(R.id.textView03);
        textView[0][4] = findViewById(R.id.textView04);
        textView[0][5] = findViewById(R.id.textView05);
        textView[0][6] = findViewById(R.id.textView06);
        textView[0][7] = findViewById(R.id.textView07);
        textView[0][8] = findViewById(R.id.textView08);

        textView[1][0] = findViewById(R.id.textView10);
        textView[1][1] = findViewById(R.id.textView11);
        textView[1][2] = findViewById(R.id.textView12);
        textView[1][3] = findViewById(R.id.textView13);
        textView[1][4] = findViewById(R.id.textView14);
        textView[1][5] = findViewById(R.id.textView15);
        textView[1][6] = findViewById(R.id.textView16);
        textView[1][7] = findViewById(R.id.textView17);
        textView[1][8] = findViewById(R.id.textView18);

        textView[2][0] = findViewById(R.id.textView20);
        textView[2][1] = findViewById(R.id.textView21);
        textView[2][2] = findViewById(R.id.textView22);
        textView[2][3] = findViewById(R.id.textView23);
        textView[2][4] = findViewById(R.id.textView24);
        textView[2][5] = findViewById(R.id.textView25);
        textView[2][6] = findViewById(R.id.textView26);
        textView[2][7] = findViewById(R.id.textView27);
        textView[2][8] = findViewById(R.id.textView28);

        textView[3][0] = findViewById(R.id.textView30);
        textView[3][1] = findViewById(R.id.textView31);
        textView[3][2] = findViewById(R.id.textView32);
        textView[3][3] = findViewById(R.id.textView33);
        textView[3][4] = findViewById(R.id.textView34);
        textView[3][5] = findViewById(R.id.textView35);
        textView[3][6] = findViewById(R.id.textView36);
        textView[3][7] = findViewById(R.id.textView37);
        textView[3][8] = findViewById(R.id.textView38);

        textView[4][0] = findViewById(R.id.textView40);
        textView[4][1] = findViewById(R.id.textView41);
        textView[4][2] = findViewById(R.id.textView42);
        textView[4][3] = findViewById(R.id.textView43);
        textView[4][4] = findViewById(R.id.textView44);
        textView[4][5] = findViewById(R.id.textView45);
        textView[4][6] = findViewById(R.id.textView46);
        textView[4][7] = findViewById(R.id.textView47);
        textView[4][8] = findViewById(R.id.textView48);

        textView[5][0] = findViewById(R.id.textView50);
        textView[5][1] = findViewById(R.id.textView51);
        textView[5][2] = findViewById(R.id.textView52);
        textView[5][3] = findViewById(R.id.textView53);
        textView[5][4] = findViewById(R.id.textView54);
        textView[5][5] = findViewById(R.id.textView55);
        textView[5][6] = findViewById(R.id.textView56);
        textView[5][7] = findViewById(R.id.textView57);
        textView[5][8] = findViewById(R.id.textView58);

        textView[6][0] = findViewById(R.id.textView60);
        textView[6][1] = findViewById(R.id.textView61);
        textView[6][2] = findViewById(R.id.textView62);
        textView[6][3] = findViewById(R.id.textView63);
        textView[6][4] = findViewById(R.id.textView64);
        textView[6][5] = findViewById(R.id.textView65);
        textView[6][6] = findViewById(R.id.textView66);
        textView[6][7] = findViewById(R.id.textView67);
        textView[6][8] = findViewById(R.id.textView68);

        textView[7][0] = findViewById(R.id.textView70);
        textView[7][1] = findViewById(R.id.textView71);
        textView[7][2] = findViewById(R.id.textView72);
        textView[7][3] = findViewById(R.id.textView73);
        textView[7][4] = findViewById(R.id.textView74);
        textView[7][5] = findViewById(R.id.textView75);
        textView[7][6] = findViewById(R.id.textView76);
        textView[7][7] = findViewById(R.id.textView77);
        textView[7][8] = findViewById(R.id.textView78);

        textView[8][0] = findViewById(R.id.textView80);
        textView[8][1] = findViewById(R.id.textView81);
        textView[8][2] = findViewById(R.id.textView82);
        textView[8][3] = findViewById(R.id.textView83);
        textView[8][4] = findViewById(R.id.textView84);
        textView[8][5] = findViewById(R.id.textView85);
        textView[8][6] = findViewById(R.id.textView86);
        textView[8][7] = findViewById(R.id.textView87);
        textView[8][8] = findViewById(R.id.textView88);


        textView[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[0][0], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 0, 0);
            }
        });

        textView[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[0][1], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 0, 1);
            }
        });


        textView[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[0][2], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 0, 2);
            }
        });

        textView[0][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[0][3], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 0, 3);
            }
        });

        textView[0][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[0][4], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 0, 4);
            }
        });


        textView[0][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[0][5], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 0, 5);
            }
        });

        textView[0][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[0][6], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 0, 6);
            }
        });

        textView[0][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[0][7], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 0, 7);
            }
        });


        textView[0][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[0][8], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 0, 8);
            }
        });


        textView[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[1][0], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 1, 0);
            }
        });

        textView[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[1][1], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 1, 1);
            }
        });


        textView[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[1][2], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 1, 2);
            }
        });

        textView[1][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[1][3], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 1, 3);
            }
        });

        textView[1][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[1][4], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 1, 4);
            }
        });


        textView[1][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[1][5], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 1, 5);
            }
        });

        textView[1][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[1][6], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 1, 6);
            }
        });

        textView[1][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[1][7], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 1, 7);
            }
        });

        textView[1][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[1][8], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 1, 8);
            }
        });

        textView[2][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[2][0], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 2, 0);
            }
        });

        textView[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[2][1], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 2, 1);
            }
        });


        textView[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[2][2], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 2, 2);
            }
        });

        textView[2][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[2][3], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 2, 3);
            }
        });

        textView[2][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[2][4], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 2, 4);
            }
        });


        textView[2][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[2][5], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 2, 5);
            }
        });

        textView[2][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[2][6], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 2, 6);
            }
        });

        textView[2][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[2][7], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 2, 7);
            }
        });


        textView[2][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[2][8], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 2, 8);
            }
        });

        textView[3][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[3][0], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 3, 0);
            }
        });

        textView[3][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[3][1], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 3, 1);
            }
        });


        textView[3][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[3][2], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 3, 2);
            }
        });

        textView[3][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[3][3], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 3, 3);
            }
        });

        textView[3][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[3][4], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 3, 4);
            }
        });


        textView[3][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[3][5], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 3, 5);
            }
        });

        textView[3][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[3][6], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 3, 6);
            }
        });

        textView[3][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[3][7], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 3, 7);
            }
        });


        textView[3][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[3][8], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 3, 8);
            }
        });

        textView[4][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[4][0], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 4, 0);
            }
        });

        textView[4][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[4][1], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 4, 1);
            }
        });


        textView[4][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[4][2], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 4, 2);
            }
        });

        textView[4][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[4][3], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 4, 3);
            }
        });

        textView[4][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[4][4], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 4, 4);
            }
        });


        textView[4][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[4][5], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 4, 5);
            }
        });

        textView[4][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[4][6], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 4, 6);
            }
        });

        textView[4][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[4][7], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 4, 7);
            }
        });


        textView[4][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[4][8], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 4, 8);
            }
        });

        textView[5][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[5][0], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 5, 0);
            }
        });

        textView[5][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[5][1], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 5, 1);
            }
        });


        textView[5][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[5][2], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 5, 2);
            }
        });

        textView[5][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[5][3], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 5, 3);
            }
        });

        textView[5][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[5][4], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 5, 4);
            }
        });


        textView[5][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[5][5], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 5, 5);
            }
        });

        textView[5][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[5][6], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 5, 6);
            }
        });

        textView[5][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[5][7], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 5, 7);
            }
        });


        textView[5][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[5][8], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 5, 8);
            }
        });

        textView[6][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[6][0], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 6, 0);
            }
        });

        textView[6][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[6][1], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 6, 1);
            }
        });


        textView[6][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[6][2], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 6, 2);
            }
        });

        textView[6][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[6][3], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 6, 3);
            }
        });

        textView[6][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[6][4], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 6, 4);
            }
        });

        textView[6][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[6][5], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 6, 5);
            }
        });

        textView[6][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[6][6], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 6, 6);
            }
        });

        textView[6][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[6][7], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 6, 7);
            }
        });


        textView[6][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[6][8], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 6, 8);
            }
        });

        textView[7][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[7][0], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 7, 0);
            }
        });

        textView[7][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[7][1], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 7, 1);
            }
        });


        textView[7][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[7][2], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 7, 2);
            }
        });

        textView[7][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[7][3], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 7, 3);
            }
        });

        textView[7][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[7][4], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 7, 4);
            }
        });


        textView[7][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[7][5], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 7, 5);
            }
        });

        textView[7][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[7][6], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 7, 6);
            }
        });

        textView[7][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[7][7], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 7, 7);
            }
        });


        textView[7][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[7][8], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 7, 8);
            }
        });

        textView[8][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[8][0], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 8, 0);
            }
        });

        textView[8][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[8][1], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 8, 1);
            }
        });


        textView[8][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[8][2], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 8, 2);
            }
        });

        textView[8][3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[8][3], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 8, 3);
            }
        });

        textView[8][4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[8][4], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 8, 4);
            }
        });


        textView[8][5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[8][5], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 8, 5);
            }
        });

        textView[8][6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[8][6], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 8, 6);
            }
        });

        textView[8][7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[8][7], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 8, 7);
            }
        });


        textView[8][8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisplayPopupWindow.displayPopupWindow(view, textView[8][8], inflater, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in_animation), vibrator, board, 8, 8);
            }
        });


        Button sudokuSolver = findViewById(R.id.solve_sudoku);
        Button clearButton = findViewById(R.id.clear_board);

        sudokuSolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    VibrationEffect vibrationEffect = VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.vibrate(vibrationEffect);
                }
                SudokuSolver.solveSudoku(board, 0, 0, textView, AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in));
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    VibrationEffect vibrationEffect = VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE);
                    vibrator.vibrate(vibrationEffect);
                }
                ClearBoard.clear(board, textView);
            }
        });
    }

}

class ViewLocation {
    int left, bottom;

    ViewLocation(int left, int bottom) {
        this.left = left;
        this.bottom = bottom;
    }

    public static ViewLocation locateView(View view)
    {
        int[] loc_int = new int[2];
        view.getLocationOnScreen(loc_int);
        return new ViewLocation(loc_int[0], loc_int[1] + view.getHeight());
    }
}

class DisplayPopupWindow {

    static void displayPopupWindow(View view, TextView textView, LayoutInflater inflater, Animation anim, Vibrator vibrator, int[][] board, int row, int col) {
        textView.startAnimation(anim);
        View popupView = inflater.inflate(R.layout.activity_popup_window, null);
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true;
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            popupWindow.setElevation(35);
        }

        ViewLocation location = ViewLocation.locateView(view);
        popupWindow.showAtLocation(view, Gravity.TOP | Gravity.LEFT, location.left, location.bottom);

        TextView textnumber1 = popupView.findViewById(R.id.number1);
        TextView textnumber2 = popupView.findViewById(R.id.number2);
        TextView textnumber3 = popupView.findViewById(R.id.number3);
        TextView textnumber4 = popupView.findViewById(R.id.number4);
        TextView textnumber5 = popupView.findViewById(R.id.number5);
        TextView textnumber6 = popupView.findViewById(R.id.number6);
        TextView textnumber7 = popupView.findViewById(R.id.number7);
        TextView textnumber8 = popupView.findViewById(R.id.number8);
        TextView textnumber9 = popupView.findViewById(R.id.number9);
        TextView textclear = popupView.findViewById(R.id.clear);

        textnumber1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayPopupWindow.RepeatedThings(vibrator, textView, popupWindow, board, row, col, 1);
            }
        });

        textnumber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayPopupWindow.RepeatedThings(vibrator, textView, popupWindow, board, row, col, 2);
            }
        });

        textnumber3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayPopupWindow.RepeatedThings(vibrator, textView, popupWindow, board, row, col, 3);
            }
        });

        textnumber4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayPopupWindow.RepeatedThings(vibrator, textView, popupWindow, board, row, col, 4);
            }
        });

        textnumber5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayPopupWindow.RepeatedThings(vibrator, textView, popupWindow, board, row, col, 5);
            }
        });

        textnumber6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayPopupWindow.RepeatedThings(vibrator, textView, popupWindow, board, row, col, 6);
            }
        });

        textnumber7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayPopupWindow.RepeatedThings(vibrator, textView, popupWindow, board, row, col, 7);
            }
        });

        textnumber8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayPopupWindow.RepeatedThings(vibrator, textView, popupWindow, board, row, col, 8);
            }
        });

        textnumber9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayPopupWindow.RepeatedThings(vibrator, textView, popupWindow, board, row, col, 9);
            }
        });

        textclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayPopupWindow.RepeatedThings(vibrator, textView, popupWindow, board, row, col, 0);
            }
        });

    }

    static void RepeatedThings(Vibrator vibrator, TextView textView, PopupWindow popupWindow, int[][] board, int row, int col, int val) {

        String textToDisplayInCell = val == 0 ? "" : String.valueOf(val);
        String toastMessage = "";

        if(val != 0 && board[row][col] != val) {
            if (SudokuSolver.check3BY3GridContainsDuplicateValue(board, row, col, val)) {
                toastMessage = textToDisplayInCell + " already contains in same 3 * 3 grid";
            }
            else if (SudokuSolver.checkRowContainsDuplicateValue(board, row, val)) {
                toastMessage = textToDisplayInCell + " already contains in same row";
            }
            else if (SudokuSolver.checkColumnContainsDuplicateValue(board, col, val)) {
                toastMessage = textToDisplayInCell + " already contains in same column";
            }
        }

        boolean isItSafeToInsertValueInBoard = toastMessage.length() == 0;
        int vibrateTime = isItSafeToInsertValueInBoard ? 30 : 100;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            VibrationEffect vibrationEffect = VibrationEffect.createOneShot(vibrateTime, VibrationEffect.DEFAULT_AMPLITUDE);
            vibrator.vibrate(vibrationEffect);
        }

        if(isItSafeToInsertValueInBoard) {
            board[row][col] = val;
            textView.setText(textToDisplayInCell);
            textView.setTextColor(Color.rgb(0, 0, 0));
        }
        else {
            Toast.makeText(popupWindow.getContentView().getContext(), toastMessage, Toast.LENGTH_SHORT).show();
        }

        try { Thread.sleep(200); } catch (Exception ignore) { }
        popupWindow.dismiss();
    }

}

class SudokuSolver {

    static boolean check3BY3GridContainsDuplicateValue(int[][] board, int row, int col, int val) {
        int startRow = ( row < 3 ? 0 : ( row < 6 ? 3 : 6 ) );
        int startCol = ( col < 3 ? 0 : ( col < 6 ? 3 : 6 ) );

        for(int i = startRow; i < startRow + 3; i++) {
            for(int j = startCol; j < startCol + 3; j++) {
                if(board[i][j] == val) {
                    return true;
                }
            }
        }

        return false;
    }

    static boolean checkRowContainsDuplicateValue(int[][] board, int row, int val) {
        for(int i = 0; i < 9; i++) {
            if(board[row][i] == val) {
                return true;
            }
        }
        return false;
    }

    static boolean checkColumnContainsDuplicateValue(int[][] board, int col, int val) {
        for(int i = 0; i < 9; i++) {
            if(board[i][col] == val) {
                return true;
            }
        }
        return false;
    }

    static boolean solveSudoku(int[][] board, int row, int col, TextView[][] textView, Animation anim)
    {

        if (row == 8 && col == 9) {
            return true;
        }

        if (col == 9) {
            row++;
            col = 0;
        }

        if (board[row][col] != 0) {
            return solveSudoku(board, row, col + 1, textView, anim);
        }

        for (int num = 1; num <= 9; num++) {

            if (check3BY3GridContainsDuplicateValue(board, row, col, num) || checkRowContainsDuplicateValue(board, row, num) || checkColumnContainsDuplicateValue(board, col, num)) {
                continue;
            }

            board[row][col] = num;
            textView[row][col].setText(String.valueOf(num));
            textView[row][col].setTextColor(Color.rgb(63, 55, 201));
            textView[row][col].startAnimation(anim);

            if (solveSudoku(board, row, col + 1, textView, anim)) {
                return true;
            }
            board[row][col] = 0;
        }
        return false;
    }

}

class ClearBoard {
    static void clear(int[][] board, TextView[][] textView) {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                board[i][j] = 0;
                textView[i][j].setText("");
                textView[i][j].setTextColor(Color.rgb(0, 0, 0));
            }
        }
    }
}