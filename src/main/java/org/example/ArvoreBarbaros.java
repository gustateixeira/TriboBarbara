package org.example;

public class ArvoreBarbaros {
   private Nodo root;
   private int size;
   public ArvoreBarbaros(){
      root = null;
       size = 0;
   }

   public void add(String pai, String nome, int t){
       if(this.root == null){
           this.root = new Nodo(null, nome, t);
           size++;
       }
       else {
           Nodo n = root;
           if (n.NOME.equals(pai)) {
               Nodo filho = new Nodo(root, nome, t);
               root.children.put(nome, filho);
               size++;
           }
       }
   }

   public boolean isEmpty(){
       return size == 0;
   }
   public Nodo getRoot(){
       return root;
   }

   public int getSize(){
       return size;
   }


}
