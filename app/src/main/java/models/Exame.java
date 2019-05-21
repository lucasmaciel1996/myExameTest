package models;

import android.util.Log;

public class Exame {
    private int ponto=0;
    private int total_ponto=0;
    private String indetificador;
    private String resultado;


    public int getPonto() {
        return ponto;
    }

    public void setPonto(int ponto) {
        this.ponto = ponto;
    }

    public int  getTotal_ponto() {
        return total_ponto;
    }


    public String getIndetificador() {
        return indetificador;
    }

    public void setIndetificador(String indetificador) {
        this.indetificador = indetificador;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }


    public Exame(int ponto,String indetificador, String resultado) {
        this.ponto = ponto;
        this.indetificador = indetificador;
        this.resultado = resultado;
    }

    public int soma_pontos(Exame exame){
        this.total_ponto =this.total_ponto +  exame.getPonto();
        return getTotal_ponto();
    }
    public int diminui_pontos(Exame exame){
        this.total_ponto =this.total_ponto -  exame.getPonto();
        return getTotal_ponto();
    }
    public String consulta_result(Exame exame)
    {
        if(this.getTotal_ponto()>3)
        {
            return "REPROVADO";
        }
        return "APROVADO";
    }
}
