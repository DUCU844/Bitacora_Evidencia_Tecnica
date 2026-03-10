package dosw.bitacora.corte2.semana1;

import java.util.List;

public class FuntionForStudents {

    public static List<Student> getStudentsFromTeamDorado(List<Student> students) {
        return students.stream()
                .filter(s -> "DORADO".equals(s.getTeam()))
                .toList();
    }

    public static List<String> getStudentsNameOrderAlphabetic(List<Student> students) {
        return students.stream()
                .map(Student::getName)
                .sorted()
                .toList();
    }
}
