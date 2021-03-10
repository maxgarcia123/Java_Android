package max.garcia.appminhaideia.controller;

import android.util.Log;

import max.garcia.appminhaideia.core.Apputil;

public class ClientController {

    String appVersion;

    String TAG = "APP_MINHA_IDEIA";

    public ClientController(){
        this.appVersion = Apputil.appVersion();

        Log.i(TAG, "ClientController: Versão do APP "+appVersion);
    }
}
