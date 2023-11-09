package org.example;

public class ArvoreBarbaros {
   private final Nodo root;
   private int size;
   public ArvoreBarbaros(Nodo nodo){
      this.root = nodo;
      size = 0;
   }

   public void add(Nodo pai,String name, int terras){
       Nodo n = root;
       if(root == pai) {
            Nodo nodo = new Nodo(pai, name, terras);
            root.children.put(name, nodo);
            size++;
         }
       else{
             while(n != pai){
                 Nodo child = n.children.get(name);
                 if(child == null){
                    child = new Nodo(pai, name, terras);
                    n.children.put(name,child);
                    size++;
                 }
                 n = child;
             }
         }
   }
   public boolean isEmpty(){
       return size == 0;
   }

   public int getSize(){
       return size;
   }


}
