package com.sebaspc.aplicacionesmoviles;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPIService {
    @GET("Obtener_componentes.php")
    Call<UResponse> getComponentes();

    //@POST("Insertar_componente.php")
    //Call<boolean> insertarComponente();


}
