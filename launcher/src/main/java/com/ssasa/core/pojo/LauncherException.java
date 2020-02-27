package com.ssasa.core.pojo;

import androidx.annotation.NonNull;

import java.util.Locale;

public class LauncherException {

    private int errorCode;
    private String message;

    public LauncherException(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    @NonNull
    @Override
    public String toString() {

        return String.format(Locale.getDefault(), "error code: %d message: %s", errorCode, message);
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
