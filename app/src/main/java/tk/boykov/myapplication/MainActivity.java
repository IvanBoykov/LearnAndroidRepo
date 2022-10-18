package tk.boykov.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	private String getOrientationString() {
		switch (getResources().getConfiguration().orientation) {
			case Configuration.ORIENTATION_LANDSCAPE:
				return getString(R.string.orientation_landscape);
			case Configuration.ORIENTATION_PORTRAIT:
				return getString(R.string.orientation_portrait);
			
			default:
				return "Unexpected value: " + getResources().getConfiguration().orientation;
		}
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView textView = findViewById(R.id.textView);
		textView.setText("Ориентация экрана: " + getOrientationString());
	}
}
