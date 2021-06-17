/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unju.grafico;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author D.C
 */
public class Principal {

    public static void main(String[] args) {

        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue("Toyota", new Double(30));
        datos.setValue("Mercedes-Benz", new Double(27));
        datos.setValue("BMW", new Double(24));
        datos.setValue("Ford", new Double(20));

        JFreeChart grafico = ChartFactory.createPieChart(// graf de tipo circular
                "Automoviles mas Vendidos",// título																		
                datos, // datos
                true, // incluir referenciasXX
                true, false);

        ChartPanel panel = new ChartPanel(grafico);

        JFrame ventana = new JFrame("Grafica estadístico de uso en particular");
        ventana.setVisible(true);
        ventana.setSize(1000, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.add(panel);
    }
    
}
