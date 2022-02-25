package algoritmia2253486;

import javax.swing.JOptionPane;

public class siLibreFF {

    public static void main(String[] args) {
        //Definimos la variable dato que almacena el dato ingresado por el JOptionPane.showInputDialog
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero del 1 al 9 para saber la habilidad activa de un personaje de FREE FIRE"));
        // por medio del switch al ingresar un numero se mostrara un mensaje correspondiente al numero 
        switch (dato) {

            case 1:
                JOptionPane.showMessageDialog(null, "Wukong: Se convierte en un arbusto esta habilidad se quita al atacar pero se reinicia al eliminar a un enemigo. Precio: 499 diamantes");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "A124: Puede convertir 60 puntos de energia en vida en 4 segundo se reinicia en 10 segundos. Precio: 499 diamantes");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Steffie: Crea un graffiti que aumenta la defensa de daño. Precio: 499 diamantes");
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Alok: Crea una aura de 5 metros que aumenta la velocidad de movimiento en 15% y cura 5 puntos de vida cada 5 segundos. Precio: 599 diamantes");
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "Clu: Revela por unos pocos segundos a cualquier enemigo que esté de pie y se encuentre dentro del radio de 30 y 50 metros según el nivel. Precio: 499 diamantes");
                break;

            case 6:
                JOptionPane.showMessageDialog(null, "K: los PE(puntos de energía) aumentan en 50. Al activar el Modo Jiu-jitsu, los aliados dentro de un radio de 6m convierten PE en vida con mayor rapidez. Al activar el Modo Psicología, K recupera PE lentamente. Precio: 599 diamantes");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Chrono: Crea un campo de fuerza durante 8 segundos que bloquea 600 puntos de daño enemigos. Aumenta también la velocidad de movimiento en 15%. Precio: 599 diamantes");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Skyler: Libera una onda sonica hacia denlante que destruye hasta 5 paredes gloo y por cada pared gloo dañada aumenta la recuperacion de vida. Precio: No disponible");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Xayne: Obtiene 80 PV (puntos de vida) y hace 40% mas de daño a paredes gloo y escudos. Precio: No disponible");
                break;
            // Cuando se escriba un numero que pase el 9 se mostrara ese mensaje
            default:
                JOptionPane.showMessageDialog(null, "Alto ay crack por ahora no hay mas personajes con habilidades activas.PVP o miedo");
        }
    }

}
