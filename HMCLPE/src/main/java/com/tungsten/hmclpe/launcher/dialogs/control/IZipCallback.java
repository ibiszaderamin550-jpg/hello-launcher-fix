package com.tungsten.hmclpe.launcher.dialogs.control;

public interface IZipCallback {
    void onStart();
    void onProgress(int percentDone);
    void onFinish(boolean success);
    void onError(Throwable t);
}
