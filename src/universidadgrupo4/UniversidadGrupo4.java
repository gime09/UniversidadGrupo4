
package universidadgrupo4;

import java.sql.Connection;
import java.time.LocalDate;
import universidadgrupo4.accesoADatos_persistencia_.AlumnoData;
import universidadgrupo4.accesoADatos_persistencia_.Conexion;
import universidadgrupo4.entidades_logica_.Alumno;

public class UniversidadGrupo4 {

    public static void main(String[] args) {

        Connection con = Conexion.getConexion();

        // Alumno juan=new Alumno(1,12312312,"Luna","Juan Pedro",LocalDate.of(1980, 4, 25),true);
       // AlumnoData alu = new AlumnoData();
        //alu.guardarAlumno(juan);
        // alu.modificarAlumno(juan);
        //alu.eliminarAlumno(1);
      /*  Alumno alumnoEncontrado = alu.buscarAlumno(13);
        if (alumnoEncontrado != null) {

            System.out.println("dni" + alumnoEncontrado.getDni());
            System.out.println("apellido" + alumnoEncontrado.getApellido());
        }*/
        
        
        // Alumno alumnoEncontrado = alu.buscarAlumnoPorDni(12312312);
       //if (alumnoEncontrado != null) {

          //  System.out.println("dni" + alumnoEncontrado.getDni());
          //  System.out.println("apellido" + alumnoEncontrado.getApellido());
       // }
        
         
       AlumnoData alu=new AlumnoData();
       
       for(Alumno alumno:alu.listarAlumnos()){
           
           System.out.println(alumno.getDni());
           System.out.println(alumno.getApellido());
           System.out.println(alumno.getNombre());
           System.out.println(alumno.getFechaNac());
           
       }
       
       
    }
}
