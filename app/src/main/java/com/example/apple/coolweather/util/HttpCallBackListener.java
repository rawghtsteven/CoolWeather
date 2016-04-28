package com.example.apple.coolweather.util;

/**
 * Created by apple on 4/27/16.
 */
public interface HttpCallBackListener {
    void onFinish(String s);

    void onError(Exception e);
}
