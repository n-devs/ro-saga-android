package com.idev.rosaga;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class NetworkUtils {

    private static final String URL = "https://raw.githubusercontent.com/n-devs/ro-ip/data/ip-address.json";

    public static void fetchIpAddress(Callback callback) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(URL)
                .build();

        client.newCall(request).enqueue(callback);
    }
}