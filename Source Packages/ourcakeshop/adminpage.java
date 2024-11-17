package ourcakeshop;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 * 
 */




//import .*;
import java.sql.*;
import javax.swing.JOptionPane;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.*;
import javax.swing.JOptionPane;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Color;
import org.jfree.data.general.DefaultPieDataset;
//import org.jfree.data.general.DefaultCategoryDataset;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.statistics.HistogramDataset;
import ourcakeshop.db;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.TableRowSorter;


public class adminpage extends javax.swing.JFrame {
    
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String path2 = null;
    
    double firstnum;
    double secondnum;
    double result;
   String operations;
   private ImageIcon selectedImageIcon;
   // Assuming jTable3 is your JTable
//int desiredRowHeight = 200; // Set your desired row height
//jTable3.setRowHeight(desiredRowHeight);

   // String answer;
    
    /**
     * Creates new form adminpage
     */
    
    Color DefaultColor,ClickedColor,dflt,clk;
    private Object jOptionPane;
    public adminpage() {
        initComponents();
        setExtendedState(adminpage.MAXIMIZED_BOTH);
        
        
        
    
        
        
        
        DefaultColor=new Color(255,102,102);
        ClickedColor=new Color(255,204,204);
        dflt= new Color(242,242,242);
        clk=new Color(255,204,255);
        //norm=new Color(242,242,242);
        //ff.setBackground(DefaultColor);
        ff.setBackground(dflt);
        si.setBackground(DefaultColor);
        vr.setBackground(DefaultColor); 
        ch.setBackground(DefaultColor); 
        co.setBackground(DefaultColor); 
        cc.setBackground(DefaultColor); 
        cs.setBackground(DefaultColor);
       // showPieChart();
        showLineChart();
        showHistogram();
        showBarChart();
        showPieeChart();
        
    }
    
     
     
  /* public void showPieChart(){
        
        //create dataset
      DefaultPieDataset barDataset = new DefaultPieDataset( );
      barDataset.setValue( "Pending" , new Double( 30 ) );  
      barDataset.setValue( "Ongoing" , new Double( 10) );   
      barDataset.setValue( "Completed" , new Double( 55 ) );    
      barDataset.setValue( "Discarded" , new Double( 10 ) );  
      
      //create chart
       JFreeChart piechart = ChartFactory.createPieChart("Cake Sales",barDataset, false,true,false);//explain
      
        PiePlot piePlot =(PiePlot) piechart.getPlot();
      
       //changing pie chart blocks colors
       piePlot.setSectionPaint("Pending", new Color(255,255,102));
        piePlot.setSectionPaint("Ongoing", new Color(102,255,102));
        piePlot.setSectionPaint("Completed", new Color(255,102,153));
        piePlot.setSectionPaint("Discarded", new Color(0,204,204));
      
       
        piePlot.setBackgroundPaint(Color.white);
        
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        panelBarChart.removeAll();
        panelBarChart.add(barChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();
    }*/
     public void showLineChart(){
        //create dataset for the graph
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(200, "Profit", "january");
        dataset.setValue(150, "Profit", "february");
        dataset.setValue(18, "Profit", "march");
        dataset.setValue(100, "Profit", "april");
        dataset.setValue(80, "Profit", "may");
        dataset.setValue(250, "Profit", "june");
        
        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("Profit of Current Year","monthly","Profit", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        //create plot object
         CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundPaint(Color.white);
        
        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204,0,51);
        lineRenderer.setSeriesPaint(0, lineChartColor);
        
         //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        panline.removeAll();
        panline.add(lineChartPanel, BorderLayout.CENTER);
        panline.validate();
    }
      public void showHistogram(){
        
         double[] values = { 95, 49, 14, 59, 50, 66, 47, 40, 1, 67,
                            12, 58, 28, 63, 14, 9, 31, 17, 94, 71,
                            49, 64, 73, 97, 15, 63, 10, 12, 31, 62,
                            93, 49, 74, 90, 59, 14, 15, 88, 26, 57,
                            77, 44, 58, 91, 10, 67, 57, 19, 88, 84                                
                          };
 
 
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("key", values, 20);
        
         JFreeChart chart = ChartFactory.createHistogram("Customer Review Histogram","Cake Sale", "Review Frequency", dataset,PlotOrientation.VERTICAL, false,true,false);
            XYPlot plot= chart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);

        
        
