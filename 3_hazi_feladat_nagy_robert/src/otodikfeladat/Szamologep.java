/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otodikfeladat;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Nagy Róbert
 */
public class Szamologep extends JFrame implements ActionListener {

    JTextField kep = new JTextField();

    JButton e1 = new JButton();
    JButton e2 = new JButton("Backspace");
    JButton e3 = new JButton("CE");
    JButton e4 = new JButton("C");

    JButton m1 = new JButton("MC");
    JButton m2 = new JButton("7");
    JButton m3 = new JButton("8");
    JButton m4 = new JButton("9");
    JButton m5 = new JButton("/");
    JButton m6 = new JButton("sqrt");

    JButton h1 = new JButton("MR");
    JButton h2 = new JButton("4");
    JButton h3 = new JButton("5");
    JButton h4 = new JButton("6");
    JButton h5 = new JButton("*");
    JButton h6 = new JButton("%");

    JButton n1 = new JButton("MS");
    JButton n2 = new JButton("1");
    JButton n3 = new JButton("2");
    JButton n4 = new JButton("3");
    JButton n5 = new JButton("-");
    JButton n6 = new JButton("1/x");

    JButton o1 = new JButton("M+");
    JButton o2 = new JButton("0");
    JButton o3 = new JButton("+/-");
    JButton o4 = new JButton(".");
    JButton o5 = new JButton("+");
    JButton o6 = new JButton("=");

    JPanel pl1 = new JPanel();
    JPanel pl2 = new JPanel();
    JPanel pl3 = new JPanel();

    public Szamologep() throws HeadlessException {
        super("Szamologep");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout gr0 = new GridLayout(4, 1);
        setLayout(gr0);

        GridLayout gr1 = new GridLayout(1, 1);
        GridLayout gr2 = new GridLayout(1, 4);
        GridLayout gr3 = new GridLayout(4, 6);

        pl1.setLayout(gr1);
        pl2.setLayout(gr2);
        pl3.setLayout(gr3);

        pl1.add(kep);

        pl2.add(e1);
        pl2.add(e2);
        pl2.add(e3);
        pl2.add(e4);

        pl3.add(m1);
        pl3.add(m2);
        pl3.add(m3);
        pl3.add(m4);
        pl3.add(m5);
        pl3.add(m6);
        pl3.add(h1);
        pl3.add(h2);
        pl3.add(h3);
        pl3.add(h4);
        pl3.add(h5);
        pl3.add(h6);
        pl3.add(n1);
        pl3.add(n2);
        pl3.add(n3);
        pl3.add(n4);
        pl3.add(n5);
        pl3.add(n6);
        pl3.add(o1);
        pl3.add(o2);
        pl3.add(o3);
        pl3.add(o4);
        pl3.add(o5);
        pl3.add(o6);

        this.add(pl1);
        this.add(pl2);
        this.add(pl3);

        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);

        h2.addActionListener(this);
        h3.addActionListener(this);
        h4.addActionListener(this);

        n2.addActionListener(this);
        n3.addActionListener(this);
        n4.addActionListener(this);

        o2.addActionListener(this);
        o5.addActionListener(this);
        o6.addActionListener(this);

        pack();
    }

    public static void main(String[] args) {
        Szamologep sz = new Szamologep();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == m2) {
            kep.setText(kep.getText() + m2.getText());
        }
        if (e.getSource() == m3) {
            kep.setText(kep.getText() + m3.getText());
        }
        if (e.getSource() == m4) {
            kep.setText(kep.getText() + m4.getText());
        }

        if (e.getSource() == h2) {
            kep.setText(kep.getText() + h2.getText());
        }
        if (e.getSource() == h3) {
            kep.setText(kep.getText() + h3.getText());
        }
        if (e.getSource() == h4) {
            kep.setText(kep.getText() + h4.getText());
        }

        if (e.getSource() == n2) {
            kep.setText(kep.getText() + n2.getText());
        }
        if (e.getSource() == n3) {
            kep.setText(kep.getText() + n3.getText());
        }
        if (e.getSource() == n4) {
            kep.setText(kep.getText() + n4.getText());
        }

        if (e.getSource() == o2) {
            kep.setText(kep.getText() + o2.getText());
        }
        int ossz = 0;
        if (e.getSource() == o5) {
            int count = 0;
            if (count > 0) {
                
                String[] keplet = kep.getText().split("+");
                for (int i = 0; i < keplet.length; i++) {
                    ossz += Integer.parseInt(keplet[i]);
                }
                count++;
            }
            kep.setText(kep.getText() + o5.getText());
        }
        if (e.getSource() == o6) {
            kep.setText(Integer.toString(ossz));

        }
    }
}
