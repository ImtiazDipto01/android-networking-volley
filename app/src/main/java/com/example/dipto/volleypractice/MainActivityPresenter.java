package com.example.dipto.volleypractice;

/**
 * Created by Dipto on 2/10/2018.
 */

public class MainActivityPresenter {

    MainActivityView view ;

    public MainActivityPresenter(MainActivityView mainActivityView){
        this.view = mainActivityView ;
    }

    public void getInvokeApi(){
        view.startLoading();

        new InvokeApi(view.getAppContext(), new MainActivityInteractor() {

            @Override
            public void onRequestComplete(IPResponse response) {
                view.stopLoading();
                view.showIpInfo(response);
            }

            @Override
            public void onRequestError(String msg) {
                view.stopLoading();
                view.showMessage(msg);
            }
        });
    }
}
