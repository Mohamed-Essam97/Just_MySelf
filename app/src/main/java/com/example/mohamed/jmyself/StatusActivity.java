package com.example.mohamed.jmyself;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class StatusActivity extends AppCompatActivity {

    TextView Status;
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        Status =findViewById(R.id.Status);
    }



    public void Sad(View view) {
        Random r=new Random();
        int Random=(r.nextInt(9)+1);

       String[] Sad=getResources().getStringArray(R.array.Sad);
        if (Random== 1)
        {
            Status.setText(Sad[0]);
        }
        else if (Random==2)
        {
            Status.setText(Sad[1]);

        }
        else if(Random==3)
        {
            Status.setText(Sad[2]);

        }
        else if(Random==4)
        {
            Status.setText(Sad[3]);

        }
        else if(Random==5)
        {
            Status.setText(Sad[4]);

        }
        else if(Random==6)
        {
            Status.setText(Sad[5]);

        }
        else if(Random==7)
        {
            Status.setText(Sad[6]);

        }
        else if(Random==8)
        {
            Status.setText(Sad[7]);

        }
        else if(Random==9)
        {
            Status.setText(Sad[8]);

        }
        else if(Random==10)
        {
            Status.setText(Sad[9]);

        }

        else {
            Toast.makeText(this, "No", Toast.LENGTH_SHORT).show();
        }


    }

    public void Happy(View view) {
        Random r=new Random();
        int Random=(r.nextInt(9)+1);

        String[] Happy=getResources().getStringArray(R.array.Happy);

        if (Random== 1)
        {
            Status.setText(Happy[0]);
        }
        else if (Random==2)
        {
            Status.setText(Happy[1]);

        }
        else if(Random==3)
        {
            Status.setText(Happy[2]);

        }
        else if(Random==4)
        {
            Status.setText(Happy[3]);

        }
        else if(Random==5)
        {
            Status.setText(Happy[4]);

        }
        else if(Random==6)
        {
            Status.setText(Happy[5]);

        }
        else if(Random==7)
        {
            Status.setText(Happy[6]);

        }
        else if(Random==8)
        {
            Status.setText(Happy[7]);

        }
        else if(Random==9)
        {
            Status.setText(Happy[8]);

        }
        else if(Random==10)
        {
            Status.setText(Happy[9]);

        }

        else {
            Toast.makeText(this, "No", Toast.LENGTH_SHORT).show();
        }

    }

    public void Sick(View view) {
        Random r=new Random();
        int Random=(r.nextInt(9)+1);

        String[] Sick=getResources().getStringArray(R.array.Sick);

        if (Random== 1)
        {
            Status.setText(Sick[0]);
        }
        else if (Random==2)
        {
            Status.setText(Sick[1]);

        }
        else if(Random==3)
        {
            Status.setText(Sick[2]);

        }
        else if(Random==4)
        {
            Status.setText(Sick[3]);

        }
        else if(Random==5)
        {
            Status.setText(Sick[4]);

        }
        else if(Random==6)
        {
            Status.setText(Sick[5]);

        }
        else if(Random==7)
        {
            Status.setText(Sick[6]);

        }
        else if(Random==8)
        {
            Status.setText(Sick[7]);

        }
        else if(Random==9)
        {
            Status.setText(Sick[8]);

        }
        else if(Random==10)
        {
            Status.setText(Sick[9]);

        }

        else {
            Toast.makeText(this, "No", Toast.LENGTH_SHORT).show();
        }    }


}
