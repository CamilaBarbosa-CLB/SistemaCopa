package br.com.copa.model;

public class Jogo {

    private int id;
    private String localJogo;
    private String dataHora;
    private String timeA;
    private String timeB;
    private int golsTimeA;
    private int golsTimeB;
    private String escalacaoTimeA;
    private String escalacaoTimeB;

    public Jogo() {

    }

    public Jogo(int id, String localJogo, String dataHora, String timeA, String timeB, int golsTimeA, int golsTimeB,
            String escalacaoTimeA, String escalacaoTimeB) {
        this.id = id;
        this.localJogo = localJogo;
        this.dataHora = dataHora;
        this.timeA = timeA;
        this.timeB = timeB;
        this.golsTimeA = golsTimeA;
        this.golsTimeB = golsTimeB;
        this.escalacaoTimeA = escalacaoTimeA;
        this.escalacaoTimeB = escalacaoTimeB;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getLocalJogo() {
        return localJogo;
    }

    public void setLocalJogo(String localJogo) {
        this.localJogo = localJogo;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getTimeA() {
        return timeA;
    }

    public void setTimeA(String timeA) {
        this.timeA = timeA;
    }

    public String getTimeB() {
        return timeB;
    }

    public void setTimeB(String timeB) {
        this.timeB = timeB;
    }

    public int getGolsTimeA() {
        return golsTimeA;
    }

    public void setGolsTimeA(int golsTimeA) {
        this.golsTimeA = golsTimeA;
    }

    public int getGolsTimeB() {
        return golsTimeB;
    }

    public void setGolsTimeB(int golsTimeB) {
        this.golsTimeB = golsTimeB;
    }

    public String getEscalacaoTimeA() {
        return escalacaoTimeA;
    }

    public void setEscalacaoTimeA(String escalacaoTimeA) {
        this.escalacaoTimeA = escalacaoTimeA;
    }

    public String getEscalacaoTimeB() {
        return escalacaoTimeB;
    }

    public void setEscalacaoTimeB(String escalacaoTimeB) {
        this.escalacaoTimeB = escalacaoTimeB;
    }
}