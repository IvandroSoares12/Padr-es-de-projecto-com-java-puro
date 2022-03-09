package one.digitalinovationestrategy;

public class Robo {
    private comportamento Comportamento;

    public void setComportamento(comportamento comportamento) {
        Comportamento = comportamento;
    }
    public  void mover(){
        Comportamento.mover();
    }
}
