package Ejercicio_12;

import java.util.Scanner;

public class main_Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el numero de horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese el valor recibido por una hora normal de trabajo: ");
        double valorHoraNormal = scanner.nextDouble();

        Salario salario = new Salario(nombre, horasTrabajadas, valorHoraNormal);
        double salarioDevengado = salario.calcularSalario();

        System.out.println("\nEl trabajador " + salario.getNombre() + " devengo: $" + salarioDevengado);
    }
}
