package br.edu.fatecrl.mvcdemo.models;

public class Brasileirao {
    private String nome;
    private String artilheiro;
    private int pontos;
    private int gols;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtilheiro() {
        return artilheiro;
    }

    public void setArtilheiro(String artilheiro) {
        this.artilheiro = artilheiro;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public Brasileirao(String nome, String artilheiro, int pontos, int gols) {
        this.nome = nome;
        this.artilheiro = artilheiro;
        this.pontos = pontos;
        this.gols = gols;
    }
}
