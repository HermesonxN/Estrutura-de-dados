package com.projeto.atribuicaoreferencia;

/**
 * <h1>Meu Objeto</h1>
 * Objeto criado para teste, serve para guardar numeros inteiros.
 * <p>
 * <b>Note:</b> Leia atentamente a documentação destas classes
 * para desfrutar dos recursos oferecidos pelo autor.
 * 
 * @author Hermeson Oliveira
 * @version 1.0
 * @since 13/03/2023
 */
public class MeuObj {
    Integer num;

    /**
    * <h1>Meu Objeto</h1>
    * Este método sera usado para guardar números inteiros.
    * @param num Esse parametro recebe o número e o armazena.
    */
    public MeuObj(Integer num){
        this.num = num;
    }

    /**
    * <h1>setNum</h1>
    * Este método sera usado para alterar o número guardado inicialmente.
    * @param num Esse parametro recebe o número e o armazena.
    */
    public void setNum(Integer num){
        this.num = num;
    }

    /**
    * <h1>toString</h1>
    * Este método sera usado para retornar o número atual guardado.
    */
    @Override
    public String toString(){
        return this.num.toString();
    }
}
