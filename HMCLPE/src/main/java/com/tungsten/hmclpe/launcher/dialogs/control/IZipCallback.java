package com.tungsten.hmclpe.launcher.dialogs.control;

public interface IZipCallback {
    void onStart();
    void onProgress(int progress);
    void onFinish();
    void onError(Throwable t);
}
