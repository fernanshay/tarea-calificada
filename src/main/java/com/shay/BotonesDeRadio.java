package com.shay;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;

public class BotonesDeRadio {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio FM");
        frame.setSize(400, 300);

        // Botones de radio
        JRadioButton boton1 = new JRadioButton("94.5 FM");
        JRadioButton boton2 = new JRadioButton("103.5 DAWN FM");
        JRadioButton boton3 = new JRadioButton("108.8 FM");

        // Agrupación de botones
        ButtonGroup grupoOpciones = new ButtonGroup();
        grupoOpciones.add(boton1);
        grupoOpciones.add(boton2);
        grupoOpciones.add(boton3);

        // Implementación de botones al formulario
        frame.add(boton1);
        frame.add(boton2);
        frame.add(boton3);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
