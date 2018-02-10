package com.example.dipto.volleypractice;

/**
 * Created by Dipto on 2/10/2018.
 */

public interface MainActivityInteractor {
    public void onRequestComplete(IPResponse response) ;

    public void onRequestError(String msg) ;
}
