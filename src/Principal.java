import com.aluracursos.screenmtach.modelos.Pelicula;
import com.aluracursos.screenmtach.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);
        miPelicula.evalua(8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());
        System.out.println(miPelicula.getNombre());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("Casa Dragon");
        casaDragon.setTemporadas(1);
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        System.out.println(casaDragon.getDuracionEnMinutos());
        casaDragon.muestraFichaTecnica();
    }
}
