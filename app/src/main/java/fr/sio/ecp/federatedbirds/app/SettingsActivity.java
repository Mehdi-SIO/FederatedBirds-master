package fr.sio.ecp.federatedbirds.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import fr.sio.ecp.federatedbirds.R;


public class SettingsActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);

        if (savedInstanceState == null) {
            SettingsFragment fragment = new SettingsFragment();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.main_container, fragment)
                    .commit();
        }

    }

}
