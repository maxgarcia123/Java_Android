package professor.marcomaddo.appminhaideiadb.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import professor.marcomaddo.appminhaideiadb.R;
import professor.marcomaddo.appminhaideiadb.api.AppUtil;
import professor.marcomaddo.appminhaideiadb.controller.ClienteController;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "onCreate: App Minha Ideia DataBase");

        clienteController = new ClienteController(getApplicationContext());

    }
}