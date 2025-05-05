import java.util.*;

public class FilmRegistry {
    private List<Film> filmes = new ArrayList<>();
    private List<Person> pessoas = new ArrayList<>();

    public Person adicionarPessoa(String nome) {
        Person p = new Person(nome);
        pessoas.add(p);
        return p;
    }

    public Film adicionarFilme(String titulo, int ano, String trilhaSonora) {
        Film f = new Film(titulo, ano, trilhaSonora);
        filmes.add(f);
        return f;
    }

    public List<Person> getPessoas() { return Collections.unmodifiableList(pessoas); }
    public List<Film> getFilmes() { return Collections.unmodifiableList(filmes); }
}
