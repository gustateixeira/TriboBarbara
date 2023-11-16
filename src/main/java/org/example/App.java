package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String pai = sc.next();
        ArvoreBarbaros a = new ArvoreBarbaros(pai, Integer.parseInt(t));
        while(sc.hasNext()){
            if(a.getRoot().children.isEmpty()){
                String filho = sc.next();
                int terras = sc.nextInt();
                a.add(pai, filho, terras);

            }
            else{
                pai = sc.next();
                String filho = sc.next();
                int terras = sc.nextInt();
                a.add(pai, filho, terras);
            }
        }
        for(Nodo n : a.guerreiros){
            a.repassarTerras(n);
        }
        System.out.println(a);
        System.out.println(a.getGuerreiroMaisTerras());
    }
}
