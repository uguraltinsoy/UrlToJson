package com.deeplabstudio.urltojson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deeplabstudio.urljson.UrlJson
import java.util.HashMap
import org.json.JSONObject
import org.json.JSONArray

class KotlinMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_main)

        //var result = UrlJson.getJson("Source Url")


        val property = HashMap<String, String>()
        property["X-PCK"] = "API_KEY"
        property["User-Agent"] = "Mozilla/5.0"
        property["Content-type"] = "application/json"
        val result = UrlJson.getJson("Source Url", property)

        val jsonArray = JSONArray(result)

    }
}