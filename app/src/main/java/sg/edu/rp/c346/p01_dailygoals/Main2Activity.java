package sg.edu.rp.c346.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv1 = findViewById(R.id.textView);
        TextView tv2 = findViewById(R.id.textView2);
        TextView tv3 = findViewById(R.id.textView3);
        TextView tv4 = findViewById(R.id.textView4);

        Intent i = getIntent();

        String[] info = ((Intent) i).getStringArrayExtra("info");

        String w1 = getString(R.string.w1);
        String w2 = getString(R.string.w2);
        String w3 = getString(R.string.w3);

        tv1.setText(w1 + ":" + info[0]);
        tv2.setText(w2 + ":" + info[1]);
        tv3.setText(w3 + ":" + info[2]);
        tv4.setText("Reflection: " + info[3]);

        Button btn1 = findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
