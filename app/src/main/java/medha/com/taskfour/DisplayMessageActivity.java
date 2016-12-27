package medha.com.taskfour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        TextView print_name = (TextView) findViewById(R.id.print_name);
        TextView print_age= (TextView) findViewById(R.id.print_age);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String age = intent.getStringExtra("Age");


        print_name.setText(name);
        print_age.setText(age);


    }
}




