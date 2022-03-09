package one.digitalinovation.gof;
/**
 * Sngletoon LazyHolder
 * @author Ivandro Soares
 */
public class Singletoonlazyholder {
    private static class InstaceHolder {
        public static Singletoonlazyholder instancia = new Singletoonlazyholder();
    }
    private Singletoonlazyholder() {
        super();

    }

    public static Singletoonlazyholder getInstance() {


        return InstaceHolder.instancia;
    }
}
