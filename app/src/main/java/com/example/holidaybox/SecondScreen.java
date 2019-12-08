package com.example.holidaybox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class SecondScreen extends AppCompatActivity {
    Spinner cookieSpinner;
    Spinner cakeSpinner;
    Spinner candySpinner;
    Spinner pieSpinner;
    Spinner pastrySpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        cookieSpinner = (Spinner)findViewById(R.id.CookieSpinner);
        cookieSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    return;
                } else if (position == 1) {
                    Intent intent = new Intent(SecondScreen.this, GingerbreadScreen.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(SecondScreen.this, SugarCookieClass.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(SecondScreen.this, ChocSable.class);
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        cakeSpinner = (Spinner)findViewById(R.id.CakeSpinner);
        cakeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    return;
                } else if (position == 1) {
                    Intent intent = new Intent(SecondScreen.this, RedVelvetCake.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(SecondScreen.this, YuleLogCake.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(SecondScreen.this, FruitCake.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        candySpinner = (Spinner)findViewById(R.id.CandySpinner);
        candySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    return;
                } else if (position == 1) {
                    Intent intent = new Intent(SecondScreen.this, Truffles.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(SecondScreen.this, PeppermintBark.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(SecondScreen.this, SnowmenPops.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        pieSpinner = (Spinner)findViewById(R.id.PieSpinner);
        pieSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    return;
                } else if (position == 1) {
                    Intent intent = new Intent(SecondScreen.this, ApplePie.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(SecondScreen.this, WhiteChristmasPie.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(SecondScreen.this, CoconutPie.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        pastrySpinner = (Spinner)findViewById(R.id.PastrySpinner);
        pastrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    return;
                } else if (position == 1) {
                    Intent intent = new Intent(SecondScreen.this, TeaScones.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(SecondScreen.this, NutellaCroissant.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(SecondScreen.this, RasberryDanish.class);
                    startActivity(intent);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}
