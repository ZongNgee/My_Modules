package sg.edu.rp.c346.id21008914.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tvOne;
    TextView tvTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOne = findViewById(R.id.textViewOne);
        tvTwo = findViewById(R.id.textViewTwo);
        tvOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modCode", "C346");
                intent.putExtra("modName", "Android Programming");
                intent.putExtra("year", "2020");
                intent.putExtra("sem", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("value", "W66M");
                startActivity(intent);

            }
        });
        tvTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("modCode", "C349");
                intent.putExtra("modName", "iPad Programming");
                intent.putExtra("year", "2020");
                intent.putExtra("sem", "1");
                intent.putExtra("credit", "4");
                intent.putExtra("value", "E66K");
                startActivity(intent);

            }
        });
    }
}