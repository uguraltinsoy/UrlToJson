package com.deeplabstudio.urltojson;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.deeplabstudio.urljson.UrlJson;

import java.util.HashMap;

public class JavaMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_main);

        String result_no_header = UrlJson.getJson("Source Url");


        HashMap<String, String> property = new HashMap<>();
        property.put("X-PCK", "API_KEY");
        property.put("User-Agent", "Mozilla/5.0");
        property.put("Content-type", "application/json");
        String result_add_header = UrlJson.getJson("Source Url", property);
    }
}