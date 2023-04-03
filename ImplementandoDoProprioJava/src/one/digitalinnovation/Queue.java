package one.digitalinnovation;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        
        Queue<Carro> queueCarros = new LinkedList<>();

        //Adiciona
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));
        queueCarros.add(new Carro("Peugeot"));

        //Retorna true se der certo adicionar o novo item
        System.out.println(queueCarros);
        System.out.println(queueCarros.offer(new Carro("Renault")));

        //Pega o primeiro da fila
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        //Remove o primeiro da fila
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        //Verifica se a fila esta vazia
        System.out.println(queueCarros.isEmpty());
    }
}
