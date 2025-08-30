package me.dio.domain.model;

public class About {

    private String autor;
    private String projeto;
    private String versao;
    private String mensagem;

    // Construtor
    public About(String autor, String projeto, String versao, String mensagem) {
        this.autor = autor;
        this.projeto = projeto;
        this.versao = versao;
        this.mensagem = mensagem;
    }

    // Getters
    public String getAutor() {
        return autor;
    }

    public String getProjeto() {
        return projeto;
    }

    public String getVersao() {
        return versao;
    }

    public String getMensagem() {
        return mensagem;
    }
}
