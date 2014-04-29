package me.harrygonzalez.arrispod;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ArrisPwdGen generator = new ArrisPwdGen();
        
        TextView pass_text = (TextView) findViewById(R.id.pass_text);
        pass_text.setText(ArrisPwdGen.currentPassword(generator.GenArrisPasswords()).toString());
	}

}
