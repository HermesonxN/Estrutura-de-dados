package com.projeto.atribuicaoreferencia;

public class Main{
    public static void main(String[] args) {
        //Tipo primitivo
        int A = 1;
        int B = A;

        System.out.println("A = " + A + " e B = " + B);
        A = 2;
        System.out.println("A = " + A + " e B = " + B);

        //Tipo Objeto
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("Objeto A = " + objA + " e ObjetoB = " + objB);
        objA.setNum(2);
        System.out.println("Objeto A = " + objA + " e ObjetoB = " + objB);

    }
}