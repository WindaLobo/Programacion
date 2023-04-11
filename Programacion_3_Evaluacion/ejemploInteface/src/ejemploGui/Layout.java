package ejemploGui;

import java.awt.FlowLayout;
import javax.swing.*;

public class Layout {

    JFrame marco;
    JPanel panel;
    JButton boton1, boton2, boton3, boton4, boton5;

    public void DistribuidorFlowLayaout() {
        panel = new JPanel();
        marco = new JFrame("** Layaout **");
        boton1 = new JButton(" Boton1");
        boton2 = new JButton(" Boton2 ");
        boton3 = new JButton(" Boton3 ");
        boton4 = new JButton(" Boton4 ");
        boton5 = new JButton(" Boton5 ");
       
        marco.setSize(600, 400);
        panel.setLayout(new FlowLayout());
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
    }
   
    public void DistribuidorFlowLayaout2() {
        IniciarComponetes();
        panel.setLayout(new FlowLayout());
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);
        cerrarVentana();

    }

    public void IniciarComponetes() {
        marco = new JFrame("** Layaout **");
        boton1 = new JButton(" Boton1");
        boton2 = new JButton(" Boton2 ");
        boton3 = new JButton(" Boton3 ");
        boton4 = new JButton(" Boton4 ");
        boton5 = new JButton(" Boton5 ");

        marco.setSize(600, 400);

    }

    public void cerrarVentana() {
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);

    }
}

