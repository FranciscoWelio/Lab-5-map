import java.util.*;

public class FilmRegistry {
    private List<Film> filmes = new ArrayList<>();
    private List<Employee> pessoas = new ArrayList<>();

    public Employee adicionarPessoa(String nome) {
        Employee p = new Employee(nome);
        pessoas.add(p);
        return p;
    }

    public Film adicionarFilme(String titulo, int ano, String trilhaSonora) {
        Film f = new Film(titulo, ano, trilhaSonora);
        filmes.add(f);
        return f;
    }

}
