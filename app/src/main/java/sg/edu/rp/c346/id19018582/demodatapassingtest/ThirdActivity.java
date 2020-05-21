package sg.edu.rp.c346.id19018582.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView tvAns3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAns3 = findViewById(R.id.textView3);

        Intent rec = getIntent();
        char val = rec.getCharExtra("result", '0');
        tvAns3.setText("Character Value Received is: " + val);

    }
}
