package com.hansel.fipe_api.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCarro(@JsonAlias("Marca") String marca,
        @JsonAlias("Valor") String preco,
        @JsonAlias("Modelo") String modelo,
        @JsonAlias("AnoModelo") int anoModelo,
        @JsonAlias("Combustivel") String combustivel,
        @JsonAlias("CodigoFipe") String codigoFipe) {
}
