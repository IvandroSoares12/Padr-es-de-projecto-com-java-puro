package subsistema2.cep;

import one.digitalinovation.gof.Singletooneager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();

    }

    public static CepApi getInstance() {


        return instancia;
    }
    public  String recuperarcidade(String ce){
        return "Araraquara";
    }
    public  String recuperarestado(String cep){
        return"SP";
    }
}
