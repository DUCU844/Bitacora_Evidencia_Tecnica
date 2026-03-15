package dosw.bitacora.corte2.semana1.model;

import java.util.List;

public class Student {
    String id;
    String name;
    String team; // "DORADO", "AZUL", "VERDE"
    List<Grade> grades;

    public Student(String id, String name, String team, List<Grade> grades) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.grades = grades;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", grades=" + grades +
                '}';
    }
}
