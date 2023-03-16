package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ControlaTemperatura {
    public static void main(String[] args) {
        System.out.println("--\t Lista de Temperaturas médias \t--");
        List<Double> listaTemperaturas = new ArrayList<Double>(List.of(29.6,26.7,28.4,27.2,29.9,30.1));
        System.out.println(listaTemperaturas);
        System.out.println();
        System.out.println("Média das Temperaturas");
        Iterator iterator = listaTemperaturas.iterator();
        double soma = 0d;
        while (iterator.hasNext()) soma = Double.sum(soma, (Double) iterator.next());
        double media = soma / listaTemperaturas.size();
        System.out.printf("A média é: %.2f", media);
        System.out.println();
        Iterator iterator2 = listaTemperaturas.iterator();
        while (iterator2.hasNext()) {
            double temp = (Double) iterator2.next();
            if (Double.compare(temp, media)<0){
                System.out.printf("\nTemp: " + temp + " é menor que a Média: %.2f", media );
            } else if (Double.compare(temp, media)==0) {
                System.out.printf("\nTemp: " + temp + " é igual a Média: %.2f", media );
            } else {
                System.out.printf("\nTemp: "+ temp + " é maior que a Média: %.2f", media);
            }
        }
    }
}
