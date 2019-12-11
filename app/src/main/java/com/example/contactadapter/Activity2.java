package com.example.contactadapter;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        setTitle("Contact Detail");

        String n1 ="ID: EE-001  \nPhone: 03**-*******   \nEmail:Hassan@gmail.com" ;
        String n2 ="ID: CC-090  \nPhone: 03**-*******   \nEmail:Zain@hotmail.com";
        String n3 ="ID: SE-101  \nPhone: 03**-*******   \nEmail:AtikaIslam@gmail.com" ;
        String n4 ="ID: CS-111  \nPhone: 03**-*******   \nEmail:MS@gmail.com" ;
        String n5 ="ID: EE-022  \nPhone: 03**-*******   \nEmail:DD@hotmail.com" ;
        String n6 ="ID: CC-990  \nPhone: 03**-*******   \nEmail:Raza@gmail.com";
        String n7 ="ID: SE-101  \nPhone: 03**-*******   \nEmail:pucit@edu.pk" ;
        String n8 ="ID: CS-121  \nPhone: 03**-*******   \nEmail:hacker@hack.com" ;

        Intent intent = getIntent();
        final String s = intent.getStringExtra("Send");

        TextView text = findViewById(R.id.text);
        //txt.setText(s);

        if (s.equals("Hassan")  )
        {
            text.setText(n1);
        }
        else if (s.equals("Zain"))
        {
            text.setText(n2);

        }
        else if (s.equals("Atika"))
        {
            text.setText(n3);

        }
        else if (s.equals("Musician"))
        {
            text.setText(n4);

        }
        else if (s.equals("Dancer"))
        {
            text.setText(n5);

        }
        else if (s.equals("Raza"))
        {
            text.setText(n6);

        }
        else if (s.equals("pucit_admin"))
        {
            text.setText(n7);

        }
        else if (s.equals("Hacker"))
        {
            text.setText(n8);

        }
        else
            return;


        Button Back = findViewById(R.id.button_back);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   TextView txt = (EditText) findViewById(R.id.reply);
              //  String text = txt.getText().toString();

                Intent intent1 = new Intent(Activity2.this, MainActivity.class);
                intent1.putExtra("Reply","");
                startActivity(intent1);
                //finish();
            }
        });
    }
}
