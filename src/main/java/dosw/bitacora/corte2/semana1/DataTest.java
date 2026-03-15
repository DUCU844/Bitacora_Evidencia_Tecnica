package dosw.bitacora.corte2.semana1;

import dosw.bitacora.corte2.semana1.model.Grade;
import dosw.bitacora.corte2.semana1.model.Student;

import java.time.LocalDate;
import java.util.List;

public class DataTest {

    public static List<Student> getStudents(){

        Student s1 = new Student(
                "1",
                "Ana",
                "DORADO",
                List.of(
                        new Grade("BD",4.5, LocalDate.now(),true),
                        new Grade("REDES",3.0, LocalDate.now(),false),
                        new Grade("DORADO",4.8, LocalDate.now(),true)
                )
        );

        Student s2 = new Student(
                "2",
                "Carlos",
                "AZUL",
                List.of(
                        new Grade("BD",4.0, LocalDate.now(),true),
                        new Grade("REDES",4.2, LocalDate.now(),true),
                        new Grade("DORADO",3.5, LocalDate.now(),true)
                )
        );

        Student s3 = new Student(
                "3",
                "Luis",
                "VERDE",
                List.of(
                        new Grade("BD",2.9, LocalDate.now(),false),
                        new Grade("REDES",3.6, LocalDate.now(),true)
                )
        );

        return List.of(s1,s2,s3);
    }
}
