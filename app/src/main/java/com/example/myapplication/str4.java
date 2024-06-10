package com.example.myapplication;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;


public class str4 extends AppCompatActivity {
    private float imageX, imageY;
    private ConstraintLayout container;
    private FrameLayout imageViewContainer;
    private ImageView imageView;
    private EditText editText;
    private int imagePositionX;
    private int imagePositionY;
    private String savedText;
    private int cursorPosition;
    private int imageCounter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.str4);

        Button addButton = findViewById(R.id.addButton);
        ConstraintLayout layout = findViewById(R.id.container2);




        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText newEditText = new EditText(getApplicationContext());
                newEditText.setText("");

                newEditText.setFocusableInTouchMode(true);
                newEditText.setFocusable(true);
                newEditText.requestFocus();

                layout.addView(newEditText);

                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
                        ConstraintLayout.LayoutParams.WRAP_CONTENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT
                );

                layoutParams.leftToLeft = ConstraintSet.PARENT_ID;
                layoutParams.topToTop = ConstraintSet.PARENT_ID;
                layoutParams.leftMargin = 100;
                layoutParams.topMargin = 20;

                newEditText.setLayoutParams(layoutParams);
                newEditText.requestLayout();

                newEditText.setOnTouchListener(new View.OnTouchListener() {
                    float dX, dY;

                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        switch (event.getAction()) {
                            case MotionEvent.ACTION_DOWN:
                                dX = v.getX() - event.getRawX();
                                dY = v.getY() - event.getRawY();
                                break;
                            case MotionEvent.ACTION_MOVE:
                                v.animate()
                                        .x(event.getRawX() + dX)
                                        .y(event.getRawY() + dY)
                                        .setDuration(0)
                                        .start();
                                break;
                            default:
                                return false;
                        }
                        return true;
                    }
                });
            }

        });
        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(str4.this);
                imageView.setImageResource(R.drawable.line); // установите изображение
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
                        900, 100);
                layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
                layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                layoutParams.leftMargin = 50;
                layoutParams.topMargin = 100;
                imageView.setLayoutParams(layoutParams);
                layout.addView(imageView);

                imageView.setOnTouchListener(new View.OnTouchListener() {
                    float startX, startY;
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        switch(event.getAction()) {
                            case MotionEvent.ACTION_DOWN:
                                startX = event.getRawX() - v.getX();
                                startY = event.getRawY() - v.getY();
                                break;
                            case MotionEvent.ACTION_MOVE:
                                v.setX(event.getRawX() - startX);
                                v.setY(event.getRawY() - startY);
                                break;
                        }
                        return true;
                    }
                });
            }
        });
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(str4.this);
                imageView.setImageResource(R.drawable.line2); // установите изображение
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
                        900, 400);
                layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
                layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                layoutParams.leftMargin = 50;
                layoutParams.topMargin = 100;
                imageView.setLayoutParams(layoutParams);
                layout.addView(imageView);

                imageView.setOnTouchListener(new View.OnTouchListener() {
                    float startX, startY;
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        switch(event.getAction()) {
                            case MotionEvent.ACTION_DOWN:
                                startX = event.getRawX() - v.getX();
                                startY = event.getRawY() - v.getY();
                                break;
                            case MotionEvent.ACTION_MOVE:
                                v.setX(event.getRawX() - startX);
                                v.setY(event.getRawY() - startY);
                                break;
                        }
                        return true;
                    }
                });
            }
        });
        findViewById(R.id.button9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(str4.this);
                imageView.setImageResource(R.drawable.images); // установите изображение
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
                        250, 250);
                layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
                layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                layoutParams.leftMargin = 50;
                layoutParams.topMargin = 100;
                imageView.setLayoutParams(layoutParams);
                layout.addView(imageView);

                imageView.setOnTouchListener(new View.OnTouchListener() {
                    float startX, startY;
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        switch(event.getAction()) {
                            case MotionEvent.ACTION_DOWN:
                                startX = event.getRawX() - v.getX();
                                startY = event.getRawY() - v.getY();
                                break;
                            case MotionEvent.ACTION_MOVE:
                                v.setX(event.getRawX() - startX);
                                v.setY(event.getRawY() - startY);
                                break;
                        }
                        return true;
                    }
                });
            }
        });
        findViewById(R.id.button11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(str4.this);
                imageView.setImageResource(R.drawable.busstation); // установите изображение
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
                        230, 230);
                layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
                layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                layoutParams.leftMargin = 50;
                layoutParams.topMargin = 100;
                imageView.setLayoutParams(layoutParams);
                layout.addView(imageView);

                imageView.setOnTouchListener(new View.OnTouchListener() {
                    float startX, startY;
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        switch(event.getAction()) {
                            case MotionEvent.ACTION_DOWN:
                                startX = event.getRawX() - v.getX();
                                startY = event.getRawY() - v.getY();
                                break;
                            case MotionEvent.ACTION_MOVE:
                                v.setX(event.getRawX() - startX);
                                v.setY(event.getRawY() - startY);
                                break;
                        }
                        return true;
                    }
                });
            }
        });
        findViewById(R.id.button12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(str4.this);
                imageView.setImageResource(R.drawable.start); // установите изображение
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
                        150, 150);
                layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
                layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                layoutParams.leftMargin = 50;
                layoutParams.topMargin = 100;
                imageView.setLayoutParams(layoutParams);
                layout.addView(imageView);

                imageView.setOnTouchListener(new View.OnTouchListener() {
                    float startX, startY;
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        switch(event.getAction()) {
                            case MotionEvent.ACTION_DOWN:
                                startX = event.getRawX() - v.getX();
                                startY = event.getRawY() - v.getY();
                                break;
                            case MotionEvent.ACTION_MOVE:
                                v.setX(event.getRawX() - startX);
                                v.setY(event.getRawY() - startY);
                                break;
                        }
                        return true;
                    }
                });
            }
        });
        findViewById(R.id.button10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(str4.this);
                imageView.setImageResource(R.drawable.drive); // установите изображение
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
                        170, 170);
                layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
                layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                layoutParams.leftMargin = 50;
                layoutParams.topMargin = 100;
                imageView.setLayoutParams(layoutParams);
                layout.addView(imageView);

                imageView.setOnTouchListener(new View.OnTouchListener() {
                    float startX, startY;
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        switch(event.getAction()) {
                            case MotionEvent.ACTION_DOWN:
                                startX = event.getRawX() - v.getX();
                                startY = event.getRawY() - v.getY();
                                break;
                            case MotionEvent.ACTION_MOVE:
                                v.setX(event.getRawX() - startX);
                                v.setY(event.getRawY() - startY);
                                break;
                        }
                        return true;
                    }
                });
            }
        });
        findViewById(R.id.button13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView imageView = new ImageView(str4.this);
                imageView.setImageResource(R.drawable.walk); // установите изображение
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
                        200, 200);
                layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
                layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                layoutParams.leftMargin = 50;
                layoutParams.topMargin = 100;
                imageView.setLayoutParams(layoutParams);
                layout.addView(imageView);

                imageView.setOnTouchListener(new View.OnTouchListener() {
                    float startX, startY;
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        switch(event.getAction()) {
                            case MotionEvent.ACTION_DOWN:
                                startX = event.getRawX() - v.getX();
                                startY = event.getRawY() - v.getY();
                                break;
                            case MotionEvent.ACTION_MOVE:
                                v.setX(event.getRawX() - startX);
                                v.setY(event.getRawY() - startY);
                                break;
                        }
                        return true;
                    }

                });
            }
        });
        findViewById(R.id.button14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final ImageView imageView = new ImageView(str4.this);
                imageView.setImageResource(R.drawable.hotel);
                imageView.setX(imageX);
                imageView.setY(imageY);// установите изображение
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(
                        200, 200);
                layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
                layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                layoutParams.leftMargin = 50;
                layoutParams.topMargin = 100;
                imageView.setLayoutParams(layoutParams);
                layout.addView(imageView);

                imageView.setOnTouchListener(new View.OnTouchListener() {
                    float startX, startY;
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        switch(event.getAction()) {
                            case MotionEvent.ACTION_DOWN:
                                startX = event.getRawX() - v.getX();
                                startY = event.getRawY() - v.getY();
                                break;
                            case MotionEvent.ACTION_MOVE:
                                v.setX(event.getRawX() - startX);
                                v.setY(event.getRawY() - startY);

                                break;
                        }
                        return true;
                    }
                });

            }
        });



    }


}