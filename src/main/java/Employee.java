import java.util.*;

public class Employee implements Registrable, FilmographyProvider {
    private String nome;
    private Map<Film, List<Role>> filmografia = new HashMap<>();

    public Employee(String nome) {
        this.nome = nome;
    }

    @Override
    public void registrarEmFilme(Film filme, Role papel) {
        filme.adicionarParticipacao(this, papel);
        filmografia.computeIfAbsent(filme, f -> new ArrayList<>()).add(papel);
    }

    @Override
    public Map<Film, List<Role>> obterFilmografia() {
        return Collections.unmodifiableMap(filmografia);
    }

    public String getNome() { return nome; }
}
