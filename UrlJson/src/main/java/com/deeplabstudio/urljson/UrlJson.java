package com.deeplabstudio.urljson;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class UrlJson {
    private static UrlJson urlJson;
    private static String url;
    private static HashMap<String, String> requestProperty = new HashMap<>();
    static JsonObject getJsonObject;
    static JsonArray getJsonArray;

    public static UrlJson load(String url) {
        urlJson = new UrlJson();
        UrlJson.url = url;
        UrlJson.requestProperty.clear();
        return urlJson;
    }

    public UrlJson addProperty(HashMap<String, String> requestProperty) {
        UrlJson.requestProperty = requestProperty;
        return urlJson;
    }

    public void getObject(@Nullable JsonObject listener) {
        UrlJson.getJsonObject = listener;
        getObject();
    }

    public void getArray(@Nullable JsonArray listener) {
        UrlJson.getJsonArray = listener;
        getArray();
    }

    public interface JsonObject {
        void Result(JSONObject jsonObject) throws JSONException;

        void Error(String error);
    }

    public interface JsonArray {
        void Result(JSONArray jsonArray) throws JSONException;

        void Error(String error);
    }

    @SuppressLint("NewApi")
    private void getObject() {
        StringBuilder result = new StringBuilder();
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);

            URL url = new URL(UrlJson.url);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            if (UrlJson.requestProperty.size() > 0) {
                requestProperty.forEach((key, value) -> {
                    urlConnection.setRequestProperty(key, value);
                });
            }
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                result.append(inputLine);
            }
            if (UrlJson.getJsonObject != null) UrlJson.getJsonObject.Result(new JSONObject(result.toString()));
        } catch (Exception e) {
            UrlJson.getJsonObject.Error(e.getMessage());
        }
    }

    @SuppressLint("NewApi")
    private void getArray() {
        StringBuilder result = new StringBuilder();
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);

            URL url = new URL(UrlJson.url);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            if (UrlJson.requestProperty.size() > 0) {
                requestProperty.forEach((key, value) -> {
                    urlConnection.setRequestProperty(key, value);
                });
            }
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String inputLine;
            while ((inputLine = reader.readLine()) != null) {
                result.append(inputLine);
            }
            if (UrlJson.getJsonArray != null)
                UrlJson.getJsonArray.Result(new JSONArray(result.toString()));
        } catch (Exception e) {
            UrlJson.getJsonArray.Error(e.getMessage());
        }
    }
}
