package practica;

import java.util.List;

public class Dia1 {
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
        System.out.println(f6);

        // 🔹 7. true
        // 💡 ¿Hay algún nombre que tenga exactamente 5 letras?


        // 🔹 8. true
        // 💡 ¿Todos los nombres tienen más de 2 letras?


        // 🔹 9. Ana
        // 💡 Muestra el primer nombre de la lista (si existe)


        // 🔹 10. ["Ana", "Pedro", "Carlos"]
        // 💡 Devuelve una lista con los 3 primeros nombres sin repetir


        // 🔹 11. ["Ana", "Lucía"]
        // 💡 Muestra los nombres duplicados (los que aparecen más de una vez)


        // 🔹 12. ["anA", "ordeP", ...]
        // 💡 Muestra los nombres con letras invertidas


        // 🔹 13. {3=[Ana], 4=[Juan, Luis], 5=[Pedro, Lucía, Carla, María], 6=[Carlos, Miguel]}
        // 💡 Agrupa los nombres por longitud


        // 🔹 14. "Ana,Pedro,Carlos,Lucía,Ana,Miguel,Carla,Juan,María,Luis,Lucía"
        // 💡 Convierte la lista a una sola cadena separada por comas


        // 🔹 15. "Miguel"
        // 💡 Muestra el nombre más largo de la lista


        // 🔹 16. ["ANA", "CARLA", "CARLOS", "JUAN", "LUCÍA", "LUIS", "MARÍA", "MIGUEL", "PEDRO"]
        // 💡 Muestra todos los nombres sin repetir, en mayúsculas y ordenados


        // 🔹 17. ["Ana", "Juan", "Luis", "Lucía", "Carla"]
        // 💡 Muestra los 5 nombres más cortos, sin duplicados


        // 🔹 18. ["Lucía", "Miguel", "María", "Luis"]
        // 💡 Devuelve los nombres que contienen la letra "i"


        // 🔹 19. [3, 5, 6, 5, 3, 6, 5, 4, 5, 4, 5]
        // 💡 Devuelve una lista con la longitud de cada nombre


        // 🔹 20. 5.0
        // 💡 Calcula la longitud promedio de los nombres únicos

    }
}
