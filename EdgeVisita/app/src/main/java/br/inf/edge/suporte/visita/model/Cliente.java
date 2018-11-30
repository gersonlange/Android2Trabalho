package br.inf.edge.suporte.visita.model;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

public class Cliente {
    private int codigo, codigoRegiao;
    private String nome, endereco, observacao, tipoBotao;
    private double latitude, longitude;

    public int getCodigo() {
        return codigo;
    }

    public Cliente setCodigo(int codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Cliente setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getObservacao() {
        return observacao;
    }

    public Cliente setObservacao(String observacao) {
        this.observacao = observacao;
        return this;
    }

    public String getEndereco() {
        return endereco;
    }

    public Cliente setEndereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public int getCodigoRegiao() {
        return codigoRegiao;
    }

    public Cliente setCodigoRegiao(int codigoRegiao) {
        this.codigoRegiao = codigoRegiao;
        return this;
    }

    public double getLatitude() {
        return latitude;
    }

    public Cliente setLatitude(double latitude) {
        this.latitude = latitude;
        return this;
    }

    public double getLongitude() {
        return longitude;
    }

    public Cliente setLongitude(double longitude) {
        this.longitude = longitude;
        return this;
    }

    public void setTipoBotao(String tipoBotao) {
        this.tipoBotao = tipoBotao;
    }

    public String getTipoBotao() {
        return tipoBotao;
    }

}