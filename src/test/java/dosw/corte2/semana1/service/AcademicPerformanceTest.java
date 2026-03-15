package dosw.corte2.semana1.service;

import dosw.bitacora.corte2.semana1.model.Grade;
import dosw.bitacora.corte2.semana1.model.Student;
import dosw.bitacora.corte2.semana1.service.AcademicPerformance;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AcademicPerformanceTest {

    private final AcademicPerformance service = new AcademicPerformance();

    private List<Student> createStudents(){

        Student s1 = new Student(
                "1",
                "Ana",
                "DORADO",
                List.of(
                        new Grade("BD",4.5, LocalDate.now(),true),
                        new Grade("REDES",3.0, LocalDate.now(),false)
                )
        );

        Student s2 = new Student(
                "2",
                "Carlos",
                "AZUL",
                List.of(
                        new Grade("BD",4.0, LocalDate.now(),true),
                        new Grade("REDES",4.2, LocalDate.now(),true)
                )
        );

        return List.of(s1,s2);
    }

    @Test
    void shouldReturnOnlyDoradoStudents(){

        List<Student> students = createStudents();

        List<Student> result = service.getStudentsFromTeamDorado(students);

        assertEquals(1,result.size());
        assertEquals("DORADO",result.get(0).getTeam());
    }

    @Test
    void shouldReturnNamesAlphabetically(){

        List<Student> students = createStudents();

        List<String> result = service.getStudentsNameOrderAlphabetic(students);

        assertEquals("Ana", result.get(0));
        assertEquals("Carlos", result.get(1));
    }

    @Test
    void shouldCalculateGeneralAverage(){

        List<Student> students = createStudents();

        double avg = service.getAverageGeneral(students);

        assertTrue(avg > 0);
    }

    @Test
    void shouldCalculateAverageBySubject(){

        Student student = createStudents().get(0);

        Map<String,Double> result = service.averageForStudent(student);

        assertTrue(result.containsKey("BD"));
        assertTrue(result.containsKey("REDES"));
    }

}