package one.digitalinovation.gof;

import one.digitalinovation.gof.facade.facade;
import one.digitalinovationestrategy.*;

public class Test {


    private static comportamento Comportamento;
    private static Object comportamentonormal;
    private static Object comportamentoagressivo;
    private static Object comportamentodefensivo;

    public static void  main(String[]args){
        //Testes relacionados ao Designer Patter Singletoon
        Singletoonlazy lazy=Singletoonlazy.getInstance();
        System.out.println(lazy);
        lazy=Singletoonlazy.getInstance();


        Singletooneager eager=Singletooneager.getInstance();
        System.out.println(eager);
        eager =Singletooneager.getInstance();
        System.out.println(eager);

        Singletoonlazyholder lazyholder=Singletoonlazyholder.getInstance();
        System.out.println(lazyholder);
        lazyholder=Singletoonlazyholder.getInstance();
        System.out.println(lazyholder);

        //Estrategy
        Comportamento=new comportamentodefensivo();
        Comportamento=new comportamentonormal();
        Comportamento=new comportamentoagressivo();

        Robo robo=new Robo();
        robo.setComportamento((comportamento) comportamentonormal);
        robo.mover();
        robo.mover();

        robo.setComportamento((comportamento) comportamentodefensivo);
        robo.mover();
        robo.mover();

        robo.setComportamento((comportamento) comportamentoagressivo);
        robo.mover();
        robo.mover();
        
        //facede
        facade Facade=new facade();
        Facade.migrarcliente("Ivandr0","00024");
        }
    }
