package practica;

import java.util.*;
import java.util.stream.Collectors;

public class Dia1_2_3 {
    public static void main(String[] args) {
        List<String> nombres = List.of(
                "Ana", "Pedro", "Carlos", "Lucía", "Ana", "Miguel", "Carla", "Juan", "María", "Luis", "Lucía"
        );

        // 🔹 1. ["Pedro", "Carlos", "Lucía", "Miguel", "Carla", "María"]
        // 💡 Filtra los nombres que tienen más de 4 letras
        List<String> f1 = nombres.stream()
                .filter(a -> a.length() > 4)
                .toList();


        // 🔹 2. ["ANA", "PEDRO", "CARLOS", "LUCÍA", "ANA", "MIGUEL", "CARLA", "JUAN", "MARÍA", "LUIS", "LUCÍA"]
        // 💡 Convierte todos los nombres a mayúsculas
        List<String> f2 = nombres.stream()
                .map(a -> a.toUpperCase())
                .toList();


        // 🔹 3. ["Ana", "Pedro", "Carlos", "Lucía", "Miguel", "Carla", "Juan", "María", "Luis"]
        // 💡 Elimina los nombres repetidos
        List<String> f3 = nombres.stream()
                .distinct()
                .toList();


        // 🔹 4. ["Ana", "Ana", "Carla", "Carlos", "Juan", "Lucía", "Lucía", "Luis", "María", "Miguel", "Pedro"]
        // 💡 Ordena alfabéticamente los nombres
        List<String> f4 = nombres.stream()
                .sorted()
                .toList();

        // 🔹 5. ["Carlos", "Carla"]
        // 💡 Muestra solo los nombres que empiezan por "C"
        List<String> f5 = nombres.stream()
                .filter(a -> a.charAt(0) == 'C')
                .toList();


        // 🔹 6. 11
        // 💡 Cuenta cuántos nombres hay en total
        int f6 = (int) nombres.stream().count();

        // 🔹 7. true
        // 💡 ¿Hay algún nombre que tenga exactamente 5 letras?
        boolean f7 = nombres.stream()
                .anyMatch(a -> a.length() == 5);

        // 🔹 8. true
        // 💡 ¿Todos los nombres tienen más de 2 letras?
        boolean f8 = nombres.stream()
                .allMatch(a -> a.length() > 2);

        // 🔹 9. Ana
        // 💡 Muestra el primer nombre de la lista (si existe)
        String f9 = nombres.stream().findFirst().get();

        // 🔹 10. ["Ana", "Pedro", "Carlos"]
        // 💡 Devuelve una lista con los 3 primeros nombres sin repetir
        List<String> f10 = nombres.stream()
                .distinct()
                .limit(3)
                .collect(Collectors.toList());

        // 🔹 11. ["Ana", "Lucía"]
        // 💡 Muestra los nombres duplicados (los que aparecen más de una vez)
        List<String> f11 = nombres.stream()
                .collect(Collectors.groupingBy(nombre->nombre, Collectors.counting()))
                .entrySet().stream()
                .filter(e->e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        // 🔹 12. ["anA", "ordeP", ...]
        // 💡 Muestra los nombres con letras invertidas
        List<String> f12 = nombres.stream()
                        .map(a -> new StringBuilder(a).reverse().toString())
                                .collect(Collectors.toList());

        // 🔹 13. {3=[Ana], 4=[Juan, Luis], 5=[Pedro, Lucía, Carla, María], 6=[Carlos, Miguel]}
        // 💡 Agrupa los nombres por longitud
        Map<Integer, List<String>> f13 = nombres.stream()
                        .collect(Collectors.groupingBy(a-> a.length()));

        // 🔹 14. "Ana,Pedro,Carlos,Lucía,Ana,Miguel,Carla,Juan,María,Luis,Lucía"
        // 💡 Convierte la lista a una sola cadena separada por comas
        String f14 = nombres.stream()
                        .collect(Collectors.joining(","));

        // 🔹 15. "Miguel"
        // 💡 Muestra el nombre más largo de la lista
        Optional<String> f15 = nombres.stream()
                        .max(Comparator.comparingInt(String::length));

        // 🔹 16. ["ANA", "CARLA", "CARLOS", "JUAN", "LUCÍA", "LUIS", "MARÍA", "MIGUEL", "PEDRO"]
        // 💡 Muestra todos los nombres sin repetir, en mayúsculas y ordenados
        Set<String> f16 = nombres.stream()
                .map(a-> a.toUpperCase())
                .sorted()
                .collect(Collectors.toSet());


        // 🔹 17. ["Ana", "Juan", "Luis", "Lucía", "Carla"]
        // 💡 Muestra los 5 nombres más cortos, sin duplicados
        List<String> f17 = nombres.stream()
                    .distinct()
                .sorted(Comparator.comparingInt(String::length))
                    .limit(5).collect(Collectors.toList());


        // 🔹 18. ["Lucía", "Miguel", "María", "Luis"]
        // 💡 Devuelve los nombres que contienen la letra "i"
        List<String> f18 = nombres.stream()
                .distinct()
                .filter(a -> a.contains("i"))
                .collect(Collectors.toList());


        // 🔹 19. [3, 5, 6, 5, 3, 6, 5, 4, 5, 4, 5]
        // 💡 Devuelve una lista con la longitud de cada nombre
        List<Integer> f19 = nombres.stream()
                .map(a -> a.length())
                        .collect(Collectors.toList());

        // 🔹 20. 5.0
        // 💡 Calcula la longitud promedio de los nombres únicos
        double f20 = nombres.stream()
                .distinct()
                .mapToInt(String::length)
                .average()
                .orElse(0);
        System.out.println(f20);
    }
}
