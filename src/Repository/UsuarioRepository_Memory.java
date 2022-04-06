package Repository;

import Model.UsuarioVO;
import Repository.Impl.UsuarioRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository_Memory implements UsuarioRepositoryImpl {

    public List<UsuarioVO> usuarios = new ArrayList<UsuarioVO>();

    public List<UsuarioVO> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<UsuarioVO> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public boolean conectado(UsuarioVO user) {
        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getContraseña().equals(user.getContraseña()) && usuarios.get(i).getNombre().equals(user.getNombre())){
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean desconectar() {
        return false;
    }

    @Override
    public void alta(UsuarioVO user) {
        usuarios.add(user);
    }

    @Override
    public void baja(UsuarioVO user) {
        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getContraseña().equals(user.getContraseña()) && usuarios.get(i).getNombre().equals(user.getNombre())){
               usuarios.remove(i);
            }
        }
    }

    @Override
    public void modificar(UsuarioVO user, UsuarioVO user1) {
        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getContraseña().equals(user1.getContraseña()) && usuarios.get(i).getNombre().equals(user1.getNombre())){
                usuarios.remove(i);
            }
        }
        usuarios.add(user);
    }

    @Override
    public void mostrar() {
        System.out.println(usuarios.size());
        for(int i=0;i<usuarios.size();i++){
            System.out.println(usuarios.get(i));
        }
    }
}
