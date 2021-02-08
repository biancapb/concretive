package model;

import java.util.Date;

public class AddAnnotations {
    private Date dateAnnotation;
    private int qtdBalde, qtdCimento, qtdAgua, totalBlocos;
    private String descricao;

//    public AddAnnotations(Date date, int qtdBalde, int qtdCimento, int qtdAgua, int totalBlocos, String descricao) {
//        this.dateAnnotation = date;
//        this.qtdBalde = qtdBalde;
//        this.qtdCimento = qtdCimento;
//        this.qtdAgua = qtdAgua;
//        this.totalBlocos = totalBlocos;
//        this.descricao = descricao;
//    }
public AddAnnotations(int qtdBalde, int qtdCimento) {
//    this.dateAnnotation = date;
    this.qtdBalde = qtdBalde;
    this.qtdCimento = qtdCimento;
//    this.qtdAgua = qtdAgua;
//    this.totalBlocos = totalBlocos;
//    this.descricao = descricao;
}

    public Date getDateAnnotation() {
        return dateAnnotation;
    }

    public void setDateAnnotation(Date dateAnnotation) {
        this.dateAnnotation = dateAnnotation;
    }

    public int getQtdBalde() {
        return qtdBalde;
    }

    public void setQtdBalde(int qtdBalde) {
        this.qtdBalde = qtdBalde;
    }

    public int getQtdCimento() {
        return qtdCimento;
    }

    public void setQtdCimento(int qtdCimento) {
        this.qtdCimento = qtdCimento;
    }

    public int getQtdAgua() {
        return qtdAgua;
    }

    public void setQtdAgua(int qtdAgua) { this.qtdAgua = qtdAgua; }

    public int getTotalBlocos() {
        return totalBlocos;
    }

    public void setTotalBlocos(int totalBlocos) {
        this.totalBlocos = totalBlocos;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
