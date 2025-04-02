package br.com.petz.cliente_pet.cliente.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Sexo {
    MASCULINO("masculino"),
    FEMININO("feminino"),
    OUTRO("outro");

    private String descricao;

    Sexo(String descricao) {
        this.descricao = descricao;
    }

    @JsonCreator
    public static Sexo fromString(String value) {
        for (Sexo sexo : Sexo.values()) {
            if (sexo.descricao.equalsIgnoreCase(value)) {
                return sexo;
            }
        }
        return null;
    }
}
