package max.garcia.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import max.garcia.appminhaideia.R;
import max.garcia.appminhaideia.controller.ClientController;
import max.garcia.appminhaideia.core.Apputil;
import max.garcia.appminhaideia.model.Client;


public class SplashActivity extends AppCompatActivity {
    TextView txtAppversion;

    Client objClient;
    ClientController clientController;

    int stayOfTime = 1000 * 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.d(Apputil.TAG, "onCreate: Tela Slapsh carregada...");

        clientController = new ClientController();

        txtAppversion = findViewById(R.id.txtAppVersion);
        txtAppversion.setText(Apputil.appVersion());

        changeScreen();
    }

    private void changeScreen() {

        Log.d(Apputil.TAG, "changeScrean: Mudando tela...");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d(Apputil.TAG, "changeScrean: Esperando um tempo...");

                objClient =  new Client(
                        "Max",
                        "teste@gmail.com",
                        "996565658",
                        19,
                        true
                );

                Intent changeOfScreen = new Intent(SplashActivity.this, MainActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("name", objClient.getName());
                bundle.putString("email", objClient.getEmail());

                changeOfScreen.putExtras(bundle);

                startActivity(changeOfScreen);
                finish();
            }
        }, stayOfTime);

    }

}