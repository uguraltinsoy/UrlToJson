package com.deeplabstudio.urltojson;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.deeplabstudio.urljson.UrlJson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

public class JavaMainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_main);

        /*String result_no_header = UrlJson.getJson("Source Url");


        HashMap<String, String> property = new HashMap<>();
        property.put("X-PCK", "API_KEY");
        property.put("User-Agent", "Mozilla/5.0");
        property.put("Content-type", "application/json");
        String result_add_header = UrlJson.getJson("Source Url", property);*/

        HashMap<String, String> property = new HashMap<>();
        property.put("X-PCK", "API_KEY");
        property.put("User-Agent", "Mozilla/5.0");
        property.put("Content-type", "application/json");

        UrlJson.load("Source Url").addProperty(property).getObject(new UrlJson.JsonObject() {
            @Override
            public void Result(JSONObject jsonObject) throws JSONException {

            }

            @Override
            public void Error(String error) {

            }
        });

        UrlJson.load("Source Url").addProperty(property).getArray(new UrlJson.JsonArray() {
            @Override
            public void Result(JSONArray jsonArray) throws JSONException {

            }

            @Override
            public void Error(String error) {

            }
        });

        HashMap<String, String> property = new HashMap<>();
        property.put("X-PCK", "API_KEY");
        property.put("User-Agent", "Mozilla/5.0");
        property.put("Content-type", "application/json");

        UrlJson.load("Source Url").addProperty(property).getObject(new UrlJson.JsonObject() {
            @Override
            public void Result(JSONObject jsonObject) throws JSONException {

            }

            @Override
            public void Error(String error) {

            }
        });
    }
}