/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quizapplication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Kiruthika
 */
public class quiztest extends JFrame implements  ActionListener{
    private static final long serialVersionUID = 1L;

	JLabel label;
	JRadioButton radioButton[] = new JRadioButton[5];
	JButton btnNext, btnResult;
	ButtonGroup bg;
	int count = 0, current = 0, x = 1, y = 1, now = 0;
	int m[] = new int[10];

	// create jFrame with radioButton and JButton
	quiztest(String s) {
		super(s);
		label = new JLabel();
		add(label);
		bg = new ButtonGroup();
		for (int i = 0; i < 5; i++) {
			radioButton[i] = new JRadioButton();
			add(radioButton[i]);
			bg.add(radioButton[i]);
		}
		btnNext = new JButton("Next");
		btnResult = new JButton("Result");
                btnResult.setVisible(false);
		btnNext.addActionListener(this);
		btnResult.addActionListener(this);
		add(btnNext);
		add(btnResult);
		set();
		label.setBounds(30, 40, 450, 20);
		//radioButton[0].setBounds(50, 80, 200, 20);
		radioButton[0].setBounds(50, 80, 450, 20);
		radioButton[1].setBounds(50, 110, 200, 20);
		radioButton[2].setBounds(50, 140, 200, 20);
		radioButton[3].setBounds(50, 170, 200, 20);
		btnNext.setBounds(100, 240, 100, 30);
		btnResult.setBounds(270, 240, 100, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250, 100);
		setVisible(true);
		setSize(600, 350);
	}

	// handle all actions based on event
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNext) {
			if (check())
				count = count + 1;
			current++;
			set();
			if (current == 9) {
				btnNext.setEnabled(false);
                                btnResult.setVisible(true);
				btnResult.setText("Result");
			}
		}

		if (e.getActionCommand().equals("Result")) {
			if (check())
				count = count + 1;
			current++;
			JOptionPane.showMessageDialog(this, "correct answers= " + count);
			System.exit(0);
		}
	}

	// SET Questions with options
	void set() {
		radioButton[4].setSelected(true);
		if (current == 0) {
			label.setText("Que1:  What is the size of int data type in Java?");
			radioButton[0].setText("16 bits");
			radioButton[1].setText("32 bits");
			radioButton[2].setText("64 bits");
			radioButton[3].setText("8 bits");
		}
		if (current == 1) {
			label.setText("Que2:  What does JVM stand for?");
			radioButton[0].setText("Java Variable Machine");
			radioButton[1].setText("Java Virtual Machine");
			radioButton[2].setText("Java Versatile Machine");
			radioButton[3].setText("None of the above");
		}
		if (current == 2) {
			label.setText("Que3: Which keyword is used to declare a class in Java?");
			radioButton[0].setText("class");
			radioButton[1].setText("Class");
			radioButton[2].setText("struct");
			radioButton[3].setText("object");
		}
		if (current == 3) {
			label.setText("Que4: How many primitive data types are there in Java?");
			radioButton[0].setText("6");
			radioButton[1].setText("7");
			radioButton[2].setText("8");
			radioButton[3].setText("9");
		}
		if (current == 4) {
			label.setText("Que5:  What is the default value of a boolean in Java?");
			radioButton[0].setText(" true");
			radioButton[1].setText("false");
			radioButton[2].setText("0");
			radioButton[3].setText("null");
		}
		if (current == 5) {
			label.setText("Que6: What is used to terminate a statement in Java?");
			radioButton[0].setText(".");
			radioButton[1].setText(":");
			radioButton[2].setText(";");
			radioButton[3].setText(",");
		}
		if (current == 6) {
			label.setText("Que7:  Which of the following is not a Java feature?");
			radioButton[0].setText("platform-independent");
			radioButton[1].setText("object-oriented");
			radioButton[2].setText("pointer-intensive");
			radioButton[3].setText("Secure");
		}
		if (current == 7) {
			label.setText("Que8:  What is the access modifier for a member of a class that is accessible in all other classes in the same package?");
			radioButton[0].setText("private");
			radioButton[1].setText("protected");
			radioButton[2].setText("public");
			radioButton[3].setText("default");
		}
		if (current == 8) {
			label.setText("Que9: What is the parent class of all classes in Java?");
			radioButton[0].setText("object");
			radioButton[1].setText("class");
			radioButton[2].setText("system");
			radioButton[3].setText("root");
		}
		if (current == 9) {
			label.setText("Que10: What is used to handle exceptions in Java?");
			radioButton[0].setText("try-catch block");
			radioButton[1].setText("if-else block");
			radioButton[2].setText("for loop");
			radioButton[3].setText("switch-case block");
		}
		label.setBounds(30, 40, 450, 20);
		for (int i = 0, j = 0; i <= 90; i += 30, j++)
			radioButton[j].setBounds(50, 80 + i, 200, 20);
	}

	// declare right answers.
	boolean check() {
		if (current == 0)
			return (radioButton[1].isSelected());
		if (current == 1)
			return (radioButton[1].isSelected());
		if (current == 2)
			return (radioButton[0].isSelected());
		if (current == 3)
			return (radioButton[2].isSelected());
		if (current == 4)
			return (radioButton[1].isSelected());
		if (current == 5)
			return (radioButton[2].isSelected());
		if (current == 6)
			return (radioButton[2].isSelected());
		if (current == 7)
			return (radioButton[3].isSelected());
		if (current == 8)
			return (radioButton[0].isSelected());
		if (current == 9)
			return (radioButton[0].isSelected());
		return false;
	}

	public static void main(String s[]) {
		new quiztest("Simple Quiz App");
	}
    
}/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
