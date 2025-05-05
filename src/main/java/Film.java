import java.util.*;

public class Film implements FilmInfoProvider {

    private String titulo;


    private int ano;
    private String trilhaSonora;
    private List<RoleAssignment> participacoes = new ArrayList<>();
    private String diretor;
    private String roteirista;

    public Film(String titulo, int ano, String trilhaSonora) {
        this.titulo = titulo;
        this.ano = ano;
        this.trilhaSonora = trilhaSonora;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getAno() {
        return ano;
    }

    public String getTrilhaSonora() {
        return trilhaSonora;
    }


    public void setDiretor(String nome) { this.diretor = nome; }
    public void setRoteirista(String nome) { this.roteirista = nome; }

    void adicionarParticipacao(Employee pessoa, Role papel) {
        participacoes.add(new RoleAssignment(pessoa, papel));
    }
    @Override
    public String obterDetalhes() {
        StringBuilder sb = new StringBuilder();
        sb.append("Título: ").append(titulo).append(" (").append(ano).append(")\n");
        sb.append("Diretor: ").append(diretor).append("\n");
        sb.append("Roteirista: ").append(roteirista).append("\n");
        sb.append("Trilha sonora: ").append(trilhaSonora).append("\n");
        sb.append("Elenco e equipe:\n");
        for (RoleAssignment ra : participacoes) {
            sb.append(" - ").append(ra.getPessoa().getNome())
              .append(" como ").append(ra.getPapel().getNome()).append("\n");
        }
        return sb.toString();
    }
}

