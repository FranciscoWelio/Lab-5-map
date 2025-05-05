import java.util.*;

public class Main {
    public static void main(String[] args) {
        try{
            FilmRegistry registro = new FilmRegistry();
            Scanner scanner = new Scanner(System.in);

            // Exemplo de uso fixo
            Employee alice = registro.adicionarPessoa("Alice Souza");
            Employee bob = registro.adicionarPessoa("Bob Lima");

            if(alice ==null || bob ==null){
                throw new IllegalStateException("Falha ao criar funcionário");
            }
            Film filme = registro.adicionarFilme("A Grande Aventura", 2025, "Orquestra Sinfônica");
            filme.setDiretor("Carlos Pereira");
            filme.setRoteirista("Ana Costa");

            Film filme2 = registro.adicionarFilme("A Grande Aventura 2", 2025, "Orquestra Sinfônica");
            filme2.setDiretor("Carlos Pereira");
            filme2.setRoteirista("Ana Costa");

            alice.registrarEmFilme(filme, Role.Director);
            alice.registrarEmFilme(filme2, Role.Actor);
            alice.registrarEmFilme(filme2, Role.CameraOperator);
            bob.registrarEmFilme(filme, Role.Screenwriter);
            System.out.println("-- Detalhes do Filme --");
            if(filme.obterDetalhes()==null){
                throw new IllegalStateException("Detalhes não disponíveis");
            }
            System.out.println(filme.obterDetalhes());
            System.out.println("-- Filmografia de " + alice.getNome() + " --");
            alice.obterFilmografia().forEach((f, papeis) -> {
                papeis.forEach(p -> System.out.println("Função: " + p + "\n"));
            });
        } catch (IllegalStateException e) {
            System.err.println("Erro: " + e.getMessage());
        }



    }
}
