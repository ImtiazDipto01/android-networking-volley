package com.example.dipto.volleypractice;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

/**
 * Created by Dipto on 2/10/2018.
 */

public class InvokeApi {

    String URL = "http://ipinfo.io/json" ;
    MainActivityInteractor mainActivityInteractor ;

    public InvokeApi(final Context context, final MainActivityInteractor interactor){

        this.mainActivityInteractor = interactor ;
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, URL, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
    }
}
