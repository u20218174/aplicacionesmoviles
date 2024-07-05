package com.sebaspc.aplicacionesmoviles;

import java.util.ArrayList;
import java.util.List;

public class UResponse {
    private Integer estado;
    private List<Componente> componentes = new ArrayList<Componente>();

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }
}
