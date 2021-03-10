package max.garcia.appaula01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

     String TAG = "MEU_APP" ;
    String PREF = "MEU_APP_PREFERENCES" ;

     SharedPreferences sharedPreferences;
     SharedPreferences.Editor dados;

     String nomeProduto;
     int codigoProduto;
     float precoProduto;
     boolean estoque;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate: Roddando");

        sharedPreferences = getSharedPreferences(PREF, Context.MODE_PRIVATE);

        Log.i(TAG, "onCreate: Pasta shared Criada ");

        dados = sharedPreferences.edit();
        nomeProduto = "notebook";
        codigoProduto = 12345;
        precoProduto = 997.97f;
        estoque = true;

        Log.i(TAG, "onCreate: dados para serem salvos");
        Log.i(TAG, "onCreate: Ptoduto "+nomeProduto);
        Log.i(TAG, "onCreate: Codigo "+codigoProduto);
        Log.i(TAG, "onCreate: Preço "+precoProduto);
        Log.i(TAG, "onCreate: tem no estoque "+estoque);

        dados.putString("nomeProduto", nomeProduto);
        dados.putInt("codigoProduto",codigoProduto);
        dados.putFloat("precoProduto",precoProduto);
        dados.putBoolean("estoque",estoque);

        dados.clear();
        dados.apply();

    }
}