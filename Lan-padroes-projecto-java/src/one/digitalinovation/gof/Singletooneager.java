package one.digitalinovation.gof;
/**
 * Sngletoon apressado
 * @author Ivandro Soares
 */
public class Singletooneager {
    private static Singletooneager instancia = new Singletooneager();

    private Singletooneager() {
        super();

    }

    public static Singletooneager getInstance() {


        return instancia;
    }
}