        ChartPanel barpChartPanel2 = new ChartPanel(chart);
        jPanel26.removeAll();
        jPanel26.add(barpChartPanel2, BorderLayout.CENTER);
        jPanel26.validate();
    }

       public void showBarChart(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(50, "Amount", "january");
        dataset.setValue(30, "Amount", "february");
        dataset.setValue(37, "Amount", "march");
        dataset.setValue(42, "Amount", "april");
        dataset.setValue(27, "Amount", "may");
        dataset.setValue(29, "Amount", "june");
        
        JFreeChart chart = ChartFactory.createBarChart("Cake Sale","monthly","amount", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204,0,51);
        renderer.setSeriesPaint(0, clr3);
        
        ChartPanel barpChartPanel = new ChartPanel(chart);
        jP.removeAll();
        jP.add(barpChartPanel, BorderLayout.CENTER);
        jP.validate();
        
        
    }
       public void showPieeChart(){
        
        //create dataset
      DefaultPieDataset barDataset = new DefaultPieDataset( );
      barDataset.setValue( "Pending" , new Double( 30 ) );  
      barDataset.setValue( "Ongoing" , new Double( 10) );   
      barDataset.setValue( "Completed" , new Double( 55 ) );    
      barDataset.setValue( "Discarded" , new Double( 10 ) );  
      
      //create chart
       JFreeChart piechart = ChartFactory.createPieChart("Cake Sale of Current Year",barDataset, false,true,false);//explain
      
        PiePlot piePlot =(PiePlot) piechart.getPlot();
      
       //changing pie chart blocks colors
       piePlot.setSectionPaint("Pending", new Color(255,255,102));
        piePlot.setSectionPaint("Ongoing", new Color(102,255,102));
        piePlot.setSectionPaint("Completed", new Color(255,102,153));
        piePlot.setSectionPaint("Discarded", new Color(0,204,204));
      
       
        piePlot.setBackgroundPaint(Color.white);
        
        //create chartPanel to display chart(graph)
        ChartPanel barChartPanel = new ChartPanel(piechart);
        jpp.removeAll();
        jpp.add(barChartPanel, BorderLayout.CENTER);
        jpp.validate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txttot = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtpen = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtcom = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtdis = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        panline = new javax.swing.JPanel();
        jP = new javax.swing.JPanel();
        jpp = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jPanel25 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel30 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jPanel31 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel29 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jLabel36 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        T2 = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        srch = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        lbl1 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        item = new javax.swing.JTextField();
        flavor = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        txtpn1 = new javax.swing.JTextField();
        txtmail1 = new javax.swing.JTextField();
        txtdesig1 = new javax.swing.JTextField();
        txtadded1 = new javax.swing.JTextField();
        uppbtn = new javax.swing.JButton();
        adbtn1 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jtxtDisplay = new javax.swing.JTextField();
        bacckspace = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        ans = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jBtn15 = new javax.swing.JButton();
        jBtn16 = new javax.swing.JButton();
        jBtn17 = new javax.swing.JButton();
        jBtn18 = new javax.swing.JButton();
        jBtn19 = new javax.swing.JButton();
        jBtn20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ch = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        co = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cc = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ff = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        si = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cs = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        vr1 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        vr = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel13.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(204, 153, 255)));
        jPanel13.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel13.setText("New");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        txttot.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txttot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel13)
                .addGap(27, 27, 27)
                .addComponent(txttot, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttot, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(204, 153, 255)));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel12.setText("Delivered");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        txtpen.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtpen, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpen, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(204, 153, 255)));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel15.setText("Confirmed");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        txtcom.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(txtcom, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcom, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(204, 153, 255)));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 36)); // NOI18N
        jLabel14.setText("Discarded");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        txtdis.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtdis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdis, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdis, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        t2.setBackground(new java.awt.Color(255, 204, 255));
        t2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        t2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"January", "35", "5", "0", "40"},
                {"February", "37", "6", "0", "43"},
                {"March", "42", "4", "0", "46"},
                {"April", "56", "2", "0", "58"}
            },
            new String [] {
                "Month", "Completed", "Discarded", "Pending", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        t2.setRowHeight(30);
        jScrollPane1.setViewportView(t2);

        jLabel20.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel20.setText("Month");

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel80.setText("This Year");

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Reviews"
            }
        ));
        jScrollPane8.setViewportView(jTable4);

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "Aprill", "May", "June", "July", "August", "September", "October", "November", "December" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton1)))
                        .addGap(173, 173, 173))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jButton1)))
                .addGap(36, 36, 36)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(150, 150, 150))
        );

        jTabbedPane1.addTab("", jPanel5);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flavor", "Weight", "Message", "Cost", "ID", "DueDate", "User Name"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable2);

        jPanel21.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 101, 670, 420));

        jLabel23.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel23.setText("Flavor");
        jPanel21.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 710, 90, -1));

        jLabel24.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel24.setText("Weight");
        jPanel21.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 750, 100, -1));

        jLabel25.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel25.setText("Message");
        jPanel21.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 790, 100, -1));

        jLabel26.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel26.setText("Price");
        jPanel21.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 830, 60, -1));

        jLabel27.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel27.setText("Product ID");
        jPanel21.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 310, 140, -1));

        jLabel79.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel79.setText("Due Date");
        jPanel21.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 910, 100, -1));

        jLabel28.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel28.setText("User Name");
        jPanel21.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, 130, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel21.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, 230, 30));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel21.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 190, 230, 30));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel21.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 230, 230, 30));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel21.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 270, 230, 30));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel21.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 310, 230, 30));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel21.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 350, 230, 30));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel21.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 390, 230, 30));

        jButton5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButton5.setText("Confirm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, -1, -1));

        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButton3.setText("Discard");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 460, -1, -1));

        jTable8.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flavor", "Weight", "Message", "Price", "Product Code", "Due Date", "User Name"
            }
        ));
        jTable8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable8MouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(jTable8);

        jPanel21.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, 670, 504));

        jLabel39.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(51, 51, 255));
        jLabel39.setText("Click Here to see");
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel39MouseClicked(evt);
            }
        });
        jPanel21.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, -1, -1));

        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel21.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 710, 230, 30));

        jTextField12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel21.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 910, 230, 30));

        jTextField13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jPanel21.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 830, 230, 30));

        jTextField14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel21.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 870, 230, 30));

        jTextField15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jPanel21.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 960, 230, 30));

        jTextField16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel21.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 790, 230, 30));

        jTextField17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel21.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 750, 230, 30));

        jLabel30.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel30.setText("Flavor");
        jPanel21.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, 100, -1));

        jLabel31.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel31.setText("Weight");
        jPanel21.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 190, 110, -1));

        jLabel32.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel32.setText("Message");
        jPanel21.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 100, -1));

        jLabel41.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel41.setText("Price");
        jPanel21.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 70, -1));

        jLabel42.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel42.setText("Product ID");
        jPanel21.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 870, 130, -1));

        jLabel81.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel81.setText("Due Date");
        jPanel21.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 110, -1));

        jLabel47.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel47.setText("User Name");
        jPanel21.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 960, 120, -1));

        jButton15.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButton15.setText("Delivered");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 1010, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel19.setText("New Orders:");
        jPanel21.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel48.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel48.setText("Confirmed Orders:");
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });
        jPanel21.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, -1, -1));

        jScrollPane13.setViewportView(jPanel21);

        jPanel4.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 750));

        jTabbedPane1.addTab("tab9", jPanel4);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel26.setLayout(new java.awt.BorderLayout());

        panline.setLayout(new java.awt.BorderLayout());

        jP.setLayout(new java.awt.BorderLayout());

        jpp.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panline, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jP, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(163, 163, 163)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpp, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panline, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpp, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jP, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(204, 153, 255)));
        jPanel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel24MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel24MousePressed(evt);
            }
        });
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel28.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(204, 153, 255)));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel37.setText("CheeseCake");
        jPanel28.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, 50));

        jPanel24.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jSpinner3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(50, 0, 75, 1));
        jPanel24.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 110, 50));

        jPanel9.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 237, 98));

        jPanel25.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(204, 153, 255)));
        jPanel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel25MousePressed(evt);
            }
        });
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel34.setText("Pancakes");
        jPanel25.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(30, 0, 50, 1));
        jPanel25.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 32, 110, 50));

        jPanel9.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 237, 100));

        jPanel30.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(204, 153, 255)));
        jPanel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel30MousePressed(evt);
            }
        });
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel32.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(204, 153, 255)));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel33.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(204, 153, 255)));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel32.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel30.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel49.setText("Brownies");
        jPanel30.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        jSpinner2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(75, 0, 75, 1));
        jPanel30.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 110, 50));

        jPanel9.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 237, 98));

        jPanel31.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(204, 153, 255)));
        jPanel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel31MousePressed(evt);
            }
        });
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel46.setText("Pastries");
        jPanel31.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        jSpinner4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(50, 0, 75, 1));
        jPanel31.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 110, 50));

        jPanel9.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, 240, 100));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/offer1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 792, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("", jPanel29);

        jPanel34.setBackground(new java.awt.Color(255, 255, 255));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/offer3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(773, 773, 773))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel36))
        );

        jTabbedPane2.addTab("", jPanel34);

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/offer4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("", jPanel36);

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/offer2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 740, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("", jPanel35);

        jPanel9.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 740, 430));

        jLabel45.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel45.setText("Discount Percentage");
        jPanel9.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jTabbedPane1.addTab("", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        T2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        T2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Address", "Phone Number"
            }
        ));
        T2.setDragEnabled(true);
        T2.setRowHeight(30);
        T2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(T2);

        jLabel21.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel21.setText("Customer Details:");

        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel82.setText("Search Here:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel21)
                .addGap(19, 19, 19)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", jPanel10);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        srch.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        srch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Price", "Image"
            }
        ));
        srch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                srchMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(srch);

        jPanel11.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 830, 1070, 580));

        jTable3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "price", "Image"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable3);

        jPanel11.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 1080, 380));

        lbl1.setPreferredSize(new java.awt.Dimension(150, 150));
        jPanel11.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, -1, 166));

        jButton6.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButton6.setText("Upload");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 200, -1, -1));
        jPanel11.add(item, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 260, 30));

        flavor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flavorActionPerformed(evt);
            }
        });
        jPanel11.add(flavor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 260, 30));
        jPanel11.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 260, 30));

        jButton8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButton8.setText("Enter");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        jLabel75.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel75.setText("Product ID");
        jPanel11.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel76.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel76.setText("Item Name");
        jPanel11.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel74.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel74.setText("Price");
        jPanel11.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel16.setText("Add to Stock");
        jPanel11.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, -1));

        jLabel17.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel17.setText("Delete from Stock");
        jPanel11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 310, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Search:");
        jPanel11.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 740, 71, -1));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton9.setText("Delete");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 780, -1, -1));

        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField10KeyReleased(evt);
            }
        });
        jPanel11.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 740, 430, 31));

        jScrollPane5.setViewportView(jPanel11);

        jPanel23.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 750));

        jTabbedPane1.addTab("tab10", jPanel23);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        T1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        T1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Rani", "908765", "raisa@gmail.com", "Moderator", "8000"},
                {"Nasir", "798658", "habiba@gmail.com", "Moderator", "7000"},
                {"faisal", "678843", "mehreen@gmail.com", "Moderator", "6000"},
                {"Abdul", "679643", "abdul@yahoo.com", "Moderator", "7000"},
                {"Yaqub", "564658", "yaqub@outlook.com", "Chef", "8000"},
                {"Feroz", "456767", "feroz@gmailco", "Chef", "8000"},
                {"Toha", "898760", "tpha@yahoo.com", "Chef", "7000"},
                {"Aynan", "087986", "aynan@gmail.com", "Cashier", "5000"},
                {"Taz", "989765", "taz@yahoo.com", "Cashier", "6000"},
                {"Nazifa", "345456", "naz@gmail.com", "Deliveryman", "7000"}
            },
            new String [] {
                "Name", "Phone Number", "Email", "designation", "Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        T1.setDragEnabled(true);
        T1.setRowHeight(25);
        T1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(T1);

        jLabel22.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel22.setText("Current Staffs");

        jLabel40.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel40.setText("Phone Number");

        jLabel51.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel51.setText("Name");

        jLabel52.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel52.setText("Email");

        jLabel53.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel53.setText("Salary");

        jLabel54.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel54.setText("Designation");

        txtName1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName1ActionPerformed(evt);
            }
        });

        txtpn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtpn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpn1ActionPerformed(evt);
            }
        });

        txtmail1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmail1ActionPerformed(evt);
            }
        });

        txtdesig1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtdesig1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesig1ActionPerformed(evt);
            }
        });

        txtadded1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtadded1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadded1ActionPerformed(evt);
            }
        });

        uppbtn.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        uppbtn.setText("Update Data");
        uppbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uppbtnActionPerformed(evt);
            }
        });

        adbtn1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        adbtn1.setText("Add Data");
        adbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adbtn1ActionPerformed(evt);
            }
        });

        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel83.setText("Search Here:");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtpn1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtadded1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdesig1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(adbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(uppbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel83)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel22)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(txtpn1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel52)
                                    .addComponent(txtmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel54))
                            .addComponent(txtadded1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtdesig1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uppbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(209, 209, 209))
        );

        jTabbedPane1.addTab("", jPanel17);

        jPanel38.setBackground(new java.awt.Color(255, 255, 255));

        jTable6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flavor", "Weight", "Message", "Price", "Product Code", "Due Date", "User Name"
            }
        ));
        jScrollPane10.setViewportView(jTable6);

        jLabel38.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        jLabel38.setText("Delivered Orders:");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel38))
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab11", jPanel38);

        jTable7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "price", "Image"
            }
        ));
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(jTable7);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(927, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(361, Short.MAX_VALUE))
        );

        jScrollPane11.setViewportView(jPanel20);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
                .addGap(198, 198, 198))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab10", jPanel12);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jPanel19.setBackground(new java.awt.Color(255, 204, 255));

        jtxtDisplay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDisplayActionPerformed(evt);
            }
        });

        bacckspace.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bacckspace.setText("<-");
        bacckspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bacckspaceActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBtn2.setText("0");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBtn3.setText(".");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBtn5.setText("7");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setText("-");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        ans.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ans.setText("=");
        ans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setText("+/-");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton11.setText("C");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton12.setText("/");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton13.setText("%");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton14.setText("*");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jBtn15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBtn15.setText("6");
        jBtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn15ActionPerformed(evt);
            }
        });

        jBtn16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBtn16.setText("3");
        jBtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn16ActionPerformed(evt);
            }
        });

        jBtn17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBtn17.setText("4");
        jBtn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn17ActionPerformed(evt);
            }
        });

        jBtn18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBtn18.setText("1");
        jBtn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn18ActionPerformed(evt);
            }
        });

        jBtn19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBtn19.setText("2");
        jBtn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn19ActionPerformed(evt);
            }
        });

        jBtn20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jBtn20.setText("5");
        jBtn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn20ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton21.setText("+");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(bacckspace, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ans, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addComponent(jBtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jBtn19, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel19Layout.createSequentialGroup()
                            .addComponent(jBtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jBtn20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel19Layout.createSequentialGroup()
                            .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bacckspace, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jBtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ans, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setText("Calculator");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(454, 454, 454)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(550, 550, 550)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(455, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", jPanel18);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, -30, 1220, 750));

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ch.setBackground(new java.awt.Color(255, 102, 102));
        ch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        ch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                chMousePressed(evt);
            }
        });
        ch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/bar-chart.png"))); // NOI18N
        jLabel8.setText("Charts");
        ch.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel3.add(ch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 240, 61));

        co.setBackground(new java.awt.Color(255, 102, 102));
        co.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        co.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                coMousePressed(evt);
            }
        });
        co.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/gift.png"))); // NOI18N
        jLabel9.setText("Current Offers");
        co.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel3.add(co, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 240, 61));

        cc.setBackground(new java.awt.Color(255, 102, 102));
        cc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        cc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ccMousePressed(evt);
            }
        });
        cc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/phone-call.png"))); // NOI18N
        jLabel10.setText("Contact Customer");
        cc.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel3.add(cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 240, 61));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Features");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 81, -1));

        ff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ffMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 0));
        jLabel11.setText("Frosting Fantasy CakeShop");

        javax.swing.GroupLayout ffLayout = new javax.swing.GroupLayout(ff);
        ff.setLayout(ffLayout);
        ffLayout.setHorizontalGroup(
            ffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ffLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        ffLayout.setVerticalGroup(
            ffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel3.add(ff, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        si.setBackground(new java.awt.Color(255, 102, 102));
        si.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        si.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                siMousePressed(evt);
            }
        });
        si.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 153, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(204, 153, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        si.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/group (1).png"))); // NOI18N
        jLabel5.setText("Staff Information");
        si.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel3.add(si, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 240, 61));

        cs.setBackground(new java.awt.Color(255, 102, 102));
        cs.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        cs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                csMousePressed(evt);
            }
        });
        cs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/cake.png"))); // NOI18N
        jLabel7.setText("Manage Stock");
        cs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel3.add(cs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 240, 61));

        vr1.setBackground(new java.awt.Color(255, 102, 102));
        vr1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        vr1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vr1MousePressed(evt);
            }
        });
        vr1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel77.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/user-interface.png"))); // NOI18N
        jLabel77.setText("Order History");
        vr1.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel3.add(vr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 240, 61));

        vr.setBackground(new java.awt.Color(255, 102, 102));
        vr.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        vr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vrMousePressed(evt);
            }
        });
        vr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/user-interface.png"))); // NOI18N
        jLabel3.setText("New Request");
        vr.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel3.add(vr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 240, 61));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1620, 720));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 48)); // NOI18N
        jLabel1.setText("Admin Portal");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 270, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Your Expertise is the Cornerstone of Our Succsess");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 70, 330, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/account.png"))); // NOI18N
        jLabel2.setText("Hello ADMIN");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 60));

        jLabel78.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel78.setText("LOGOUT");
        jLabel78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel78MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 90, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siMousePressed
        // TODO add your handling code here:
        si.setBackground(ClickedColor);
        vr.setBackground(DefaultColor); 
        vr1.setBackground(DefaultColor);
        ch.setBackground(DefaultColor); 
        co.setBackground(DefaultColor); 
        cc.setBackground(DefaultColor); 
        cs.setBackground(DefaultColor);
        ff.setBackground(dflt);
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_siMousePressed

    private void vrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vrMousePressed
        // TODO add your handling code here:
        si.setBackground(DefaultColor);
        vr.setBackground(ClickedColor); 
        ch.setBackground(DefaultColor); 
        co.setBackground(DefaultColor); 
        cc.setBackground(DefaultColor); 
        cs.setBackground(DefaultColor);
        vr1.setBackground(DefaultColor);
         ff.setBackground(dflt);
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_vrMousePressed

    private void chMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chMousePressed
        // TODO add your handling code here:
        si.setBackground(DefaultColor);
        vr.setBackground(DefaultColor); 
        vr1.setBackground(DefaultColor);
        ch.setBackground(ClickedColor); 
        co.setBackground(DefaultColor); 
        cc.setBackground(DefaultColor); 
        cs.setBackground(DefaultColor);
         ff.setBackground(dflt);
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_chMousePressed

    private void coMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coMousePressed
        // TODO add your handling code here:
        si.setBackground(DefaultColor);
        vr.setBackground(DefaultColor); 
        vr1.setBackground(DefaultColor);
        ch.setBackground(DefaultColor); 
        co.setBackground(ClickedColor); 
        cc.setBackground(DefaultColor); 
        cs.setBackground(DefaultColor);
         ff.setBackground(dflt);
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_coMousePressed

    private void ccMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ccMousePressed
        // TODO add your handling code here:
        si.setBackground(DefaultColor);
        vr.setBackground(DefaultColor); 
        vr1.setBackground(DefaultColor);
        ch.setBackground(DefaultColor); 
        co.setBackground(DefaultColor); 
        cc.setBackground(ClickedColor); 
        cs.setBackground(DefaultColor);
         ff.setBackground(dflt);
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_ccMousePressed

    private void csMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_csMousePressed
        // TODO add your handling code here:
        si.setBackground(DefaultColor);
        vr.setBackground(DefaultColor); 
        vr1.setBackground(DefaultColor);
        ch.setBackground(DefaultColor); 
        co.setBackground(DefaultColor); 
        cc.setBackground(DefaultColor); 
        cs.setBackground(ClickedColor);
         ff.setBackground(dflt);
       jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_csMousePressed

    private void jPanel31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MousePressed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(3);
    }//GEN-LAST:event_jPanel31MousePressed

    private void jPanel30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel30MousePressed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_jPanel30MousePressed

    private void jPanel25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MousePressed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel25MousePressed

    private void jPanel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseClicked
        // TODO add your handling code here:
      //  jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_jPanel24MouseClicked

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        firstnum=Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations="+";
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jBtn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn20ActionPerformed
        // TODO add your handling code here:
        String Enternumber =jtxtDisplay.getText()+jBtn20.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn20ActionPerformed

    private void jBtn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn19ActionPerformed
        // TODO add your handling code here:
        String Enternumber =jtxtDisplay.getText()+jBtn19.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn19ActionPerformed

    private void jBtn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn18ActionPerformed
        // TODO add your handling code here:
        String Enternumber =jtxtDisplay.getText()+jBtn18.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn18ActionPerformed

    private void jBtn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn17ActionPerformed
        // TODO add your handling code here:
        String Enternumber =jtxtDisplay.getText()+jBtn17.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn17ActionPerformed

    private void jBtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn16ActionPerformed
        // TODO add your handling code here:
        String Enternumber =jtxtDisplay.getText()+jBtn16.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn16ActionPerformed

    private void jBtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn15ActionPerformed
        // TODO add your handling code here:
        String Enternumber =jtxtDisplay.getText()+jBtn15.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        firstnum=Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations="*";
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        firstnum=Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations="%";
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        firstnum=Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations="/";

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        jtxtDisplay.setText("");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        double ops=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=ops*(-1);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jButton10ActionPerformed

    private void ansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansActionPerformed
        // TODO add your handling code here:
        String answer;

        secondnum=Double.parseDouble(jtxtDisplay.getText());
        if(operations== "+" )
        {
            result=firstnum+secondnum;
            answer=String.format("%.0f",result );
            jtxtDisplay.setText(answer);
        }

        else if(operations=="/")
        {
            result=firstnum/secondnum;
            answer=String.format("%.0f",result );
            jtxtDisplay.setText(answer);
        }

        else if(operations=="-")
        {
            result=firstnum-secondnum;
            answer=String.format("%.0f",result );
            jtxtDisplay.setText(answer);
        }

        else if(operations=="*")
        {
            result=firstnum*secondnum;
            answer=String.format("%.0f",result );
            jtxtDisplay.setText(answer);
        }

        else if(operations=="%")
        {
            result=firstnum%secondnum;
            answer=String.format("%.0f",result );
            jtxtDisplay.setText(answer);
        }
    }//GEN-LAST:event_ansActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        // TODO add your handling code here:
        String Enternumber =jtxtDisplay.getText()+jBtn9.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        firstnum=Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations="-";
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        // TODO add your handling code here:
        String Enternumber =jtxtDisplay.getText()+jBtn8.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        // TODO add your handling code here:
        String Enternumber =jtxtDisplay.getText()+jBtn5.getText();
        jtxtDisplay.setText(Enternumber);

    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        // TODO add your handling code here:
        String Enternumber =jtxtDisplay.getText()+jBtn3.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        // TODO add your handling code here:
        String Enternumber =jtxtDisplay.getText()+jBtn2.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void bacckspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bacckspaceActionPerformed
        // TODO add your handling code here:
        String backspace =null;
        if(jtxtDisplay.getText().length()>0){
            StringBuilder strB=new StringBuilder(jtxtDisplay.getText());
            strB.deleteCharAt(jtxtDisplay.getText().length()-1);
            backspace=strB.toString();
            jtxtDisplay.setText(backspace);
        }
    }//GEN-LAST:event_bacckspaceActionPerformed

    private void jtxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDisplayActionPerformed

    private void T2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T2MouseClicked
        // TODO add your handling code here:
        int selectedRow=T2.getSelectedRow();
        DefaultTableModel tblModel= (DefaultTableModel)T2.getModel();
      //  txtName.setText(tblModel.getValueAt(selectedRow,0).toString());
       // txtpn.setText(tblModel.getValueAt(selectedRow,1).toString());
        //txtmail.setText(tblModel.getValueAt(selectedRow,2).toString());
        //txtadded.setText(tblModel.getValueAt(selectedRow,3).toString());
        //txtdesig.setText(tblModel.getValueAt(selectedRow,4).toString());

    }//GEN-LAST:event_T2MouseClicked

    private void jPanel24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MousePressed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_jPanel24MousePressed

    private void txtName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName1ActionPerformed

    private void txtpn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpn1ActionPerformed

    private void txtmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmail1ActionPerformed

    private void txtdesig1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesig1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdesig1ActionPerformed

    private void txtadded1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadded1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtadded1ActionPerformed

    private void T1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T1MouseClicked
        // TODO add your handling code here:
         int selectedRow=T1.getSelectedRow();
        DefaultTableModel tblModl= (DefaultTableModel)T1.getModel();
        txtName1.setText(tblModl.getValueAt(selectedRow,0).toString());
        txtpn1.setText(tblModl.getValueAt(selectedRow,1).toString());
        txtmail1.setText(tblModl.getValueAt(selectedRow,2).toString());
        txtadded1.setText(tblModl.getValueAt(selectedRow,3).toString());
        txtdesig1.setText(tblModl.getValueAt(selectedRow,4).toString());
    }//GEN-LAST:event_T1MouseClicked

    private void uppbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uppbtnActionPerformed
        // TODO add your handling code here:
        int i=T1.getSelectedRow();
        DefaultTableModel tblMdl=(DefaultTableModel)T1.getModel();
        if(i>=0)
        {
            tblMdl.setValueAt(txtName1.getText(),i,0);
            tblMdl.setValueAt(txtpn1.getText(),i,1);
            tblMdl.setValueAt(txtmail1.getText(),i,2);
            tblMdl.setValueAt(txtadded1.getText(),i,3);
            tblMdl.setValueAt(txtdesig1.getText(),i,4);

        }
        
        
        
        
        
        
        
        
      
    }//GEN-LAST:event_uppbtnActionPerformed

    private void adbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adbtn1ActionPerformed
        // TODO add your handling code here:
           DefaultTableModel tblModl=(DefaultTableModel)T1.getModel();
        tblModl.addRow(new String[]{txtName1.getText(),txtpn1.getText(),txtmail1.getText(),txtadded1.getText(),txtdesig1.getText()});

           String nam = txtName1.getText();
         String phone = txtpn1.getText();
          String mail = txtmail1.getText();
          String desig = txtadded1.getText();
          String salary = txtdesig1.getText();
        
          try {
              Statement s = db.mycon().createStatement();
              s.executeUpdate("INSERT INTO raisaa(Name,Number,Email,designation,Salary)"+ "VALUES('"+nam+"','"+phone+"','"+mail+"','"+desig+"','"+salary+"')");
              JOptionPane.showMessageDialog(rootPane, "Your data has been added");
          } catch (Exception e) {
              System.out.println(e);
          }
      
        
    }//GEN-LAST:event_adbtn1ActionPerformed

    private void txttotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotActionPerformed

    private void txtpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpenActionPerformed

    private void txtcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcomActionPerformed

    private void txtdisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdisActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         //DefaultTableModel tblModel=(DefaultTableModel)t2.getModel();
       // tblModel.addRow(new String[]{txtmnth.getText(),txttot.getText(),txtpen.getText(),txtcom.getText(),txtdis.getText()});
              /*  try {
              Statement s = db.mycon().createStatement();
              


              
             String sql = "SELECT COUNT(*) FROM buynow";
             ResultSet rs = s.executeQuery(sql);
            
                 String fla = rs.getString("Flavor");
           
               String wei = rs.getString("Weight");
                 String mesg = rs.getString("Message");
                 String taka = String.valueOf(rs.getInt("Cost"));
                 String pid = rs.getString("ID");
          
                 
                 String tbData[] = {fla,wei,mesg,taka,pid};
                 DefaultTableModel tb1Model = (DefaultTableModel)jTable2.getModel();
                 tb1Model.addRow(tbData);
             
              JOptionPane.showMessageDialog(rootPane, "Accept Order?");
          } catch (Exception e) {
              System.out.println(e);
          }*/
          String fla = (String)jComboBox1.getSelectedItem();
          DefaultTableModel tablModel=(DefaultTableModel)t2.getModel();
        tablModel.addRow(new String[]{fla,txttot.getText(),txtpen.getText(),txtcom.getText(),txtdis.getText()});
        // DefaultTableModel tblModel=(DefaultTableModel)T2.getModel();
      //  tblModel.addRow(new String[]{txtName.getText(),txtpn.getText(),txtmail.getText(),txtadded.getText(),txtdesig.getText()});
      
           //   String nam = txtmnth.getText();
         String phone = txttot.getText();
          String mail = txtpen.getText();
          String desig = txtcom.getText();
          String salary = txtdis.getText();
        
          try {
              Statement s = db.mycon().createStatement();
              s.executeUpdate("INSERT INTO raisa_u(Month,Total,Pending,Complete,Discarded)"+ "VALUES('"+fla+"','"+phone+"','"+mail+"','"+desig+"','"+salary+"')");
              JOptionPane.showMessageDialog(rootPane, "Your data has been added");
          } catch (Exception e) {
              System.out.println(e);
          }
        
        
        
             
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
          int selectedRow=jTable2.getSelectedRow();
        DefaultTableModel tblModl= (DefaultTableModel)jTable2.getModel();
        jTextField1.setText(tblModl.getValueAt(selectedRow,0).toString());
        jTextField2.setText(tblModl.getValueAt(selectedRow,1).toString());
        jTextField3.setText(tblModl.getValueAt(selectedRow,2).toString());
        jTextField4.setText(tblModl.getValueAt(selectedRow,3).toString());
        jTextField5.setText(tblModl.getValueAt(selectedRow,4).toString());
         jTextField6.setText(tblModl.getValueAt(selectedRow,5).toString());
         jTextField7.setText(tblModl.getValueAt(selectedRow,6).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModl= (DefaultTableModel)jTable2.getModel();
        if(jTable2.getSelectedRowCount()==1){
            tblModl.removeRow(jTable2.getSelectedRow());
        }else{
            if(jTable2.getRowCount()==0){
                 JOptionPane.showMessageDialog(rootPane, "Empty Table");
            }else{
                 JOptionPane.showMessageDialog(rootPane, "Please select Any");
            }
        }
        
          String nam = jTextField1.getText();
         String phone = jTextField2.getText();
          String mail = jTextField3.getText();
          String desig = jTextField4.getText();
          String salary = jTextField5.getText();
          String du = jTextField6.getText();
          String duu = jTextField7.getText();
          
        
          try {
              Statement s = db.mycon().createStatement();
              s.executeUpdate("INSERT INTO discard(Flavor,Weight,Message,Cost,ID,DueDate,UserName)"+ "VALUES('"+nam+"','"+phone+"','"+mail+"','"+desig+"','"+salary+"','"+du+"','"+duu+"')");
              JOptionPane.showMessageDialog(rootPane, "Discarded!");
          } catch (Exception e) {
              System.out.println(e);
          }
          
          try {
    Statement s = db.mycon().createStatement();
    s.executeUpdate("DELETE FROM buynow WHERE Flavor = '" + nam + "' AND Weight = '" + phone + "' AND Message = '" + mail + "' AND Cost = '" + desig + "' AND ID = '" + salary + "' AND DueDate = '" + du + "' AND UserName = '" + duu + "'");
   // JOptionPane.showMessageDialog(rootPane, "Discarded!");
} catch (Exception e) {
    System.out.println(e);
}

        
    }//GEN-LAST:event_jButton3ActionPerformed
 int g,gg,ggg;
    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        
          /*  try {
              Statement s = db.mycon().createStatement();
              


              
             String sql = "SELECT COUNT(*) FROM buynow";
             ResultSet rs = s.executeQuery(sql);
            
                // String fla = rs.getString("Flavor");
           
             //  String wei = rs.getString("Weight");
             //    String mesg = rs.getString("Message");
              //   String taka = String.valueOf(rs.getInt("Cost"));
              //   String pid = rs.getString("ID");
          
                 
                 String tbData[] = {fla,wei,mesg,taka,pid};
                 DefaultTableModel tb1Model = (DefaultTableModel)jTable2.getModel();
                 tb1Model.addRow(tbData);
             
              JOptionPane.showMessageDialog(rootPane, "Total order has been added");
          } catch (Exception e) {
              System.out.println(e);
          }*/
        
        
     

        
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
           String nam = jTextField1.getText();
         String phone = jTextField2.getText();
          String mail = jTextField3.getText();
          String desig = jTextField4.getText();
          String salary = jTextField5.getText();
          String du = jTextField6.getText();
          String duu = jTextField7.getText();
        
          try {
              Statement s = db.mycon().createStatement();
              s.executeUpdate("INSERT INTO wishlist(Flavor,Weight,Message,Cost,ID,DueDate,UserName)"+ "VALUES('"+nam+"','"+phone+"','"+mail+"','"+desig+"','"+salary+"','"+du+"','"+duu+"')");
              JOptionPane.showMessageDialog(rootPane, "Wishlisted!");
          } catch (Exception e) {
              System.out.println(e);
          }
                 try {
    Statement s = db.mycon().createStatement();
    s.executeUpdate("DELETE FROM buynow WHERE Flavor = '" + nam + "' AND Weight = '" + phone + "' AND Message = '" + mail + "' AND Cost = '" + desig + "' AND ID = '" + salary + "' AND DueDate = '" + du + "' AND UserName = '" + duu + "'");
   // JOptionPane.showMessageDialog(rootPane, "Discarded!");
} catch (Exception e) {
    System.out.println(e);
    
}
                 DefaultTableModel tblModl= (DefaultTableModel)jTable2.getModel();
        if(jTable2.getSelectedRowCount()==1){
            tblModl.removeRow(jTable2.getSelectedRow());
        }else{
            if(jTable2.getRowCount()==0){
                 JOptionPane.showMessageDialog(rootPane, "Empty Table");
            }else{
                 JOptionPane.showMessageDialog(rootPane, "Please select Any");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
   
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        JFileChooser chooser = new JFileChooser() ;
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        path2 = path;
        
        try {
            BufferedImage bi = ImageIO.read(new File(path));
            Image img = bi.getScaledInstance(150,150 , Image.SCALE_SMOOTH);
            selectedImageIcon = new ImageIcon(img);
           // ImageIcon icon = new ImageIcon(img);
            lbl1.setIcon(selectedImageIcon);
        } catch (IOException ex) {
            Logger.getLogger(adminpage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        
         DefaultTableModel tblModel=(DefaultTableModel)jTable3.getModel();
            tblModel.addRow(new Object[]{item.getText(), flavor.getText(), price.getText(), selectedImageIcon});
            int lastRowIndex = jTable3.getRowCount() - 1;
    int desiredRowHeight = 200;
     jTable3.setRowHeight(lastRowIndex, desiredRowHeight);
            int imageColumnIndex = 3; // Assuming the image is in the fourth column (index 3)
        jTable3.getColumnModel().getColumn(imageColumnIndex).setCellRenderer(new ImageRenderer());
       // tblModel.addRow(new String[]{item.getText(),flavor.getText(),price.getText(),selectedImageIcon});
                 String nam = item.getText();
         String phone = flavor.getText();
          String mail = price.getText();
         // String desig = txtadded.getText();
       //   String salary = txtdesig.getText();
       String sqlquery = "INSERT INTO stock(Item,Flavour,Price,Image)"+ "VALUES(?,?,?,?)";
        
          try {
           //   Statement s = db.mycon().createStatement();
            //  s.executeUpdate("INSERT INTO stock(Item,Flavour,Price,Image)"+ "VALUES('"+nam+"','"+phone+"','"+mail+"','"+desig+"')");
          Connection  con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dim","root","");
              PreparedStatement pst = con.prepareStatement(sqlquery);
              pst.setString(1,nam);
              pst.setString(2,phone);
              pst.setString(3,mail);
              InputStream is = new FileInputStream(new File(path2));
              pst.setBlob(4, is);
              pst.execute();
              item.setText("");
              flavor.setText("");
              price.setText("");
              lbl1.setIcon(null);
              
              JOptionPane.showMessageDialog(rootPane, "Your data has been added");
          } catch (Exception e) {
              System.out.println(e);
          }
    }//GEN-LAST:event_jButton8ActionPerformed

    
    private class ImageRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel label = new JLabel();
            if (value instanceof ImageIcon) {
                ImageIcon icon = (ImageIcon) value;
                label.setIcon(icon);
                int imageHeight = icon.getIconHeight();
            table.setRowHeight(row, imageHeight);
            label.setHorizontalAlignment(JLabel.CENTER);
            }
            return label;
        }
    }

    
    
    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
      /*  int r = jTable3.getSelectedRow();
        String click = (jTable3.getModel().getValueAt(r,0).toString());
        String sql = "SELECT *FROM stock WHERE IDNumber='" + click + "'";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()) {
                String it = rs.getString(1);
                String fl = rs.getString(2);
                String pr = Integer.toString(rs.getInt(3));
                Blob image = rs.getBlob(4);
                String path = "C:\\Users\\User\\OneDrive\\Documents\\NetBeansProjects\\OurCakeShop\\src\\icon\\img.jpg";
                byte [] bytea = image.getBytes(1,(int)image.length());
                FileOutputStream fos = new FileOutputStream(path);
                fos.write(bytea);
                ImageIcon icon = new ImageIcon(bytea);
                lbl1.setIcon(icon);
                
                
                item.setText(it);
                flavor.setText(fl);
                price.setText(pr);
              //  lbl1.setIcon(image);
            }
        }
        catch (Exception e) {
              System.out.println(e);
          } */
      
      int selectedRow=jTable3.getSelectedRow();
        DefaultTableModel tblModel= (DefaultTableModel)jTable3.getModel();
        item.setText(tblModel.getValueAt(selectedRow,0).toString());
        flavor.setText(tblModel.getValueAt(selectedRow,1).toString());
        price.setText(tblModel.getValueAt(selectedRow,2).toString());
      //  lbl1.setText(tblModel.getValueAt(selectedRow,3).toString());
       // txtdesig.setText(tblModel.getValueAt(selectedRow,4).toString());
       lbl1.setIcon((ImageIcon) tblModel.getValueAt(selectedRow, 3));
        
    }//GEN-LAST:event_jTable3MouseClicked

    private void flavorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flavorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flavorActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void ffMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ffMousePressed
        // TODO add your handling code here:
        ff.setBackground(clk);
        si.setBackground(DefaultColor);
        vr.setBackground(DefaultColor);
        vr1.setBackground(DefaultColor);
        ch.setBackground(DefaultColor);
        co.setBackground(DefaultColor);
        cc.setBackground(DefaultColor);
        cs.setBackground(DefaultColor);
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_ffMousePressed

    private void vr1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vr1MousePressed
        // TODO add your handling code here:
        vr1.setBackground(ClickedColor);
         si.setBackground(DefaultColor);
        vr.setBackground(DefaultColor); 
        ch.setBackground(DefaultColor); 
        co.setBackground(DefaultColor); 
        cc.setBackground(DefaultColor); 
        cs.setBackground(DefaultColor);
        ff.setBackground(dflt);
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_vr1MousePressed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jLabel78MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel78MouseClicked
        try {
            // TODO add your handling code here:
            login  x = new login();
            x.show();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(adminpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel78MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         try {
              Statement s = db.mycon().createStatement();
              
             String sql = "SELECT *FROM buynow";


              
         
 

             ResultSet rs = s.executeQuery(sql);
             while(rs.next()){
                 String fla = rs.getString("Flavor");
               //  String tier = rs.getString("Tier");
               //  String colo = rs.getString("Color");
               //  String hr = rs.getString("HeightRadius");
               //  String suga = String.valueOf(rs.getInt("Sugar"));
               String wei = rs.getString("Weight");
                 String mesg = rs.getString("Message");
                 String taka = String.valueOf(rs.getInt("Cost"));
                 String pid = rs.getString("ID");
                 String cash = rs.getString("DueDate");
                 String use = rs.getString("UserName");
                 
                 String tbData[] = {fla,wei,mesg,taka,pid,cash,use};
                 DefaultTableModel tb1Model = (DefaultTableModel)jTable2.getModel();
                 tb1Model.addRow(tbData);
             }
             // JOptionPane.showMessageDialog(rootPane, "Accept Order?");
          } catch (Exception e) {
              System.out.println(e);
          }
        
           try {
    Statement s = db.mycon().createStatement();
    String sql = "SELECT * FROM stock";

    ResultSet rs = s.executeQuery(sql);

    // Assuming columnIndexForImageColumn is the index of the Image column
    int columnIndexForImageColumn = 3; // Replace this with your actual index
    int desiredRowHeight = 200; // Change this value to adjust the row height as needed

    srch.setRowHeight(desiredRowHeight);
    // Set a custom cell renderer for the image column
      srch.getColumnModel().getColumn(columnIndexForImageColumn).setCellRenderer(new ImageIconRenderer());
    //srch.getColumnModel().getColumn(columnIndexForImageColumn).setCellRenderer(new adminpage.ImageIconRenderer());

    // Custom cell renderer class for ImageIcon
    

    while (rs.next()) {
        String fla = rs.getString("Item");
        String wei = rs.getString("Flavour");
        String mesg = rs.getString("Price");
        
        byte[] imageData = rs.getBytes("Image");

        InputStream in = new ByteArrayInputStream(imageData);
        BufferedImage bImageFromConvert = ImageIO.read(in);
        
        // Create ImageIcon
        ImageIcon imageIcon = new ImageIcon(bImageFromConvert);
        
        // Create row data without ImageIcon
        Object[] rowData = { fla, wei, mesg };
        
        // Add row data to the table model
        DefaultTableModel tb1Model = (DefaultTableModel) srch.getModel();
        tb1Model.addRow(rowData);
        
        // Get the last row index
        int rowIndex = tb1Model.getRowCount() - 1;
        
        // Set the ImageIcon in the JTable cell (assuming the image column is the last one)
        srch.setValueAt(imageIcon, rowIndex, columnIndexForImageColumn);
    }
} catch (Exception e) {
    System.out.println(e);
}
        
        
        
        
           try {
    Statement s = db.mycon().createStatement();

    // Get count from table1
    String queryTable1 = "SELECT COUNT(*) AS count_table1 FROM buynow";
    ResultSet rsTable1 = s.executeQuery(queryTable1);
    if (rsTable1.next()) {
        int countTable1 = rsTable1.getInt("count_table1");
        g=countTable1;
        txttot.setText(String.valueOf(countTable1));
       // System.out.println("Total count in table1: " + countTable1);
    }

 
  rsTable1.close();
   s.close();
}
  catch (Exception e) {
              System.out.println(e);
          }
           
           
             try {
    Statement s = db.mycon().createStatement();

   

    // Get count from table2
    String queryTable2 = "SELECT COUNT(*) AS count_table2 FROM confirm";
    ResultSet rsTable2 = s.executeQuery(queryTable2);
    if (rsTable2.next()) {
        int countTable2 = rsTable2.getInt("count_table2");
       // System.out.println("Total count in table2: " + countTable2);
       gg=countTable2;
        txtpen.setText(String.valueOf(countTable2));
    }

    // Close the ResultSet and Statement
    
  rsTable2.close();
   s.close();
}
  catch (Exception e) {
              System.out.println(e);
          }
             
                   try {
    Statement s = db.mycon().createStatement();

   

    // Get count from table2
    String queryTable2 = "SELECT COUNT(*) AS count_table2 FROM wishlist";
    ResultSet rsTable2 = s.executeQuery(queryTable2);
    if (rsTable2.next()) {
        int countTable2 = rsTable2.getInt("count_table2");
       // System.out.println("Total count in table2: " + countTable2);
       ggg=countTable2;
        txtcom.setText(String.valueOf(countTable2));
    }

    // Close the ResultSet and Statement
    
  rsTable2.close();
   s.close();
}
  catch (Exception e) {
              System.out.println(e);
          }
                   
              int gggg;     
                   
                    try {
    Statement s = db.mycon().createStatement();

   

    // Get count from table2
    String queryTable2 = "SELECT COUNT(*) AS count_table2 FROM discard";
    ResultSet rsTable2 = s.executeQuery(queryTable2);
    if (rsTable2.next()) {
        int countTable2 = rsTable2.getInt("count_table2");
       // System.out.println("Total count in table2: " + countTable2);
       gggg=countTable2;
        txtdis.setText(String.valueOf(countTable2));
    }

    // Close the ResultSet and Statement
    
  rsTable2.close();
   s.close();
}
  catch (Exception e) {
              System.out.println(e);
          }
                   
            //       int gggg = g-gg-ggg;
         //txtdis.setText(String.valueOf(gggg));
         
         
              try {
              Statement s = db.mycon().createStatement();
              
             String sql = "SELECT *FROM review";
             


              
         
 

             ResultSet rs = s.executeQuery(sql);
             while(rs.next()){
                 String fla = rs.getString("Review");
               //  String tier = rs.getString("Tier");
               //  String colo = rs.getString("Color");
               //  String hr = rs.getString("HeightRadius");
               //  String suga = String.valueOf(rs.getInt("Sugar"));
              
                 
                 String tbData[] = {fla};
                 DefaultTableModel tb1Model = (DefaultTableModel)jTable4.getModel();
                 tb1Model.addRow(tbData);
             }
             // JOptionPane.showMessageDialog(rootPane, "Accept Order?");
          } catch (Exception e) {
              System.out.println(e);
          }
              
              try {
              Statement s = db.mycon().createStatement();
              
             String sql = "SELECT *FROM confirm";
             


              
         
 

             ResultSet rs = s.executeQuery(sql);
             while(rs.next()){
                 String fla = rs.getString("Flavor");
               //  String tier = rs.getString("Tier");
               //  String colo = rs.getString("Color");
               //  String hr = rs.getString("HeightRadius");
               //  String suga = String.valueOf(rs.getInt("Sugar"));
               String wei = rs.getString("Weight");
                 String mesg = rs.getString("Message");
                 String taka = String.valueOf(rs.getInt("Cost"));
                 String pid = rs.getString("ID");
                 String cash = rs.getString("DueDate");
                 String use = rs.getString("UserName");
                 
                 String tbData[] = {fla,wei,mesg,taka,pid,cash,use};
                 DefaultTableModel tb1Model = (DefaultTableModel)jTable6.getModel();
                 tb1Model.addRow(tbData);
             }
             // JOptionPane.showMessageDialog(rootPane, "Accept Order?");
          } catch (Exception e) {
              System.out.println(e);
          }
              
              try {
              Statement s = db.mycon().createStatement();
              
            // String sql = "SELECT *FROM wishlist" ;
        
String sql = "SELECT wishlist.*\n" +
             "FROM wishlist\n" +
             "LEFT JOIN confirm ON wishlist.ID = confirm.ID\n" +
             "WHERE confirm.ID IS NULL";

              
         
 

             ResultSet rs = s.executeQuery(sql);
             while(rs.next()){
                 String fla = rs.getString("Flavor");
               //  String tier = rs.getString("Tier");
               //  String colo = rs.getString("Color");
               //  String hr = rs.getString("HeightRadius");
               //  String suga = String.valueOf(rs.getInt("Sugar"));
               String wei = rs.getString("Weight");
                 String mesg = rs.getString("Message");
                 String taka = String.valueOf(rs.getInt("Cost"));
                 String pid = rs.getString("ID");
                 String cash = rs.getString("DueDate");
                 String use = rs.getString("UserName");
                 
                 String tbData[] = {fla,wei,mesg,taka,pid,cash,use};
                // DefaultTableModel tb1Model = (DefaultTableModel)jTable5.getModel();
                // tb1Model.addRow(tbData);
             }
             // JOptionPane.showMessageDialog(rootPane, "Accept Order?");
          } catch (Exception e) {
              System.out.println(e);
          }
              
               try {
              Statement s = db.mycon().createStatement();
              
             String sql = "SELECT *FROM login" ;
        


              
         
 

             ResultSet rs = s.executeQuery(sql);
             while(rs.next()){
                 String fla = rs.getString("Name");
               //  String tier = rs.getString("Tier");
               //  String colo = rs.getString("Color");
               //  String hr = rs.getString("HeightRadius");
               //  String suga = String.valueOf(rs.getInt("Sugar"));
                 String wei = rs.getString("Address");
                 String mesg = rs.getString("PhoneNumber");
               //  String taka = String.valueOf(rs.getInt("Cost"));
               //  String pid = rs.getString("ID");
                // String cash = rs.getString("DueDate");
                // String use = rs.getString("UserName");
                 
                 String tbData[] = {fla,wei,mesg};
                 DefaultTableModel tb1Model = (DefaultTableModel)T2.getModel();
                 tb1Model.addRow(tbData);
             }
             // JOptionPane.showMessageDialog(rootPane, "Accept Order?");
          } catch (Exception e) {
              System.out.println(e);
          }
        
    }//GEN-LAST:event_formWindowOpened

    
    class ImageIconRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (value instanceof ImageIcon) {
                ((JLabel) c).setIcon((ImageIcon) value);
                ((JLabel) c).setText(null); // Clear any text
                  ((JLabel) c).setHorizontalAlignment(SwingConstants.CENTER);
            }
            return c;
        }
    }
    
    
    
    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        // TODO add your handling code here:
        DefaultTableModel obj = (DefaultTableModel)T2.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        T2.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(jTextField8.getText()));
    }//GEN-LAST:event_jTextField8KeyReleased

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased
        // TODO add your handling code here:
        DefaultTableModel obj = (DefaultTableModel)T1.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        T1.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(jTextField9.getText()));
    }//GEN-LAST:event_jTextField9KeyReleased

    private void srchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_srchMouseClicked
        // TODO add your handling code here:
        int selectedRow=srch.getSelectedRow();
        DefaultTableModel tblModel= (DefaultTableModel)srch.getModel();
       // caketxt.setText(tblModel.getValueAt(selectedRow,0).toString());
       // prtxt.setText(tblModel.getValueAt(selectedRow,1).toString());
        //flvrtxt.setText(tblModel.getValueAt(selectedRow,2).toString());
        // txtadded.setText(tblModel.getValueAt(selectedRow,3).toString());
        //txtdesig.setText(tblModel.getValueAt(selectedRow,4).toString());
    }//GEN-LAST:event_srchMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModl= (DefaultTableModel)srch.getModel();
        if(srch.getSelectedRowCount()==1){
            tblModl.removeRow(srch.getSelectedRow());
        }else{
            if(srch.getRowCount()==0){
                 JOptionPane.showMessageDialog(rootPane, "Empty Table");
            }else{
                 JOptionPane.showMessageDialog(rootPane, "Please select Any");
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyReleased
        // TODO add your handling code here:
            DefaultTableModel obj = (DefaultTableModel)srch.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        srch.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(jTextField10.getText()));
    }//GEN-LAST:event_jTextField10KeyReleased

    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable7MouseClicked

    private void jTable8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable8MouseClicked
        // TODO add your handling code here:
        int selectedRow=jTable8.getSelectedRow();
        DefaultTableModel tblModl= (DefaultTableModel)jTable8.getModel();
        jTextField11.setText(tblModl.getValueAt(selectedRow,0).toString());
        jTextField17.setText(tblModl.getValueAt(selectedRow,1).toString());
        jTextField16.setText(tblModl.getValueAt(selectedRow,2).toString());
        jTextField13.setText(tblModl.getValueAt(selectedRow,3).toString());
        jTextField14.setText(tblModl.getValueAt(selectedRow,4).toString());
         jTextField12.setText(tblModl.getValueAt(selectedRow,5).toString());
         jTextField15.setText(tblModl.getValueAt(selectedRow,6).toString());
    }//GEN-LAST:event_jTable8MouseClicked

    private void jLabel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseClicked
        // TODO add your handling code here:
                      try {
              Statement s = db.mycon().createStatement();
              
            // String sql = "SELECT *FROM wishlist" ;
        
String sql = "SELECT *FROM wishlist";

              
         
 

             ResultSet rs = s.executeQuery(sql);
             while(rs.next()){
                 String fla = rs.getString("Flavor");
               //  String tier = rs.getString("Tier");
               //  String colo = rs.getString("Color");
               //  String hr = rs.getString("HeightRadius");
               //  String suga = String.valueOf(rs.getInt("Sugar"));
               String wei = rs.getString("Weight");
                 String mesg = rs.getString("Message");
                 String taka = String.valueOf(rs.getInt("Cost"));
                 String pid = rs.getString("ID");
                 String cash = rs.getString("DueDate");
                 String use = rs.getString("UserName");
                 
                 String tbData[] = {fla,wei,mesg,taka,pid,cash,use};
                 DefaultTableModel tb1Model = (DefaultTableModel)jTable8.getModel();
                 tb1Model.addRow(tbData);
             }
             // JOptionPane.showMessageDialog(rootPane, "Accept Order?");
          } catch (Exception e) {
              System.out.println(e);
          }
    }//GEN-LAST:event_jLabel39MouseClicked

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
          String nam = jTextField11.getText();
         String phone = jTextField17.getText();
          String mail = jTextField16.getText();
          String desig = jTextField13.getText();
          String salary = jTextField14.getText();
           String du = jTextField12.getText();
           String duu = jTextField15.getText();
        
          try {
              Statement s = db.mycon().createStatement();
              s.executeUpdate("INSERT INTO confirm(Flavor,Weight,Message,Cost,ID,DueDate,UserName)"+ "VALUES('"+nam+"','"+phone+"','"+mail+"','"+desig+"','"+salary+"','"+du+"','"+duu+"')");
              JOptionPane.showMessageDialog(rootPane, "Congratulations!Order Completed");
          } catch (Exception e) {
              System.out.println(e);
          }
          
                 try {
    Statement s = db.mycon().createStatement();
    s.executeUpdate("DELETE FROM wishlist WHERE Flavor = '" + nam + "' AND Weight = '" + phone + "' AND Message = '" + mail + "' AND Cost = '" + desig + "' AND ID = '" + salary + "' AND DueDate = '" + du + "' AND UserName = '" + duu + "'");
   // JOptionPane.showMessageDialog(rootPane, "Discarded!");
} catch (Exception e) {
    System.out.println(e);
}
                 
                 DefaultTableModel tblModl= (DefaultTableModel)jTable8.getModel();
        if(jTable8.getSelectedRowCount()==1){
            tblModl.removeRow(jTable8.getSelectedRow());
        }else{
            if(jTable8.getRowCount()==0){
                 JOptionPane.showMessageDialog(rootPane, "Empty Table");
            }else{
                 JOptionPane.showMessageDialog(rootPane, "Please select Any");
            }
        }
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel48MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel48MouseClicked

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminpage().setVisible(true);
              
            }
        });
        
   
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable T1;
    private javax.swing.JTable T2;
    private javax.swing.JButton adbtn1;
    private javax.swing.JButton ans;
    private javax.swing.JButton bacckspace;
    private javax.swing.JPanel cc;
    private javax.swing.JPanel ch;
    private javax.swing.JPanel co;
    private javax.swing.JPanel cs;
    private javax.swing.JPanel ff;
    private javax.swing.JTextField flavor;
    private javax.swing.JTextField item;
    private javax.swing.JButton jBtn15;
    private javax.swing.JButton jBtn16;
    private javax.swing.JButton jBtn17;
    private javax.swing.JButton jBtn18;
    private javax.swing.JButton jBtn19;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn20;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel jpp;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JLabel lbl1;
    private javax.swing.JPanel panline;
    private javax.swing.JTextField price;
    private javax.swing.JPanel si;
    private javax.swing.JTable srch;
    private javax.swing.JTable t2;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtadded1;
    private javax.swing.JTextField txtcom;
    private javax.swing.JTextField txtdesig1;
    private javax.swing.JTextField txtdis;
    private javax.swing.JTextField txtmail1;
    private javax.swing.JTextField txtpen;
    private javax.swing.JTextField txtpn1;
    private javax.swing.JTextField txttot;
    private javax.swing.JButton uppbtn;
    private javax.swing.JPanel vr;
    private javax.swing.JPanel vr1;
    // End of variables declaration//GEN-END:variables
}
