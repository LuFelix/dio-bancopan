package map;

import javax.sound.midi.Soundbank;
import java.util.*;

/**
 * Maps são conjuntos de pares com chave únicas e valor [Dicionários são chaves com que através
 * do índice se conectam aos seus conteúdos]
 *
 */
public class ControlaMaps {
    public static void main(String[] args) {

        /**
         * Criar um conjunto(Dicionário) de carros com seus respectivos consumos
         */
        Map<String,Double> mapCarros  = new HashMap<>();
        mapCarros.put("Gol",14.2);
        mapCarros.put("Corsa",12.8);
        mapCarros.put("Uno",16.4);
        mapCarros.put("Celta",15.9);
        mapCarros.put("Mobi",16.8);
        mapCarros.put("Clio",15.2);
        mapCarros.put("Up!",16.8);

        /**
         * Exibição do Mapa com 6 Carros
         */
        {
            System.out.println();
            System.out.println("--\t Exibição do Mapa com 6 carros ");
            System.out.println(mapCarros);
        }

        /**
         * Atualizar o consumo do corsa para 13.8
         */
        {
            System.out.println();
            System.out.println("--\t Atualizar o consumo do corsa para 13.8 ");
            mapCarros.put("Corsa",13.8);
            System.out.println(mapCarros);
        }

        /**
         * Conferir se elementos estão no conjunto HashMap
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
         * Exibir os nomes dos carros
         */
        {
            System.out.println();
            System.out.println("--\t Exibir os nomes dos carros ");
            Set<String> setCarros = mapCarros.keySet();
            System.out.println("Set de modelos: "+ setCarros);
        }

        /**
         * Exibir os consumos dos carros
         */
        {
            System.out.println();
            System.out.println("--\t Exibir os consumos dos carros ");
            Collection<Double> consumos = mapCarros.values();
            System.out.println("Collection com os consumos: "+ consumos);
        }

        /**
         * Exibir o carro de menor emaior consumo
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



    }
}
