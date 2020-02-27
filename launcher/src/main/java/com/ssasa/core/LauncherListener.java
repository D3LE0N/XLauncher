package com.ssasa.core;

import com.ssasa.core.pojo.LauncherException;
import com.ssasa.core.pojo.Persona;

public interface LauncherListener {

    void onSuccess(Persona persona);

    void onError(LauncherException error);
}
