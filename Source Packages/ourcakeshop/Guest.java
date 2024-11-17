package ourcakeshop;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

 
import javax.swing.Timer;
import java.awt.event.*;



import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JPopupMenu;
import swing.DataSearch;
import swing.EventClick;
import swing.PanelSearch;
import com.raven.event.EventItem;
import com.raven.form.FormHome1;
import com.raven.model.ModelItem;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.ImageIcon;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import org.jdesktop.animation.timing.interpolation.PropertySetter;

import AppPackage.AnimationClass;
import com.mysql.cj.jdbc.Blob;
//import com.harium.etyl.core.animation.Animator;
import com.raven.event.EventItem;
import com.raven.form.FormHome;
import com.raven.model.ModelItem;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import main.Tiramisu;
//import ourcakeshop.bajecopied1.formWindowOpened.ImageIconRenderer;
import test.Slide1;
import test.Slide2;
import test.Slide3;

/**
 *
 * @author User
 */
public class Guest extends javax.swing.JFrame {
     private JPopupMenu menu;
    private PanelSearch search;
    
    private FormHome1 fu;
     private Animator ff;
    private Point fff;
    private ModelItem ffff;
    
    
    private FormHome1 home;
     private Animator animator;
    private Point animatePoint;
    private ModelItem itemSelected;
    
    private FormHome1 homee;
     private Animator animatorr;
    private Point animatePointt;
    private ModelItem itemSelectedd;
    
    
     private FormHome1 homeee;
     private Animator animatorrr;
    private Point animatePointtt;
    private ModelItem itemSelecteddd;
    
      private FormHome1 ome;
     private Animator nimator;
    private Point nimatePoint;
    private ModelItem temSelected;
    
    private FormHome1 omee;
     private Animator nimatorr;
    private Point nimatePointt;
    private ModelItem temSelectedd;
    
    
     private FormHome1 omeee;
     private Animator nimatorrr;
    private Point nimatePointtt;
    private ModelItem temSelecteddd;
    
      private FormHome1 me;
     private Animator imator;
    private Point imatePoint;
    private ModelItem emSelected;
    
    private FormHome1 mee;
     private Animator imatorr;
    private Point imatePointt;
    private ModelItem emSelectedd;
    
    
     private FormHome1 meee;
     private Animator imatorrr;
    private Point imatePointtt;
    private ModelItem emSelecteddd;
    
    
    AnimationClass ac= new AnimationClass();
    
