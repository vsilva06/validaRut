import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {
    static  int s;

    public static void main(String[] args) {


        ingresarRut();
    }

    public static void ingresarRut() {
        var tec = new Scanner(System.in);
        var valido = false;
        do {
            System.out.println("Ingresar rut");
            String rut = tec.next();
            valido = validarRut(rut);
            if (valido) {
                System.out.println("Rut valido");
            } else {
                System.out.println("Rut invalido");
            }

        } while (valido == false);
    }


    public static String eliminarelementos(String rut) {

        rut = rut.toUpperCase();
        rut = rut.replace(".", "");
        rut = rut.replace("-", "");

        return rut;

    }

    public static boolean validarRut(String rut) {
        rut = eliminarelementos(rut);
        s = 1;
        s = modulo11(s, rut);
        return numeroverificador(s, rut);

    }

    public static boolean numeroverificador(int s, String rut) {
        char dv = rut.charAt(rut.length() - 1);
        try {
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                return true;
            }
        } catch (Exception e) {
            System.err.println("");
        }
        return false;
    }

    public static int modulo11(int s, String rut) {
        try {
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));
            int m = 0;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
        } catch (NumberFormatException e) {
            System.err.println("Formato incorrecto");

        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("");
        }
        return s;
    }


}

