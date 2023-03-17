package map;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Maps são conjuntos de pares com chave únicas e valor [Dicionários são chaves com que através
 * do índice se conectam aos seus conteúdos]
 *
 */
public class ControlaMaps {
    public static void main(String[] args) {

        /**
         * Criar um conjunto(Dicionário) de carros (Map) com seus respectivos consumos
         */
        Map<String,Double> mapCarros  = new HashMap<>();

        /**
         * Adição de elementos ao Mapa
         */
        {
            mapCarros.put("Gol", 14.2);
            mapCarros.put("Corsa", 12.8);
            mapCarros.put("Uno", 16.4);
            mapCarros.put("Celta", 15.9);
            mapCarros.put("Mobi", 16.8);
            mapCarros.put("Clio", 15.2);
            mapCarros.put("Up!", 16.8);
            mapCarros.put("Onix", 16.0);
            mapCarros.put("Siena", 16.0);
        }

        /**
         * Exibição do Mapa com 9 Carros
         */
        {
            System.out.println();
            System.out.println("--\t Exibição do Mapa com 6 carros ");
            System.out.println(mapCarros);
        }

        /**
         * Atualizar o consumo de um elemento para 13.8
         */
        {
            System.out.println();
            System.out.println("--\t Atualizar o consumo do corsa para 13.8 ");
            mapCarros.put("Corsa",13.8);
            System.out.println(mapCarros);
        }

        /**
         * Conferir se elementos pertencem ao conjunto HashMap
         */
        {
            System.out.println();
            System.out.println("--\t Conferir se Focus e Uno estão no conjunto HashMap");
            System.out.println("Focus está no HashMap? "+mapCarros.containsKey("Focus"));
            System.out.println("Uno está no HashMap? "+mapCarros.containsKey("Uno"));
        }

        /**
         * Exibir o valor de elementos atravéz da chave
         */
        {
            System.out.println();
            System.out.println("--\t Exibir o consumo do Uno e do Mobi ");
            System.out.println("Consumo do Uno: " + mapCarros.get("Uno"));
            System.out.println("Consumo do Mobi: " + mapCarros.get("Mobi"));
        }

        /**
         * Exibir as chaves do conjunto (os nomes dos carros)
         */
        {
            System.out.println();
            System.out.println("--\t Exibir os nomes dos carros ");
            Set<String> setCarros = mapCarros.keySet();
            System.out.println("Set de modelos: "+ setCarros);
        }

        /**
         * Exibir os valores do conjunto (consumos dos carros)
         */
        {
            System.out.println();
            System.out.println("--\t Exibir os consumos dos carros ");
            Collection<Double> consumos = mapCarros.values();
            System.out.println("Collection com os consumos: "+ consumos);
        }

        /**
         * Exibir a chave(carro) de menor e maior valor(consumo)
         */
        {
            System.out.println();
            System.out.println("--\t Exibir o carro de menor consumo ");
            Collection<Double> consumos = mapCarros.values();
            Double valor = Collections.max(consumos);
            Set<Map.Entry<String,Double>> entrySet = mapCarros.entrySet();
            String chave;
            for (Map.Entry<String,Double> entry : entrySet) {
               if(entry.getValue()==valor) System.out.println("Carro mais econômico: "+entry.getKey());
            }
            valor = Collections.min(consumos);
            for (Map.Entry<String,Double> entry : entrySet) {
                if(entry.getValue()==valor) System.out.println("Carro com maior consumo: "+entry.getKey());
            }
        }

        /**
         * Exibir a soma de tos os consumos e a média
         */
        {
            System.out.println();
            System.out.println("--\t Exibir a soma dos consumos e a média ");
            Collection<Double> consumos = mapCarros.values();
            Iterator<Double> iterator = consumos.iterator();
            double aux = 0d;
            while (iterator.hasNext()){
                aux += iterator.next();
            }
            System.out.printf("A soma dos consumoe é: %.2f", aux);
            System.out.println();
            System.out.printf("A média dos consumos é: %.2f", aux/consumos.size());
            System.out.println();
        }

        /**
         * Exibir uma collection com os consumos, remover consumos maior que 16.0km/l
         */
        {
            System.out.println();
            System.out.println("--\t Remover os carros com consumo inferior a 16,0 Km/l ");
            System.out.println();
            Collection<Double> consumos2 =  mapCarros.values();
            System.out.println("Collection consumos: " + consumos2);
            System.out.println();
            Iterator<Double> iterator2 = mapCarros.values().iterator();
            while (iterator2.hasNext()) {
                double aux = iterator2.next();
                if (Double.compare(aux,16d) < 0) {
                    System.out.println("Remover é inferior a 16km/l: "+aux);
                    iterator2.remove();
                }else if (Double.compare(aux,16d) > 0){
                    System.out.println("Não remover, é superior a 16km/l : "+aux);
                }else {
                    System.out.println("Não remover é igual a 16km/l "+aux);
                }
            }
            System.out.println();
            System.out.println("Consumos econômicos: " + mapCarros.values());
            System.out.println("Carros mais econômicos: "+mapCarros);
            System.out.println();
        }

        /**
         * Exibir os carros na ordem em que forem inseridos(LinkedHashMap)
         */
        {
            System.out.println();
            System.out.println("--\t Exibir os arros em ordem de inserção ");
            Map<String, Double> linkedHashMapCarros = new LinkedHashMap<>(mapCarros);
            System.out.println();
            System.out.println("LinkedHashMap Carros: " + linkedHashMapCarros);
            System.out.println();
        }

        /**
         * Exibir os carros na ordem de nome(TreeMap), limpar e conferir.
         */
        {
            System.out.println();
            System.out.println("--\t Exibir os arros em ordem de nome(TreeMap) ");
            Map<String, Double> treeMapCarros = new TreeMap<>(mapCarros);
            System.out.println();
            System.out.println("TreeMap Ordenado por nome do carros: ");
            System.out.println(treeMapCarros);
            System.out.println();
            treeMapCarros.clear();
            System.out.println("TreeMap limpo: " + treeMapCarros);
            System.out.println("TreeMap está vazio? " + treeMapCarros.isEmpty());

        }

    }
}
