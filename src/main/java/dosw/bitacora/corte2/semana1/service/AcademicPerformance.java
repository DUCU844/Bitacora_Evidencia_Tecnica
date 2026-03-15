package dosw.bitacora.corte2.semana1.service;

import dosw.bitacora.corte2.semana1.model.Grade;
import dosw.bitacora.corte2.semana1.model.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;

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

    //Retornar las materias reprobadas por equipo -> Retornar Map <String, Long>
    // donde la clave es el nombre del equipo y el valor la cantidad total de materias reprobadas
    public Map<String, Long> getFailedSubjectsByTeam(List<Student> students) {

        return students.stream()
                .collect(Collectors.groupingBy(
                        Student::getTeam,
                        Collectors.flatMapping(
                                s -> s.getGrades().stream(),
                                Collectors.filtering(
                                        g -> !g.isPassed(),
                                        Collectors.counting()
                                )
                        )
                ));
    }

    //Top 3 estudiantes con mas materias aprobadas -> Retornar lista ordenada de manera descendente
    public List<Student> getTop3StudentsWithMostApproved(List<Student> students) {

        return students.stream()
                .sorted((s1, s2) -> Long.compare(
                        countApproved(s2),
                        countApproved(s1)
                ))
                .limit(3)
                .toList();
    }

    private long countApproved(Student student) {

        return student.getGrades()
                .stream()
                .filter(Grade::isPassed)
                .count();
    }

    //Agrupar estudiantes por estado academico: Clasificarlos por ALTO RENDIMIENTO -> Promedio >=4,5 ,
    // REGULAR -> Promedio entre 3,5 y 4.49, RIESGO -> promedio < 3,5
    public Map<String, List<Student>> groupByAcademicStatus(List<Student> students) {

        return students.stream()
                .collect(Collectors.groupingBy(student -> {

                    double avg = getStudentAverage(student);

                    if (avg >= 4.5) return "ALTO RENDIMIENTO";
                    if (avg >= 3.5) return "REGULAR";
                    return "RIESGO";
                }));
    }

    //Obtener la materia con más reprobaciones
    public String getSubjectWithMostFailures(List<Student> students) {

        return students.stream()
                .flatMap(s -> s.getGrades().stream())
                .filter(g -> !g.isPassed())
                .collect(Collectors.groupingBy(
                        Grade::getSubject,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    //Tome solo estudiantes del equipo DORADO, Obtenga todas sus notas,
    // Filtre solo notas aprobadas,Agrupe por materia, Calcule promedio por materia,
    // Ordene descendente por promedio, Retorne un LinkedHashMap preservando orden.
    public Map<String, Double> doradoApprovedAverageBySubject(List<Student> students) {

        return students.stream()
                .filter(s -> "DORADO".equals(s.getTeam()))
                .flatMap(s -> s.getGrades().stream())
                .filter(Grade::isPassed)
                .collect(Collectors.groupingBy(
                        Grade::getSubject,
                        Collectors.averagingDouble(Grade::getScore)
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a,b)->a,
                        LinkedHashMap::new
                ));
    }
}
