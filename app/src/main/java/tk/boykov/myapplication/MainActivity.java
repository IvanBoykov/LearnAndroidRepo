package tk.boykov.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
	private static final int SHOW_GIFT_ACTIVITY_RESULT_ID=127;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.aboutButton).setOnClickListener((v) ->{
			Intent intent = new Intent(this, AboutActivity.class);
			startActivity(intent);
		});
	}
	public  void  send(View view){
	Intent intent= new Intent(this, ShowGiftActivity.class);
		EditText text=findViewById(R.id.giftTitleEdit);
	String giftTitle= text.getText().toString();
	intent.putExtra("gift", giftTitle);
	startActivityForResult(intent, SHOW_GIFT_ACTIVITY_RESULT_ID);
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		switch (requestCode){
			case SHOW_GIFT_ACTIVITY_RESULT_ID:
				boolean accepted= data.getBooleanExtra("accepted", false);
				if (accepted){
					Toast.makeText(this, "Подарок принят", Toast.LENGTH_SHORT).show();
				}else {
					Toast.makeText(this, "Подарок не принят", Toast.LENGTH_SHORT).show();
				}
				break;
		}
	}
}
