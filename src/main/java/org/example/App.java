package org.example;


import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        ArvoreBarbaros a = new ArvoreBarbaros();
        String t = sc.next();
        String pai = sc.next();
        a.add(null, pai, Integer.parseInt(t));
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
        System.out.println(a.getRoot().NOME);
        System.out.println(a.getSize());
    }
}
