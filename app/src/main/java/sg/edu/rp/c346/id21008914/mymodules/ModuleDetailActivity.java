package sg.edu.rp.c346.id21008914.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView mod;
    TextView name;
    TextView year;
    TextView sem;
    TextView credit;
    TextView value;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        mod = findViewById(R.id.textView1);
        name = findViewById(R.id.textView2);
        year = findViewById(R.id.textView3);
        sem = findViewById(R.id.textView4);
        credit = findViewById(R.id.textView5);
        value = findViewById(R.id.textView6);

        mod.setText("Module code: "+ getIntent().getStringExtra("modCode"));
        name.setText("Module name: "+ getIntent().getStringExtra("modName"));
        year.setText("Academic Year: "+ getIntent().getStringExtra("year"));
        sem.setText("Semester: "+ getIntent().getStringExtra("sem"));
        credit.setText("Module Credit: "+ getIntent().getStringExtra("credit"));
        value.setText("Venue: "+ getIntent().getStringExtra("value"));

    }
}