package br.com.moviematch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
