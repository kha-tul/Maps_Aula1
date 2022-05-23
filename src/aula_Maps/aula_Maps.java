package aula_Maps;

import java.util.HashMap;
import java.util.Map;

public class aula_Maps {
    public static void main(String[] args) {

        Map<String, Integer> campeoesMundialFifa = new HashMap<>(); //hashmap é a implementação mais comum
       //hashmap implementa map. tem keys

        //Adicionando os campeões Mundiais
        campeoesMundialFifa.put("Brasil", 5); //contem string (brasil) e integer (5)
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);

        System.out.println(campeoesMundialFifa);

        //Atualiza o valor para a chave Brasil
        campeoesMundialFifa.put("Brasil", 6);

        //Retorna a Argentina
        System.out.println(campeoesMundialFifa.get("Argentina"));

        //Retorna se existe ou não um campeão França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        //Remove o campeão França
        campeoesMundialFifa.remove("França");

        //Retorna se existe ou não França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        //Retorna se existe ou não seleção hexacampeã
        System.out.println(campeoesMundialFifa.containsValue(6));

        //Retorna o tamanho do mapa
        System.out.println(campeoesMundialFifa.size());

        //Navega nos registros do mapa
        for (Map.Entry<String, Integer> entry : campeoesMundialFifa.entrySet()) { // entry está dentro da interface map
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }

        //Navega nos registros do mapa
        for (String key : campeoesMundialFifa.keySet()) {
            System.out.println(key + " -- " + campeoesMundialFifa.get(key));
        }

        System.out.println(campeoesMundialFifa);

        //Verifica se o Mapa contém chave Estados Unidos
        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));

        //Verifica se o mapa contém valor 5
        System.out.println(campeoesMundialFifa.containsValue(5));

        //Verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeoesMundialFifa.size());

        campeoesMundialFifa.clear();

        System.out.println(campeoesMundialFifa.size());

        //Hashmap é mais performático. LinkedHashMap é melhor para ordenacao.
    }
}
