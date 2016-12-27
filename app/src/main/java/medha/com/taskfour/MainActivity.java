package medha.com.taskfour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText name = (EditText) findViewById(R.id.name);
        EditText age = (EditText) findViewById(R.id.age);
        String Name = name.getText().toString();
        String Age=(age.getText().toString());

        intent.putExtra("Name",Name);
        intent.putExtra("Age",Age);
        startActivity(intent);
    }

}
