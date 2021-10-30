package com.deeplabstudio.urljson;

import android.annotation.SuppressLint;
import android.os.StrictMode;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

public class UrlJson {

    public static String getJson(String SourceUrl){
        StringBuilder result = new StringBuilder();
        try{
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);

            URL url = new URL(SourceUrl);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String  inputLine;
            while ((inputLine = reader.readLine())!= null){
                result.append(inputLine);
            }
            return result.toString();
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @SuppressLint("NewApi")
    public static String getJson(String responseURL, HashMap<String, String> requestProperty){
        StringBuilder result = new StringBuilder();
        try{
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            URL url = new URL(responseURL);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            requestProperty.forEach((key,value)->{
                urlConnection.setRequestProperty(key, value);
            });
            InputStream in = new BufferedInputStream(urlConnection.getInputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String  inputLine;
            while ((inputLine = reader.readLine())!= null){
                result.append(inputLine);
            }
            return result.toString();
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
