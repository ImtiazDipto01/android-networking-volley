package com.example.dipto.volleypractice;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
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
                        try {

                            String ip = response.getString("ip");
                            String country = response.getString("country");
                            String loc = response.getString("loc");
                            String city = response.getString("city");
                            IPResponse ipResponse = new IPResponse(country, loc, city, ip) ;
                            mainActivityInteractor.onRequestComplete(ipResponse);
                        }
                        catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        mainActivityInteractor.onRequestError("Network Problem !");
                    }
                });

        VolleySingleTone.getInstance(context).addToRequestQueue(jsonObjectRequest);
    }
}
