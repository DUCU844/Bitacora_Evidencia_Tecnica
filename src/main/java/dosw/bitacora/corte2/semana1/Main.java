package dosw.bitacora.corte2.semana1;

import dosw.bitacora.corte2.semana1.model.Student;
import dosw.bitacora.corte2.semana1.service.AcademicPerformance;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AcademicPerformance service = new AcademicPerformance();
        List<Student> students = DataTest.getStudents();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el ejercicio a ejecutar:");
        System.out.println("1 - Estudiantes equipo DORADO");
        System.out.println("2 - Nombres ordenados");
        System.out.println("3 - Promedio general");
        System.out.println("4 - Promedio por materia de un estudiante");
        System.out.println("5 - Estudiante con mayor promedio");
        System.out.println("6 - Materias reprobadas por equipo");
        System.out.println("7 - Top 3 estudiantes con más aprobadas");
        System.out.println("8 - Agrupar por estado académico");
        System.out.println("9 - Materia con más reprobaciones");
        System.out.println("10 - Promedio materias aprobadas equipo DORADO");

        int option = scanner.nextInt();

        switch (option){

            case 1 -> System.out.println(
                    service.getStudentsFromTeamDorado(students)
            );

            case 2 -> System.out.println(
                    service.getStudentsNameOrderAlphabetic(students)
            );

            case 3 -> System.out.println(
                    service.getAverageGeneral(students)
            );

            case 4 -> System.out.println(
                    service.averageForStudent(students.get(0))
            );

            case 5 -> System.out.println(
                    service.getTopStudent(students)
            );

            case 6 -> System.out.println(
                    service.getFailedSubjectsByTeam(students)
            );

            case 7 -> System.out.println(
                    service.getTop3StudentsWithMostApproved(students)
            );

            case 8 -> System.out.println(
                    service.groupByAcademicStatus(students)
            );

            case 9 -> System.out.println(
                    service.getSubjectWithMostFailures(students)
            );

            case 10 -> System.out.println(
                    service.doradoApprovedAverageBySubject(students)
            );

            default -> System.out.println("Opción inválida");
        }

    }
}