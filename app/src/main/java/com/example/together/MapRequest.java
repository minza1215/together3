package com.example.together;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 김민제 on 2017-07-02.
 */

public class MapRequest extends StringRequest {

    final static private String URL = "http://minza1215.cafe24.com/TogetherMap.php";
    private Map<String, String> parameters;

    public MapRequest(String Latitude, String Longitude, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("Latitude", Latitude);
        parameters.put("Longitude", Longitude);
    }

    @Override
    public Map<String, String> getParams(){
        return parameters;
    }
}