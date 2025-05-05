import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
public class FilmTest {
    @Test
    void filmTest(){
        Film filme = new Film("Filmaço da Preula", 2025,"Hans Zimmer");
        assertEquals("Filmaço da Preula",filme.getTitulo());
        assertEquals(2025,filme.getAno());
        assertEquals("Hans Zimmer",filme.getTrilhaSonora());
    }
    @Test
    void filmParitipacaoTest(){
        Film filme = new Film("Filmaço da Preula", 2025,"Hans Zimmer");
        Role role = new ScreenwriterRole();
        Person pessoa = new Person("Serginho Groisman");
        filme.adicionarParticipacao(pessoa, role);
        assertEquals("Serginho Groisman", pessoa.getNome());
        assertEquals("Roteirista", role.getNome());
    }
    @Test
    void obterDetalhesTest(){
        Film filme = new Film("Filmaço da Preula", 2025,"Hans Zimmer");
        Role role = new ScreenwriterRole();
        Person pessoa = new Person("Serginho Groisman");
        filme.adicionarParticipacao(pessoa, role);
        filme.setDiretor("Tim Maia");
        filme.setRoteirista("Serginho Groisman");
        assertEquals("Título: Filmaço da Preula (2025)\n" +
                "Diretor: Tim Maia\n" +
                "Roteirista: Serginho Groisman\n" +
                "Trilha sonora: Hans Zimmer\n" +
                "Elenco e equipe:\n" +
                " - Serginho Groisman como Roteirista\n", filme.obterDetalhes());
    }
    @Test
    void filmNotTest(){
        Film filme = new Film("Filmaço da Preula", 2025,"Hans Zimmer");
        assertNotEquals("Filmeco Mixuruca",filme.getTitulo());
        assertNotEquals(2026,filme.getAno());
        assertNotEquals("Lupe de Lupe",filme.getTrilhaSonora());
    }
    @Test
    void filmParitipacaoNotTest(){
        Film filme = new Film("Filmaço da Preula", 2025,"Hans Zimmer");
        Role role = new ScreenwriterRole();
        Person pessoa = new Person("Serginho Groisman");
        filme.adicionarParticipacao(pessoa, role);
        assertNotEquals("Pericles", pessoa.getNome());
        assertNotEquals("Ator", role.getNome());
    }
    @Test
    void obterDetalhesNotTest(){
        Film filme = new Film("Filmaço da Preula", 2025,"Hans Zimmer");
        Role role = new ScreenwriterRole();
        Person pessoa = new Person("Serginho Groisman");
        filme.adicionarParticipacao(pessoa, role);
        filme.setDiretor("Tim Maia");
        filme.setRoteirista("Serginho Groisman");
        assertNotEquals("Título: Filmaço da Preula (2025)\n" +
                "Diretor: Pedro Bial\n" +
                "Roteirista: William Bonner\n" +
                "Trilha sonora: Hans Zimmer\n" +
                "Elenco e equipe:\n" +
                " - Serginho Groisman como Ator\n", filme.obterDetalhes());
    }

}
