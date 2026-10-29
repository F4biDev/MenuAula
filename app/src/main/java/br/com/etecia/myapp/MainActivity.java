package br.com.etecia.myapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Toolbar toolBarMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        }
        //criar um método  para acessar o menu


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (R.id.mPesquisar == item.getItemId()){
            Toast.makeText(this, "Cliquei em pesquisar", Toast.LENGTH_SHORT).show();
        }
         if (R.id.mFavoritar == item.getItemId()){
             Toast.makeText(this, "Cliquei em Favoritar", Toast.LENGTH_SHORT).show();

         }
         if (R.id.mCompatilhar == item.getItemId()){
             Toast.makeText(this, "Cliquei em compartilhar", Toast.LENGTH_SHORT).show();
         }
         if (R.id.mAnexar == item.getItemId()){
             Toast.makeText(this, "Cliquei em Anexar", Toast.LENGTH_SHORT).show();
         }

        return super.onOptionsItemSelected(item);
    }
}
