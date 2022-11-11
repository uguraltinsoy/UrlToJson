# Android UrlToJson

### AndroidManifest
```  
 <uses-permission android:name="android.permission.INTERNET"/>
 ```  

## Download
### Build Gradle
```  
allprojects {  
	 repositories { 
		 ... maven { url 'https://jitpack.io' } 
	 }
}  
```  
```  
dependencies {  
 implementation 'com.github.uguraltinsoy:UrlToJson:1.0.2'
}  
```  
or Maven:
```  
<repositories>  
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>  
```  
```  
<dependency>  
	<groupId>com.github.uguraltinsoy</groupId>
	<artifactId>UrlToJson</artifactId> 
	<version>1.0.2</version>
</dependency>  
```  

## Usage Java - Kotlin

### Get String Json
#### Java
```Java
// JSON OBJECT 
UrlJson.load("Source Url").getObject(new UrlJson.JsonObject() {  
	@Override  
	public void Result(JSONObject jsonObject) throws JSONException {  

	}  
    @Override  
    public void Error(String error) {  
	}
});
// JSON ARRAY
UrlJson.load("Source Url").getArray(new UrlJson.JsonArray() {  
	@Override  
    public void Result(JSONArray jsonArray) throws JSONException {  
     
    }  
  
    @Override  
    public void Error(String error) {  
  
    }
});
```  
#### Kotlin
```Kotlin   
// JSON OBJECT 
UrlJson.load("Source Url").getObject(object : JsonObject {  
	@Throws(JSONException::class)  
    override fun Result(jsonObject: JSONObject) {  
    
    }  
    
    override fun Error(error: String) {
    
	}  
})
// JSON ARRAY
UrlJson.load("Source Url").getArray(object : JsonArray {  
	@Throws(JSONException::class)  
	override fun Result(jsonArray: JSONArray) {  

	}  
    override fun Error(error: String) {

	}  
})
```  

### Get String Json with Request Property or Header
#### Java
```Java
HashMap<String, String> property = new HashMap<>();  
property.put("X-PCK", "API_KEY");  
property.put("User-Agent", "Mozilla/5.0");  
property.put("Content-type", "application/json");  
```
```Java 
// JSON OBJECT
UrlJson.load("Source Url").addProperty(property).getObject(new UrlJson.JsonObject() {  
	@Override  
	public void Result(JSONObject jsonObject) throws JSONException {  
    
    }  
    @Override  
    public void Error(String error) {  
  
    }
});
// JSON ARRAY
UrlJson.load("Source Url").addProperty(property).getArray(new UrlJson.JsonArray() {  
	@Override  
    public void Result(JSONArray jsonArray) throws JSONException {  
  
    }  
    @Override  
    public void Error(String error) {  
  
    }
});  
```  
#### Kotlin
```Kotlin
val property = HashMap<String, String>()  
property["X-PCK"] = "API_KEY"  
property["User-Agent"] = "Mozilla/5.0"  
property["Content-type"] = "application/json"
```
```Kotlin
// JSON OBJECT 
UrlJson.load("Source Url").addProperty(property).getObject(object : JsonObject {  
	@Throws(JSONException::class)  
    override fun Result(jsonObject: JSONObject) {  
    
    }  
    
    override fun Error(error: String) {
    
	}  
})
// JSON ARRAY
UrlJson.load("Source Url").addProperty(property).getArray(object : JsonArray {  
	@Throws(JSONException::class)  
	override fun Result(jsonArray: JSONArray) {  

	}  
    override fun Error(error: String) {

	}  
}) 
```

### Developer By
```  
Uğur Altınsoy  
```  

### Donate
```  
BTC  : 1N7V3wX4xvGfwgBP1zQrcMSxohKKfiDxyH  
ETH  : 0x0df6da87e219fb4854e933f1071ad91d17afa517  
XRP  : rEb8TK3gBgk5auZkwc6sHnwrGVJH8DuaLh  
DOGE : DKKmSHAa8GhAE5HNjmCXzkXPKTjpybY3mq  
DENT : 0x0df6da87e219fb4854e933f1071ad91d17afa517  
```  

### Social
[![Twitter](https://img.shields.io/badge/twitter-%231DA1F2.svg?&style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/uguraltnsy)  
[![Instagram](https://img.shields.io/badge/instagram-%23E4405F.svg?&style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/ugur.altnsy)  
[![Linkedin](https://img.shields.io/badge/linkedin-%230077B5.svg?&style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/uğur-altınsoy/)  
[![Google Play](https://img.shields.io/badge/Google%20Play-414141?logo=google-play&logoColor=white&style=for-the-badge)](https://play.google.com/store/apps/developer?id=DeepLab&hl=tr)