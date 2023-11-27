package com.shay;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.Dimension;

public class CasillasDeCompras {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Casillas de marcación");
        frame.setSize(400, 300);

        // JPanel con BoxLayout para la disposición vertical
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Título
        JLabel titleLabel = new JLabel("Lista de Compras");

        // Casillas de marcación
        JCheckBox casilla1 = new JCheckBox("Plátano 🍌");
        JCheckBox casilla2 = new JCheckBox("Baterías AAA 🔋");
        JCheckBox casilla3 = new JCheckBox("Regalo para  ella 🎁");

        // Configuración de tamaño de las casillas
        Dimension checkBoxSize = new Dimension(250, 40);
        casilla1.setPreferredSize(checkBoxSize);
        casilla2.setPreferredSize(checkBoxSize);
        casilla3.setPreferredSize(checkBoxSize);

        // JLabel y las casillas de marcación al JPanel
        panel.add(titleLabel);
        panel.add(casilla1);
        panel.add(casilla2);
        panel.add(casilla3);

        // JPanel al formulario
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
