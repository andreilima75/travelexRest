package br.com.confidencecambio.javabasico.service;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloServiceTest {

    private HelloService service;

    @Before
    public void init(){
         service= new HelloService();
    }


    @Test
    public void quandoPassarUmNomeQueroEleDeResposta(){
        var nome = "Meu Nome";
        String valorValido = service.retornaValorValido(nome);
        assertEquals(nome,valorValido);
    }

    @Test
    public void quandoPassarNuloQueroOPadrao(){

        String valorValido = service.retornaValorValido(null);
        assertEquals("Mundo",valorValido);
    }

    @Test
    public void calculaImc(){

        Double imc = service.calculaImc(1.0, 1.0);
        assertEquals("1.0",imc.toString());
    }

}