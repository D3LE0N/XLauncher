package com.ssasa.core;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.gson.Gson;
import com.ssasa.core.pojo.LauncherException;
import com.ssasa.core.pojo.Persona;

import static android.app.Activity.RESULT_OK;

public class Launcher {

    private static final int REQUEST_CODE = 27;
    private String secretKey;
    private LauncherListener launcherListener;
    private Activity activity;
    private static final String ACTION = "com.codevelopers.lectordpisat.READERACTION";
    private static final String KEY = "key";
    private Fragment fragment;

    public Launcher(@NonNull Activity activity, @NonNull String secretKey, @NonNull LauncherListener listener) {

        this.secretKey = secretKey;
        this.launcherListener = listener;
        this.activity = activity;
    }

    public Launcher(@NonNull Fragment fragment, @NonNull String secretKey, @NonNull LauncherListener listener) {

        this.secretKey = secretKey;
        this.launcherListener = listener;
        this.fragment = fragment;
    }

    public void launch() {

        if (!isOk()) {
            return;
        }

        Intent intent = new Intent(ACTION);
        intent.putExtra(KEY, secretKey);


        if (intent.resolveActivity((activity == null ? fragment.getActivity() : activity).getPackageManager()) != null)

            if (activity != null) {
                activity.startActivityForResult(intent, REQUEST_CODE);
            } else
                fragment.startActivityForResult(intent, REQUEST_CODE);
        else
            launcherListener.onError(new LauncherException(3, "No has Launcher app"));
    }


    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if (requestCode != REQUEST_CODE)
            return;

        if (resultCode != RESULT_OK) {
            launcherListener.onError(new LauncherException(4, "The user cancel capture or Secret key is invalid"));
            return;
        }

        String json;
        if (data == null || (json = data.getStringExtra(KEY)) == null) {

            launcherListener.onError(new LauncherException(5, "Not capturing data"));
            return;
        }

        launcherListener.onSuccess(new Gson().fromJson(json, Persona.class));
    }

    private boolean isOk() {

        if (launcherListener == null)
            return false;

        if (activity == null || fragment == null) {

            launcherListener.onError(new LauncherException(1, "The activity or Fragment is null"));
            return false;
        }

        if (secretKey == null || TextUtils.isEmpty(secretKey)) {

            launcherListener.onError(new LauncherException(2, "Invalid Secret Key"));
            return false;
        }


        return true;
    }


}
