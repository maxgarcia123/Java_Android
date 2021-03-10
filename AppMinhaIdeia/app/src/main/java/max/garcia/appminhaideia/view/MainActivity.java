package max.garcia.appminhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import max.garcia.appminhaideia.R;
import max.garcia.appminhaideia.core.Apputil;
import max.garcia.appminhaideia.model.Client;

public class MainActivity extends AppCompatActivity {


    TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(Apputil.TAG, "onCreate: Tela Principal carregada...");
        Bundle bundle = getIntent().getExtras();

        Log.d(Apputil.TAG, "onCreate: Nome.."+bundle.getString("name"));
        Log.d(Apputil.TAG, "onCreate: Email.."+bundle.getString("email"));

        txtName = findViewById(R.id.txtName);
        txtName.setText("Bem vindo... "+bundle.getString("name"));

    }
}