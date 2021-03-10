package professor.marcomaddo.appminhaideiadb.controller;

import android.content.Context;
import android.util.Log;

import professor.marcomaddo.appminhaideiadb.api.AppUtil;
import professor.marcomaddo.appminhaideiadb.datasource.AppDataBase;

public class ClienteController extends AppDataBase {

    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtil.TAG, "ClienteController: Conectado");
    }
}
