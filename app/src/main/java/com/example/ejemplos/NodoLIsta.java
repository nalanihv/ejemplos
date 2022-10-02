package com.example.ejemplos;

public class NodoLIsta {
    int dato;
    NodoLIsta enlace;

    public NodoLIsta(int x)
    {
        dato = x;
        enlace = null;
    }
    public NodoLIsta(int x, NodoLIsta n)
    {
        dato = x;
        enlace = n;
    }
    public int getDato()
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
