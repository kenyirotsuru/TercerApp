/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema.tercerapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sistema.tercerapp.dao.PacienteDao;
import sistema.tercerapp.model.Pacientes;

/**
 *
 * @author Francisco
 */
@Service("pacientesService")
@Transactional
public class PacientesServiceImpl implements PacientesService{

   @Autowired
    private PacienteDao dao;

    @Override
    public Pacientes findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void savePacientes(Pacientes pa) {
         dao.save(pa);
    }

    @Override
    public void updatePacientes(Pacientes pa) {
        Pacientes entity = dao.findById(pa.getId());
        if(entity!=null){
            
             //actualizar formulario
        }            
    }

    @Override
    public void deletePacientes(int id) {
        dao.delete(id);
    }

    @Override
    public List<Pacientes> findAllPacientes() {
        return dao.findAll();
    }
    
}
