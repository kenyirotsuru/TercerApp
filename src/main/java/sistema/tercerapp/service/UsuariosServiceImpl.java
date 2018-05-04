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
import sistema.tercerapp.dao.UsuariosDao;
import sistema.tercerapp.model.Usuarios;

/**
 *
 * @author Francisco
 */
@Service("usuariosService")
@Transactional
public class UsuariosServiceImpl implements UsuariosService{
    
  @Autowired
    private UsuariosDao dao;

    @Override
    public Usuarios findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void saveUsuarios(Usuarios us) {
         dao.save(us);
    }

    @Override
    public void updateUsuarios(Usuarios us) {
    Usuarios entity = dao.findById(us.getId());
        if(entity!=null){
            
             //actualizar formulario
        }   
    }

    @Override
    public void deleteUsuarios(int id) {
        dao.delete(id);
    }

    @Override
    public List<Usuarios> findAllUsuarios() {
        return dao.findAll();
    }
    
}
