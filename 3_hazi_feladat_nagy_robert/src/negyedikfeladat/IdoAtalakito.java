/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negyedikfeladat;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Nagy Róbert
 */
public class IdoAtalakito extends JFrame implements ActionListener {

    JTextField tf1 = new JTextField(10);
    JTextField tfnap = new JTextField("nap");
    JTextField tf2 = new JTextField(10);
    JTextField tfora = new JTextField("óra");
    JTextField tf3 = new JTextField(10);
    JTextField tfperc = new JTextField("perc");
    JTextField tf4 = new JTextField(10);
    JTextField tfmperc = new JTextField("másodperc");

    JTextField tf5 = new JTextField(10);
    JTextField tfnap2 = new JTextField("nap");
    JTextField tf6 = new JTextField(10);
    JTextField tfora2 = new JTextField("óra");
    JTextField tf7 = new JTextField(10);
    JTextField tfperc2 = new JTextField("perc");
    JTextField tf8 = new JTextField(10);
    JTextField tfmperc2 = new JTextField("másodperc");

    JTextField etf1 = new JTextField(10);
    JTextField etfnap = new JTextField("nap");
    JTextField etf2 = new JTextField(10);
    JTextField etfora = new JTextField("óra");
    JTextField etf3 = new JTextField(10);
    JTextField etfperc = new JTextField("perc");
    JTextField etf4 = new JTextField(10);
    JTextField etfmperc = new JTextField("másodperc");

    JPanel pl1 = new JPanel();
    JPanel pl2 = new JPanel();
    JPanel pl3 = new JPanel();
    JPanel pl4 = new JPanel();

    JButton bt = new JButton("Szamol");

    public IdoAtalakito() throws HeadlessException {
        super("IdoAtalakito");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout gr = new GridLayout(4, 1); // elrendezés manager a gridlayout -> rács szrűen rendi el (2 sor, 1 oszlop)
        setLayout(gr);

        GridLayout gr2 = new GridLayout(1, 8);
        GridLayout gr4 = new GridLayout(1, 1);

        pl1.setLayout(gr2);
        pl2.setLayout(gr2);
        pl3.setLayout(gr4);
        pl4.setLayout(gr2);

        pl1.add(tf1);
        pl1.add(tfnap);
        pl1.add(tf2);
        pl1.add(tfora);
        pl1.add(tf3);
        pl1.add(tfperc);
        pl1.add(tf4);
        pl1.add(tfmperc);

        pl2.add(tf5);
        pl2.add(tfnap2);
        pl2.add(tf6);
        pl2.add(tfora2);
        pl2.add(tf7);
        pl2.add(tfperc2);
        pl2.add(tf8);
        pl2.add(tfmperc2);

        pl3.add(bt);
        bt.addActionListener(this);

        pl4.add(etf1);
        pl4.add(etfnap);
        pl4.add(etf2);
        pl4.add(etfora);
        pl4.add(etf3);
        pl4.add(etfperc);
        pl4.add(etf4);
        pl4.add(etfmperc);

        this.add(pl1);
        this.add(pl2);
        this.add(pl3);
        this.add(pl4);

        pack();
    }

    public static void main(String[] args) {
        IdoAtalakito l = new IdoAtalakito();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt) {
            if (Integer.parseInt(tf4.getText()) + Integer.parseInt(tf8.getText()) <= 60) {
                etf4.setText(Integer.toString(Integer.parseInt(tf4.getText()) + Integer.parseInt(tf8.getText())));
            }
            else{
                tf3.setText(Integer.toString(Integer.parseInt(tf3.getText())+1));
                etf4.setText(Integer.toString(Integer.parseInt(tf4.getText()) + Integer.parseInt(tf8.getText()) - 60));
            }
            if (Integer.parseInt(tf3.getText()) + Integer.parseInt(tf7.getText()) <= 60) {
                etf3.setText(Integer.toString(Integer.parseInt(tf3.getText()) + Integer.parseInt(tf7.getText())));
            } else {
                tf2.setText(Integer.toString(Integer.parseInt(tf2.getText()) + 1));
                etf3.setText(Integer.toString(Integer.parseInt(tf3.getText()) + Integer.parseInt(tf7.getText()) - 60));
            }
            if(Integer.parseInt(tf2.getText()) + Integer.parseInt(tf6.getText()) <= 24){
                etf2.setText(Integer.toString(Integer.parseInt(tf2.getText()) + Integer.parseInt(tf6.getText())));
            }
            else{
                tf1.setText(Integer.toString(Integer.parseInt(tf1.getText())+1));
                etf2.setText(Integer.toString(Integer.parseInt(tf2.getText()) + Integer.parseInt(tf6.getText())-24));
            }
            etf1.setText(Integer.toString(Integer.parseInt(tf1.getText()) + Integer.parseInt(tf5.getText())));
        }
    }
}
