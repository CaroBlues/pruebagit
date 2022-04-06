import Model.UsuarioVO;
import Service.Impl.UsuarioServiceImpl;
import Service.UsuarioService;

import java.util.Scanner;

public class PruebaServicio {

    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {

        UsuarioServiceImpl usuarioService = new UsuarioService();
        int opc=0;
        int opc2=0;
        do {
            menu();
            opc=s.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Dime el nombre");
                    String nombre=s.next();
                    System.out.println("Dime la contraseña");
                    String contraseña=s.next();

                    UsuarioVO user=new UsuarioVO(nombre,contraseña);
                    if(usuarioService.conectado(user)){
                        System.out.println("Ese usuario ya existe");
                    }else{
                        usuarioService.mostrar();
                        usuarioService.alta(user);
                        System.out.println("Bienvenido "+nombre);
                        do {
                            menu2();
                            opc2=s.nextInt();
                            opc2=opciones(opc2,usuarioService,user);
                        }while (opc2!=0);
                    }
                    break;
                case 2:
                    System.out.println("Dime el nombre");
                    nombre=s.next();
                    System.out.println("Dime la contraseña");
                    contraseña=s.next();
                    UsuarioVO user2=new UsuarioVO(nombre,contraseña);

                    if(usuarioService.conectado(user2)){
                        usuarioService.mostrar();
                        System.out.println("Bienvenido "+nombre);
                        do {
                            menu2();
                            opc2=s.nextInt();
                            opc2=opciones(opc2,usuarioService,user2);
                        }while (opc2!=0);
                    }else {
                        System.out.println("Ese usuario no existe");
                    }
                    break;
                case 0:
                    System.out.println("Adios");
                    usuarioService.mostrar();
                    break;
                default:
                    System.out.println("Opcion equivocada, elija otra");
                    break;
            }
        }while (opc!=0);
    }

    public static void menu(){
        System.out.println("1)Alta \n" +
                "2)Sign in\n" +
                "0)Salir");
    }
    public static void menu2(){
        System.out.println("1)Baja \n" +
                "2)Modificar\n" +
                "0)Log out");
    }

    public static int opciones(int opc2, UsuarioServiceImpl usuarioService, UsuarioVO user){
        switch (opc2){
            case 1:
                usuarioService.baja(user);
                opc2=0;
                break;
            case 2:
                System.out.println("Dime el nombre");
                String nombre2=s.next();
                System.out.println("Dime la contraseña");
                String contraseña2=s.next();
                UsuarioVO user2=new UsuarioVO(nombre2,contraseña2);
                usuarioService.modificar(user2,user);
                user=user2;
                break;
            case 0:
                System.out.println("Adios");
                break;
            default:
                System.out.println("Opcion equivocada, elija otra");
                break;
        }
        return opc2;
    }
}
