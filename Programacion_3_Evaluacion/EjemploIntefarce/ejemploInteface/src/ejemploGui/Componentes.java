package ejemploGui;

import java.awt.Color;
import javax.swing.*;

public class Componentes {

    JFrame marco;
    JPanel panel;
    JLabel etiqueta;
    JTextField lineaDeTexto;
    JTextArea areaTexto;
    JButton botonCopiar, botonSalir;

    public void iniciarComponentes() {
        //Definir Componentes
        marco = new JFrame(" Componentes ");
        panel = new JPanel();
        etiqueta = new JLabel(" Linea texto ");
        lineaDeTexto = new JTextField();
        areaTexto = new JTextArea();
        botonCopiar = new JButton("Copiar");
        botonSalir = new JButton();

        // Caracteristica
        marco.setBounds(0, 0, 800, 800);
        panel.setBounds(5, 5, 750, 750);
        panel.setBackground(Color.red);
        etiqueta.setBounds(50, 100, 100, 50);
        lineaDeTexto.setBounds(200, 100, 200, 50);
        areaTexto.setBounds(50, 200, 200, 300);
        botonCopiar.setBounds(100, 600, 150, 100);
        botonSalir.setBounds(500, 600, 150, 100);
        botonSalir.setText(" Salir ");
        botonSalir.setToolTipText(" Salimos del programa ");

        //Agregamos componentes al panel
        panel.setLayout(null);
        panel.add(etiqueta);
        panel.add(lineaDeTexto);
        panel.add(areaTexto);
        panel.add(botonCopiar);
        panel.add(botonSalir);
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }

}
