package com.curso;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Program {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Cassio", 16);

        System.out.println(map); // {Cassio=16}

        map.put("Cassio", 20);

        System.out.println(map); // {Cassio=20}

        map.put("Ryan", 12);

        boolean existeCassio = map.containsKey("Ryan");

        boolean existeValor = map.containsValue(10);

        System.out.println("Existe ? " + existeValor);

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        for (Integer value : map.values()) {
            System.out.println(value);
        }

        map.forEach( (key, value) -> {
            System.out.println("Key " + key);

            System.out.println("Value " + value);
        });
    }

}
