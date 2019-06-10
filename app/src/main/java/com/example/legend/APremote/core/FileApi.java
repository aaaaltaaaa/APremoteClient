package com.example.legend.APremote.core;

import android.os.Environment;

import java.io.IOException;


public class FileApi {

    public static String homeDirectoryPath = "";

    public static String getExternalStoragePath() {
        String rootPath = System.getenv("EXTERNAL_STORAGE");
        try {
            rootPath = Environment.getExternalStorageDirectory().getCanonicalPath();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rootPath;
    }

}
