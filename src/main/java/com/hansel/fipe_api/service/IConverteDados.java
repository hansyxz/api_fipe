package com.hansel.fipe_api.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
