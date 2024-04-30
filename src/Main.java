import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello primeros pasos en java!");

        System.out.println("Pelicula Matrix");
        //Declaraccion de las variables

        int fechaLanzamiento = 1999;
        double evaluacion = 4.0;
        boolean IncluidoEnPlanBasico = true;
        String nombre ="Matrix";
        String sinopsis = """
                Matriz nominda  a mejor pelicula del año 2024
                """;
        // Saludos de echale Ganas Pronto seras Un programador

        double mediaEvaluacionUsuario = 0;


        System.out.println("Pelicula:" + nombre);
        System.out.println("Fecha:" + fechaLanzamiento);
        System.out.println("puntuacion:" + +evaluacion);
        System.out.println("Plan Basico:" +IncluidoEnPlanBasico);

        double mediaEvaluacion =  (3.5 +5.0 +4.5 + 3.0 + 4.2 )/ 5;
        System.out.println("Media de la evaluacion de matrix:" + mediaEvaluacion);

        if (fechaLanzamiento < 2023){
            System.out.println("Pelicula popular en el momento");
        }else {
            System.out.println("Pelicula que vale la pena ver");
        }
        for (int i = 0; i < 5; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la puntacion a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula " +
                "Matrix calculada por el usuario es:"+ mediaEvaluacionUsuario /5);
        }
    }