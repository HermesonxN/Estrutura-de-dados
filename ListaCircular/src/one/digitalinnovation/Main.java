package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        
        ListaCircular<String> minhaLista = new ListaCircular<>();
        
        minhaLista.add("String 0");
        System.out.println(minhaLista);
        
        minhaLista.remove(0);
        System.out.println(minhaLista);

        minhaLista.add("String 0");
        System.out.println(minhaLista);

        minhaLista.add("String 1");
        minhaLista.add("String 2");
        System.out.println(minhaLista);

        /* System.out.println(minhaLista.get(0));
        System.out.println(minhaLista.get(1));
        System.out.println(minhaLista.get(2));
        System.out.println(minhaLista.get(3)); */

        for(int i = 0; i < 20; i++){
            System.out.println(minhaLista.get(i));
        }
    }
}
