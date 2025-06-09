package practica;

import java.util.List;

public class Dia4 {
    public static void main(String[] args) {
        List<String> nombres = List.of(
                "Ana", "Pedro", "Carlos", "Lucía", "Ana", "Miguel", "Carla", "Juan", "María", "Luis", "Lucía"
        );

        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // ✅ 1. Mostrar nombres que terminan en vocal
        // 💡 Resultado esperado: nombres que terminan en vocal (a, e, i, o, u)

        // ✅ 2. Mostrar longitud de cada nombre
        // 💡 Resultado esperado: lista de números con la longitud de cada nombre

        // ✅ 3. Contar cuántos nombres empiezan por M
        // 💡 Resultado esperado: número total de nombres que comienzan con "M"

        // ✅ 4. Transformar nombre a "Inicial - Longitud"
        // 💡 Resultado esperado: por ejemplo, "A-3", "P-5", etc.

        // ✅ 5. Mostrar nombres con más de 4 letras en mayúsculas
        // 💡 Resultado esperado: lista en mayúsculas de nombres con más de 4 letras

        // ✅ 6. Sumar todos los números pares
        // 💡 Resultado esperado: suma de los números pares

        // ✅ 7. Agrupar nombres por su primera letra
        // 💡 Resultado esperado: mapa con clave como inicial y valor lista de nombres

        // ✅ 8. Agrupar números en pares e impares
        // 💡 Resultado esperado: mapa con clave true/false y listas de números

        // ✅ 9. Sumar todos los caracteres de los nombres únicos
        // 💡 Resultado esperado: suma de la longitud de los nombres sin duplicados

        // ✅ 10. Agrupar nombres por longitud
        // 💡 Resultado esperado: mapa donde la clave es longitud y el valor es lista de nombres
    }
}
