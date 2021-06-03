/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarChart;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

/**
 *
 * @author Onyekachukwu
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private BarChart<String, Number> barChart;
    
    @FXML
    private CategoryAxis xAxis;

    @FXML
    private NumberAxis yAxis;

    private XYChart.Series<String, Number> series;
    
    private XYChart.Series<String, Number> series1;
    
    private XYChart.Series<String, Number> series2;
    
    private XYChart.Series<String, Number> series3;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //defining barchart title
        barChart.setTitle("World population");
        
        // for china
        series = new XYChart.Series<>();
        series.setName("China");
        series.getData().add(new XYChart.Data<String, Number>("",100));
        barChart.getData().addAll(series);
        
        // for usa
        series1 = new XYChart.Series<>();
        series1.setName("USA");
        series1.getData().add(new XYChart.Data<String, Number>("",89));
        barChart.getData().addAll(series1);
        
        // for Nigeria
        series2 = new XYChart.Series<>();
        series2.setName("Nigeria");
        series2.getData().add(new XYChart.Data<String, Number>("",90));
        barChart.getData().addAll(series2);
        
        // for India
        series3 = new XYChart.Series<>();
        series3.setName("India");
        series3.getData().add(new XYChart.Data<String, Number>("",95));
        barChart.getData().addAll(series3);
    }

}
