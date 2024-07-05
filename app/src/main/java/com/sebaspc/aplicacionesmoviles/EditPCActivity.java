package com.sebaspc.aplicacionesmoviles;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EditPCActivity extends AppCompatActivity implements Callback<UResponse>{

    ImageButton imageButton;
    ImageButton imageButton2;
    Button btnnoguardar;
    Button btnguardar;
    Button base;

    TextView componente1;
    TextView descripcion1;
    TextView componente2;
    TextView descripcion2;
    TextView componente3;
    TextView descripcion3;
    TextView componente4;
    TextView descripcion4;
    TextView componente5;
    TextView descripcion5;

    int currentRow = 0;
    private RecyclerView recyclerView;
    private ArrayList<Componente> arregloMain;
    private MyLocalAdapter listAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_pcactivity);

        base = findViewById(R.id.btnBase);
        base.setVisibility(View.INVISIBLE);

        componente1=findViewById(R.id.txtComponente1);
        descripcion1=findViewById(R.id.txtDescripcion1);
        componente2=findViewById(R.id.txtComponente2);
        descripcion2=findViewById(R.id.txtDescripcion2);
        componente3=findViewById(R.id.txtComponente3);
        descripcion3=findViewById(R.id.txtDescripcion3);
        componente4=findViewById(R.id.txtComponente4);
        descripcion4=findViewById(R.id.txtDescripcion4);
        componente5=findViewById(R.id.txtComponente5);
        descripcion5=findViewById(R.id.txtDescripcion5);


        btnnoguardar = findViewById(R.id.btnCancelar);

        btnnoguardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MisCreacionesActivity.class);
                startActivity(intent);
                finish();
            }
        });
        btnguardar = findViewById(R.id.btnGuardar);
        btnguardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MisCreacionesActivity.class);
                startActivity(intent);
                finish();
            }
        });

        /*
        button1 = findViewById(R.id.btnBase);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DetalleComponenteActivity.class);
                startActivity(intent);
            }
        });*/

        imageButton = findViewById(R.id.iconCasa);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        imageButton2 = findViewById(R.id.iconSalir);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoadingActivity.class);
                startActivity(intent);
                finish();
            }
        });

        /// Instancias del RecyclerView
        //recyclerView = (RecyclerView) findViewById(R.id.lista);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));

        /// Llamada al servicio mediante Retrofit

        Log.d("prueba","que fue llama");
        Call<UResponse> call = MyAPIAdapter.getApiService().getComponentes();
        Log.d("prueba","si llama");
        call.enqueue(this);


    }

    @Override
    public void onResponse(Call<UResponse> call, Response<UResponse> response) {
        if (response.isSuccessful()){
            UResponse respuesta = response.body();

            List<Componente> componentes = respuesta.getComponentes();
            ArrayList<Componente> lista = new ArrayList<>();
            Integer i=1;
            for (Componente componente: componentes) {
                lista.add( new Componente(i,
                        componente.getNombreComponente().toString(),
                        componente.getDescripcion().toString(),
                        componente.getIdProforma()));
                i=i+1;
            }

            if(arregloMain!=null)
                arregloMain.clear();
            arregloMain = lista;
            Componente fila1 = arregloMain.get(0);
            Componente fila2 = arregloMain.get(1);
            Componente fila3 = arregloMain.get(2);
            Componente fila4 = arregloMain.get(3);
            Componente fila5 = arregloMain.get(4);

            componente1.setText(fila1.getNombreComponente());
            descripcion1.setText(fila1.getDescripcion());
            componente2.setText(fila2.getNombreComponente());
            descripcion2.setText(fila2.getDescripcion());
            componente3.setText(fila3.getNombreComponente());
            descripcion3.setText(fila3.getDescripcion());
            componente4.setText(fila4.getNombreComponente());
            descripcion4.setText(fila4.getDescripcion());
            componente5.setText(fila5.getNombreComponente());
            descripcion5.setText(fila5.getDescripcion());


            listAdapter = new MyLocalAdapter(this, arregloMain);

            //recyclerView.setAdapter(listAdapter);
            //listAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void onFailure(Call<UResponse> call, Throwable t) {

    }

    class MyLocalAdapter extends RecyclerView.Adapter<MyLocalAdapter.LocalViewHolder> {

        private Context context;
        private List<Componente> data;

        public MyLocalAdapter(Context context, ArrayList<Componente> data) {
            this.context = context;
            this.data = data;
        }

        @Override
        public MyLocalAdapter.LocalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            /*View view = LayoutInflater.from(context).inflate(R.layout.row_componentes, null);
            MyLocalAdapter.LocalViewHolder customViewHolder = new MyLocalAdapter.LocalViewHolder(view);*/
            return null;
        }

        @Override
        public void onBindViewHolder(MyLocalAdapter.LocalViewHolder holder, int position) {


            Componente fila = data.get(position);
            holder.labelNombreComponente.setText(fila.getNombreComponente());
            holder.labeldescripcion.setText(fila.getDescripcion());

        }

        @Override
        public int getItemCount() {
            return data == null ? 0 : data.size();
        }

        class LocalViewHolder extends RecyclerView.ViewHolder {

            protected View rowView;
            protected TextView labelNombreComponente;
            protected TextView labeldescripcion;
            protected TextView idProforma;

            public LocalViewHolder(View itemView) {
                super(itemView);
                /*this.labelNombreComponente = (TextView) itemView.findViewById(R.id.nombreComponente);
                this.labeldescripcion = (TextView) itemView.findViewById(R.id.descripcion);
                this.idProforma = (TextView) itemView.findViewById(R.id.idProforma);
                this.rowView = itemView;*/
            }

        }
    }
}