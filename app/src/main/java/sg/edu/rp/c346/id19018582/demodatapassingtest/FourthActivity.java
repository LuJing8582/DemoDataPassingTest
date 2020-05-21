package sg.edu.rp.c346.id19018582.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView tvAns4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvAns4 = findViewById(R.id.textView4);

        Intent r = getIntent();
        Double d = r.getDoubleExtra("double", 0.0);
        tvAns4.setText("Double value received is: " + d);
    }
}
