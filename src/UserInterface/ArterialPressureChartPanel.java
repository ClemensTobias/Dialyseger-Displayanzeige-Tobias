package Userinterface;

import javax.swing.*;
import java.awt.*;

import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.xy.*;

public class ArterialPressureChartPanel extends JPanel {

    private final XYSeries series;

    public ArterialPressureChartPanel() {
        setLayout(new BorderLayout());
        setBounds(10, 320, 400, 300); // Position im Display

        series = new XYSeries("Arterieller Druck");

        XYSeriesCollection dataset = new XYSeriesCollection(series);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Arterieller Druck (letzte 10 Sekunden)",
                "Zeit",
                "mmHg",
                dataset,
                PlotOrientation.VERTICAL,
                false,
                false,
                false
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        add(chartPanel, BorderLayout.CENTER);

        startUpdateTimer();
    }

    private void startUpdateTimer() {
        new Timer(1000, e -> updateSeries()).start();
    }

    private void updateSeries() {
        series.clear();

        int t = 0;
        for (int value : Hardwareabstraction.ArterialPressureSimulator.getLastValues()) {
            series.add(t++, value);
        }
    }
}
