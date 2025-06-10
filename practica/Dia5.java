package practica;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Dia5 {
    public static void main(String[] args) {
        List<String> nombres = List.of(
                "Ana", "Pedro", "Carlos", "Lucía", "Ana", "Miguel",
                "Carla", "Juan", "María", "Luis", "Lucía", "Andrés", "Elena", "Iván"
        );


        // 🔹 1. Filtra los nombres que tengan exactamente 6 letras y contengan la letra "a"
        // 💡 Resultado esperado: lista de nombres con 6 letras que contienen "a"
        Predicate<String> e1 = a -> a.length() == 6 && (a.contains("a") || a.contains("A"));
        List<String> f1 = nombres.stream()
                .filter(e1)
                .collect(Collectors.toList());


        // 🔹 2. Convierte todos los nombres a minúsculas y elimínalos si aparecen más de una vez
        // 💡 Resultado esperado: lista de nombres en minúscula sin duplicados
        List<String> f2 = nombres.stream()
                .distinct()
                .map(a -> a.toLowerCase())
                .collect(Collectors.toList());

        // 🔹 3. Agrupa los nombres por la última letra
        // 💡 Resultado esperado: Map<Character, List<String>> con clave como última letra
        Function<String, Character> e2 = a -> {
            int last = a.length()-1;
            return a.charAt(last);
        };
        Map<Character, List<String>> f3 = nombres.stream()
                .collect(Collectors.groupingBy(e2));


        // 🔹 4. Crea un Map<String, Integer> con el nombre y su longitud, sin duplicados
        // 💡 Resultado esperado: {"Ana"=3, "Pedro"=5, ...}
        Map<String, Integer> f4 = nombres.stream()
                .distinct()
                .collect(Collectors.toMap(a -> a, a-> a.length()));

        System.out.println(f4);
        // 🔹 5. ¿Cuántos nombres únicos comienzan con vocal? (USE AYUDA)
        // 💡 Resultado esperado: número entero
        int f5 =(int) nombres.stream()
                .distinct()
                .filter(a -> "aeiou".indexOf(Character.toLowerCase(a.charAt(0))) >= 0)
                .count();

        // 🔹 6. Obtén una lista con los nombres únicos, en mayúsculas, ordenados alfabéticamente, que tengan más de 4 letras
        // 💡 Resultado esperado: lista de nombres
        List<String> f6 = nombres.stream()
                .distinct()
                .filter(a -> a.length() > 4)
                .map(a -> a.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
    }
}
