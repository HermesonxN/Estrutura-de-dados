package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();
        minhaLista.add("String 1");
        minhaLista.add("String 2");
        minhaLista.add("String 3");
        minhaLista.add("String 4");
        minhaLista.add("String 5");
        minhaLista.add("String 6");
        minhaLista.add("String 7");

        System.out.println(minhaLista);

        minhaLista.remove(3);
        minhaLista.add(3, "String 99");

        System.out.println(minhaLista);
        System.out.println(minhaLista.get(3));
    }
}
