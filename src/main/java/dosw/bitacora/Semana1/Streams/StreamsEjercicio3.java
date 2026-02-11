package dosw.bitacora.Semana1.Streams;

import java.util.List;

public class StreamsEjercicio3 {

    List<Usuario> usuarios = List.of(
            new Usuario(1, "Adrian", 25, true),
            new Usuario(2, "Ana", 17, false),
            new Usuario(3, "Victoria", 30, true),
            new Usuario(4, "David", 22, false),
            new Usuario(5, "Santiago", 28, true)
    );

    public List<String> UsuariosActivos(){
        return usuarios.stream()
                .filter(Usuario::isActive)
                .map(Usuario::getName)
                .map(String::toUpperCase)
                .sorted()
                .toList();
    }

    public List<String> UsuariosMayoresDeEdad(){
        return usuarios.stream()
                .filter(usr -> usr.getAge() >= 18)
                .map(Usuario::getName)
                .map(String::toUpperCase)
                .sorted()
                .toList();
    }
}
