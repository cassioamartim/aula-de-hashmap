## Visualização de Dados do HashMap

Imagine que temos um HashMap, e queremos retornar toda a HashMap, para isso nós fariamos:

```java
Map<String, Integer> map = new HashMap<>();

map.put("Cassio", 17);

map.put("Igor", 20);

map.put("Arthur", 30);

System.out.println(map);
```

## Retorno
Seguindo o padrão de `chave`/`valor`:
```
{Cassio=17, Igor=20, Arthur=30}
```