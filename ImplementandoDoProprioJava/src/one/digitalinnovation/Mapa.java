package one.digitalinnovation;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        
        Map<String, String> aluno = new HashMap<>();
        Map<String, String> aluno2 = new HashMap<>();

        aluno.put("Nome ", " João");
        aluno.put("Idade ", " 17");
        aluno.put("Media ", " 8.5");
        aluno.put("Turma ", " 3 A");
        aluno2.put("Nome ", " Maria");
        aluno2.put("Idade ", " 18");
        aluno2.put("Media ", " 8.9");
        aluno2.put("Turma ", " 3 B");

        System.out.println("Aluno: \n" + aluno);
        System.out.println("Aluno 2: \n" + aluno2);

        System.out.println("\nDados aluno: \n" + aluno.keySet());
        System.out.println(aluno.values());
        System.out.println("\nDados aluno2: \n" + aluno2.keySet());
        System.out.println(aluno2.values());

        List<Map<String, String>> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno);
        listaAlunos.add(aluno2);

        System.out.println("\nLista de alunos: \n" + listaAlunos);
    }
}
