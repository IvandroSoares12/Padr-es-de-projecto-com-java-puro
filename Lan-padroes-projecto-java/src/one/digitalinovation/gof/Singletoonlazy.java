package one.digitalinovation.gof;
/**
 * Sngletoon preguiçoso
 * @author Ivandro Soares
 */
public class Singletoonlazy {
    private static Singletoonlazy instancia;
    private Singletoonlazy(){
        super();

    }
    public static Singletoonlazy getInstance(){
        if(instancia==null){
            instancia=new Singletoonlazy();
        }
        return instancia;
    }

}
