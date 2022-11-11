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

        val property = HashMap<String, String>()
        property["X-PCK"] = "API_KEY"
        property["User-Agent"] = "Mozilla/5.0"
        property["Content-type"] = "application/json"

        UrlJson.load("Source Url").addProperty(property).getObject(object : JsonObject {
            @Throws(JSONException::class)
            override fun Result(jsonObject: JSONObject) {
            }

            override fun Error(error: String) {}
        })

        UrlJson.load("Source Url").getArray(object : JsonArray {
            @Throws(JSONException::class)
            override fun Result(jsonArray: JSONArray) {
            }

            override fun Error(error: String) {}
        })

    }
}