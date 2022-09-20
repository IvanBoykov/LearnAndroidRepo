package tk.boykov.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	
	private  int ravens=0;
	private  int cats=0;
	TextView ravenCounter;
	TextView catsCounter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		String ravenCounterText=getString(R.string.ravenCounterText);
		String catsCounterText= getString(R.string.catsCounterText);
		ravenCounter=findViewById(R.id.ravenCounterText);
		ravenCounter.setText(String.format(ravenCounterText, 0));
				findViewById(R.id.ravenCounterButton).setOnClickListener((view) ->{
					this.ravens+=1;
					this.ravenCounter.setText(String.format(ravenCounterText, ravens));
				});
		catsCounter=findViewById(R.id.catsCounter);
		catsCounter.setText(String.format(catsCounterText, 0));
		findViewById(R.id.catsCounterButton).setOnClickListener((view ->{
			this.cats+=1;
			catsCounter.setText(String.format(catsCounterText, cats));
		} ));
	}
}
