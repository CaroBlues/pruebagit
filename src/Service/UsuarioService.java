package Service;

import Model.UsuarioVO;
import Repository.Impl.UsuarioRepositoryImpl;
import Repository.UsuarioRepository_Memory;
import Service.Impl.UsuarioServiceImpl;

public class UsuarioService implements UsuarioServiceImpl {

    private UsuarioRepositoryImpl usuarioRepository=new UsuarioRepository_Memory();

    @Override
    public boolean conectado(UsuarioVO user){
        return usuarioRepository.conectado(user);
    }

    @Override
    public boolean desconectar() {
        return usuarioRepository.desconectar();
    }

    @Override
    public void alta(UsuarioVO user) {
        usuarioRepository.alta(user);
    }

    @Override
    public void baja(UsuarioVO user) {
        usuarioRepository.baja(user);
    }

    @Override
    public void modificar(UsuarioVO user, UsuarioVO user1) {
        usuarioRepository.modificar(user,user1);
    }

    @Override
    public void mostrar() {
        usuarioRepository.mostrar();
    }


}
