package Service.Impl;

import Model.UsuarioVO;

public interface UsuarioServiceImpl {

    public boolean conectado(UsuarioVO user);
    public boolean desconectar();
    public void alta(UsuarioVO user);
    public void baja(UsuarioVO user);
    public void modificar(UsuarioVO user, UsuarioVO user1);
    public void mostrar();
}
