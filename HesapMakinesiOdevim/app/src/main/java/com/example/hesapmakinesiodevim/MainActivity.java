package com.example.hesapmakinesiodevim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button_C,button_bolme;
    Button button_yedi,button_sekiz,button_dokuz,button_carpma;
    Button button_dort,button_bes,button_alti,button_cikarma;
    Button button_bir,button_iki,button_uc,button_toplama;
    Button button_AC,button_sifir,button_nokta,button_esittir;

    TextView sonuc,cozum;

    boolean toplama,cikarma,carpma,bolme;

    float deger_bir,deger_iki;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_C=findViewById(R.id.button_C);

        Button button_bolme=findViewById(R.id.button_bolme);
        Button button_yedi=findViewById(R.id.button_yedi);
        Button button_sekiz=findViewById(R.id.button_sekiz);
        Button button_dokuz=findViewById(R.id.button_dokuz);
        Button button_carpma=findViewById(R.id.button_carpma);
        Button button_dort=findViewById(R.id.button_dort);
        Button button_bes=findViewById(R.id.button_bes);
        Button button_alti=findViewById(R.id.button_alti);
        Button button_cikarma=findViewById(R.id.button_cikarma);
        Button button_bir=findViewById(R.id.button_bir);
        Button button_iki=findViewById(R.id.button_iki);
        Button button_uc=findViewById(R.id.button_uc);
        Button button_toplama=findViewById(R.id.button_toplama);
        Button button_AC=findViewById(R.id.button_AC);
        Button button_sifir=findViewById(R.id.button_sifir);
        Button button_nokta=findViewById(R.id.button_nokta);
        Button button_esittir=findViewById(R.id.button_esittir);

        TextView sonuc=findViewById(R.id.sonuc);
        TextView cozum=findViewById(R.id.cozum);



        //simdi butonlari tiklanabilir hale getiriyoruz
        button_bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"1");
                cozum.setText(sonuc.getText());
            }
        });

        button_iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"2");
                cozum.setText(sonuc.getText());
            }
        });

        button_uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"3");
                cozum.setText(sonuc.getText());
            }
        });

        button_dort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"4");
                cozum.setText(sonuc.getText());
            }
        });

        button_bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"5");
                cozum.setText(sonuc.getText());
            }
        });

        button_alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"6");
                cozum.setText(sonuc.getText());
            }
        });

        button_yedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"7");
                cozum.setText(sonuc.getText());
            }
        });

        button_sekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"8");
                cozum.setText(sonuc.getText());
            }
        });

        button_dokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"9");
                cozum.setText(sonuc.getText());
            }
        });

        button_sifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+"0");
                cozum.setText(sonuc.getText());
            }
        });

        button_nokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText(sonuc.getText()+".");
                cozum.setText(sonuc.getText());
            }
        });

        button_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonuc.setText("");
            }
        });

        button_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String deger = cozum.getText().toString();
                deger=deger.substring(0,deger.length()-1);
                cozum.setText(deger);
                sonuc.setText(deger);
            }
        });

        button_toplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sonuc == null) {
                    sonuc.setText("");
                }
                else {
                    deger_bir=Float.parseFloat(sonuc.getText()+"");
                    toplama=true;
                    sonuc.setText(null);
                }
            }
        });


        button_cikarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger_bir=Float.parseFloat(sonuc.getText()+"");
                cikarma=true;
                sonuc.setText(null);
            }
        });

        button_carpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger_bir=Float.parseFloat(sonuc.getText()+"");
                carpma=true;
                sonuc.setText(null);
            }
        });

        button_bolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger_bir=Float.parseFloat(sonuc.getText()+"");
                bolme=true;
                sonuc.setText(null);
            }
        });

        button_esittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deger_iki=Float.parseFloat(sonuc.getText()+"");

                if(toplama==true)
                {
                    sonuc.setText(deger_bir+deger_iki+"");
                    cozum.setText(deger_bir+"+"+deger_iki);
                    toplama=false;//surekli toplama islemi yapmamasi icin
                }

                if(cikarma==true)
                {
                    sonuc.setText(deger_bir-deger_iki+"");
                    cozum.setText(deger_bir+"-"+deger_iki);
                    cikarma=false;
                }

                if(carpma==true)
                {
                    sonuc.setText(deger_bir*deger_iki+"");
                    cozum.setText(deger_bir+"*"+deger_iki);
                    carpma=false;
                }

                if(bolme==true)
                {
                    sonuc.setText(deger_bir/deger_iki+"");
                    cozum.setText(deger_bir+"/"+deger_iki);
                    bolme=false;
                }
            }
        });
    }
}