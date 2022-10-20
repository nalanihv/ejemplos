package com.example.ejemplos;

import android.util.Log;

public class Stack {
    private StackNode top;

    public Stack(){
        top=null;}
    public StackNode getTop(){
        return  top;}



    public void Push(int data){
        StackNode node =new StackNode(data,top);
        top=node;
        if(top==null){
            Log.i("log"," STACK OVERFLOW");
        }
    }

    public void printl(){
        String aux="";
        StackNode node=top;
        while (top!=null){
            aux+=node+ "-> ";
            node=node.getNext();
        }
        Log.i("log",""+aux);
    }


    public  int Pop(){
        if (top.getNext()==null){
            Log.i("log","stack empty");
            return -1;
        }else {
            StackNode aux=top;
            top=top.getNext();
            return aux.getData();}
    }


}
