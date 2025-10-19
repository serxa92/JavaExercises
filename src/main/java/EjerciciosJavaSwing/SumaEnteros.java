package EjerciciosJavaSwing;


import javax.swing.*;
import java.awt.*;

//Extiende de JFrame para que la clase pueda crear instancias con los componentes
public class SumaEnteros extends JFrame {
    //VARIABLES
    private JTextField campo1, campo2;
    private JLabel suma, resultado;
    private JButton botonSumar;

    public SumaEnteros() {

        //VENTANA
        setTitle("Sumador de enteros");
        setSize(400, 100);
        setLayout(new FlowLayout());

        //CAJAS DE TEXTO Y ETIQUETAS
        campo1 = new JTextField(4);
        campo2 = new JTextField(4);
        suma = new JLabel("+");
        resultado = new JLabel(" =  ");

        //CREAMOS BOTÓN Y ASIGNAMOS ACCIÓN
        botonSumar = new JButton("Sumar");
        botonSumar.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(campo1.getText());
                int num2 = Integer.parseInt(campo2.getText());
                resultado.setText(" =  " + (num1 + num2));

            } catch (NumberFormatException ex) {
                //MENSAJE DE ERROR
                JOptionPane.showMessageDialog(null, "Debes ingresar un número entero."
                );

            }
        });
        //AÑADIR COMPONENTES A LA VENTANA
        add(botonSumar);
        add(campo1);
        add(suma);
        add(campo2);
        add(resultado);

        //MOSTRAMOS JFRAME Y CONFIGURAMOS CIERRE
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//function

    public static void main(String[] args) {
        new SumaEnteros();
    }//main

}//class
