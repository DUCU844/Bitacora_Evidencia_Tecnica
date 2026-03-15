package dosw.bitacora.corte2.semana1.service;

import dosw.bitacora.corte2.semana1.model.Grade;
import dosw.bitacora.corte2.semana1.model.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AcademicPerformance {

    private static final String TEAM_DORADO = "DORADO";

    //Obtener todos los estudiantes del equipo DORADO -> Retornar una lista de estudiantes cuyo team sea DORADO

    public List<Student> getStudentsFromTeamDorado(List<Student> students) {
        return students.stream()
                .filter(s -> TEAM_DORADO.equals(s.getTeam()))
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
    public Map<String, Double> averageForStudent(Student students) {
        return  students.getGrades()
                .stream()
                .collect(Collectors.groupingBy(
                        Grade::getSubject,
                        Collectors.averagingDouble(Grade::getScore)
                ));

    }

    //Retornar el estudiante cuyo promedio general sea el mas alto del curso
    public Student getTopStudent(List<Student> students) {

        return students.stream()
                .max((s1, s2) -> Double.compare(
                        getStudentAverage(s1),
                        getStudentAverage(s2)))
                .orElse(null);
    }
    private double getStudentAverage(Student student) {

        return student.getGrades()
                .stream()
                .mapToDouble(Grade::getScore)
                .average()
                .orElse(0.0);
    }




}
