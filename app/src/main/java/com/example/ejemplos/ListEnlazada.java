package com.example.ejemplos;

public class ListEnlazada {
    private NodoLIsta primero;

    public ListEnlazada()
    {
        primero = null;
    }

    public String toString() {
        String resultado = "";
        NodoLIsta aux = primero;
        while(aux != null) {
            resultado += aux+" -> ";
            aux = aux.getEnlace();
        }
        return resultado;
    }
}