  DefaultListModel defaultListModel = new DefaultListModel();
    /**
     * Creates new form baje
     */
    public Guest() {
        initComponents();
          setExtendedState(Guest.MAXIMIZED_BOTH);
          menu = new JPopupMenu();
        search = new PanelSearch();
        menu.setBorder(BorderFactory.createLineBorder(new Color(164, 164, 164)));
        menu.add(search);
        menu.setFocusable(false);
        search.addEventClick(new EventClick() {
            @Override
            public void itemClick(DataSearch data) {
                menu.setVisible(false);
                txtSearch.setText(data.getText());
                
                System.out.println("Click Item : " + data.getText());
            }

            @Override
            public void itemRemove(Component com, DataSearch data) {
                search.remove(com);
                removeHistory(data.getText());
                menu.setPopupSize(menu.getWidth(), (search.getItemSize() * 35) + 2);
                if (search.getItemSize() == 0) {
                    menu.setVisible(false);
                }
                System.out.println("Remove Item : " + data.getText());
            }
        });
          txtSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String searchText = txtSearch.getText();
                if (searchText.equals("Birthday cake")) {
                    
                    jTabbedPane1.setSelectedIndex(2);
               
                }
              else if (searchText.equals("Kid's Cakes")) {
                    
                    jTabbedPane1.setSelectedIndex(4);
               
                }
                 else if (searchText.equals("Fruit Cake")) {
                    
                    jTabbedPane1.setSelectedIndex(3);
               
                }
                 else if (searchText.equals("Anniversary Cakes")) {
                    
                      jTabbedPane1.setSelectedIndex(6);
               
                }
                 else if (searchText.equals("Tiramisu")) {
                    
                  jTabbedPane1.setSelectedIndex(5);
               
                }
                 else if (searchText.equals("Brownies")) {
                    
                      jTabbedPane1.setSelectedIndex(7);
               
                }
                 else if (searchText.equals("Cup Cakes")) {
                    
                      jTabbedPane1.setSelectedIndex(8);
               
                }
                 else if (searchText.equals("Truffle Cakes")) {
                    
                     jTabbedPane1.setSelectedIndex(9);
               
                }
                 else if (searchText.equals("Pastry")) {
                    
                   jTabbedPane1.setSelectedIndex(10);
               
                }
            }
        });
          
          
          
          
         slideshow2.initSlideshow(new Slide1(), new Slide2(), new Slide3());
              // slideshow3.initSlideshow(new Slide1(), new Slide2(), new Slide3());
                    //  slideshow4.initSlideshow(new Slide1(), new Slide2(), new Slide3());
                         //    slideshow5.initSlideshow(new Slide1(), new Slide2(), new Slide3());
  //      this.bindData();
        jPanel9.hide();
        // setBackground(new Color(0, 0, 0, 0));
        init();
       // ini();
          animator = PropertySetter.createAnimator(500, mainPanel, "imageLocation", animatePoint, mainPanel.getTargetLocation());
          animator.addTarget(new PropertySetter(mainPanel, "imageSize", new Dimension(180, 120), mainPanel.getTargetSize()));
          animator.addTarget(new TimingTargetAdapter() {
            @Override
            public void end() {
                mainPanel.setImageOld(null);
            }
        });
        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        
        
         //init();
        ini();
          animatorr = PropertySetter.createAnimator(500, mainPanel1, "imageLocation", animatePointt, mainPanel1.getTargetLocation());
          animatorr.addTarget(new PropertySetter(mainPanel1, "imageSize", new Dimension(180, 120), mainPanel1.getTargetSize()));
          animatorr.addTarget(new TimingTargetAdapter() {
            @Override
            public void end() {
                mainPanel1.setImageOld(null);
            }
        });
        animatorr.setResolution(0);
        animatorr.setAcceleration(.5f);
        animatorr.setDeceleration(.5f);
        
                in();
          animatorrr = PropertySetter.createAnimator(500, mainPanel2, "imageLocation", animatePointtt, mainPanel2.getTargetLocation());
          animatorrr.addTarget(new PropertySetter(mainPanel2, "imageSize", new Dimension(180, 120), mainPanel2.getTargetSize()));
          animatorrr.addTarget(new TimingTargetAdapter() {
            @Override
            public void end() {
                mainPanel2.setImageOld(null);
            }
        });
        animatorrr.setResolution(0);
        animatorrr.setAcceleration(.5f);
        animatorrr.setDeceleration(.5f);
        
        
        xinit();
       // ini();
          nimator = PropertySetter.createAnimator(500, mainPanel3, "imageLocation", nimatePoint, mainPanel3.getTargetLocation());
          nimator.addTarget(new PropertySetter(mainPanel3, "imageSize", new Dimension(180, 120), mainPanel3.getTargetSize()));
          nimator.addTarget(new TimingTargetAdapter() {
            @Override
            public void end() {
                mainPanel3.setImageOld(null);
            }
        });
        nimator.setResolution(0);
        nimator.setAcceleration(.5f);
        nimator.setDeceleration(.5f);
        
        
         xini();
          nimatorr = PropertySetter.createAnimator(500, mainPanel4, "imageLocation", nimatePointt, mainPanel4.getTargetLocation());
          nimatorr.addTarget(new PropertySetter(mainPanel4, "imageSize", new Dimension(180, 120), mainPanel4.getTargetSize()));
          nimatorr.addTarget(new TimingTargetAdapter() {
            @Override
            public void end() {
                mainPanel4.setImageOld(null);
            }
        });
        nimatorr.setResolution(0);
        nimatorr.setAcceleration(.5f);
        nimatorr.setDeceleration(.5f);
        
                xin();
          nimatorrr = PropertySetter.createAnimator(500, mainPanel5, "imageLocation", nimatePointtt, mainPanel5.getTargetLocation());
          nimatorrr.addTarget(new PropertySetter(mainPanel5, "imageSize", new Dimension(180, 120), mainPanel5.getTargetSize()));
          nimatorrr.addTarget(new TimingTargetAdapter() {
            @Override
            public void end() {
                mainPanel5.setImageOld(null);
            }
        });
        nimatorrr.setResolution(0);
        nimatorrr.setAcceleration(.5f);
        nimatorrr.setDeceleration(.5f);
        
        
        
        
        
        
         xxinit();
       // ini();
          imator = PropertySetter.createAnimator(500, mainPanel6, "imageLocation", imatePoint, mainPanel6.getTargetLocation());
          imator.addTarget(new PropertySetter(mainPanel6, "imageSize", new Dimension(180, 120), mainPanel6.getTargetSize()));
          imator.addTarget(new TimingTargetAdapter() {
            @Override
            public void end() {
                mainPanel6.setImageOld(null);
            }
        });
        imator.setResolution(0);
        imator.setAcceleration(.5f);
        imator.setDeceleration(.5f);
        
        
         xxini();
          imatorr = PropertySetter.createAnimator(500, mainPanel7, "imageLocation", imatePointt, mainPanel7.getTargetLocation());
          imatorr.addTarget(new PropertySetter(mainPanel7, "imageSize", new Dimension(180, 120), mainPanel7.getTargetSize()));
          imatorr.addTarget(new TimingTargetAdapter() {
            @Override
            public void end() {
                mainPanel7.setImageOld(null);
            }
        });
        imatorr.setResolution(0);
        imatorr.setAcceleration(.5f);
        imatorr.setDeceleration(.5f);
        
                xxin();
          imatorrr = PropertySetter.createAnimator(500, mainPanel8, "imageLocation", imatePointtt, mainPanel8.getTargetLocation());
          imatorrr.addTarget(new PropertySetter(mainPanel8, "imageSize", new Dimension(180, 120), mainPanel8.getTargetSize()));
          imatorrr.addTarget(new TimingTargetAdapter() {
            @Override
            public void end() {
                mainPanel8.setImageOld(null);
            }
        });
        imatorrr.setResolution(0);
        imatorrr.setAcceleration(.5f);
        imatorrr.setDeceleration(.5f);
        
    } 
   // String ss;
      public Guest(String msg) {
        initComponents();
          setExtendedState(Guest.MAXIMIZED_BOTH);
        jLabel123.setText(msg);
      //  ss=msg;
        // jLabel14.setText(ms);
       // sss=ms;
        
    }
      private void init(){
        home = new FormHome1();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(home);
        testData();
    }
      private void ini(){
        homee = new FormHome1();
        mainPanel1.setLayout(new BorderLayout());
        mainPanel1.add(homee);
        estData();
    }
      private void in(){
        homeee = new FormHome1();
        mainPanel2.setLayout(new BorderLayout());
        mainPanel2.add(homeee);
        stData();
    }
      
      
      
          private void xinit(){
        ome = new FormHome1();
        mainPanel3.setLayout(new BorderLayout());
        mainPanel3.add(ome);
        xtestData();
    }
      private void xini(){
        omee = new FormHome1();
        mainPanel4.setLayout(new BorderLayout());
        mainPanel4.add(omee);
        xestData();
    }
      private void xin(){
        omeee = new FormHome1();
        mainPanel5.setLayout(new BorderLayout());
        mainPanel5.add(omeee);
        xstData();
    }
      
      
          private void xxinit(){
        me = new FormHome1();
        mainPanel6.setLayout(new BorderLayout());
        mainPanel6.add(me);
        xxtestData();
    }
      private void xxini(){
        mee = new FormHome1();
        mainPanel7.setLayout(new BorderLayout());
        mainPanel7.add(mee);
        xxestData();
    }
      private void xxin(){
        meee = new FormHome1();
        mainPanel8.setLayout(new BorderLayout());
        mainPanel8.add(meee);
        xxstData();
    }
      
   
    
  
    private void testData() {
        
         home.setEvent(new EventItem() {
            @Override
            public void itemClick(Component com, ModelItem item) {
                if (itemSelected != null) {
                    mainPanel.setImageOld(itemSelected.getImage());
                }
                if (itemSelected != item) {
                    if (!animator.isRunning()) {
                        itemSelected = item;
                        animatePoint = getLocationOf(com);
                        mainPanel.setImage(item.getImage());
                        mainPanel.setImageLocation(animatePoint);
                        mainPanel.setImageSize(new Dimension(10, 120));
                        mainPanel.repaint();
                        home.setSelected(com);
                        home.showItem(item);
                        animator.start();
                    }
                }
            }
        });
     int ID = 1;
       // for (int i = 1; i <= 6; i++) {
              home.addItem(new ModelItem(1, "Butter Blast", "This product is excluded from all promotional discounts and offers.", 560, "Product Code:013", new ImageIcon(getClass().getResource("/icon/b1.jpg"))));
            home.addItem(new ModelItem(2, "Seven Sins", "This product is excluded from all promotional discounts and offers.", 100, "Product Code:014", new ImageIcon(getClass().getResource("/icon/b2.jpg"))));
            home.addItem(new ModelItem(3, "Six Layers", "Stock 2", 650, "Product Code:015", new ImageIcon(getClass().getResource("/icon/b3.jpg"))));
            home.addItem(new ModelItem(4, "Angel", "Stock 3", 540, "Product Code:016", new ImageIcon(getClass().getResource("/icon/b4.jpg"))));
            home.addItem(new ModelItem(5, "Babka Cake", "Stock 1", 720, "Product Code:017", new ImageIcon(getClass().getResource("/icon/b5.jpg"))));
            home.addItem(new ModelItem(6, "Vancho Cake", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:018", new ImageIcon(getClass().getResource("/icon/b6.jpg"))));
       // }
    }
    
     private void estData() {
        
         homee.setEvent(new EventItem() {
            @Override
            public void itemClick(Component com, ModelItem item) {
                if (itemSelectedd != null) {
                    mainPanel1.setImageOld(itemSelectedd.getImage());
                }
                if (itemSelectedd != item) {
                    if (!animatorr.isRunning()) {
                        itemSelectedd = item;
                        animatePointt = getLocationOff(com);
                        mainPanel1.setImage(item.getImage());
                        mainPanel1.setImageLocation(animatePointt);
                        mainPanel1.setImageSize(new Dimension(10, 120));
                        mainPanel1.repaint();
                        homee.setSelected(com);
                        homee.showItem(item);
                        animatorr.start();
                    }
                }
            }
        });
     int ID = 1;
       // for (int i = 1; i <= 6; i++) {
          
            homee.addItem(new ModelItem(1, "Mixed Fruit", "This product is excluded from all promotional discounts and offers.", 670, "Product Code:019", new ImageIcon(getClass().getResource("/icon/1.jpg"))));
            homee.addItem(new ModelItem(2, "Mixed Fruit", "This product is excluded from all promotional discounts and offers.", 500, "Product Code:020", new ImageIcon(getClass().getResource("/icon/2.jpg"))));
            homee.addItem(new ModelItem(3, "Mixed Fruit", "Stock 5", 650, "Product Code:021", new ImageIcon(getClass().getResource("/icon/3.jpg"))));
            homee.addItem(new ModelItem(4, "Strawberry cake", "Stock 3", 560, "Product Code:022", new ImageIcon(getClass().getResource("/icon/4.jpg"))));
            homee.addItem(new ModelItem(5, "Mixed Fruit", "Stock 2", 420, "Product Code:023", new ImageIcon(getClass().getResource("/icon/5.jpg"))));
            homee.addItem(new ModelItem(6, "Mixed Fruit", "This product is excluded from all promotional discounts and offers.", 560, "Product Code:024", new ImageIcon(getClass().getResource("/icon/6.jpg"))));
     }
     private void stData() {
        
         homeee.setEvent(new EventItem() {
            @Override
            public void itemClick(Component com, ModelItem item) {
                if (itemSelecteddd != null) {
                    mainPanel2.setImageOld(itemSelecteddd.getImage());
                }
                if (itemSelecteddd != item) {
                    if (!animatorrr.isRunning()) {
                        itemSelecteddd = item;
                        animatePointtt = getLocationOfff(com);
                        mainPanel2.setImage(item.getImage());
                        mainPanel2.setImageLocation(animatePointtt);
                        mainPanel2.setImageSize(new Dimension(10, 120));
                        mainPanel2.repaint();
                        homeee.setSelected(com);
                        homeee.showItem(item);
                        animatorrr.start();
                    }
                }
            }
        });
     int ID = 1;
       // for (int i = 1; i <= 6; i++) {
       homeee.addItem(new ModelItem(1, "The Spiderman", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:001", new ImageIcon(getClass().getResource("/icon/k1.jpg"))));
           homeee.addItem(new ModelItem(2, "Angry Bird", "This product is excluded from all promotional discounts and offers.", 100, "Product Code:002", new ImageIcon(getClass().getResource("/icon/k2.jpg"))));
            homeee.addItem(new ModelItem(3, "Car Cake", "NMD City Stock 2", 150, "Product Code:003", new ImageIcon(getClass().getResource("/icon/k3.jpg"))));
            homeee.addItem(new ModelItem(4, "Car Cake", "NMD City Stock 2", 160, "Product Code:004", new ImageIcon(getClass().getResource("/icon/k4.jpg"))));
            homeee.addItem(new ModelItem(5, "Doraemon", "NMD City Stock 2", 120, "Product Code:005", new ImageIcon(getClass().getResource("/icon/k5.jpg"))));
            homeee.addItem(new ModelItem(6, "Doraemon", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:006", new ImageIcon(getClass().getResource("/icon/k6.jpg"))));  
            
            homeee.addItem(new ModelItem(7, "The Spider", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:007", new ImageIcon(getClass().getResource("/icon/k7.jpg"))));
            homeee.addItem(new ModelItem(8, "CAR cake", "This product is excluded from all promotional discounts and offers.", 100, "Product Code:008", new ImageIcon(getClass().getResource("/icon/k8.jpg"))));
            homeee.addItem(new ModelItem(9, "Barbie Cake", "NMD City Stock 2", 150, "Product Code:009", new ImageIcon(getClass().getResource("/icon/k9.jpg"))));
            homeee.addItem(new ModelItem(10, "Barbie Cake", "NMD City Stock 2", 160, "Product Code:010", new ImageIcon(getClass().getResource("/icon/k10.jpg"))));
            homeee.addItem(new ModelItem(11, "Micky MOuse", "NMD City Stock 2", 120, "Product Code:011", new ImageIcon(getClass().getResource("/icon/k11.jpg"))));
            homeee.addItem(new ModelItem(12, "The Spider", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:012", new ImageIcon(getClass().getResource("/icon/k12.jpg"))));
            
              homeee.addItem(new ModelItem(13, "The Spider", "This product is excluded from all promotional discounts and offers.", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/k13.jpg"))));
            homeee.addItem(new ModelItem(14, "Jungle Jug", "This product is excluded from all promotional discounts and offers.", 100, "Available", new ImageIcon(getClass().getResource("/icon/k14.jpg"))));
            homeee.addItem(new ModelItem(15, "Jungle sher", "NMD City Stock 2", 150, "No Pre order based", new ImageIcon(getClass().getResource("/icon/k15.jpg"))));
            homeee.addItem(new ModelItem(16, "Hati&Sathi", "NMD City Stock 2", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/k16.jpg"))));
            homeee.addItem(new ModelItem(17, "Jugle zoo", "NMD City Stock 2", 120, "Available", new ImageIcon(getClass().getResource("/icon/k17.jpg"))));
            homeee.addItem(new ModelItem(18, "The Spider", "This product is excluded from all promotional discounts and offers.", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/k18.jpg"))));
            
              homeee.addItem(new ModelItem(19, "Billu ji", "This product is excluded from all promotional discounts and offers.", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/k19.jpg"))));
            homeee.addItem(new ModelItem(20, "Jungle Jug", "This product is excluded from all promotional discounts and offers.", 100, "Available", new ImageIcon(getClass().getResource("/icon/k20.jpg"))));
            homeee.addItem(new ModelItem(21, "Jungle sher", "NMD City Stock 2", 150, "No Pre order based", new ImageIcon(getClass().getResource("/icon/k21.jpg"))));
            homeee.addItem(new ModelItem(22, "Hati&Sathi", "NMD City Stock 2", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/k22.jpg"))));
            homeee.addItem(new ModelItem(23, "Jugle zoo", "NMD City Stock 2", 120, "Available", new ImageIcon(getClass().getResource("/icon/k23.jpg"))));
            homeee.addItem(new ModelItem(24, "The Spider", "This product is excluded from all promotional discounts and offers.", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/k24.jpg"))));
       
       
            homeee.addItem(new ModelItem(25, "Billu ji", "This product is excluded from all promotional discounts and offers.", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/11.jpg"))));
            homeee.addItem(new ModelItem(26, "Jungle Jug", "This product is excluded from all promotional discounts and offers.", 100, "Available", new ImageIcon(getClass().getResource("/icon/22.jpg"))));
            homeee.addItem(new ModelItem(27, "Jungle sher", "NMD City Stock 2", 150, "No Pre order based", new ImageIcon(getClass().getResource("/icon/33.jpg"))));
            homeee.addItem(new ModelItem(28, "Hati&Sathi", "NMD City Stock 2", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/44.jpg"))));
            homeee.addItem(new ModelItem(29, "Jugle zoo", "NMD City Stock 2", 120, "Available", new ImageIcon(getClass().getResource("/icon/55.jpg"))));
            homeee.addItem(new ModelItem(30, "The Spider", "This product is excluded from all promotional discounts and offers.", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/66.jpg"))));
       // }
    }
     
     
     
     
     
      private void xtestData() {
        
         ome.setEvent(new EventItem() {
            @Override
            public void itemClick(Component com, ModelItem item) {
                if (temSelected != null) {
                    mainPanel3.setImageOld(temSelected.getImage());
                }
                if (temSelected != item) {
                    if (!nimator.isRunning()) {
                        temSelected = item;
                        nimatePoint = etLocationOf(com);
                        mainPanel3.setImage(item.getImage());
                        mainPanel3.setImageLocation(nimatePoint);
                        mainPanel3.setImageSize(new Dimension(10, 120));
                        mainPanel3.repaint();
                        ome.setSelected(com);
                        ome.showItem(item);
                        nimator.start();
                    }
                }
            }
        });
     int ID = 1;
       // for (int i = 1; i <= 6; i++) {
            ome.addItem(new ModelItem(1, " Classic Tiramisu", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:025", new ImageIcon(getClass().getResource("/icon/t1.jpg"))));
            ome.addItem(new ModelItem(2, " Tiramisu Eclair", "This product is excluded from all promotional discounts and offers.", 100, "Product Code:026", new ImageIcon(getClass().getResource("/icon/t2.jpg"))));
            ome.addItem(new ModelItem(3, " Classic Tiramisu", "NMD City Stock 2", 150, "Product Code:027", new ImageIcon(getClass().getResource("/icon/t3.jpg"))));
            ome.addItem(new ModelItem(4, "Tiramisu Mille-Crepe", "NMD City Stock 2", 160, "Product Code:028", new ImageIcon(getClass().getResource("/icon/t4.jpg"))));
            ome.addItem(new ModelItem(5, "Brownie Tiramisu", "NMD City Stock 2", 120, "Product Code:029", new ImageIcon(getClass().getResource("/icon/t5.jpg"))));
            ome.addItem(new ModelItem(6, " Classic Tiramisu", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:030", new ImageIcon(getClass().getResource("/icon/t6.jpg"))));
            
             ome.addItem(new ModelItem(1, " Tiramisu Eclair", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:031", new ImageIcon(getClass().getResource("/icon/t7.jpg"))));
            ome.addItem(new ModelItem(2, "Tiramisu Mille-Crepe", "This product is excluded from all promotional discounts and offers.", 100, "Product Code:032", new ImageIcon(getClass().getResource("/icon/t8.jpg"))));
            ome.addItem(new ModelItem(3, "SUPERNOVA", "NMD City Stock 2", 150, "Product Code:033", new ImageIcon(getClass().getResource("/icon/t9.jpg"))));
            ome.addItem(new ModelItem(4, " Classic Tiramisu", "NMD City Stock 2", 160, "Product Code:034", new ImageIcon(getClass().getResource("/icon/t10.jpg"))));
            ome.addItem(new ModelItem(5, " Tiramisu Eclair", "NMD City Stock 2", 120, "Product Code:035", new ImageIcon(getClass().getResource("/icon/t11.jpg"))));
            ome.addItem(new ModelItem(6, " Tiramisu Eclair", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:036", new ImageIcon(getClass().getResource("/icon/t12.jpg"))));
            
             ome.addItem(new ModelItem(1, " Tiramisu Eclair", "This product is excluded from all promotional discounts and offers.", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/t13.jpg"))));
            ome.addItem(new ModelItem(2, " Classic Tiramisu", "This product is excluded from all promotional discounts and offers.", 100, "Available", new ImageIcon(getClass().getResource("/icon/t14.jpg"))));
            ome.addItem(new ModelItem(3, "Brownie Tiramisu", "NMD City Stock 2", 150, "No Pre order based", new ImageIcon(getClass().getResource("/icon/t15.jpg"))));
            ome.addItem(new ModelItem(4, "Tiramisu Mille-Crepe", "NMD City Stock 2", 160, "Available", new ImageIcon(getClass().getResource("/icon/t16.jpg"))));
            ome.addItem(new ModelItem(5, " Classic Tiramisu", "NMD City Stock 2", 120, "Available", new ImageIcon(getClass().getResource("/icon/t17.jpg"))));
            ome.addItem(new ModelItem(6, "Brownie Tiramisu", "This product is excluded from all promotional discounts and offers.", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/t18.jpg"))));
       // }
    }
    
     private void xestData() {
        
         omee.setEvent(new EventItem() {
            @Override
            public void itemClick(Component com, ModelItem item) {
                if (temSelectedd != null) {
                    mainPanel4.setImageOld(temSelectedd.getImage());
                }
                if (temSelectedd != item) {
                    if (!nimatorr.isRunning()) {
                        temSelectedd = item;
                        nimatePointt = tLocationOff(com);
                        mainPanel4.setImage(item.getImage());
                        mainPanel4.setImageLocation(nimatePointt);
                        mainPanel4.setImageSize(new Dimension(10, 120));
                        mainPanel4.repaint();
                        omee.setSelected(com);
                        omee.showItem(item);
                        nimatorr.start();
                    }
                }
            }
        });
     int ID = 1;
       // for (int i = 1; i <= 6; i++) {
            omee.addItem(new ModelItem(1, "Timeless Tradition Cake", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:037", new ImageIcon(getClass().getResource("/icon/a1.jpg"))));
            omee.addItem(new ModelItem(2, "Gourmet Delight Cake", "This product is excluded from all promotional discounts and offers.", 100, "Product Code:038", new ImageIcon(getClass().getResource("/icon/a2.jpg"))));
            omee.addItem(new ModelItem(3, "Starting a New", "NMD City Stock 2", 150, "Product Code:039", new ImageIcon(getClass().getResource("/icon/a3.jpg"))));
            omee.addItem(new ModelItem(4, "Golden Years Cake", "NMD City Stock 2", 160, "Product Code:040", new ImageIcon(getClass().getResource("/icon/a4.jpg"))));
            omee.addItem(new ModelItem(5, "Enchanted Garden Cake", "NMD City Stock 2", 120, "Product Code:041", new ImageIcon(getClass().getResource("/icon/a5.jpg"))));
            //omee.addItem(new ModelItem(6, "Celebration of Life Cake", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:042", new ImageIcon(getClass().getResource("/icon/a6.jpg"))));
            
              omee.addItem(new ModelItem(1, "Golden Years Cake", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:043", new ImageIcon(getClass().getResource("/icon/a7.jpg"))));
            omee.addItem(new ModelItem(2, "Gourmet Delight Cake", "This product is excluded from all promotional discounts and offers.", 100, "Product Code:044", new ImageIcon(getClass().getResource("/icon/a8.jpg"))));
            omee.addItem(new ModelItem(3, "Enchanted Garden Cake", "NMD City Stock 2", 150, "Product Code:045", new ImageIcon(getClass().getResource("/icon/a9.jpg"))));
            omee.addItem(new ModelItem(4, "Marrige anniversary", "NMD City Stock 2", 160, "Product Code:046", new ImageIcon(getClass().getResource("/icon/a10.jpg"))));
            omee.addItem(new ModelItem(5, "Golden Years Cake", "NMD City Stock 2", 120, "Product Code:047", new ImageIcon(getClass().getResource("/icon/a11.jpg"))));
            omee.addItem(new ModelItem(6, "Timeless Tradition Cake", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:048", new ImageIcon(getClass().getResource("/icon/a12.jpg"))));
            
             // omee.addItem(new ModelItem(1, "Starting a New", "This product is excluded from all promotional discounts and offers.", 160, "Available", new ImageIcon(getClass().getResource("/icon/a13.jpg"))));
            //omee.addItem(new ModelItem(2, "Marrige anniversary", "This product is excluded from all promotional discounts and offers.", 100, "Pre order based", new ImageIcon(getClass().getResource("/icon/a14.jpg"))));
            //omee.addItem(new ModelItem(3, "Marrige anniversary", "NMD City Stock 2", 150, "Available", new ImageIcon(getClass().getResource("/icon/a15.jpg"))));
            //omee.addItem(new ModelItem(4, "Starting a New", "NMD City Stock 2", 160, " Milestone Achievement", new ImageIcon(getClass().getResource("/icon/a16.jpg"))));
           // omee.addItem(new ModelItem(5, "Marrige anniversary", "NMD City Stock 2", 120, "No Pre order based", new ImageIcon(getClass().getResource("/icon/a17.jpg"))));
           // omee.addItem(new ModelItem(6, "Starting a New", "This product is excluded from all promotional discounts and offers.", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/a18.jpg")))); 
            
             // omee.addItem(new ModelItem(1, "Starting a New", "This product is excluded from all promotional discounts and offers.", 160, "Available", new ImageIcon(getClass().getResource("/icon/a19.jpg"))));
            //omee.addItem(new ModelItem(2, " Personal Achievement", "This product is excluded from all promotional discounts and offers.", 100, "Pre order based", new ImageIcon(getClass().getResource("/icon/a20.jpg"))));
           // omee.addItem(new ModelItem(3, " Gourmet Delight Cake", "NMD City Stock 2", 150, " Milestone Achievement", new ImageIcon(getClass().getResource("/icon/a21.jpg"))));
           // omee.addItem(new ModelItem(4, "Starting a New", "NMD City Stock 2", 160, "Available", new ImageIcon(getClass().getResource("/icon/a22.jpg"))));
           // omee.addItem(new ModelItem(5, " Celebration of Life Cake", "NMD City Stock 2", 120, "Available", new ImageIcon(getClass().getResource("/icon/a23.jpg"))));
           // omee.addItem(new ModelItem(6, " Milestone Achievement", "This product is excluded from all promotional discounts and offers.", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/a25.jpg"))));
       // }
    }
    
     private void xstData() {
        
         omeee.setEvent(new EventItem() {
            @Override
            public void itemClick(Component com, ModelItem item) {
                if (temSelecteddd != null) {
                    mainPanel5.setImageOld(temSelecteddd.getImage());
                }
                if (temSelecteddd != item) {
                    if (!nimatorrr.isRunning()) {
                        temSelecteddd = item;
                        nimatePointtt = LocationOfff(com);
                        mainPanel5.setImage(item.getImage());
                        mainPanel5.setImageLocation(nimatePointtt);
                        mainPanel5.setImageSize(new Dimension(10, 120));
                        mainPanel5.repaint();
                        omeee.setSelected(com);
                        omeee.showItem(item);
                        nimatorrr.start();
                    }
                }
            }
        });
     int ID = 1;
       // for (int i = 1; i <= 6; i++) {
            omeee.addItem(new ModelItem(1, "Chocolate Chip Brownies", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:049", new ImageIcon(getClass().getResource("/icon/v1.jpg"))));
            omeee.addItem(new ModelItem(2, "Fudge Brownies", "This product is excluded from all promotional discounts and offers.", 100, "Product Code:050", new ImageIcon(getClass().getResource("/icon/v2.jpg"))));
            omeee.addItem(new ModelItem(3, "Chocolate Chip Brownies", "NMD City Stock 2", 150, "Product Code:051", new ImageIcon(getClass().getResource("/icon/v3.jpg"))));
            omeee.addItem(new ModelItem(4, "Peanut Butter Brownies", "NMD City Stock 2", 160, "Product Code:052", new ImageIcon(getClass().getResource("/icon/v4.jpg"))));
            omeee.addItem(new ModelItem(5, "Classic Brownies", "NMD City Stock 2", 120, "Product Code:053", new ImageIcon(getClass().getResource("/icon/v5.jpg"))));
            omeee.addItem(new ModelItem(6, "Gluten-Free Brownies:", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:054", new ImageIcon(getClass().getResource("/icon/v6.jpg"))));
       // }
       
       
           omeee.addItem(new ModelItem(1, "Fudge Brownies", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:055", new ImageIcon(getClass().getResource("/icon/v7.jpg"))));
           // omeee.addItem(new ModelItem(2, "FORUM MID", "This product is excluded from all promotional discounts and offers.", 100, "Adidas", new ImageIcon(getClass().getResource("/icon/v8.jpg"))));
            omeee.addItem(new ModelItem(3, "Walnut Brownies", "NMD City Stock 2", 150, "Product Code:056", new ImageIcon(getClass().getResource("/icon/v9.jpg"))));
            omeee.addItem(new ModelItem(4, "Black Bean Brownies", "NMD City Stock 2", 160, "Product Code:057", new ImageIcon(getClass().getResource("/icon/v10.jpg"))));
            omeee.addItem(new ModelItem(5, "Chocolate Chip Brownies", "NMD City Stock 2", 120, "Product Code:058", new ImageIcon(getClass().getResource("/icon/v11.jpg"))));
            omeee.addItem(new ModelItem(6, "Fudge Brownies", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:059", new ImageIcon(getClass().getResource("/icon/v12.jpg"))));
       // }
         omeee.addItem(new ModelItem(1, "Walnut Brownies", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:060", new ImageIcon(getClass().getResource("/icon/v13.jpg"))));
            omeee.addItem(new ModelItem(2, "Gluten-Free Brownies:", "This product is excluded from all promotional discounts and offers.", 100, "Product Code:061", new ImageIcon(getClass().getResource("/icon/v14.jpg"))));
            omeee.addItem(new ModelItem(3, "Peanut Butter Brownies", "NMD City Stock 2", 150, "Product Code:062", new ImageIcon(getClass().getResource("/icon/v15.jpg"))));
            omeee.addItem(new ModelItem(4, "Cream Cheese Brownies", "NMD City Stock 2", 160, "Product Code:063", new ImageIcon(getClass().getResource("/icon/v16.jpg"))));
            omeee.addItem(new ModelItem(5, "Classic Brownies", "NMD City Stock 2", 120, "Product Code:064", new ImageIcon(getClass().getResource("/icon/v17.jpg"))));
            omeee.addItem(new ModelItem(6, "Chocolate Chip Brownies", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:065", new ImageIcon(getClass().getResource("/icon/v18.jpg"))));
       // }
       
    }
     
     
     
     
      private void xxtestData() {
        
         me.setEvent(new EventItem() {
            @Override
            public void itemClick(Component com, ModelItem item) {
                if (emSelected != null) {
                    mainPanel6.setImageOld(emSelected.getImage());
                }
                if (emSelected != item) {
                    if (!imator.isRunning()) {
                        emSelected = item;
                        imatePoint = ocationOf(com);
                        mainPanel6.setImage(item.getImage());
                        mainPanel6.setImageLocation(imatePoint);
                        mainPanel6.setImageSize(new Dimension(10, 120));
                        mainPanel6.repaint();
                        me.setSelected(com);
                        me.showItem(item);
                        imator.start();
                    }
                }
            }
        });
     int ID = 1;
       // for (int i = 1; i <= 6; i++) {
            me.addItem(new ModelItem(1, "Rainbow Cupcakes", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:066", new ImageIcon(getClass().getResource("/icon/c1.jpg"))));
            me.addItem(new ModelItem(2, "Rainbow Cupcakes", "This product is excluded from all promotional discounts and offers.", 100, "Product Code:067", new ImageIcon(getClass().getResource("/icon/c2.jpg"))));
            me.addItem(new ModelItem(3, "Maple Bacon Cupcakes", "NMD City Stock 2", 150, "Product Code:068", new ImageIcon(getClass().getResource("/icon/c3.jpg"))));
            me.addItem(new ModelItem(4, "Salted Caramel Cupcakes", "NMD City Stock 2", 160, "Product Code:069", new ImageIcon(getClass().getResource("/icon/c4.jpg"))));
            me.addItem(new ModelItem(5, "Raspberry Cupcakes", "NMD City Stock 2", 120, "Product Code:070", new ImageIcon(getClass().getResource("/icon/c5.jpg"))));
            me.addItem(new ModelItem(6, "Cookie Dough Cupcakes", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:071", new ImageIcon(getClass().getResource("/icon/c6.jpg"))));
       // }
       
        me.addItem(new ModelItem(1, "Maple Bacon Cupcakes", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:072", new ImageIcon(getClass().getResource("/icon/c7.jpg"))));
            me.addItem(new ModelItem(2, "Salted Caramel Cupcakes", "This product is excluded from all promotional discounts and offers.", 100, "Product Code:073", new ImageIcon(getClass().getResource("/icon/c8.jpg"))));
            me.addItem(new ModelItem(3, "Raspberry Cupcakes", "NMD City Stock 2", 150, "Product Code:074", new ImageIcon(getClass().getResource("/icon/c9.jpg"))));
            me.addItem(new ModelItem(4, "Adidas", "NMD City Stock 2", 160, "Product Code:075", new ImageIcon(getClass().getResource("/icon/c10.jpg"))));
            me.addItem(new ModelItem(5, "Pumpkin Spice Cupcakes", "NMD City Stock 2", 120, "Product Code:076", new ImageIcon(getClass().getResource("/icon/c11.jpg"))));
            me.addItem(new ModelItem(6, "Cookie Dough Cupcakes", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:077", new ImageIcon(getClass().getResource("/icon/c12.jpg"))));
            
             me.addItem(new ModelItem(1, "Coconut Cupcakes", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:078", new ImageIcon(getClass().getResource("/icon/c13.jpg"))));
            me.addItem(new ModelItem(2, "Coffee Cupcakes", "This product is excluded from all promotional discounts and offers.", 100, "Product Code:079", new ImageIcon(getClass().getResource("/icon/c14.jpg"))));
            me.addItem(new ModelItem(3, "Peanut Butter Cupcakes", "NMD City Stock 2", 150, "Product Code:080", new ImageIcon(getClass().getResource("/icon/c15.jpg"))));
         //   me.addItem(new ModelItem(4, "Chai Latte Cupcakes", "NMD City Stock 2", 160, "No Pre order based", new ImageIcon(getClass().getResource("/icon/c16.jpg"))));
          //  me.addItem(new ModelItem(5, "Carrot Cake Cupcakes", "NMD City Stock 2", 120, "Available", new ImageIcon(getClass().getResource("/icon/c17.jpg"))));
          //  me.addItem(new ModelItem(6, "Coffee Cupcakes", "This product is excluded from all promotional discounts and offers.", 160, "No Pre order based", new ImageIcon(getClass().getResource("/icon/c18.jpg"))));
            
          //   me.addItem(new ModelItem(1, "Coconut Cupcakes", "This product is excluded from all promotional discounts and offers.", 160, "No Pre order based", new ImageIcon(getClass().getResource("/icon/c19.jpg"))));
          //  me.addItem(new ModelItem(2, "Coffee Cupcakes", "This product is excluded from all promotional discounts and offers.", 100, "No Pre order based", new ImageIcon(getClass().getResource("/icon/c20.jpg"))));
          //  me.addItem(new ModelItem(3, "Pumpkin Spice Cupcakes", "NMD City Stock 2", 150, "Pre order based", new ImageIcon(getClass().getResource("/icon/c21.jpg"))));
         //   me.addItem(new ModelItem(4, "Coconut Cupcakes", "NMD City Stock 2", 160, "No Pre order based", new ImageIcon(getClass().getResource("/icon/c22.jpg"))));
          //  me.addItem(new ModelItem(5, "Raspberry Cupcakes", "NMD City Stock 2", 120, "Pre order based", new ImageIcon(getClass().getResource("/icon/c23.jpg"))));
          //  me.addItem(new ModelItem(6, "Oreo Cupcakes", "This product is excluded from all promotional discounts and offers.", 160, "No Pre order based", new ImageIcon(getClass().getResource("/icon/c24.jpg"))));
            
           //  me.addItem(new ModelItem(1, "Chai Latte Cupcakes", "This product is excluded from all promotional discounts and offers.", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/c25.jpg"))));
           // me.addItem(new ModelItem(2, "Carrot Cake Cupcakes", "This product is excluded from all promotional discounts and offers.", 100, "No Pre order based", new ImageIcon(getClass().getResource("/icon/c26.jpg"))));
           // me.addItem(new ModelItem(3, "Maple Bacon Cupcakes", "NMD City Stock 2", 150, "No Pre order based", new ImageIcon(getClass().getResource("/icon/c27.jpg"))));
          //  me.addItem(new ModelItem(4, "Peanut Butter Cupcakes", "NMD City Stock 2", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/c28.jpg"))));
          //  me.addItem(new ModelItem(5, "Chai Latte Cupcakes", "NMD City Stock 2", 120, "No Pre order based", new ImageIcon(getClass().getResource("/icon/c29.jpg"))));
          //  me.addItem(new ModelItem(6, "Oreo Cupcakes", "This product is excluded from all promotional discounts and offers.", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/c30.jpg"))));
            
            
          //   me.addItem(new ModelItem(1, "Oreo Cupcakes", "This product is excluded from all promotional discounts and offers.", 160, "No Pre order based", new ImageIcon(getClass().getResource("/icon/c31.jpg"))));
          //  me.addItem(new ModelItem(2, "Peanut Butter Cupcakes", "This product is excluded from all promotional discounts and offers.", 100, "Pre order based", new ImageIcon(getClass().getResource("/icon/c32.jpg"))));
          //  me.addItem(new ModelItem(3, "Oreo Cupcakes", "NMD City Stock 2", 150, "No Pre order based", new ImageIcon(getClass().getResource("/icon/c33.jpg"))));
           // me.addItem(new ModelItem(4, "Carrot Cake Cupcakes", "NMD City Stock 2", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/c34.jpg"))));
           // me.addItem(new ModelItem(5, "Maple Bacon Cupcakes", "NMD City Stock 2", 120, "No Pre order based", new ImageIcon(getClass().getResource("/icon/c5.jpg"))));
          //  me.addItem(new ModelItem(6, "Pumpkin Spice Cupcakes", "This product is excluded from all promotional discounts and offers.", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/c36.jpg"))));
            
             
    }
    
     private void xxestData() {
        
         mee.setEvent(new EventItem() {
            @Override
            public void itemClick(Component com, ModelItem item) {
                if (emSelectedd != null) {
                    mainPanel7.setImageOld(emSelectedd.getImage());
                }
                if (emSelectedd != item) {
                    if (!imatorr.isRunning()) {
                        emSelectedd = item;
                        imatePointt = cationOff(com);
                        mainPanel7.setImage(item.getImage());
                        mainPanel7.setImageLocation(imatePointt);
                        mainPanel7.setImageSize(new Dimension(10, 120));
                        mainPanel7.repaint();
                        mee.setSelected(com);
                        mee.showItem(item);
                        imatorr.start();
                    }
                }
            }
        });
     int ID = 1;
       // for (int i = 1; i <= 6; i++) {
            mee.addItem(new ModelItem(1, "Rocky Road Truffle Cake", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:081", new ImageIcon(getClass().getResource("/icon/r1.jpg"))));
            mee.addItem(new ModelItem(2, "Strawberry Truffle Cake", "This product is excluded from all promotional discounts and offers.", 100, "Product Code:082", new ImageIcon(getClass().getResource("/icon/r2.jpg"))));
            mee.addItem(new ModelItem(3, "Baileys Irish Cream Truffle Cake", "NMD City Stock 2", 150, "Product Code:083", new ImageIcon(getClass().getResource("/icon/r3.jpg"))));
            mee.addItem(new ModelItem(4, "Cherry Truffle Cake", "NMD City Stock 2", 160, "Product Code:084", new ImageIcon(getClass().getResource("/icon/r4.jpg"))));
            mee.addItem(new ModelItem(5, "Rocky Road Truffle Cake", "NMD City Stock 2", 120, "Product Code:085", new ImageIcon(getClass().getResource("/icon/r5.jpg"))));
            mee.addItem(new ModelItem(6, "Strawberry Truffle Cake", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:086", new ImageIcon(getClass().getResource("/icon/r6.jpg"))));
       // }
       
        mee.addItem(new ModelItem(1, "Baileys Irish Cream Truffle Cake", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:087", new ImageIcon(getClass().getResource("/icon/r7.jpg"))));
            mee.addItem(new ModelItem(2, "Baileys Irish Cream Truffle Cake", "This product is excluded from all promotional discounts and offers.", 100, "Product Code:088", new ImageIcon(getClass().getResource("/icon/r8.jpg"))));
            mee.addItem(new ModelItem(3, "Rocky Road Truffle Cake", "NMD City Stock 2", 150, "Product Code:089", new ImageIcon(getClass().getResource("/icon/r9.jpg"))));
            mee.addItem(new ModelItem(4, "Cherry Truffle Cake", "NMD City Stock 2", 160, "Product Code:090", new ImageIcon(getClass().getResource("/icon/r10.jpg"))));
            mee.addItem(new ModelItem(5, "Strawberry Truffle Cake", "NMD City Stock 2", 120, "Product Code:091", new ImageIcon(getClass().getResource("/icon/r11.jpg"))));
            mee.addItem(new ModelItem(6, "Rocky Road Truffle Cake", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:092", new ImageIcon(getClass().getResource("/icon/r12.jpg"))));
            
             //mee.addItem(new ModelItem(1, "Cherry Truffle Cake", "This product is excluded from all promotional discounts and offers.", 160, "No Pre order based", new ImageIcon(getClass().getResource("/icon/r13.jpg"))));
            //mee.addItem(new ModelItem(2, "Baileys Irish Cream Truffle Cake", "This product is excluded from all promotional discounts and offers.", 100, "Pre order based", new ImageIcon(getClass().getResource("/icon/r14.jpg"))));
            //mee.addItem(new ModelItem(3, "Rocky Road Truffle Cake", "NMD City Stock 2", 150, "No Pre order based", new ImageIcon(getClass().getResource("/icon/r15.jpg"))));
           // mee.addItem(new ModelItem(4, "Almond Joy Truffle Cake", "NMD City Stock 2", 160, "No Pre order based", new ImageIcon(getClass().getResource("/icon/r16.jpg"))));
           // mee.addItem(new ModelItem(5, "Almond Joy Truffle Cake", "NMD City Stock 2", 120, "Pre order based", new ImageIcon(getClass().getResource("/icon/r17.jpg"))));
           // mee.addItem(new ModelItem(6, "Rocky Road Truffle Cake", "This product is excluded from all promotional discounts and offers.", 160, "No Pre order based", new ImageIcon(getClass().getResource("/icon/r18.jpg"))));
            
           //  mee.addItem(new ModelItem(1, "Strawberry Truffle Cake", "This product is excluded from all promotional discounts and offers.", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/r19.jpg"))));
           // mee.addItem(new ModelItem(2, "Baileys Irish Cream Truffle Cake", "This product is excluded from all promotional discounts and offers.", 100, "No Pre order based", new ImageIcon(getClass().getResource("/icon/r20.jpg"))));
           // mee.addItem(new ModelItem(3, "Cherry Truffle Cake", "NMD City Stock 2", 150, "No Pre order based", new ImageIcon(getClass().getResource("/icon/r21.jpg"))));
           // mee.addItem(new ModelItem(4, "Rocky Road Truffle Cake", "NMD City Stock 2", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/r22.jpg"))));
           // mee.addItem(new ModelItem(5, "Strawberry Truffle Cake", "NMD City Stock 2", 120, "Pre order based", new ImageIcon(getClass().getResource("/icon/r23.jpg"))));
            //mee.addItem(new ModelItem(6, "Cherry Truffle Cake", "This product is excluded from all promotional discounts and offers.", 160, "Pre order based", new ImageIcon(getClass().getResource("/icon/r24.jpg"))));
    }
    
     private void xxstData() {
        
         meee.setEvent(new EventItem() {
            @Override
            public void itemClick(Component com, ModelItem item) {
                if (emSelecteddd != null) {
                    mainPanel8.setImageOld(emSelecteddd.getImage());
                }
                if (emSelecteddd != item) {
                    if (!imatorrr.isRunning()) {
                        emSelecteddd = item;
                        imatePointtt = ationOfff(com);
                        mainPanel8.setImage(item.getImage());
                        mainPanel8.setImageLocation(imatePointtt);
                        mainPanel8.setImageSize(new Dimension(10, 120));
                        mainPanel8.repaint();
                        meee.setSelected(com);
                        meee.showItem(item);
                        imatorrr.start();
                    }
                }
            }
        });
     int ID = 1;
       // for (int i = 1; i <= 6; i++) {
            meee.addItem(new ModelItem(1, "Danish Pastry", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:093", new ImageIcon(getClass().getResource("/icon/p1.jpg"))));
            meee.addItem(new ModelItem(2, "Croissant", "This product is excluded from all promotional discounts and offers.", 100, "Product Code:094", new ImageIcon(getClass().getResource("/icon/p2.jpg"))));
            meee.addItem(new ModelItem(3, "Croissant", "NMD City Stock 2", 150, "Product Code:095", new ImageIcon(getClass().getResource("/icon/p3.jpg"))));
            meee.addItem(new ModelItem(4, "Danish Pastry", "NMD City Stock 2", 160, "Product Code:096", new ImageIcon(getClass().getResource("/icon/p4.jpg"))));
            meee.addItem(new ModelItem(5, "Palmier", "NMD City Stock 2", 120, "Product Code:097", new ImageIcon(getClass().getResource("/icon/p5.jpg"))));
            meee.addItem(new ModelItem(6, "Strudel", "This product is excluded from all promotional discounts and offers.", 160, "Product Code:098", new ImageIcon(getClass().getResource("/icon/p6.jpg"))));
       // }
    }
     
     
     
     
     private Point getLocationOf(Component com) {
        Point p = home.getPanelItemLocation();
        int x = p.x;
        int y = p.y;
        int itemX = com.getX();
        int itemY = com.getY();
        int left = 10;
        int top = 35;
        return new Point(x + itemX + left, y + itemY + top);
    }
    
      private Point getLocationOff(Component com) {
        Point p = homee.getPanelItemLocation();
        int x = p.x;
        int y = p.y;
        int itemX = com.getX();
        int itemY = com.getY();
        int left = 10;
        int top = 35;
        return new Point(x + itemX + left, y + itemY + top);
    }
      
      private Point getLocationOfff(Component com) {
        Point p = homeee.getPanelItemLocation();
        int x = p.x;
        int y = p.y;
        int itemX = com.getX();
        int itemY = com.getY();
        int left = 10;
        int top = 35;
        return new Point(x + itemX + left, y + itemY + top);
    }
      
      
      
      
       private Point etLocationOf(Component com) {
        Point p = ome.getPanelItemLocation();
        int x = p.x;
        int y = p.y;
        int itemX = com.getX();
        int itemY = com.getY();
        int left = 10;
        int top = 35;
        return new Point(x + itemX + left, y + itemY + top);
    }
    
      private Point tLocationOff(Component com) {
        Point p = omee.getPanelItemLocation();
        int x = p.x;
        int y = p.y;
        int itemX = com.getX();
        int itemY = com.getY();
        int left = 10;
        int top = 35;
        return new Point(x + itemX + left, y + itemY + top);
    }
      
      private Point LocationOfff(Component com) {
        Point p = omeee.getPanelItemLocation();
        int x = p.x;
        int y = p.y;
        int itemX = com.getX();
        int itemY = com.getY();
        int left = 10;
        int top = 35;
        return new Point(x + itemX + left, y + itemY + top);
    }
    
      
       private Point ocationOf(Component com) {
        Point p = me.getPanelItemLocation();
        int x = p.x;
        int y = p.y;
        int itemX = com.getX();
        int itemY = com.getY();
        int left = 10;
        int top = 35;
        return new Point(x + itemX + left, y + itemY + top);
    }
    
      private Point cationOff(Component com) {
        Point p = mee.getPanelItemLocation();
        int x = p.x;
        int y = p.y;
        int itemX = com.getX();
        int itemY = com.getY();
        int left = 10;
        int top = 35;
        return new Point(x + itemX + left, y + itemY + top);
    }
      
      private Point ationOfff(Component com) {
        Point p = meee.getPanelItemLocation();
        int x = p.x;
        int y = p.y;
        int itemX = com.getX();
        int itemY = com.getY();
        int left = 10;
        int top = 35;
        return new Point(x + itemX + left, y + itemY + top);
    }
      
      
      private ArrayList getStars()
    {
        ArrayList stars = new ArrayList();
        stars.add("Birthday cake");
        stars.add("Fruit cake");
        stars.add("Wedding cake");
        stars.add("Kid's Cakes");
        stars.add("Photo Cakes");
        stars.add("Eggless Cakes");
        stars.add("Anniversary Cakes");
        stars.add("Cup Cakes");
        stars.add("Brownies");
        stars.add("Sugar Free Cakes");
        stars.add("Pastry");
        stars.add("Cheese Cakes");
        stars.add("Tiramisu");
        stars.add("Truffle Cakes");
        
        
        
        
        return stars;
        
        
                
    }
    
    
    
    
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
     int i=56;
    Timer T= new Timer(1000,new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {i--;
        if(i>=0)
            t.setText(""+i);
        }
    });
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DS = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel20 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbItemName = new javax.swing.JLabel();
        lbDescription = new javax.swing.JLabel();
        pic = new com.raven.swing.PictureBox();
        lbPrice = new javax.swing.JLabel();
        lbBrand = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        lbItemName1 = new javax.swing.JLabel();
        lbDescription1 = new javax.swing.JLabel();
        pic1 = new com.raven.swing.PictureBox();
        lbPrice1 = new javax.swing.JLabel();
        lbBrand1 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        lbItemName2 = new javax.swing.JLabel();
        lbDescription2 = new javax.swing.JLabel();
        pic2 = new com.raven.swing.PictureBox();
        lbPrice2 = new javax.swing.JLabel();
        lbBrand2 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        lbItemName3 = new javax.swing.JLabel();
        lbDescription3 = new javax.swing.JLabel();
        pic3 = new com.raven.swing.PictureBox();
        lbPrice3 = new javax.swing.JLabel();
        lbBrand3 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        lbItemName4 = new javax.swing.JLabel();
        lbDescription4 = new javax.swing.JLabel();
        pic4 = new com.raven.swing.PictureBox();
        lbPrice4 = new javax.swing.JLabel();
        lbBrand4 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jPanel53 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        lbItemName5 = new javax.swing.JLabel();
        lbDescription5 = new javax.swing.JLabel();
        pic5 = new com.raven.swing.PictureBox();
        lbPrice5 = new javax.swing.JLabel();
        lbBrand5 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        lbItemName6 = new javax.swing.JLabel();
        lbDescription6 = new javax.swing.JLabel();
        pic6 = new com.raven.swing.PictureBox();
        lbPrice6 = new javax.swing.JLabel();
        lbBrand6 = new javax.swing.JLabel();
        jPanel57 = new javax.swing.JPanel();
        lbItemName7 = new javax.swing.JLabel();
        lbDescription7 = new javax.swing.JLabel();
        pic7 = new com.raven.swing.PictureBox();
        lbPrice7 = new javax.swing.JLabel();
        lbBrand7 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        lbItemName8 = new javax.swing.JLabel();
        lbDescription8 = new javax.swing.JLabel();
        pic8 = new com.raven.swing.PictureBox();
        lbPrice8 = new javax.swing.JLabel();
        lbBrand8 = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        lbItemName9 = new javax.swing.JLabel();
        lbDescription9 = new javax.swing.JLabel();
        pic9 = new com.raven.swing.PictureBox();
        lbPrice9 = new javax.swing.JLabel();
        lbBrand9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSearch = new swing.MyTextField();
        jPanel4 = new javax.swing.JPanel();
        background1 = new com.raven.swing.Background();
        mainPanel = new com.raven.swing.MainPanel();
        jPanel7 = new javax.swing.JPanel();
        background3 = new com.raven.swing.Background();
        mainPanel2 = new com.raven.swing.MainPanel();
        jPanel6 = new javax.swing.JPanel();
        background2 = new com.raven.swing.Background();
        mainPanel1 = new com.raven.swing.MainPanel();
        jPanel8 = new javax.swing.JPanel();
        background4 = new com.raven.swing.Background();
        mainPanel3 = new com.raven.swing.MainPanel();
        jPanel14 = new javax.swing.JPanel();
        background5 = new com.raven.swing.Background();
        mainPanel4 = new com.raven.swing.MainPanel();
        jPanel15 = new javax.swing.JPanel();
        background6 = new com.raven.swing.Background();
        mainPanel5 = new com.raven.swing.MainPanel();
        jPanel16 = new javax.swing.JPanel();
        background7 = new com.raven.swing.Background();
        mainPanel6 = new com.raven.swing.MainPanel();
        jPanel17 = new javax.swing.JPanel();
        background8 = new com.raven.swing.Background();
        mainPanel7 = new com.raven.swing.MainPanel();
        jPanel18 = new javax.swing.JPanel();
        background9 = new com.raven.swing.Background();
        mainPanel8 = new com.raven.swing.MainPanel();
        jPanel19 = new javax.swing.JPanel();
        slideshow1 = new slideshow.Slideshow();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        slideshow2 = new slideshow.Slideshow();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel122 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel62 = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel21 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel63 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        srch = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        caketxt = new javax.swing.JTextField();
        prtxt = new javax.swing.JTextField();
        flvrtxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 153, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Birthday Cakes");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fruit Cakes");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Kid's Cakes");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 180, 100));

        jPanel11.setBackground(new java.awt.Color(255, 102, 102));
        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/home (1).png"))); // NOI18N
        jLabel17.setText("HOME");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 210, 50));

        jPanel13.setBackground(new java.awt.Color(255, 102, 102));
        jPanel13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/cake.png"))); // NOI18N
        jLabel14.setText("Our Cakes");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 210, -1));

        jPanel27.setBackground(new java.awt.Color(255, 102, 102));
        jPanel27.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/cake.png"))); // NOI18N
        jLabel46.setText("Pastries");
        jLabel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel46MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 210, -1));

        jPanel26.setBackground(new java.awt.Color(255, 102, 102));
        jPanel26.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/cake.png"))); // NOI18N
        jLabel45.setText("Tiramisu");
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 210, -1));

        jPanel28.setBackground(new java.awt.Color(255, 102, 102));
        jPanel28.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/cake.png"))); // NOI18N
        jLabel47.setText("CupCakes");
        jLabel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel47MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 210, -1));

        jPanel12.setBackground(new java.awt.Color(255, 102, 102));
        jPanel12.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/gift.png"))); // NOI18N
        jLabel5.setText("Offers");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 210, -1));

        jPanel25.setBackground(new java.awt.Color(255, 102, 102));
        jPanel25.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/gift.png"))); // NOI18N
        jLabel18.setText("About Us");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel18))
        );

        jPanel1.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 210, -1));

        jPanel29.setBackground(new java.awt.Color(255, 102, 102));
        jPanel29.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/gift.png"))); // NOI18N
        jLabel44.setText("Search Here");
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 210, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("LOGIN");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 710, -1, -1));

        DS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sobi/Pink Sweet Cake Information Mobile Video (1500 x 800 px) (1300 x 350 px) (1280 x 260 px) (232 x 800 px).gif"))); // NOI18N
        DS.setText("jLabel44");
        jPanel1.add(DS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, -1));

        jLabel123.setText("jLabel123");
        jPanel1.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 232, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 255));
        jLabel1.setText("Customer Care");
        jPanel44.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 14, 148, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("Help Centre");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel44.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 45, -1, -1));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel55.setText("Returns and Refund");
        jPanel44.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 93, -1, -1));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel56.setText("How to Buy");
        jLabel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel56MouseClicked(evt);
            }
        });
        jPanel44.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 69, -1, -1));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel57.setText("Contact Us");
        jPanel44.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 117, -1, -1));

        jLabel58.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel58.setText("Terms and Conditions");
        jLabel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel58MouseClicked(evt);
            }
        });
        jPanel44.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 141, -1, -1));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel59.setText("Central Complain Management");
        jPanel44.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 165, -1, -1));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 102, 255));
        jLabel60.setText("Frosting Fantasy");
        jPanel44.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 14, 148, -1));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel61.setText("Frosting Fantasy Exclusive");
        jPanel44.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 69, -1, -1));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel62.setText("About Frosting Fantasy");
        jLabel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel62MouseClicked(evt);
            }
        });
        jPanel44.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 45, -1, -1));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel63.setText("Frosting Fantasy Cares");
        jPanel44.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 93, -1, -1));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel64.setText("Digital Payments");
        jPanel44.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 117, -1, -1));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 102, 255));
        jLabel65.setText("Payment Method");
        jPanel44.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 14, 148, -1));

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 102, 255));
        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/Screenshot (25).png"))); // NOI18N
        jPanel44.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 102, 255));
        jLabel67.setText("Exclusive Deals and Offers");
        jPanel44.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 110, 232, -1));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 102, 255));
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/Screenshot (26).png"))); // NOI18N
        jPanel44.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 40, 210, 66));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 102, 255));
        jLabel69.setText("Follow Us");
        jPanel44.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 148, -1));

        jLabel70.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 102, 255));
        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/Screenshot (30).png"))); // NOI18N
        jPanel44.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 140, 232, 90));

        jPanel20.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2000, 1300, 300));

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setBackground(new java.awt.Color(102, 102, 102));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("Categories");
        jPanel24.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 6, 148, 37));

        jLabel139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sobi/White Minimalist Happy Birthday Greetings Mobile Video (300 x 300 px) (300 x 300 px).gif"))); // NOI18N
        jLabel139.setText("jLabel139");
        jPanel24.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 486, 301, -1));

        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sobi/Pink White Modern Strawberry Cake Instagram Reels (500 x 500 px) (300 x 300 px).gif"))); // NOI18N
        jLabel140.setText("jLabel139");
        jPanel24.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 61, 301, -1));

        jLabel141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sobi/White Fresh Fruit Instagram Post (300 x 300 px).gif"))); // NOI18N
        jLabel141.setText("jLabel139");
        jPanel24.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 301, -1));

        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sobi/Pink Cupcake Recipe Mobile Video (300 x 300 px) (1) (1).gif"))); // NOI18N
        jLabel142.setText("jLabel139");
        jLabel142.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel142MouseClicked(evt);
            }
        });
        jPanel24.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 61, 301, -1));

        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sobi/Pink Cupcake Recipe Mobile Video (500 x 500 px) (300 x 300 px).gif"))); // NOI18N
        jLabel143.setText("jLabel139");
        jLabel143.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel143MouseClicked(evt);
            }
        });
        jPanel24.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 486, 301, -1));

        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sobi/White Minimalist Happy Birthday Greetings Mobile Video (300 x 300 px).gif"))); // NOI18N
        jPanel24.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, -1, -1));

        jLabel38.setFont(new java.awt.Font("Edwardian Script ITC", 1, 48)); // NOI18N
        jLabel38.setText("Cupcakes");
        jPanel24.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 373, 174, -1));

        jLabel39.setFont(new java.awt.Font("Edwardian Script ITC", 1, 48)); // NOI18N
        jLabel39.setText("Fruit Cake");
        jPanel24.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 373, 206, -1));

        jLabel40.setFont(new java.awt.Font("Edwardian Script ITC", 1, 48)); // NOI18N
        jLabel40.setText("Pastry");
        jPanel24.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(896, 381, 206, -1));

        jLabel41.setFont(new java.awt.Font("Edwardian Script ITC", 1, 48)); // NOI18N
        jLabel41.setText("Tiramissu");
        jPanel24.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 786, 180, -1));

        jLabel42.setFont(new java.awt.Font("Edwardian Script ITC", 1, 48)); // NOI18N
        jLabel42.setText("BirthdayCake");
        jPanel24.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 790, 245, -1));

        jLabel43.setFont(new java.awt.Font("Edwardian Script ITC", 1, 48)); // NOI18N
        jLabel43.setText("Kid'sCake");
        jPanel24.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(896, 786, 245, -1));

        jLabel48.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel48.setText("See More");
        jLabel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel48MouseClicked(evt);
            }
        });
        jPanel24.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 396, -1, -1));

        jLabel49.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jLabel49.setText("See More");
        jLabel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel49MouseClicked(evt);
            }
        });
        jPanel24.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 396, -1, -1));

        jLabel50.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel50.setText("See More");
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });
        jPanel24.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 799, -1, 57));

        jLabel51.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel51.setText("See More");
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
        });
        jPanel24.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 810, -1, -1));

        jLabel52.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel52.setText("See More");
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });
        jPanel24.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(1147, 804, -1, -1));

        jLabel53.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel53.setText("See More");
        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel53MouseClicked(evt);
            }
        });
        jPanel24.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(1147, 395, -1, -1));

        jPanel20.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 1280, 880));

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(204, 51, 0));
        jLabel71.setText("On Sale Now");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel72.setText("Ending in");

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(204, 51, 0));
        jLabel73.setText("5");

        t.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        t.setForeground(new java.awt.Color(204, 51, 0));

        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(204, 51, 0));
        jLabel74.setText("16");

        jLabel75.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel75.setText(":");

        jLabel76.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel76.setText(":");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel71)
                .addGap(93, 93, 93)
                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(807, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel75)
                        .addComponent(jLabel76)
                        .addComponent(jLabel72)
                        .addComponent(jLabel71)))
                .addContainerGap())
        );

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("FlashSale");

        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        lbItemName.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbItemName.setForeground(new java.awt.Color(76, 76, 76));
        lbItemName.setText("Valentine Cake");

        lbDescription.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbDescription.setForeground(new java.awt.Color(178, 178, 178));
        lbDescription.setText("Valentines Day Special");

        pic.setImage(new javax.swing.ImageIcon(getClass().getResource("/myimage/s5_1.jpg"))); // NOI18N
        pic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                picMouseClicked(evt);
            }
        });

        lbPrice.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbPrice.setForeground(new java.awt.Color(76, 76, 76));
        lbPrice.setText("500");

        lbBrand.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbBrand.setForeground(new java.awt.Color(76, 76, 76));
        lbBrand.setText("Product Code 100");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(lbBrand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbPrice))
                    .addComponent(lbItemName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbItemName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrice)
                    .addComponent(lbBrand))
                .addGap(20, 20, 20))
        );

        lbItemName1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbItemName1.setForeground(new java.awt.Color(76, 76, 76));
        lbItemName1.setText("Birthday Cake");

        lbDescription1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbDescription1.setForeground(new java.awt.Color(178, 178, 178));
        lbDescription1.setText("Rainbow Sprinkles");

        pic1.setImage(new javax.swing.ImageIcon(getClass().getResource("/myimage/s10.jpg"))); // NOI18N
        pic1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic1MouseClicked(evt);
            }
        });

        lbPrice1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbPrice1.setForeground(new java.awt.Color(76, 76, 76));
        lbPrice1.setText("450");

        lbBrand1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbBrand1.setForeground(new java.awt.Color(76, 76, 76));
        lbBrand1.setText("Product Code 101");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel49Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel49Layout.createSequentialGroup()
                        .addComponent(lbBrand1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbPrice1))
                    .addComponent(lbItemName1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescription1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbItemName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescription1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrice1)
                    .addComponent(lbBrand1))
                .addGap(20, 20, 20))
        );

        lbItemName2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbItemName2.setForeground(new java.awt.Color(76, 76, 76));
        lbItemName2.setText("Basic Vanilla Cake");

        lbDescription2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbDescription2.setForeground(new java.awt.Color(178, 178, 178));
        lbDescription2.setText("With Chocolate ganash");

        pic2.setImage(new javax.swing.ImageIcon(getClass().getResource("/myimage/s3_1.jpg"))); // NOI18N
        pic2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic2MouseClicked(evt);
            }
        });

        lbPrice2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbPrice2.setForeground(new java.awt.Color(76, 76, 76));
        lbPrice2.setText("400");

        lbBrand2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbBrand2.setForeground(new java.awt.Color(76, 76, 76));
        lbBrand2.setText("Product Code 103");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel50Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pic2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel50Layout.createSequentialGroup()
                        .addComponent(lbBrand2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbPrice2))
                    .addComponent(lbItemName2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescription2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbItemName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescription2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrice2)
                    .addComponent(lbBrand2))
                .addGap(20, 20, 20))
        );

        lbItemName3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbItemName3.setForeground(new java.awt.Color(76, 76, 76));
        lbItemName3.setText("ButterScotch Cake");

        lbDescription3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbDescription3.setForeground(new java.awt.Color(178, 178, 178));
        lbDescription3.setText("Flower Patels");

        pic3.setImage(new javax.swing.ImageIcon(getClass().getResource("/myimage/s2.jpg"))); // NOI18N
        pic3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic3MouseClicked(evt);
            }
        });

        lbPrice3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbPrice3.setForeground(new java.awt.Color(76, 76, 76));
        lbPrice3.setText("450");

        lbBrand3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbBrand3.setForeground(new java.awt.Color(76, 76, 76));
        lbBrand3.setText("Product Code 102");

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel51Layout.createSequentialGroup()
                        .addComponent(lbBrand3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbPrice3))
                    .addComponent(lbItemName3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescription3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbItemName3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescription3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrice3)
                    .addComponent(lbBrand3))
                .addGap(20, 20, 20))
        );

        lbItemName4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbItemName4.setForeground(new java.awt.Color(76, 76, 76));
        lbItemName4.setText("Rainbow Cake");

        lbDescription4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbDescription4.setForeground(new java.awt.Color(178, 178, 178));
        lbDescription4.setText("Rainbow flavored");

        pic4.setImage(new javax.swing.ImageIcon(getClass().getResource("/myimage/s1.jpg"))); // NOI18N
        pic4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic4MouseClicked(evt);
            }
        });

        lbPrice4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbPrice4.setForeground(new java.awt.Color(76, 76, 76));
        lbPrice4.setText("600");

        lbBrand4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbBrand4.setForeground(new java.awt.Color(76, 76, 76));
        lbBrand4.setText("Product Code 104");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pic4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel52Layout.createSequentialGroup()
                        .addComponent(lbBrand4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbPrice4))
                    .addComponent(lbItemName4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescription4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbItemName4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescription4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrice4)
                    .addComponent(lbBrand4))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );

        jPanel20.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 1280, 410));
        jPanel20.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 1950, -1, -1));

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("You Might Wanna Try");

        jPanel55.setBackground(new java.awt.Color(255, 255, 255));

        lbItemName5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbItemName5.setForeground(new java.awt.Color(76, 76, 76));
        lbItemName5.setText("chocolate Overload");

        lbDescription5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbDescription5.setForeground(new java.awt.Color(178, 178, 178));
        lbDescription5.setText("Dark Chocolate");

        pic5.setImage(new javax.swing.ImageIcon(getClass().getResource("/myimage/tr1.jpg"))); // NOI18N
        pic5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic5MouseClicked(evt);
            }
        });

        lbPrice5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbPrice5.setForeground(new java.awt.Color(76, 76, 76));
        lbPrice5.setText("500");

        lbBrand5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbBrand5.setForeground(new java.awt.Color(76, 76, 76));
        lbBrand5.setText("Per Pound");

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel55Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pic5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel55Layout.createSequentialGroup()
                        .addComponent(lbBrand5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbPrice5))
                    .addComponent(lbItemName5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescription5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbItemName5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescription5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrice5)
                    .addComponent(lbBrand5))
                .addGap(20, 20, 20))
        );

        jPanel56.setBackground(new java.awt.Color(255, 255, 255));

        lbItemName6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbItemName6.setForeground(new java.awt.Color(76, 76, 76));
        lbItemName6.setText("Mud Cake");

        lbDescription6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbDescription6.setForeground(new java.awt.Color(178, 178, 178));
        lbDescription6.setText("Dark Chocolate");

        pic6.setImage(new javax.swing.ImageIcon(getClass().getResource("/myimage/tr5.jpg"))); // NOI18N
        pic6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic6MouseClicked(evt);
            }
        });

        lbPrice6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbPrice6.setForeground(new java.awt.Color(76, 76, 76));
        lbPrice6.setText("450");

        lbBrand6.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbBrand6.setForeground(new java.awt.Color(76, 76, 76));
        lbBrand6.setText("Per Pound");

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel56Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pic6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel56Layout.createSequentialGroup()
                        .addComponent(lbBrand6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbPrice6))
                    .addComponent(lbItemName6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescription6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbItemName6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescription6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrice6)
                    .addComponent(lbBrand6))
                .addGap(20, 20, 20))
        );

        jPanel57.setBackground(new java.awt.Color(255, 255, 255));

        lbItemName7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbItemName7.setForeground(new java.awt.Color(76, 76, 76));
        lbItemName7.setText("Chocolate Pastry");

        lbDescription7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbDescription7.setForeground(new java.awt.Color(178, 178, 178));
        lbDescription7.setText("basic chocolate");

        pic7.setImage(new javax.swing.ImageIcon(getClass().getResource("/myimage/tr3.jpg"))); // NOI18N
        pic7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic7MouseClicked(evt);
            }
        });

        lbPrice7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbPrice7.setForeground(new java.awt.Color(76, 76, 76));
        lbPrice7.setText("400");

        lbBrand7.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbBrand7.setForeground(new java.awt.Color(76, 76, 76));
        lbBrand7.setText("Per Pound");

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel57Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pic7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel57Layout.createSequentialGroup()
                        .addComponent(lbBrand7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbPrice7))
                    .addComponent(lbItemName7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescription7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbItemName7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescription7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrice7)
                    .addComponent(lbBrand7))
                .addGap(20, 20, 20))
        );

        jPanel58.setBackground(new java.awt.Color(255, 255, 255));

        lbItemName8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbItemName8.setForeground(new java.awt.Color(76, 76, 76));
        lbItemName8.setText("Butterfly Cake");

        lbDescription8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbDescription8.setForeground(new java.awt.Color(178, 178, 178));
        lbDescription8.setText("Flower Patels");

        pic8.setImage(new javax.swing.ImageIcon(getClass().getResource("/myimage/tr4_1.jpg"))); // NOI18N
        pic8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic8MouseClicked(evt);
            }
        });

        lbPrice8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbPrice8.setForeground(new java.awt.Color(76, 76, 76));
        lbPrice8.setText("450");

        lbBrand8.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbBrand8.setForeground(new java.awt.Color(76, 76, 76));
        lbBrand8.setText("Per Pound");

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel58Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pic8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel58Layout.createSequentialGroup()
                        .addComponent(lbBrand8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbPrice8))
                    .addComponent(lbItemName8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescription8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbItemName8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescription8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrice8)
                    .addComponent(lbBrand8))
                .addGap(20, 20, 20))
        );

        jPanel59.setBackground(new java.awt.Color(255, 255, 255));

        lbItemName9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbItemName9.setForeground(new java.awt.Color(76, 76, 76));
        lbItemName9.setText("Tiramisu");

        lbDescription9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbDescription9.setForeground(new java.awt.Color(178, 178, 178));
        lbDescription9.setText("without alchohol");

        pic9.setImage(new javax.swing.ImageIcon(getClass().getResource("/myimage/tira_1.jpg"))); // NOI18N
        pic9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pic9MouseClicked(evt);
            }
        });

        lbPrice9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbPrice9.setForeground(new java.awt.Color(76, 76, 76));
        lbPrice9.setText("600");

        lbBrand9.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbBrand9.setForeground(new java.awt.Color(76, 76, 76));
        lbBrand9.setText("Per Pound");

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pic9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel59Layout.createSequentialGroup()
                        .addComponent(lbBrand9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbPrice9))
                    .addComponent(lbItemName9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescription9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbItemName9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDescription9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pic9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrice9)
                    .addComponent(lbBrand9))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(57, 57, 57)
                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel53Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel20.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1650, 1280, 330));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sobi/homeeee.gif"))); // NOI18N
        jPanel20.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1280, 250));

        txtSearch.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel20.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 540, -1));

        jScrollPane3.setViewportView(jPanel20);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 785));

        jTabbedPane1.addTab("1", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        background1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1156, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("3", jPanel4);

        javax.swing.GroupLayout mainPanel2Layout = new javax.swing.GroupLayout(mainPanel2);
        mainPanel2.setLayout(mainPanel2Layout);
        mainPanel2Layout.setHorizontalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1356, Short.MAX_VALUE)
        );
        mainPanel2Layout.setVerticalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout background3Layout = new javax.swing.GroupLayout(background3);
        background3.setLayout(background3Layout);
        background3Layout.setHorizontalGroup(
            background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        background3Layout.setVerticalGroup(
            background3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(mainPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("5", jPanel7);

        javax.swing.GroupLayout mainPanel1Layout = new javax.swing.GroupLayout(mainPanel1);
        mainPanel1.setLayout(mainPanel1Layout);
        mainPanel1Layout.setHorizontalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1356, Short.MAX_VALUE)
        );
        mainPanel1Layout.setVerticalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 641, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout background2Layout = new javax.swing.GroupLayout(background2);
        background2.setLayout(background2Layout);
        background2Layout.setHorizontalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        background2Layout.setVerticalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(mainPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("4", jPanel6);

        javax.swing.GroupLayout mainPanel3Layout = new javax.swing.GroupLayout(mainPanel3);
        mainPanel3.setLayout(mainPanel3Layout);
        mainPanel3Layout.setHorizontalGroup(
            mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1356, Short.MAX_VALUE)
        );
        mainPanel3Layout.setVerticalGroup(
            mainPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 643, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout background4Layout = new javax.swing.GroupLayout(background4);
        background4.setLayout(background4Layout);
        background4Layout.setHorizontalGroup(
            background4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        background4Layout.setVerticalGroup(
            background4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(mainPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("6", jPanel8);

        javax.swing.GroupLayout mainPanel4Layout = new javax.swing.GroupLayout(mainPanel4);
        mainPanel4.setLayout(mainPanel4Layout);
        mainPanel4Layout.setHorizontalGroup(
            mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1356, Short.MAX_VALUE)
        );
        mainPanel4Layout.setVerticalGroup(
            mainPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 635, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout background5Layout = new javax.swing.GroupLayout(background5);
        background5.setLayout(background5Layout);
        background5Layout.setHorizontalGroup(
            background5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        background5Layout.setVerticalGroup(
            background5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(mainPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("7", jPanel14);

        javax.swing.GroupLayout mainPanel5Layout = new javax.swing.GroupLayout(mainPanel5);
        mainPanel5.setLayout(mainPanel5Layout);
        mainPanel5Layout.setHorizontalGroup(
            mainPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1362, Short.MAX_VALUE)
        );
        mainPanel5Layout.setVerticalGroup(
            mainPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout background6Layout = new javax.swing.GroupLayout(background6);
        background6.setLayout(background6Layout);
        background6Layout.setHorizontalGroup(
            background6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        background6Layout.setVerticalGroup(
            background6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background6Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(mainPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addComponent(background6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("8", jPanel15);

        javax.swing.GroupLayout mainPanel6Layout = new javax.swing.GroupLayout(mainPanel6);
        mainPanel6.setLayout(mainPanel6Layout);
        mainPanel6Layout.setHorizontalGroup(
            mainPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1356, Short.MAX_VALUE)
        );
        mainPanel6Layout.setVerticalGroup(
            mainPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout background7Layout = new javax.swing.GroupLayout(background7);
        background7.setLayout(background7Layout);
        background7Layout.setHorizontalGroup(
            background7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        background7Layout.setVerticalGroup(
            background7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background7Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(mainPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addComponent(background7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("9", jPanel16);

        javax.swing.GroupLayout mainPanel7Layout = new javax.swing.GroupLayout(mainPanel7);
        mainPanel7.setLayout(mainPanel7Layout);
        mainPanel7Layout.setHorizontalGroup(
            mainPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1362, Short.MAX_VALUE)
        );
        mainPanel7Layout.setVerticalGroup(
            mainPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout background8Layout = new javax.swing.GroupLayout(background8);
        background8.setLayout(background8Layout);
        background8Layout.setHorizontalGroup(
            background8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        background8Layout.setVerticalGroup(
            background8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background8Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(mainPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("10", jPanel17);

        javax.swing.GroupLayout mainPanel8Layout = new javax.swing.GroupLayout(mainPanel8);
        mainPanel8.setLayout(mainPanel8Layout);
        mainPanel8Layout.setHorizontalGroup(
            mainPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1362, Short.MAX_VALUE)
        );
        mainPanel8Layout.setVerticalGroup(
            mainPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout background9Layout = new javax.swing.GroupLayout(background9);
        background9.setLayout(background9Layout);
        background9Layout.setHorizontalGroup(
            background9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        background9Layout.setVerticalGroup(
            background9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background9Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(mainPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("11", jPanel18);

        jPanel19.setForeground(new java.awt.Color(255, 204, 255));

        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText(">");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slideshow1, javax.swing.GroupLayout.DEFAULT_SIZE, 1374, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addGap(183, 183, 183))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slideshow1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(569, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("12", jPanel19);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(102, 102, 102));
        jLabel82.setText("<html> Placing an order in Frosting Fantasy is like \"Piece of Cake\". Just follow few simple steps mentioned below:  Find your desired product from our website or App.  From the product page click on \"Buy Now\" if you just want a single product to order  Click on \"Add To Cart\" if you want to add more products to the cart.  After adding all of your desired products in Cart > Go to the cart > select the products you want to order.  Click on the “Proceed to Checkout” button  Choose your preferred delivery method (Home Delivery/Collection Point) & use coupon voucher code if you have any.  To proceed for payment click on the “Proceed to Pay” button > Select a payment option before clicking the \"Confirm order\".  After confirming the order and completing the payment, you will get a confirmation notification from the App and by SMS/email to let you know that the order is successfully placed. </html>");

        jLabel83.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel83.setText("How to Place an Order in 'Frosting Fantasy'?");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(508, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(448, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("13", jPanel23);

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel84.setText("Terms and Conditions");

        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel85.setText("2.Conditions for Use");

        jLabel86.setText("<html>Welcome to Frosting Fantasy also hereby known as “we\", \"us\" or \"Cakes\". We are an online marketplace and these are the terms and conditions governing your access and use of our site along with its related sub-domains, sites, mobile app, services and tools (the \"Site\"). By using the Site, you hereby accept these terms and conditions (including the linked information herein) and represent that you agree to comply with these terms and conditions (the \"User Agreement\"). This User Agreement is deemed effective upon your use of the Site which signifies your acceptance of these terms. If you do not agree to be bound by this User Agreement please do not access, register with or use this Site. This Site is owned and operated by a company incorporated under the Companies Act, 1994, (Registration Number: 117773/14).\n\nThe Site reserves the right to change, modify, add, or remove portions of these Terms and Conditions at any time without any prior notification. Changes will be effective when posted on the Site with no other notice provided. Please check these Terms and Conditions regularly for updates. Your continued use of the Site following the posting of changes to Terms and Conditions of use constitutes your acceptance of those changes.</html>");

        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel87.setText("1.Introduction");

        jLabel88.setText("<html>You are responsible for maintaining the confidentiality of your user identification, password, account details and related private information. You agree to accept this responsibility and ensure your account and its related details are maintained securely at all times and all necessary steps are taken to prevent misuse of your account. You should inform us immediately if you have any reason to believe that your password has become known to anyone else, or if the password is being, or is likely to be, used in an unauthorized manner. You agree and acknowledge that any use of the Site and related services offered and/or any access to private information, data or communications using your account and password shall be deemed to be either performed by you or authorized by you as the case may be. You agree to be bound by any access of the Site and/or use of any services offered by the Site (whether such access or use are authorized by you or not). You agree that we shall be entitled (but not obliged) to act upon, rely on or hold you solely responsible and liable in respect thereof as if the same were carried out or transmitted by you. You further agree and acknowledge that you shall be bound by and agree to fully indemnify us against any and all losses arising from the use of or access to the Site through your account.\n</html>");

        jLabel89.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel89.setText("3.Conditions for Sale");

        jLabel90.setText("<html>Your order is a legal offer to the seller to buy the product or service displayed on our Site. When you place an order to purchase a product, any confirmations or status updates received prior to the dispatch of your order serves purely to validate the order details provided and in no way implies the confirmation of the order itself. The acceptance of your order is considered confirmed when the product is dispatched to you. If your order is dispatched in more than one package, you may receive separate dispatch confirmations. Upon time of placing the order, we indicate an approximate timeline that the processing of your order will take however we cannot guarantee this timeline to be rigorously precise in every instance as we are dependent on third party service providers to preserve this commitment. We commit to you to make every reasonable effort to ensure that the indicative timeline is met. All commercial/contractual terms are offered by and agreed to between you and the sellers alone. The commercial/contractual terms include without limitation price, shipping costs, payment methods, payment terms, date, period and mode of delivery, warranties related to products and services and after sales services related to products and services. Daraz does not have any control or does not determine or advise or in any way involve itself in the offering or acceptance of such commercial/contractual terms between the you and the Sellers. The seller retains the right to cancel any order at its sole discretion prior to dispatch. We will ensure that there is timely intimation to you of such cancellation via an email or sms. Any prepayments made in case of such cancellation(s), shall be refunded to you within the time frames stipulated here.</html>");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel89)
                    .addComponent(jLabel87)
                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85)
                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
                    .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("14", jPanel47);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("6.How to use Collection Point?");
        jPanel22.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 130, -1, -1));

        jLabel32.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel32.setText("_____________");
        jPanel22.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 120, -1));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("2.How can I cancel my order?");
        jPanel22.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("3.What are the most common reasons for delivery delays? ");
        jPanel22.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(102, 102, 102));
        jLabel35.setText("1.What are the 'Delivery Timelines'?");
        jPanel22.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 253, -1));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setText("Top Questions");
        jPanel22.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        jLabel77.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(102, 102, 102));
        jLabel77.setText("4.What are the Refund Timelines?");
        jPanel22.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 295, -1));

        jLabel78.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(102, 102, 102));
        jLabel78.setText("5.How do I return my item?");
        jPanel22.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 90, -1, -1));

        jLabel79.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(102, 102, 102));
        jLabel79.setText("Self Service Tool");
        jPanel22.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        jLabel80.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel80.setText("_____________");
        jPanel22.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, 40));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myimage/Screenshot (31).png"))); // NOI18N
        jPanel22.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 1100, 270));

        jTabbedPane1.addTab("14", jPanel22);

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel48.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 980, 70));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sobi/Pink Sweet Cake Information Mobile Video (1500 x 800 px) (1300 x 350 px) (2).gif"))); // NOI18N

        jLabel91.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel91.setText("About Us");

        jLabel92.setText("<html>Welcome to Frosting Fantasy!\n\nAt Frosting Fantasy, we're more than just a cake shop; we're your destination for delectable creations that make life's sweet moments even sweeter. Our journey began with a passion for baking and an unwavering commitment to quality, creativity, and customer delight.</html>\n");

        jLabel93.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel93.setText("Our Story");

        jLabel94.setText("<html>Founded in 2016 Frosting Fantasy was born from a shared love of all things sweet. What started as a humble kitchen experiment quickly transformed into a thriving bakery business. With every cake we bake and every cupcake we frost, we pour our heart and soul into creating unforgettable taste experiences.</html>");

        jLabel97.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel97.setText("Quality and Creativity");

        jLabel96.setText("<html>Quality is at the heart of everything we do. We source the finest ingredients, from the freshest eggs to the richest chocolates, to ensure that every bite is a mouthwatering delight. Our team of skilled bakers and decorators bring innovation and creativity to the forefront, crafting cakes and confections that are not only visually stunning but bursting with flavor.</html>");

        jLabel95.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel95.setText("What Sets Us Apart");

        jLabel99.setText("Feel free to reach out to us anytime, and let us bring your cake dreams to life!");

        jLabel100.setText("Thank you for choosing Frosting Fantasy for your sweet cravings. We look forward to being a part of your celebrations and creating cake memories that last a lifetime.");

        jLabel98.setText("<html>Our commitment to personalized service, innovative designs, and, of course, the incredible taste of our cakes sets us apart. We don't just make cakes; we create edible works of art. Whether it's a birthday, wedding, anniversary, or just a craving for something sweet, we're here to make your moments truly special.</html>");

        jLabel121.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel121.setText("Review Section:");

        jTextArea1.setBackground(new java.awt.Color(255, 204, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane6.setViewportView(jTextArea1);

        jLabel122.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel122.setText("Drop a Review Here");

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("Send");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel95)
                            .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel97)
                            .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel93)
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 1265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 1257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 1214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 1265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(slideshow2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(185, 185, 185)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel97)
                .addGap(18, 18, 18)
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(slideshow2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel10);

        jPanel48.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 810));

        jTabbedPane1.addTab("", jPanel48);

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1380, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 867, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab17", jPanel43);

        jPanel60.setBackground(new java.awt.Color(255, 255, 255));

        jLabel108.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel108.setText("<html>Indulge in  the  sweetness of our   delectable   pastry cakes at an unbeatable price!  🍰✨ For a   limited time,   enjoy a mouthwatering  selection of pastry cakes with a  generous 50% discount. Treat yourself to layers of heavenly flavors, creamy fillings,  and   irresistible toppings, all   at half   the price. Don't   miss out on this delightful  opportunity  to satisfy  your cravings   without breaking   the bank. Hurry, this offer  won't last long!  Visit us today   and savor the joy of pastry perfection at a fraction                                                        of the cost</html>");

        jLabel109.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel109.setText("<html>❤️🍰 Red Velvet Delight at 30% Off! 🍰❤️ Elevate your taste buds with our luscious Red Velvet Cake, now available with a tempting 30% discount! 😍🎂\nIndulge in the timeless charm of velvety cocoa goodness layered with rich cream cheese frosting. This classic favorite is a true delight, and with our special offer, it's even sweeter on your wallet. Hurry in and savor a slice of this heavenly treat while this deal lasts. Treat yourself and your loved ones today!</html>\n");

        jLabel110.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel110.setText("<html>🥞✨ Breakfast Bliss at 30% Off! 🥞✨ Rise and shine with our mouthwatering pancakes, now available at a tempting 30% discount! 😍🥞 There's no better way to start your day than with a stack of fluffy, golden pancakes dripping with syrup. Don't miss out on this amazing offer! Join us for breakfast and enjoy the perfect pancake experience without breaking the bank. Come in today and savor the deliciousness while it lasts!\"</html>");

        jLabel111.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel111.setText("<html>🍓🍰 New Arrival Alert! 🍰🍓 Introducing our latest sensation - Freshly Baked Strawberry Cheesecake, and it's yours at an amazing 50% off! 😍🎉\nExperience a burst of strawberry sweetness combined with creamy cheesecake goodness. This delightful creation is the talk of the town, and now you can savor it at half the price. Don't miss out on this limited-time offer to indulge in the perfect harmony of flavors. Swing by today to treat yourself to a slice of pure bliss!\"</html>");

        jLabel112.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel112.setText("<html>\"🚨 Flash Sale Alert! 🚨 Craving something sweet and fudgy? Look no further! Our irresistible brownies are now available at an incredible 75% off! 😍🍫 Indulge in the ultimate chocolatey delight without emptying your wallet. Hurry, this mouthwatering deal won't last long. Grab a box of our heavenly brownies today and treat your taste buds to pure bliss. Don't miss out – it's a sweet steal you won't find anywhere else!\"</html>");

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel111, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel110, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel109, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab18", jPanel60);

        jPanel62.setBackground(new java.awt.Color(255, 255, 255));
        jPanel62.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sobi/Brown and Simple Cake Special Offer Promotion Card (559 × 428 px) (1366 × 768 px) (400 x 400 px).gif"))); // NOI18N
        jLabel113.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel113MouseClicked(evt);
            }
        });
        jPanel62.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sobi/Cream Maximalist Cake Promotion Instagram Post (1366 x 768 px) (400 x 400 px).gif"))); // NOI18N
        jLabel114.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel114MouseClicked(evt);
            }
        });
        jPanel62.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(851, 360, -1, -1));

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sobi/Black Food Sale (Poster (Landscape)) (400 x 400 px) (2).gif"))); // NOI18N
        jPanel62.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 750, -1, -1));

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sobi/Beige Green Minimalist Fun Clean Flash Sale Discount Brownies Bakery Store Instagram Story (400 x 400 px).gif"))); // NOI18N
        jPanel62.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 1513, -1, -1));

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sobi/Dark Elegant This or That Food Instagram Story (400 x 400 px).gif"))); // NOI18N
        jPanel62.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 1110, -1, -1));

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sobi/White and Gold Red Velvet Bakery Cake Instagram Story (1366 x 768 px) (400 x 400 px).gif"))); // NOI18N
        jLabel118.setText("jLabel54");
        jPanel62.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 1840, 400, -1));

        jLabel54.setText("<html>");
        jPanel62.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 40, 40));

        jLabel103.setText("<html>");
        jPanel62.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 50, -1));

        jLabel119.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        jLabel119.setText("<html>Indulge in  the  sweetness of our   delectable   pastry cakes at an unbeatable price!  🍰✨ For a   limited time,   enjoy a mouthwatering  selection of pastry cakes with a  generous 50% discount. Treat yourself to layers of heavenly flavors, creamy fillings,  and   irresistible toppings, all   at half   the price. Don't   miss out on this delightful  opportunity  to satisfy  your cravings   without breaking   the bank. Hurry, this offer  won't last long!  Visit us today   and savor the joy of pastry perfection at a fraction                                                        of the cost</html>");
        jPanel62.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 730, -1));

        jLabel120.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        jLabel120.setText("<html>❤️🍰 Red Velvet Delight at 30% Off! 🍰❤️ Elevate your taste buds with our luscious Red Velvet Cake, now available with a tempting 30% discount! 😍🎂\nIndulge in the timeless charm of velvety cocoa goodness layered with rich cream cheese frosting. This classic favorite is a true delight, and with our special offer, it's even sweeter on your wallet. Hurry in and savor a slice of this heavenly treat while this deal lasts. Treat yourself and your loved ones today!</html>\n");
        jPanel62.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 780, -1));

        jLabel104.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        jLabel104.setText("<html>🥞✨ Breakfast Bliss at 30% Off! 🥞✨ Rise and shine with our mouthwatering pancakes, now available at a tempting 30% discount! 😍🥞 There's no better way to start your day than with a stack of fluffy, golden pancakes dripping with syrup. Don't miss out on this amazing offer! Join us for breakfast and enjoy the perfect pancake experience without breaking the bank. Come in today and savor the deliciousness while it lasts!\"</html>");
        jPanel62.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 850, 790, -1));

        jLabel105.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        jLabel105.setText("<html>🥞✨ Breakfast Bliss at 30% Off! 🥞✨ Rise and shine with our mouthwatering pancakes, now available at a tempting 30% discount! 😍🥞 There's no better way to start your day than with a stack of fluffy, golden pancakes dripping with syrup. Don't miss out on this amazing offer! Join us for breakfast and enjoy the perfect pancake experience without breaking the bank. Come in today and savor the deliciousness while it lasts!\"</html>");
        jPanel62.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 1230, 750, -1));

        jLabel106.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        jLabel106.setText("<html>🍓🍰 New Arrival Alert! 🍰🍓 Introducing our latest sensation - Freshly Baked Strawberry Cheesecake, and it's yours at an amazing 50% off! 😍🎉\nExperience a burst of strawberry sweetness combined with creamy cheesecake goodness. This delightful creation is the talk of the town, and now you can savor it at half the price. Don't miss out on this limited-time offer to indulge in the perfect harmony of flavors. Swing by today to treat yourself to a slice of pure bliss!\"</html>");
        jPanel62.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 1560, 750, -1));

        jLabel107.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        jLabel107.setText("<html>🍰✨ Special Offer Alert! 🍰✨ Dive into the world of delicious bento cakes at an unbeatable 50% off! 😋🎉 Our artisan-crafted bento cakes are a perfect blend of flavors and artistry, and now you can enjoy them at half the price. Whether you're celebrating a special occasion or just satisfying your sweet tooth, our bento cakes are the way to go. Hurry in and savor this delectable deal before it's gone. Treat yourself and your loved ones today!</html>");
        jPanel62.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1970, 660, -1));

        jScrollPane4.setViewportView(jPanel62);

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab20", jPanel61);

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));

        jPanel21.setBackground(new java.awt.Color(255, 204, 204));

        jLabel21.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel21.setText("<html>Indulge in  the  sweetness of our   delectable   pastry cakes at an unbeatable price!  🍰✨ For a   limited time,   enjoy a mouthwatering  selection of pastry cakes with a  generous 50% discount. Treat yourself to layers of heavenly flavors, creamy fillings,  and   irresistible toppings, all   at half   the price. Don't   miss out on this delightful  opportunity  to satisfy  your cravings   without breaking   the bank. Hurry, this offer  won't last long!  Visit us today   and savor the joy of pastry perfection at a fraction                                                        of the cost</html>");

        jLabel22.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel22.setText("<html>\"🚨 Flash Sale Alert! 🚨 Craving something sweet and fudgy? Look no further! Our irresistible brownies are now available at an incredible 75% off! 😍🍫 Indulge in the ultimate chocolatey delight without emptying your wallet. Hurry, this mouthwatering deal won't last long. Grab a box of our heavenly brownies today and treat your taste buds to pure bliss. Don't miss out – it's a sweet steal you won't find anywhere else!\"</html>");

        jLabel24.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel24.setText("<html>❤️🍰 Red Velvet Delight at 30% Off! 🍰❤️ Elevate your taste buds with our luscious Red Velvet Cake, now available with a tempting 30% discount! 😍🎂 Indulge in the timeless charm of velvety cocoa goodness layered with rich cream cheese frosting. This classic favorite is a true delight, and with our special offer, it's even sweeter on your wallet. Hurry in and savor a slice of this heavenly treat while this deal lasts. Treat yourself and your loved ones today!</html> ");

        jLabel26.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel26.setText("<html>🥞✨ Breakfast Bliss at 30% Off! 🥞✨ Rise and shine with our mouthwatering pancakes, now available at a tempting 30% discount! 😍🥞 There's no better way to start your day than with a stack of fluffy, golden pancakes dripping with syrup. Don't miss out on this amazing offer! Join us for breakfast and enjoy the perfect pancake experience without breaking the bank. Come in today and savor the deliciousness while it lasts!\"</html>");

        jLabel29.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel29.setText("<html>🍰✨ Special Offer Alert! 🍰✨ Dive into the world of delicious bento cakes at an unbeatable 50% off! 😋🎉 Our artisan-crafted bento cakes are a perfect blend of flavors and artistry, and now you can enjoy them at half the price. Whether you're celebrating a special occasion or just satisfying your sweet tooth, our bento cakes are the way to go. Hurry in and savor this delectable deal before it's gone. Treat yourself and your loved ones today!</html>");

        jLabel30.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        jLabel30.setText("<html>🍓🍰 New Arrival Alert! 🍰🍓 Introducing our latest sensation - Freshly Baked Strawberry Cheesecake, and it's yours at an amazing 50% off! 😍🎉\nExperience a burst of strawberry sweetness combined with creamy cheesecake goodness. This delightful creation is the talk of the town, and now you can savor it at half the price. Don't miss out on this limited-time offer to indulge in the perfect harmony of flavors. Swing by today to treat yourself to a slice of pure bliss!\"</html>");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/Beige_Green_Minimalist_Fun_Clean_Flash_Sale_Discount_Brownies_Bakery_1.png"))); // NOI18N
        jLabel19.setText("jLabel19");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/Brown_and_Simple_Cake_Special_Offer_Promotion_Card_559_×_428_px.png"))); // NOI18N
        jLabel20.setText("jLabel20");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/Black Food Sale (Poster (Landscape)) (4).png"))); // NOI18N
        jLabel23.setText("jLabel23");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/Cream_Maximalist_Cake_Promotion_Instagram_Post_1366_x_768_px (1).png"))); // NOI18N
        jLabel25.setText("jLabel25");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/White_and_Gold_Red_Velvet_Bakery_Cake_Instagram_Story_1366_x_768 (1).png"))); // NOI18N
        jLabel27.setText("jLabel23");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic/Red Sweet Cake Promo Poster (2).png"))); // NOI18N
        jLabel28.setText("jLabel23");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27))
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3))))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(852, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel21);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1368, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("2", jPanel3);

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1380, Short.MAX_VALUE)
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 867, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab21", jPanel63);

        jPanel54.setBackground(new java.awt.Color(255, 255, 255));

        srch.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
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
        jScrollPane1.setViewportView(srch);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        caketxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caketxtActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Price:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Search Here:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("Code:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Item:");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Buy Now");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel54Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                        .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(caketxt, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                        .addComponent(flvrtxt)
                        .addComponent(prtxt))
                    .addComponent(jButton3))
                .addGap(140, 140, 140))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caketxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(flvrtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("tab20", jPanel54);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, -40, 1312, 840));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(255, 102, 102)));
        jMenuBar1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N

        jMenu1.setText("My Account");

        jMenuItem1.setText("Login");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Create account");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("About Frosting Fantacy");

        jMenuItem3.setText("About us");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Contact us");
        jMenu2.add(jMenuItem4);

        jMenu4.setText("Customer Service");

        jMenuItem5.setText("About your order");
        jMenu4.add(jMenuItem5);

        jMenuItem6.setText("Wishlist");
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Terms & condition");
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Privacy Policy");
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Cancellation return & refund policy");
        jMenu4.add(jMenuItem9);

        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(17);
    }                                    
