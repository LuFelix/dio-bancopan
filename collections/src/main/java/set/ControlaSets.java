package set;

import java.util.*;

public class ControlaSets {
    public static void main(String[] args) {
        /**
        * Usar a Interface Set HashSet para manipular elementos
        */
        System.out.println();
        System.out.println("Classe ControlaSets");
        System.out.println("Usar a Interface Set HashSet para manipular elementos");
        Set<Double> setNotas = new HashSet<>(Arrays.asList(7d, 8.5, 9.2, 5.6, 4.9, 8.5));
        System.out.println(setNotas);

        /**
         * O HashSet não possui índice, ordenação aleatória, possui método contains e não aceita elementos repetidos
         */
        {
            System.out.println();
            setNotas.add(7d);
            System.out.println("Verificar se o set contem o elemento 9.2: " + setNotas.contains(9.2));
            System.out.println("Verificar se o set contem o elemento 8.49: " + setNotas.contains(8.49));
            System.out.println();
        }

        /**
         * Exibir a maior e a menor nota
         */
        {
            System.out.println("A menor nota é: " + Collections.min(setNotas));
            System.out.println("A maior nota é: " + Collections.max(setNotas));
            System.out.println();
        }

        /**
         * Exibir a soma e média das notas
         */
        {
            Iterator<Double> iterator = setNotas.iterator();
            double aux = 0;
            while (iterator.hasNext()) aux += iterator.next();

            System.out.printf("A soma das nota é: %.2f", aux);
            System.out.printf("\nA média das nota é: %.2f", aux/setNotas.size());
            System.out.println();
        }

        /**
         * Remover uma nota específica
         */
        {
            System.out.println();
            System.out.println("Remover a nota 5.6 ");
            setNotas.remove(5.6);
            System.out.println(setNotas);
            System.out.println();
        }

        /**
         * Remover notas menores que 7
         */
        {
            System.out.println("Remover notes menores que 7");
            Iterator iterator1 = setNotas.iterator();
            while (iterator1.hasNext()){
                if (Double.compare((Double)iterator1.next(),7.0) < 0) iterator1.remove();
            }
            System.out.println(setNotas);
            System.out.println();
        }

        /**
         * A interface LinkedHashSet possui ordenação de inserção, mas não aceita repetidos
         */
        System.out.println("A Interface LinkedHashSet possui ordem de inserção");
        Set<Double> setNotas2 = new LinkedHashSet<>();
        setNotas2.add(7d);
        setNotas2.add(7.5);
        setNotas2.add(8.9);
        setNotas2.add(3.7);
        setNotas2.add(4.2);
        setNotas2.add(5.8);
        setNotas2.add(9.4);
        System.out.println(setNotas2);
        System.out.println();
        setNotas2.add(5.8);
        setNotas2.add(9.4);
        System.out.println("Hashset depois de tentativa de inserção de repetidos");
        System.out.println(setNotas2);
        System.out.println();

        /**
         * Para ordenar passamos o set para um TreeSet que aceita ordenação na hora de inserção
         */
        System.out.println("TreeSet ordena recebendo um HashSet na hora de inserção");
        Set<Double> treeSetNotas = new TreeSet<>(setNotas2);
        System.out.println(treeSetNotas);
        System.out.println();

        /**
         * Apagar um Set e testar se está vazio
         */
        System.out.println("Apagar um Set");
        treeSetNotas.clear();
        System.out.println(treeSetNotas);
        System.out.println("O Set está vazio? " + treeSetNotas.isEmpty());
    }
}
