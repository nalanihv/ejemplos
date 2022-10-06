package com.example.ejemplos;

public class NodoLIsta {
    String dato;
    NodoLIsta enlace;

    public NodoLIsta(String x)
    {
        dato = x;
        enlace = null;
    }
    public NodoLIsta(String x, NodoLIsta n)
    {
        dato = x;
        enlace = n;
    }
    public String getDato()
    {
        return dato;
    }
    public NodoLIsta getEnlace()
    {
        return enlace;
    }
    public void setEnlace(NodoLIsta enlace)
    {
        this.enlace = enlace;
    }

    public String toString() {
        return String.valueOf( dato );
    }
}
