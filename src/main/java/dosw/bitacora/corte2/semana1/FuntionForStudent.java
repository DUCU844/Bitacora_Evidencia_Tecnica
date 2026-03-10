package dosw.bitacora.corte2.semana1;

import java.util.List;

public class FuntionForStudent {

    public List<Student> getStudentsFromTeamDorado(List<Student> students) {
        return students.stream()
                .filter(s -> "DORADO".equals(s.getTeam()))
                .toList();
    }

    public List<String> getStudentsNameOrderAlphabetic(List<Student> students) {
        return students.stream()
                .map(Student::getName)
                .sorted()
                .toList();
    }
}
