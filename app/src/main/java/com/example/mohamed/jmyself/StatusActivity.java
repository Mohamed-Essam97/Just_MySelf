package com.example.mohamed.jmyself;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class StatusActivity extends AppCompatActivity {

    TextView Status;
    Random r=new Random();
    int Random=(r.nextInt(9)+1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);
        Status =findViewById(R.id.Status);
    }



    public void Sad(View view) {
        String sad1="ربنا مش هيدّيك كل حاجة، بس هيديك حاجة متتوقعهاش";
        String sad2="اتعلم ترضى واشكر ومتشتكيش، ربنا وعدك انه هيزيدك";
        String sad3="وَإِذْ تَأَذَّنَ رَبُّكُمْ لَئِن شَكَرْتُمْ لأَزِيدَنَّكُمْ";
        String sad4="وَمَن يَتَّقِ ٱللَّهَ يَجْعَل لَّهُ مِنْ أَمْرِهِ يُسْرا";
        String sad5="إِنَّمَآ أَشْكُو بَثِّى وَحُزْنِى إِلَى ٱللَّه";
        String sad6="وَلَسَوْفَ يُعْطِيكَ رَبُّكَ فَتَرْضَىٰ";
        String sad7="مَا أَنزَلْنَا عَلَيْكَ الْقُرْآنَ لِتَشْقَى";
        String sad8="وَمَنْ أَعْرَضَ عَن ذِكْرِي فَإِنَّ لَهُ مَعِيشَةً ضَنكًا وَنَحْشُرُهُ يَوْمَ الْقِيَامَةِ أَعْمَىٰ";
        String sad9="مَآ أَصَابَ مِن مّصِيبَةٍ إِلاّ بِإِذْنِ اللّهِ";
        String sad10="وَمَن يُؤْمِن بِاللّهِ يَهْدِ قَلْبَهُ وَاللّهُ بِكُلّ شَيْءٍ عَلِيمٌ";
        Toast.makeText(this, "The Random is"+Random, Toast.LENGTH_SHORT).show();
        if (Random== 1)
        {
            Status.setText(sad1);
        }
        else if (Random==2)
        {
            Status.setText(sad2);

        }
        else if(Random==3)
        {
            Status.setText(sad3);

        }
        else if(Random==4)
        {
            Status.setText(sad4);

        }
        else if(Random==5)
        {
            Status.setText(sad5);

        }
        else if(Random==6)
        {
            Status.setText(sad6);

        }
        else if(Random==7)
        {
            Status.setText(sad7);

        }
        else if(Random==8)
        {
            Status.setText(sad8);

        }
        else if(Random==9)
        {
            Status.setText(sad9);

        }
        else if(Random==10)
        {
            Status.setText(sad10);

        }

        else {
            Toast.makeText(this, "No", Toast.LENGTH_SHORT).show();
        }


    }

    public void Happy(View view) {
        String happy1="رضا أهلك كنز من كنوز الدنيا بيفتحلك اي باب مقفول";
        String happy2="اتعلم ترضى واشكر ومتشتكيش، ربنا وعدك انه هيزيدك";
        String happy3="وَإِذْ تَأَذَّنَ رَبُّكُمْ لَئِن شَكَرْتُمْ لأَزِيدَنَّكُمْ";
        String happy4="وَمَن يَتَّقِ ٱللَّهَ يَجْعَل لَّهُ مِنْ أَمْرِهِ يُسْرا";
        String happy5="إِنَّمَآ أَشْكُو بَثِّى وَحُزْنِى إِلَى ٱللَّه";
        String happy6="وَلَسَوْفَ يُعْطِيكَ رَبُّكَ فَتَرْضَىٰ";
        String happy7="مَا أَنزَلْنَا عَلَيْكَ الْقُرْآنَ لِتَشْقَى";
        String happy8="وَمَنْ أَعْرَضَ عَن ذِكْرِي فَإِنَّ لَهُ مَعِيشَةً ضَنكًا وَنَحْشُرُهُ يَوْمَ الْقِيَامَةِ أَعْمَىٰ";
        String happy9="مَآ أَصَابَ مِن مّصِيبَةٍ إِلاّ بِإِذْنِ اللّهِ";
        String happy10="وَمَن يُؤْمِن بِاللّهِ يَهْدِ قَلْبَهُ وَاللّهُ بِكُلّ شَيْءٍ عَلِيمٌ";
        Toast.makeText(this, "The Random is"+Random, Toast.LENGTH_SHORT).show();
        if (Random== 1)
        {
            Status.setText(happy1);
        }
        else if (Random==2)
        {
            Status.setText(happy2);

        }
        else if(Random==3)
        {
            Status.setText(happy3);

        }
        else if(Random==4)
        {
            Status.setText(happy4);

        }
        else if(Random==5)
        {
            Status.setText(happy5);

        }
        else if(Random==6)
        {
            Status.setText(happy6);

        }
        else if(Random==7)
        {
            Status.setText(happy7);

        }
        else if(Random==8)
        {
            Status.setText(happy8);

        }
        else if(Random==9)
        {
            Status.setText(happy9);

        }
        else if(Random==10)
        {
            Status.setText(happy10);

        }

        else {
            Toast.makeText(this, "No", Toast.LENGTH_SHORT).show();
        }

    }

    public void Sick(View view) {
    }

    public void Heart(View view) {
    }
}
