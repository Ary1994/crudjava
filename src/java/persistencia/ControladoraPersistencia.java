
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Persona;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    PersonaJpaController persJPA=new PersonaJpaController();
    
    public void CrearPersona(Persona per){
        persJPA.create(per);
    }
    public void eliminarPer(int id){
        try {
            persJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void eliminarPer(Persona per){
        try {
            persJPA.destroy(per.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List<Persona> TraerPer(){
        return persJPA.findPersonaEntities();
    }
}
