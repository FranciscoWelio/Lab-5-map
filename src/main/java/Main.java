import java.util.*;

public class Main {
    public static void main(String[] args) {
        FilmRegistry registro = new FilmRegistry();
        Scanner scanner = new Scanner(System.in);

        // Exemplo de uso fixo
        Person alice = registro.adicionarPessoa("Alice Souza");
        Person bob = registro.adicionarPessoa("Bob Lima");

        Film filme = registro.adicionarFilme("A Grande Aventura", 2025, "Orquestra Sinfônica");
        filme.setDiretor("Carlos Pereira");
        filme.setRoteirista("Ana Costa");

        alice.registrarEmFilme(filme, new ActorRole());
        bob.registrarEmFilme(filme, new CameraOperatorRole());

        System.out.println("-- Detalhes do Filme --");
        System.out.println(filme.obterDetalhes());

        System.out.println("-- Filmografia de " + alice.getNome() + " --");
        alice.obterFilmografia().forEach((f, papeis) -> {
            System.out.println(f.obterDetalhes());
            papeis.forEach(p -> System.out.println("Função: " + p.getNome()));
        });
    }
}
