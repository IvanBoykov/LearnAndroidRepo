package tk.boykov.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	private TextView textView;
	private EditText kittyName;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textView = findViewById(R.id.TextView);
		kittyName = findViewById(R.id.EditKittyName);
	}
	
	public void onClickButton1(View view) {
		if (kittyName.getText().length() == 0) {
			textView.setText("Hello Kitty!");
		} else {
			textView.setText("Привет, " + kittyName.getText());
		}
	}
}
