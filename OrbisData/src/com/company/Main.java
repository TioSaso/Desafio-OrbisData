package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id;
        int cont = 0;
        double valor;

        //Categorias
        Categoria D = new Categoria("D","Desayunos",0);
        Categoria A = new Categoria("A","Comidas",0);
        Categoria M = new Categoria("M","Meriendas",0);
        Categoria I = new Categoria("I","Cenas",0);
        Categoria C = new Categoria("C","Copas",0);
        //ArrayList
        ArrayList<Categoria> categoriasList = new ArrayList<>();
        categoriasList.add(D);
        categoriasList.add(A);
        categoriasList.add(M);
        categoriasList.add(I);
        categoriasList.add(C);

        while (cont <= 1 ){
            System.out.println("Ingrese Categoria: ");
            id = sc.next();
            System.out.println("Ingrese Valor: ");
            valor = sc.nextDouble();

            switch (id){
                case "D":
                    categoriasList.get(0).setValor(categoriasList.get(1).getValor()+valor);
                    break;
                case "A":
                    categoriasList.get(1).setValor(categoriasList.get(1).getValor()+valor);
                    break;
                case "M":
                    categoriasList.get(2).setValor(categoriasList.get(2).getValor()+valor);
                    break;
                case "I":
                    categoriasList.get(3).setValor(categoriasList.get(3).getValor()+valor);
                    break;
                case "C":
                    categoriasList.get(4).setValor(categoriasList.get(4).getValor()+valor);
                    break;
                case "N":
                    cont=1;
                    //Minimo-Maximo
                    double maximo = 0.0;
                    String maxName = "";
                    String minName = "";
                    double minimo = 0.0;

                    for(int i = 0; i < categoriasList.size(); i++){
                        if(minimo>categoriasList.get(i).getValor()) {
                            minimo=categoriasList.get(i).getValor();
                            minName=categoriasList.get(i).getNomCategoria();
                        }
                        if(maximo<categoriasList.get(i).getValor()) {
                            maximo=categoriasList.get(i).getValor();
                            maxName=categoriasList.get(i).getNomCategoria();
                        }
                    }

                    //Media
                    double media=0.0;
                    for (int i = 0; i < categoriasList.size(); i++) {
                        media= media + categoriasList.get(i).getValor();
                    }
                    media= media/categoriasList.size();

                    //Salida
                    String salida="";
                    int rep = 0;
                    for(int i=0; i<categoriasList.size(); i++){

                        if(maximo==categoriasList.get(i).getValor()){
                            rep++;
                        }
                        if(minimo==categoriasList.get(i).getValor()){
                            rep++;
                        }

                    }
                    System.out.println("Repeticiones: "+ rep);
                    if(rep==1){
                        salida= maxName+"#"+minName+"#";
                    }else{
                        salida = maxName+"#"+"EMPATE#";
                    }

                    if(categoriasList.get(0).getValor()>media){
                        salida= salida+"SI";
                    }else{
                        salida= salida+"NO";
                    }
                    System.out.println(salida);
                    System.exit(0);
                    break;
            }

        }


    }



}
