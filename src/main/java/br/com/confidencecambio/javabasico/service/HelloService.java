package br.com.confidencecambio.javabasico.service;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class HelloService {

    private static final String valorPadrao = "Mundo";

    public String retornaValorValido(@Nullable String nome) {
        return Optional.ofNullable(nome).orElse(valorPadrao);
    }

    public Double calculaImc(Double peso, Double altura) {
        return peso / (Math.pow(altura,2));
    }
}
