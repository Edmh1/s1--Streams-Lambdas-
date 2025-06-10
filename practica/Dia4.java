package practica;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Dia4 {
    public static void main(String[] args) {
        List<String> nombres = List.of(
                "Ana", "Pedro", "Carlos", "Lucía", "Ana", "Miguel", "Carla", "Juan", "María", "Luis", "Lucía"
        );

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // ✅ 1. Mostrar nombres que terminan en vocal
        // 💡 Resultado esperado: nombres que terminan en vocal (a, e, i, o, u)
        Predicate<String> lammbda = a -> a.endsWith("a") || a.endsWith("e") || a.endsWith("i") || a.endsWith("o") || a.endsWith("u");
        List<String> e1 = nombres.stream()
                .filter(lammbda)
                .collect(Collectors.toList());


        // ✅ 2. Mostrar longitud de cada nombre
        // 💡 Resultado esperado: lista de números con la longitud de cada nombre
        Function<String, Integer> lambda2 = a -> a.length();
        List<Integer> e2 = nombres.stream()
                .map(lambda2)
                .collect(Collectors.toList());

        // ✅ 3. Contar cuántos nombres empiezan por M
        // 💡 Resultado esperado: número total de nombres que comienzan con "M"
        int e3 = (int) nombres.stream()
                .filter(a -> a.startsWith("M"))
                .count();

        // ✅ 4. Transformar nombre a "Inicial - Longitud"
        // 💡 Resultado esperado: por ejemplo, "A-3", "P-5", etc.
        List<String> e4 = nombres.stream()
                .map(a-> a.charAt(0)+"-"+a.length())
                .collect(Collectors.toList());

        // ✅ 5. Mostrar nombres con más de 4 letras en mayúsculas
        // 💡 Resultado esperado: lista en mayúsculas de nombres con más de 4 letras

        // ✅ 6. Sumar todos los números pares
        // 💡 Resultado esperado: suma de los números pares
        int e6 = numeros.stream()
                .filter(a -> a % 2 == 0)
                .mapToInt(a -> a)
                .sum();

        // ✅ 7. Agrupar nombres por su primera letra
        // 💡 Resultado esperado: mapa con clave como inicial y valor lista de nombres
        Map<Character, List<String>> e7 = nombres.stream()
                .collect(Collectors.groupingBy(a -> a.charAt(0)));

        // ✅ 8. Agrupar números en pares e impares
        // 💡 Resultado esperado: mapa con clave true/false y listas de números
        Map<Boolean, List<Integer>> e8 = numeros.stream()
                .collect(Collectors.groupingBy(a -> a % 2 == 0));


        // ✅ 9. Sumar todos los caracteres de los nombres únicos
        // 💡 Resultado esperado: suma de la longitud de los nombres sin duplicados
        int sum = (int) nombres.stream()
                .distinct()
                .mapToInt(a -> a.length())
                .sum();
        // ✅ 10. Agrupar nombres por longitud
        // 💡 Resultado esperado: mapa donde la clave es longitud y el valor es lista de nombres
        Map<Integer, List<String>> e9 = nombres.stream()
                .collect(Collectors.groupingBy(a -> a.length()));
        System.out.println(e9);
    }
}
