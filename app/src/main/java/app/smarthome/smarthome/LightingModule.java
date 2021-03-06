package app.smarthome.smarthome;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class LightingModule extends AppCompatActivity implements View.OnClickListener{

    Switch livingRoom, diningRoom, masterRoom, kitchen;
    String LLBool, DLBool, MLBool, KLBool;
    Button btnSetLight;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lighting_module);

        livingRoom = (Switch)findViewById(R.id.switchL);
        diningRoom = (Switch)findViewById(R.id.switchD);
        masterRoom  = (Switch)findViewById(R.id.switchM);
        kitchen = (Switch)findViewById(R.id.switchK);

        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
        LLBool = globalValue.getLivingRoomBool();
        DLBool = globalValue.getDiningRoomBool();
        MLBool = globalValue.getMasterRoomBool();
        KLBool = globalValue.getKitchenBool();

        if (LLBool.equals("1")){
            livingRoom.setChecked(true);
        }else{
            livingRoom.setChecked(false);
        }
        if (DLBool.equals("1")){
            diningRoom.setChecked(true);
        }else{
            diningRoom.setChecked(false);
        }if (MLBool.equals("1")){
            masterRoom.setChecked(true);
        }else{
            masterRoom.setChecked(false);
        }if (KLBool.equals("1")){
            kitchen.setChecked(true);
        }else{
            kitchen.setChecked(false);
        }


        btnSetLight = (Button)findViewById(R.id.btnSetLighting);
        btnSetLight.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lighting_module, menu);
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

        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
        if(livingRoom.isChecked()){
            globalValue.setLivingRoomBool("1");
        }else{
            globalValue.setLivingRoomBool("0");
        }

        if(diningRoom.isChecked()){
            globalValue.setDiningRoomBool("1");
        }else{
            globalValue.setDiningRoomBool("0");
        }

        if(masterRoom.isChecked()){
            globalValue.setMasterRoomBool("1");
        }else{
            globalValue.setMasterRoomBool("0");
        }

        if(kitchen.isChecked()){
            globalValue.setKitchenBool("1");
        }else{
            globalValue.setKitchenBool("0");
        }

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

        // set title
        alertDialogBuilder.setTitle("Successful Configuration");

        // set dialog message
        AlertDialog.Builder builder = alertDialogBuilder
                .setMessage("The light setting is configured successfully.")
                .setCancelable(false)
                .setPositiveButton("Good", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity
                        LightingModule.this.finish();
                    }
                })
               /* .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                    }
                })*/;

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();

    }
}
