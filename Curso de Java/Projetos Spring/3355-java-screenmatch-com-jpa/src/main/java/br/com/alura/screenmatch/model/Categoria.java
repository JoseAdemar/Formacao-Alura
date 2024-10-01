package br.com.alura.screenmatch.model;

public enum Categoria {
    ACAO("Action"),
    ROMANCE("Romance"),
    COMEDIA("Comedy"),
    DRAMA("Drama"),
    CRIME("Crime");

    private String categoriaOmdb;
   private Categoria(String categoriaOmdb) {
       this.categoriaOmdb = categoriaOmdb;
   }

   public  static Categoria fromString(String text) {
       for (Categoria categoria : Categoria.values()) {
           if (categoria.categoriaOmdb.equalsIgnoreCase(text)){
               return categoria;
           }
       }
       throw new IllegalArgumentException("Nenhum categoria encontrada para a string fornecida: " + text);
   }
}
