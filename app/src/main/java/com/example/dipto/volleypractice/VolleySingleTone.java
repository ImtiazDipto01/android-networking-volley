package com.example.dipto.volleypractice;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Dipto on 2/10/2018.
 */

public class VolleySingleTone {

    private static VolleySingleTone volleySingleTone ;
    private RequestQueue requestQueue ;
    private Context context ;

    private VolleySingleTone(Context context){
        this.context = context ;
        requestQueue = getRequestQueue();
    }

    public RequestQueue getRequestQueue(){

        if(requestQueue == null){
            requestQueue = Volley.newRequestQueue(this.context) ;
        }
        return requestQueue ;
    }

    public static synchronized VolleySingleTone getInstance(Context context){

        if(volleySingleTone == null){
            volleySingleTone = new VolleySingleTone(context) ;
        }
        return  volleySingleTone ;
    }

    public<T> void addToRequestQueue(Request<T> request){
        requestQueue.add(request) ;
    }
}
