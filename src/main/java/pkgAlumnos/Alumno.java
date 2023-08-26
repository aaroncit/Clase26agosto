package pkgAlumnos;

import java.util.ArrayList;

public class Alumnos {

    public class CursoAsignado {

        public class Alumno {
            private String carnet;

            public String nombre;

            public String telefono;

            public String direccion;

            private ArrayList<Alumnos.CursoAsignado> Cursoasignados;

            public Alumno(String carnet, String nombre, String telefono, String direccion) {

                this.nombre = nombre;
                this.carnet = carnet;
                this.telefono = telefono;
                this.direccion = direccion;
                this.Cursoasignados = new ArrayList<>();

            }

            public void agregarCursoAsignado(Alumnos.CursoAsignado curso) {
                CursoAsignado.add(curso);

            }

            @Override
            public String toString() {
                return "Carnet:" + this.carnet + "Nombre:" + this.nombre + "Direccion:" + this.direccion;
            }

            public void mostrarInformacion() {
                System.out.println("nombre: " + nombre);
                System.out.println("Curso Asignados:");
                for (Alumnos.CursoAsignado curso :);
            }
        }

    }
}
