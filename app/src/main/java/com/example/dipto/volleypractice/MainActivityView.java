package com.example.dipto.volleypractice;

import android.content.Context;

/**
 * Created by Dipto on 2/10/2018.
 */

public interface MainActivityView {
    public void showIpInfo(IPResponse ipResponse) ;

    public void startLoading() ;

    public void stopLoading() ;

    public void showMessage(String msg) ;

    Context getAppContext() ;
}
