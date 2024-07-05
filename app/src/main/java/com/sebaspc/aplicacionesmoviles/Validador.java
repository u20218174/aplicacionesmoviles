package com.sebaspc.aplicacionesmoviles;

import android.util.Log;

public class Validador {

    public boolean validar_correo(String correo){
        int aux = 0;
        int a=0;
        boolean respuesta=false;
        for (int i = 0; i < correo.length(); i++){
            int letra_alt  = correo.charAt(i);
            if (aux==0){
                if (letra_alt>= 97 && letra_alt <=122){
                }
                else if (letra_alt==64 && i!=0) {
                    aux+=1;
                    a=i;
                } else {
                    break;
                }
            }
             else if (aux == 1){
                if (letra_alt>= 97 && letra_alt <=122){
                }
                else if (letra_alt==46 && i>a+1) {
                    aux+=1;
                    a=i;
                } else {
                    break;
                }
            }
            else if (aux == 2){
                if (letra_alt>= 97 && letra_alt <=122){
                    if (i == correo.length()-1)
                    {
                        respuesta=true;
                    }
                }
                else if (letra_alt==46 && i>a+1) {
                    aux+=1;
                } else {
                    break;
                }
            }
            else if (aux == 3){
                if (letra_alt>= 97 && letra_alt <=122){
                    if (i == correo.length()-1)
                    {
                        respuesta=true;
                    }
                }
                else {
                    break;
                }
            }

        }
        return respuesta;
    }
}
