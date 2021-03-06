/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foodpackagingwaste;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author SCIENCE
 */
class GlassPanel extends JPanel {
    JPanel sort_panel, northPanel;
    JButton colloidal_btn, ceramics_btn, polymer_btn, amorphous_btn, back_btn;
    Toolkit kit = Toolkit.getDefaultToolkit();
    Image img = kit.createImage("images/GLASS SORTING.PNG");
    public GlassPanel(){
        northPanel = new JPanel();
        back_btn = new JButton(new ImageIcon("images/filter_btn1.png"));
        back_btn.setRolloverIcon(new ImageIcon("images/filter_btn2.png"));
        back_btn.setToolTipText("return");
        back_btn.setContentAreaFilled(false);
        back_btn.setBorder(null);
        back_btn.setMargin(new Insets(0,0,0,0));
        back_btn.addActionListener(Main.eventhandler);
        northPanel.setBorder(new EmptyBorder(10,10,10,10));
        northPanel.setLayout(new BorderLayout());
        northPanel.setOpaque(false);
        northPanel.add(back_btn, BorderLayout.WEST);
        northPanel.add(new JLabel("UNN Food Packaging Waste :: Glass Advance Sorted"), BorderLayout.EAST);
        
        colloidal_btn = new JButton("");
        colloidal_btn.setContentAreaFilled(false);
        colloidal_btn.setBorder(null);
        colloidal_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ceramics_btn = new JButton("");
        ceramics_btn.setContentAreaFilled(false);
        ceramics_btn.setBorder(null);
        ceramics_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        polymer_btn = new JButton("");
        polymer_btn.setContentAreaFilled(false);
        polymer_btn.setBorder(null);
        polymer_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        amorphous_btn = new JButton("");
        amorphous_btn.setContentAreaFilled(false);
        amorphous_btn.setBorder(null);
        amorphous_btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        colloidal_btn.addActionListener(Main.eventhandler);
        ceramics_btn.addActionListener(Main.eventhandler);
        polymer_btn.addActionListener(Main.eventhandler);
        amorphous_btn.addActionListener(Main.eventhandler);
        sort_panel = new JPanel();
        sort_panel.setLayout(new GridLayout(1, 5, 18, 10));
        sort_panel.setBorder(new EmptyBorder(360, 225, 105, 212));
        sort_panel.add(colloidal_btn);
        sort_panel.add(ceramics_btn);
        sort_panel.add(polymer_btn);
        sort_panel.add(amorphous_btn);
        sort_panel.setOpaque(false);
        
        setLayout(new BorderLayout());
        add(northPanel, BorderLayout.NORTH);
        add(sort_panel, BorderLayout.CENTER);
    }
    public void paintComponent(Graphics g2)
    {
        Graphics2D g = (Graphics2D)g2;
        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    }
    
}
