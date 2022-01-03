package com.curso.microservico.loja.model.form;

public class EnderecoForm {

    private String rua;
    private long numero;
    private String estado;

    public EnderecoForm(String rua, long numero, String estado) {

        this.rua = rua;
        this.numero = numero;
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
