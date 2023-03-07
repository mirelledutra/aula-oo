public class Principal {
    public static void main(String[] args) {
        
        Filme filme1 = new Filme();
        filme1.setTitulacao("Era do Gelo");
      /* */  System.out.println(filme1.getTitulacao());

        filme1.setDuracao(60);
      /* */  System.out.println(filme1.getDuracao());

        filme1.setAno(2002);
       /* */ System.out.println(filme1.getAno());

        filme1.setSinopse("Vinte mil anos atrás, num mundo coberto de gelo, o mamute Manfred e a preguiça Sid resgatam um bebê humano órfão. Agora, os dois vão enfrentar muitas aventuras até devolver o filhote de gente à sua tribo, que migrou para um novo acampamento.");
      /* */  System.out.println(filme1.getSinopse());

      System.out.println("O filme "+filme1.getTitulacao()+", com duração de "+filme1.getDuracao()+" minutos, estreou no ano de "+filme1.getAno()+"."+" Sinopse: "+filme1.getSinopse());

      Filme filme2 = new Filme();
      filme2.setTitulacao("Madagascar");
      filme2.setDuracao(120);
      filme2.setAno(2005);
      filme2.setSinopse("fjalfjajfaj");

      System.out.println("O filme "+filme2.getTitulacao()+", com duração de "+filme2.getDuracao()+" minutos, estreou no ano de "+filme2.getAno()+"."+" Sinopse: "+filme2.getSinopse());

    }

    
   
}
