package dosw.bitacora.corte2.semana1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AcademicPerformance {

    //Obtener todos los estudiantes del equipo DORADO -> Retornar una lista de estudiantes cuyo team sea DORADO
    public List<Student> getStudentsFromTeamDorado(List<Student> students) {
        return students.stream()
                .filter(s -> "DORADO".equals(s.getTeam()))
                .toList();
    }

    //Obtener todos los nombres de estudiantes ordenados Alfabeticamente
    public List<String> getStudentsNameOrderAlphabetic(List<Student> students) {
        return students.stream()
                .map(Student::getName)
                .sorted()
                .toList();
    }

    //Calcular el promedio general de todos los score existentes en el sistema
    public double getAverageGeneral(List<Student> students) {
        return students.stream()
                .flatMap(student -> student.getGrades().stream())
                .mapToDouble(Grade::getScore)
                .average()
                .orElse(0.0);
    }

    //Retornar por estudiante el promedio por materia -> Retornar un Map<String, Double> donde la clave es la materia
    // y el valor el promedio
    public Map<String, Double> averageForStudent(List<Student> students) {
        return  students.stream()
                .flatMap(student -> student.getGrades().stream())
                .collect(Collectors.groupingBy(
                        Grade::getSubject,
                        Collectors.averagingDouble(Grade::getScore)
                ));

    }

}
