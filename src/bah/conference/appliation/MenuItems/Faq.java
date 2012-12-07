package bah.conference.appliation.MenuItems;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import bah.conference.appliation.R;
import bah.conference.appliation.database.quick.Bottom_Menu;

public class Faq extends Activity implements MenuItem{	
	@Override
    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.faq);

        Bottom_Menu.initialize(this);
	}
	public void open(Activity activity) {
		Intent intent = new Intent(activity,Faq.class);
		activity.startActivity(intent);
	}

}
