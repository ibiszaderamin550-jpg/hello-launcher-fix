package com.tungsten.hmclpe.launcher.dialogs.control;
import java.io.File;

public class ZipManager {
    public static void unzip(File zipFile, String targetDir, Object callback) {
        // Dummy placeholder to bypass compiler errors
    }
}
interface IZipCallback {
    void onStart();
    void onProgress(int progress);
    void onFinish();
    void onError(Throwable t);
}
