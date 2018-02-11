package com.example.dipto.volleypractice;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    @BindView(R.id.textViewIp)
    TextView textViewIp;
    @BindView(R.id.textViewCountry)
    TextView textViewCountry;
    @BindView(R.id.textViewLocation)
    TextView textViewLocation;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;

    MainActivityPresenter presenter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new MainActivityPresenter(this);
    }

    @OnClick(R.id.button)
    public void onViewClicked() {
        presenter.getInvokeApi();
    }

    @Override
    public void showIpInfo(IPResponse ipResponse) {
        textViewIp.setText(ipResponse.getIp());
        textViewCountry.setText(ipResponse.getCountry());
        textViewLocation.setText(ipResponse.getCity());
    }

    @Override
    public void startLoading() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void stopLoading() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public Context getAppContext() {
        return getApplicationContext();
    }
}
