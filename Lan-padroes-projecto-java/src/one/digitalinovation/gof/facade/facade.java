package one.digitalinovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class facade {
    public void migrarcliente(String nome,String cep){
        String cidada= CepApi.getInstance().recuperarcidade(cep);
        String estado=CepApi.getInstance().recuperarestado(cep);
        CrmService.gravarcliente(nome,cep,cidada,estado);

    }
}
