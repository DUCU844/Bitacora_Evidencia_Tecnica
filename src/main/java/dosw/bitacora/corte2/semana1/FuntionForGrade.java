package dosw.bitacora.corte2.semana1;

import java.util.*;
import java.util.stream.*;

public class FuntionForGrade {

    public double getAverageGeneral(List<Student> students) {
        return students.stream()
                .flatMap(student -> student.getGrades().stream())
                .mapToDouble(Grade::getScore)
                .average()
                .orElse(0.0);
    }



}
