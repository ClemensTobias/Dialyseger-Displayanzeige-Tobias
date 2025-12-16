package Userinterface;

import javax.swing.*;
import java.awt.*;
import java.util.function.Supplier;

import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.xy.*;


public class PressureChartPanel extends JPanel {

    public XYSeries series;

    public void PressureLineChartPanel(Supplier<int[]> ringBufferSupplier, int xCoordinate, int yCoordinate, String name, String title) {
        setLayout(new BorderLayout());
        setBounds(xCoordinate, yCoordinate, 400, 240); // Position im Display

        series = new XYSeries(name);

        XYSeriesCollection dataset = new XYSeriesCollection(series);

        JFreeChart chart = ChartFactory.createXYLineChart(
                title,
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

        startUpdateTimer(ringBufferSupplier);
    }

    private void startUpdateTimer(Supplier<int[]> ringBufferSupplier) {
        new Timer(1000, e -> updateSeries(ringBufferSupplier)).start();
    }

    private void updateSeries(Supplier<int[]> ringBufferSupplier) {
        series.clear();

        int t = 0;
        for (int value : ringBufferSupplier.get()) {
            series.add(t++, value);
        }
    }
}
