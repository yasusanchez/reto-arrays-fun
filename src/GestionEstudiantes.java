public class GestionEstudiantes {
    public static void main(String[] args) {
        // Definimos los datos de los estudiantes
        String[] estudiantes = {"Ana", "Carlos", "Sofía", "David", "Elena"};
        String[] materias = {"Matemáticas", "Física", "Química", "Literatura", "Historia"};
        double[][] notas = {
                {8.5, 7.0, 9.0, 8.0, 7.5},  // Notas de Ana
                {7.0, 6.5, 8.0, 9.0, 8.5},  // Notas de Carlos
                {9.5, 9.0, 9.5, 8.5, 9.0},  // Notas de Sofía
                {6.0, 7.0, 7.5, 8.0, 7.0},  // Notas de David
                {8.0, 8.5, 7.5, 9.0, 8.5}   // Notas de Elena
        };

        // Informacion de los estudiantes
        mostrarInformacionEstudiantes(estudiantes, materias, notas);

        // Promedios de cada estudiante
        calcularPromedios(estudiantes, notas);

        // Encontramos al estudiante con el promedio mas alto
        encontrarMejorEstudiante(estudiantes, notas);

        // Materia con el promedio mas alto
        encontrarMejorMateria(materias, notas);
    }

    public static void mostrarInformacionEstudiantes(String[] estudiantes, String[] materias, double[][] notas) {
        System.out.println("Información de los estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.print(estudiantes[i] + ": ");
            for (int j = 0; j < materias.length; j++) {
                System.out.print(materias[j] + " - " + notas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void calcularPromedios(String[] estudiantes, double[][] notas) {
        System.out.println("\nPromedios de los estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            double suma = 0;
            for (double nota : notas[i]) {
                suma += nota;
            }
            double promedio = suma / notas[i].length;
            System.out.println(estudiantes[i] + ": " + promedio);
        }
    }

    public static void encontrarMejorEstudiante(String[] estudiantes, double[][] notas) {
        int indiceMejorEstudiante = 0;
        double mayorPromedio = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < estudiantes.length; i++) {
            double suma = 0;
            for (double nota : notas[i]) {
                suma += nota;
            }
            double promedio = suma / notas[i].length;
            if (promedio > mayorPromedio) {
                mayorPromedio = promedio;
                indiceMejorEstudiante = i;
            }
        }

        System.out.println("\nEl estudiante con el promedio más alto es: " + estudiantes[indiceMejorEstudiante] + " con un promedio de " + mayorPromedio);
    }

    public static void encontrarMejorMateria(String[] materias, double[][] notas) {
        int indiceMejorMateria = 0;
        double mayorPromedio = Double.NEGATIVE_INFINITY;
        int numMaterias = materias.length;

        for (int j = 0; j < numMaterias; j++) {
            double suma = 0;
            for (int i = 0; i < notas.length; i++) {
                suma += notas[i][j];
            }
            double promedio = suma / notas.length;
            if (promedio > mayorPromedio) {
                mayorPromedio = promedio;
                indiceMejorMateria = j;
            }
        }

        System.out.println("\nLa materia con el promedio más alto es: " + materias[indiceMejorMateria] + " con un promedio de " + mayorPromedio);
    }
}
