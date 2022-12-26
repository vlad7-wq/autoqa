package edu.restAPI;

import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;


public class RestApiTest {
    String url = "https://goweather.herokuapp.com/weather/";
    String city = "kyiv";

    @Test
    public void test() {
        String s = RestApiGet.Get(url + city);
        JSONObject jsonObject = new JSONObject(s);
        System.out.println(jsonObject.get("temperature"));

    }
    @Test
    public void test1() {
        String s = RestApiGet.Get(url + city);
        JSONObject jsonObject = new JSONObject(s);
        System.out.println(jsonObject.get("description"));
    }
    @Test
    public void arrayTest() {
        String s = RestApiGet.Get(url + city);
        JSONObject jsonObject = new JSONObject(s);
        JSONArray array = new JSONArray(jsonObject.getJSONArray("forecast"));

        for (int i=0; i<array.length(); i++) {
            JSONObject microfson = (JSONObject) array.get(i);
            System.out.println(microfson.get("wind"));
        }
    }
}