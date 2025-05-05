import java.util.List;
import java.util.Map;

public interface FilmographyProvider {
    Map<Film, List<Role>> obterFilmografia();
}