int f=1;

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        
       // f++;
        if(f==1)
        {
            jPanel9.hide();
            f=0;
        }
        else
        {
            jPanel9.show();
            f=1;
        }
        
        
    }                                     

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }                                     

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(1);
    }                                    

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(3);
    }                                    

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(2);
    }                                    

     @SuppressWarnings("empty-statement")
     
     
     
     
    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
        // TODO add your handling code here:
         T.start();
         
         
         
         
          /*try {
              Statement s = db.mycon().createStatement();
              
             String sql = "SELECT * FROM stock";

              
         
 

             ResultSet rs = s.executeQuery(sql);
             while(rs.next()){
                 String fla = rs.getString("Item");
               //  String tier = rs.getString("Tier");
               //  String colo = rs.getString("Color");
               //  String hr = rs.getString("HeightRadius");
               //  String suga = String.valueOf(rs.getInt("Sugar"));
               String wei = rs.getString("Flavour");
                 String mesg = rs.getString("Price");
              //   String taka = String.valueOf(rs.getInt("Image"));
               //  String pid = rs.getString("Image");
              //   String cash = rs.getString("DueDate");
             
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
        int columnIndexForImageColumn = tb1Model.getColumnCount() - 1;
        srch.setValueAt(imageIcon, rowIndex, columnIndexForImageColumn);
             }
             // JOptionPane.showMessageDialog(rootPane, "Accept Order?");
          } catch (Exception e) {
              System.out.println(e);
          }*/
          
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

    }                                 

    
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
    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        
    }                                    

    private void picMouseClicked(java.awt.event.MouseEvent evt) {                                 
        // TODO add your handling code here:
        
           /* buynow1 x = new buynow1();
        x.show();
         String msg=lbPrice.getText();
         String ms=lbBrand.getText();
        new buynow1(msg,ms).setVisible(true);
        setVisible(false);*/
        
       
    }                                

    private void pic1MouseClicked(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
         
    }                                 

    private void pic3MouseClicked(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
          
    }                                 

    private void pic2MouseClicked(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
          
    }                                 

    private void pic4MouseClicked(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
         
    }                                 

    private void pic5MouseClicked(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
         
    }                                 

    private void pic6MouseClicked(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
       
    }                                 

    private void pic8MouseClicked(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
         
    }                                 

    private void pic7MouseClicked(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
         
    }                                 

    private void pic9MouseClicked(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
         
    }                                 

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        
        jTabbedPane1.setSelectedIndex(15);
    }                                    

    private void jLabel56MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(12);
    }                                     

    private void jLabel58MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(13);
    }                                     

    private void jLabel62MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(14);
    }                                     

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        signup x = new signup();
        x.show();
        dispose();
    }                                          

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            // TODO add your handling code here:
            login x = new login();
            x.show();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Guest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                          

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        slideshow1.next();
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        slideshow1.back();
    }                                        

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        DefaultTableModel obj = (DefaultTableModel)srch.getModel();
        TableRowSorter<DefaultTableModel> obj1 = new TableRowSorter<>(obj);
        srch.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(jTextField1.getText()));
    }                                       

    private void srchMouseClicked(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
            int selectedRow=srch.getSelectedRow();
        DefaultTableModel tblModel= (DefaultTableModel)srch.getModel();
        caketxt.setText(tblModel.getValueAt(selectedRow,0).toString());
        prtxt.setText(tblModel.getValueAt(selectedRow,1).toString());
        flvrtxt.setText(tblModel.getValueAt(selectedRow,2).toString());
       // txtadded.setText(tblModel.getValueAt(selectedRow,3).toString());
        //txtdesig.setText(tblModel.getValueAt(selectedRow,4).toString());

    }                                 

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }                                     

    private void jLabel46MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(9);
    }                                     

    private void jLabel47MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(7);
    }                                     

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            login  x = new login();
            x.show();
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(adminpage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                    

    private void caketxtActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
       //  if(flag==1)
        //{
       //  buynow1 x = new buynow1();
       //  x.show();
       //  String msg=flvrtxt.getText();
       //  String ms=caketxt.getText();
         //String ms=itemID.getText();
    //    new buynow1(msg,ms).setVisible(true);
        //new buynow1(ms).setVisible(true);
     //   setVisible(false);
       // }
       // else
       // {      Component rootPane = null;
//JOptionPane.showMessageDialog(rootPane, "Item not selected yet!");}
        
    }                                        

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(14);
    }                                     

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(20);
    }                                     

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {                                      
        String text = txtSearch.getText().trim().toLowerCase();
        search.setData(search(text));
        if (search.getItemSize() > 0) {
            //  * 2 top and bot border
            menu.show(txtSearch, 0, txtSearch.getHeight());
            menu.setPopupSize(menu.getWidth(), (search.getItemSize() * 35) + 2);
        } else {
            menu.setVisible(false);
        }
    }                                     

    private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {                                       
        if (search.getItemSize() > 0) {
            menu.show(txtSearch, 0, txtSearch.getHeight());

        }
    }                                      

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
         String nam = jTextArea1.getText();
        try {
              Statement s = db.mycon().createStatement();
              s.executeUpdate("INSERT INTO review(Review)"+ "VALUES('"+nam+"')");
              JOptionPane.showMessageDialog(rootPane, "Review sent!");
          } catch (Exception e) {
              System.out.println(e);
          }
        jTextArea1.setText(null);
        
    }                                        

    private void jLabel142MouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(7);
        
    }                                      

    private void jLabel143MouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(4);
    }                                      

    private void jLabel48MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        try{
            Desktop.getDesktop().browse(new URL("https://www.bbcgoodfood.com/recipes/cupcakes").toURI());
        }
        catch(Exception e)
        {
            
        }
    }                                     

    private void jLabel49MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jLabel53MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void jLabel114MouseClicked(java.awt.event.MouseEvent evt) {                                       
 jTabbedPane1.setSelectedIndex(1);        // TODO add your handling code here:
    }                                      

    private void jLabel113MouseClicked(java.awt.event.MouseEvent evt) {                                       
 jTabbedPane1.setSelectedIndex(9);        // TODO add your handling code here:
    }                                      

     private List<DataSearch> search(String search) {
        int limitData = 7;
        List<DataSearch> list = new ArrayList<>();
        String dataTesting[] = {"Birthday cake",
            "Fruit Cake",
            "Kid's Cakes",
            "Tiramisu",
            "Wedding Cake",
            "Anniversary Cakes",
            "Brownies",
            "Cup Cakes",
            "Four Good Days",
            "Frozen Fever",
            "Frozen",
            "The Courier",
            "The First Purge",
            "Olivia Cake",
            "Truffle Cakes",
            "Pastry"
        };
        for (String d : dataTesting) {
            if (d.toLowerCase().contains(search)) {
                boolean story = isStory(d);
                if (story) {
                    list.add(0, new DataSearch(d, story));
                    //  add or insert to first record
                } else {
                    list.add(new DataSearch(d, story));
                    //  add to last record
                }
                if (list.size() == limitData) {
                    break;
                }
            }
        }
        return list;
    }
     String dataStory[] = {"200tk to 500tk",
        "Sweet Cake",
        "Strwberry Cake",
        "Tiramisu",
        "Birthday Cake"};

    private void removeHistory(String text) {
        for (int i = 0; i < dataStory.length; i++) {
            String d = dataStory[i];
            if (d.toLowerCase().equals(text.toLowerCase())) {
                dataStory[i] = "";
            }
        }
    }

    private boolean isStory(String text) {
        for (String d : dataStory) {
            if (d.toLowerCase().equals(text.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
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
            java.util.logging.Logger.getLogger(Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel DS;
    private com.raven.swing.Background background1;
    private com.raven.swing.Background background2;
    private com.raven.swing.Background background3;
    private com.raven.swing.Background background4;
    private com.raven.swing.Background background5;
    private com.raven.swing.Background background6;
    private com.raven.swing.Background background7;
    private com.raven.swing.Background background8;
    private com.raven.swing.Background background9;
    private javax.swing.JTextField caketxt;
    private javax.swing.JTextField flvrtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
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
    private javax.swing.JLabel jLabel33;
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
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
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
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
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
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbBrand;
    private javax.swing.JLabel lbBrand1;
    private javax.swing.JLabel lbBrand2;
    private javax.swing.JLabel lbBrand3;
    private javax.swing.JLabel lbBrand4;
    private javax.swing.JLabel lbBrand5;
    private javax.swing.JLabel lbBrand6;
    private javax.swing.JLabel lbBrand7;
    private javax.swing.JLabel lbBrand8;
    private javax.swing.JLabel lbBrand9;
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbDescription1;
    private javax.swing.JLabel lbDescription2;
    private javax.swing.JLabel lbDescription3;
    private javax.swing.JLabel lbDescription4;
    private javax.swing.JLabel lbDescription5;
    private javax.swing.JLabel lbDescription6;
    private javax.swing.JLabel lbDescription7;
    private javax.swing.JLabel lbDescription8;
    private javax.swing.JLabel lbDescription9;
    private javax.swing.JLabel lbItemName;
    private javax.swing.JLabel lbItemName1;
    private javax.swing.JLabel lbItemName2;
    private javax.swing.JLabel lbItemName3;
    private javax.swing.JLabel lbItemName4;
    private javax.swing.JLabel lbItemName5;
    private javax.swing.JLabel lbItemName6;
    private javax.swing.JLabel lbItemName7;
    private javax.swing.JLabel lbItemName8;
    private javax.swing.JLabel lbItemName9;
    private javax.swing.JLabel lbPrice;
    private javax.swing.JLabel lbPrice1;
    private javax.swing.JLabel lbPrice2;
    private javax.swing.JLabel lbPrice3;
    private javax.swing.JLabel lbPrice4;
    private javax.swing.JLabel lbPrice5;
    private javax.swing.JLabel lbPrice6;
    private javax.swing.JLabel lbPrice7;
    private javax.swing.JLabel lbPrice8;
    private javax.swing.JLabel lbPrice9;
    private com.raven.swing.MainPanel mainPanel;
    private com.raven.swing.MainPanel mainPanel1;
    private com.raven.swing.MainPanel mainPanel2;
    private com.raven.swing.MainPanel mainPanel3;
    private com.raven.swing.MainPanel mainPanel4;
    private com.raven.swing.MainPanel mainPanel5;
    private com.raven.swing.MainPanel mainPanel6;
    private com.raven.swing.MainPanel mainPanel7;
    private com.raven.swing.MainPanel mainPanel8;
    private com.raven.swing.PictureBox pic;
    private com.raven.swing.PictureBox pic1;
    private com.raven.swing.PictureBox pic2;
    private com.raven.swing.PictureBox pic3;
    private com.raven.swing.PictureBox pic4;
    private com.raven.swing.PictureBox pic5;
    private com.raven.swing.PictureBox pic6;
    private com.raven.swing.PictureBox pic7;
    private com.raven.swing.PictureBox pic8;
    private com.raven.swing.PictureBox pic9;
    private javax.swing.JTextField prtxt;
    private slideshow.Slideshow slideshow1;
    private slideshow.Slideshow slideshow2;
    private javax.swing.JTable srch;
    private javax.swing.JLabel t;
    private swing.MyTextField txtSearch;
    // End of variables declaration                   
}
