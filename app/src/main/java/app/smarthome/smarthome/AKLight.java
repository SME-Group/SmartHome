package app.smarthome.smarthome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class AKLight extends AppCompatActivity {

    TextView Status;
    ImageView Status2;
    String Bool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aklight);

        Status = (TextView)findViewById(R.id.txtAKLight);
        Status2 = (ImageView)findViewById(R.id.imgAKLight);

        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
        Bool = globalValue.getKitchenBool();

        if (Bool.equals("0")) //closed
        {
            Status2.setImageResource(R.drawable.lightoff1);
            Status.setText("Light : Off");
        }else if (Bool.equals("1")){
            Status2.setImageResource(R.drawable.lighton1);
            Status.setText("Light : On");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_aklight, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
