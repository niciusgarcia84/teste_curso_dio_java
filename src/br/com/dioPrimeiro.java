package br.com;

import br.com.model.Gato;

public class dioPrimeiro {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 3;
//        System.out.println("Olá Brasil!!! " + (a+b));

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro();
        livro1.setNomeLivro("Teste");
        livro1.setNumPaginas(300);
        System.out.println(livro1);
    }
}
class Livro{
    private String nomeLivro;
    private Integer numPaginas;

    public Livro() {
    }

    public Livro(String nomeLivro, Integer numPaginas) {
        this.nomeLivro = nomeLivro;
        this.numPaginas = numPaginas;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nomeLivro='" + nomeLivro + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
