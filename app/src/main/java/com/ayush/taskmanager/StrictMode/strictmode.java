package com.ayush.taskmanager.StrictMode;

public class strictmode {

    public static void StrictMode() {
        android.os.StrictMode.ThreadPolicy policy = new android.os.StrictMode.ThreadPolicy.Builder().permitAll().build();

        android.os.StrictMode.setThreadPolicy(policy);
    }
}
