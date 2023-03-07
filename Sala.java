public class Sala {
    /*descricao
     * localizacao
     * quantidade de cadeiras
     * tipo de tela
     */

     private String desc_sala;
     private String localizacao;
     private int qtd_cadeiras;
     private String tipo_tela;

     public String getDescricaoSala(){
        return this.desc_sala;
    }
    public void setDescricaoSala(String descricao){
        this.desc_sala = descricao;
    }


    public String getLocalizacao(){
        return this.localizacao;
    }
    public void setLocalizacao(String localizacao){
        this.localizacao = localizacao;
    }


    public int getQtd(){
        return this.qtd_cadeiras;
    }
    public void setQtd(int qtd_cadeiras){
        this.qtd_cadeiras = qtd_cadeiras;
    }


    public String getTipo(){
        return this.tipo_tela;
    }
    public void setTipo(String tipo_tela){
        this.tipo_tela = tipo_tela;
    }
}