public class TestarSala {
    public static void main(String[] args) {
        Sala sala1 = new Sala();
        sala1.setDescricaoSala("Sala 01");
        sala1.setLocalizacao("3. piso");
        sala1.setQtd(50);
        sala1.setTipo("3d");

        System.out.println("Descrição da sala: "+sala1.getDescricaoSala()+" localizado no "+sala1.getLocalizacao()+ " com capacidade de "+sala1.getQtd()+" pessoas"+" resolucao "+sala1.getTipo());
    }
    
}
