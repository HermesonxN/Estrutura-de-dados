package com.projetono;

public class Main {
    public static void main(String[] args) {
        
        No<String> no1 = new No<>("Conteudo No 1");
        No<String> no2 = new No<>("Conteudo No 2");
        No<String> no3 = new No<>("Conteudo No 3");
        No<String> no4 = new No<>("Conteudo No 4");
        
        no1.setProximoNo(no2); //No1 --> No2
        no2.setProximoNo(no3); //No2 --> No3
        no3.setProximoNo(no4); //No4 --> Nulo

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
}
