package logica;

import com.mysql.cj.PerConnectionLRUFactory;
import java.util.List;
import persistencia.ControladoraPersistencia;
import logica.Persona;
public class Controladora {
    ControladoraPersistencia  controlPersi = new ControladoraPersistencia();
    
    
    public void crearPersona(Persona per){
        controlPersi.CrearPersona(per);
    }
    public void eliminarPerosna(int id){
        controlPersi.eliminarPer(id);
    }
     public void eliminarPerosna(Persona per){
        controlPersi.eliminarPer(per);
    }
    public List<Persona> traerPersona(){
        return controlPersi.TraerPer();
    }
  }
