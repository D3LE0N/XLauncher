package com.ssasa.launcherlib;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ssasa.core.Launcher;
import com.ssasa.core.LauncherListener;
import com.ssasa.core.pojo.LauncherException;
import com.ssasa.core.pojo.Persona;

public class MainActivity extends AppCompatActivity {

    private Launcher launcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        launcher = new Launcher(this, "xxxxxxxxxxxxxxxxx", new LauncherListener() {

            @Override
            public void onSuccess(Persona persona) {

                Toast.makeText(MainActivity.this, persona.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(LauncherException error) {

                Toast.makeText(MainActivity.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (launcher != null)
            launcher.onActivityResult(requestCode, resultCode, data);
    }

    public void launch(View view) {

        launcher.launch();
    }
}
