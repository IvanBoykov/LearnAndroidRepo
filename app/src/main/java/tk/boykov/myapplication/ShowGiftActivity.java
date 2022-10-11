package tk.boykov.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowGiftActivity extends AppCompatActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_gift);
	String gift= getIntent().getStringExtra("gift");
		if (gift == null || "".equals(gift)) {
			gift="ничего";
		}
		TextView textView=findViewById(R.id.giftText);
		String text="Вам подарили " + gift;
		textView.setText(text);
	}
	
	public void accept(View view) {
		returnResult(true);
	}
	
	public void decline(View view) {
		returnResult(false);
	}
	private  void  returnResult(boolean response){
		Intent responseIntent= new Intent();
		responseIntent.putExtra("accepted", response);
		setResult(RESULT_OK, responseIntent);
		finish();
	}
}
