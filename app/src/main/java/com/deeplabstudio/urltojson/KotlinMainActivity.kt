package com.deeplabstudio.urltojson

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.deeplabstudio.urljson.UrlJson
import com.deeplabstudio.urljson.UrlJson.JsonArray
import com.deeplabstudio.urljson.UrlJson.JsonObject
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject

class KotlinMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_main)
    }
}