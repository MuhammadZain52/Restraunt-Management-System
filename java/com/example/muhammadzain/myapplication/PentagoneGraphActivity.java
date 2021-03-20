package com.example.muhammadzain.myapplication;

import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PentagoneGraphActivity extends AppCompatActivity {

    private BarChart mBarChart;
    final String TAG="\n\nlog for debug";
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        statusBarColor();
        mBarChart=(BarChart)findViewById(R.id.graph);
        mBarChart.setScaleEnabled(false);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        List<BarEntry> barEntries=new ArrayList<>();
        int min=0,max=10;
        Random rand=new Random();


        //firebase starts here
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        CollectionReference Bill = db.collection("Dish");
        DocumentReference docRef = db.collection("Dish").document("1");
        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        Toast.makeText(getApplicationContext(),"data\n"+document.toString(),Toast.LENGTH_LONG).show();
                        Log.d(TAG, "\n\nDocumentSnapshot data: " + document.getData());
                    } else {
                        Toast.makeText(getApplicationContext(),"no such document\n",Toast.LENGTH_LONG).show();
                        Log.d(TAG, "\n\nNo such document");
                    }
                } else {
                    Toast.makeText(getApplicationContext(),"Exception\n"+task.getException(),Toast.LENGTH_LONG).show();
                    Log.d(TAG, "\n\nget failed with ", task.getException());
                }
            }
        });

        for(int i=0;i<8;i++)
        {
            barEntries.add(new BarEntry(rand.nextInt((max - min) + 1) + min,i));
        }

        BarDataSet barDataSet=new BarDataSet(barEntries,"Growth");
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        BarData barData=new BarData(barDataSet);
        barDataSet.setBarBorderWidth(1);

        mBarChart.setData(barData);
        mBarChart.setFitBars(true);

        Description description=new Description();
        description.setText("Daily Sales Report");
        mBarChart.setDescription(description);
        mBarChart.invalidate();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void statusBarColor()
    {
        //import android.view.Window;
        Window window = this.getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.orange));
    }
}
