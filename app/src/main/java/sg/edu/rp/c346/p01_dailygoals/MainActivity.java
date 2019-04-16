package sg.edu.rp.c346.p01_dailygoals;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rg1 = findViewById(R.id.radioGroup1);
                int selectedButtonId1 = rg1.getCheckedRadioButtonId();
                RadioButton rb1 = findViewById(selectedButtonId1);

                RadioGroup rg2 = findViewById(R.id.radioGroup2);
                int selectedButtonId2 = rg2.getCheckedRadioButtonId();
                RadioButton rb2 = findViewById(selectedButtonId2);

                RadioGroup rg3 = findViewById(R.id.radioGroup3);
                int selectedButtonId3 = rg3.getCheckedRadioButtonId();
                RadioButton rb3 = findViewById(selectedButtonId3);

                EditText etReflection = findViewById(R.id.editText);

                String[] info = {rb1.getText().toString(), rb2.getText().toString(), rb3.getText().toString(), etReflection.getText().toString()};
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                i.putExtra("info", info);
                startActivity(i);
            }
        });
    }
}
