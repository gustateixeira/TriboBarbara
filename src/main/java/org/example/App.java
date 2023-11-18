package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual casos de teste deseja realizar?");
        System.out.println("Digite '1' para: FAMILIA ZARNAK (MARCIANOS)");
        System.out.println("Digite '2' para: FAMILIA AUGUSTUS (ROMANOS)");
        System.out.println("Digite '3' para: FAMILIA JOÃO (BRASILEIROS)");
        System.out.println("Digite '4' para: FAMILIA HIROSHI (JAPONESES)");
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("""
                        150000
                        Zarnak Xalor 10000
                        Zarnak Zilrax 8000
                        Xalor Zintar 5000
                        Xalor Xendra 3000
                        Zilrax Xalon 4500
                        Zilrax Zara 3500
                        Zintar Zorlon 2000
                        Zintar Zalara 1500
                        Xendra Xylon 1800
                        Xendra Zara 1200
                        """);
                System.out.println();
                System.out.println();
                ArvoreBarbaros arvore = new ArvoreBarbaros("Zarnak", 1500);
                arvore.add("Zarnak", "Xalor", 10000);
                arvore.add("Zarnak", "Zilrax", 8000);
                arvore.add("Xalor", "Zintar", 5000);
                arvore.add("Xalor", "Xendra", 3000);
                arvore.add("Zilrax", "Xalon", 4500);
                arvore.add("Zilrax", "Zara", 3500);
                arvore.add("Zintar", "Zorlon", 2000);
                arvore.add("Zintar", "Zalara", 1500);
                arvore.add("Xendra", "Xylon", 1800);
                arvore.add("Xendra", "Zara", 1200);
                for(Nodo nodo : arvore.guerreiros)
                    arvore.repassarTerras(nodo);
                System.out.println(arvore.getGuerreiroMaisTerras());
                break;
            case 2:
                System.out.println("""
                        150000
                        Zarnak Xalor 10000
                        Zarnak Zilrax 8000
                        Xalor Zintar 5000
                        Xalor Xendra 3000
                        Zilrax Xalon 4500
                        Zilrax Zara 3500
                        Zintar Zorlon 2000
                        Zintar Zalara 1500
                        Xendra Xylon 1800
                        Xendra Zara 1200
                        """);
                System.out.println();
                System.out.println();
                ArvoreBarbaros arvore2 = new ArvoreBarbaros("Augustus", 300);
                arvore2.add("Augustus", "Tiberius", 15000);
                arvore2.add("Augustus", "Caligula", 12000);
                arvore2.add("Tiberius", "Claudius", 8000);
                arvore2.add("Tiberius", "Nero", 6000);
                arvore2.add("Caligula", "Galba", 4500);
                arvore2.add("Caligula", "Otho", 3500);
                arvore2.add("Claudius", "Vespasian", 5000);
                arvore2.add("Claudius", "Titus", 3000);
                arvore2.add("Nero", "Domitian", 4000);
                arvore2.add("Nero", "Nerva", 2500);
                for(Nodo nodo : arvore2.guerreiros)
                    arvore2.repassarTerras(nodo);
                System.out.println(arvore2.getGuerreiroMaisTerras());
                break;
            case 3:
                System.out.println("""
                        100000
                        João Maria 5000
                        João Pedro 3000
                        Maria Ana 2000
                        Maria Carlos 1500
                        Pedro Mariana 4000
                        Pedro Roberto 2500
                        Ana Laura 1800
                        Ana Ricardo 1200
                        Carlos Luciana 2200
                        Carlos Fernando 1700
                        """);
                System.out.println();
                System.out.println();
                ArvoreBarbaros arvore3 = new ArvoreBarbaros("João", 10000);
                arvore3.add("João", "Maria", 5000);
                arvore3.add("João", "Pedro", 3000);
                arvore3.add("Maria", "Ana", 2000);
                arvore3.add("Maria", "Carlos", 1500);
                arvore3.add("Pedro", "Mariana", 4000);
                arvore3.add("Pedro", "Roberto", 2500);
                arvore3.add("Ana", "Laura", 1800);
                arvore3.add("Ana", "Ricardo", 1200);
                arvore3.add("Carlos", "Luciana", 2200);
                arvore3.add("Carlos", "Fernando", 1700);
                for(Nodo nodo : arvore3.guerreiros)
                    arvore3.repassarTerras(nodo);
                System.out.println(arvore3.getGuerreiroMaisTerras());
                break;
            case 4:
                System.out.println("""
                        120000
                        Hiroshi Akihiro 8000
                        Hiroshi Haruka 6000
                        Akihiro Yuki 4000
                        Akihiro Naoki 3500
                        Haruka Sakura 5000
                        Haruka Takashi 3000
                        Yuki Riku 2000
                        Yuki Emi 1500
                        Sakura Kenji 1800
                        Sakura Hana 1200""");
                System.out.println();
                System.out.println();
                ArvoreBarbaros arvore4 = new ArvoreBarbaros("Hiroshi", 12000);
                arvore4.add("Hiroshi", "Akihiro", 8000);
                arvore4.add("Hiroshi", "Haruka", 6000);
                arvore4.add("Akihiro", "Yuki", 4000);
                arvore4.add("Akihiro", "Naoki", 3500);
                arvore4.add("Haruka", "Sakura", 5000);
                arvore4.add("Haruka", "Takashi", 3000);
                arvore4.add("Yuki", "Riku", 2000);
                arvore4.add("Yuki", "Emi", 1500);
                arvore4.add("Sakura", "Kenji", 1800);
                arvore4.add("Sakura", "Hana", 1200);
                for(Nodo nodo : arvore4.guerreiros)
                    arvore4.repassarTerras(nodo);
                System.out.println(arvore4.getGuerreiroMaisTerras());
                break;

        }

    }
}