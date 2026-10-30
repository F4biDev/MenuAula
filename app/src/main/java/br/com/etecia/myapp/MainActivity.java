package br.com.etecia.myapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {

    MaterialToolbar toolBarMenu;

    ImageView idImagem;

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

        toolBarMenu = findViewById(R.id.toolBarMenu);
        idImagem = findViewById(R.id.idImagem);

        idImagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

            toolBarMenu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this, "Cliquei em voltar", Toast.LENGTH_SHORT).show();
                }
            });

        }


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
