package com.unju.grafico;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author SERGIO
 */
public class Principal {

    public static void main(String[] args) {

        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue("Futbol", new Double(75));
        datos.setValue("Basquet", new Double(10));
        datos.setValue("Tenis", new Double(7));
        datos.setValue("Otros", new Double(3));

        JFreeChart grafico = ChartFactory.createPieChart(// graf de tipo circular
                "Grafico De Deportes",// título																		
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
