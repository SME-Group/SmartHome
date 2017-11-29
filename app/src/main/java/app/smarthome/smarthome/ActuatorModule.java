package app.smarthome.smarthome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ActuatorModule extends AppCompatActivity implements View.OnClickListener{
    Button btnDoorAct, btnFireAct, btmAlarmAct, btnTheaterAct, btnStoveAct, btnLLightAct, btnDLightAct, btnKLightAct,btnMLightAct, btnClothAct,btnDishwasherAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actuator_module);

        btnDoorAct = (Button) findViewById(R.id.btnDoorActuator);
        btnFireAct = (Button) findViewById(R.id.btnSmokeAlarmActuator);
        btmAlarmAct = (Button) findViewById(R.id.btnAlarmClockActuator);
        btnTheaterAct = (Button) findViewById(R.id.btnHomeTheaterActuator);
        btnStoveAct = (Button) findViewById(R.id.btnStoveActuator);
        btnLLightAct = (Button) findViewById(R.id.btnLivingLightActuator);
        btnDLightAct = (Button) findViewById(R.id.btnDiningLightActuator);
        btnKLightAct = (Button) findViewById(R.id.btnKitchenLightActuator);
        btnMLightAct = (Button) findViewById(R.id.btnMasterLightActuator);
        btnClothAct = (Button) findViewById(R.id.btnClothHorseActuator);
        btnDishwasherAct = (Button) findViewById(R.id.btnDishWasherActuator);

        btnDoorAct.setOnClickListener(this);
        btnFireAct.setOnClickListener(this);
        btmAlarmAct.setOnClickListener(this);
        btnTheaterAct.setOnClickListener(this);
        btnStoveAct.setOnClickListener(this);
        btnLLightAct.setOnClickListener(this);
        btnDLightAct.setOnClickListener(this);
        btnKLightAct.setOnClickListener(this);
        btnMLightAct.setOnClickListener(this);
        btnClothAct.setOnClickListener(this);
        btnDishwasherAct.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actuator_module, menu);
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnDoorActuator:
                startActivity(new Intent(ActuatorModule.this, Adoor.class));
                break;
            case R.id.btnSmokeAlarmActuator:
                startActivity(new Intent(ActuatorModule.this, Asmoke.class));
                break;
            case R.id.btnAlarmClockActuator:
                startActivity(new Intent(ActuatorModule.this, Aalarm.class));
                break;
            case R.id.btnHomeTheaterActuator:
                startActivity(new Intent(ActuatorModule.this, Ahometheater.class));
                break;
            case R.id.btnStoveActuator:
                startActivity(new Intent(ActuatorModule.this, Astove.class));
                break;
            case R.id.btnLivingLightActuator:
                startActivity(new Intent(ActuatorModule.this, ALLight.class));
                break;
            case R.id.btnDiningLightActuator:
                startActivity(new Intent(ActuatorModule.this, ADLight.class));
                break;
            case R.id.btnKitchenLightActuator:
                startActivity(new Intent(ActuatorModule.this, AKLight.class));
                break;
            case R.id.btnMasterLightActuator:
                startActivity(new Intent(ActuatorModule.this, AMLight.class));
                break;
            case R.id.btnClothHorseActuator:
                startActivity(new Intent(ActuatorModule.this, ACloth.class));
                break;
            case R.id.btnDishWasherActuator:
                startActivity(new Intent(ActuatorModule.this, ADish.class));
                break;
        }
    }
}
