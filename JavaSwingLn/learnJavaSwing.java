import javax.swing.*;
import java.awt.*;  // awt means ( Abstract Window Tool Kit )
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


/// We can use now interface because if we hit the button then our contentPane background color is blue

// so we implement in our jframe class

public class learnJavaSwing extends  JFrame implements ActionListener {  // Jframe is a userDefined Datatpe we can defined the library top of the program

    // creating a variable

//    JFrame myFrame;


    // we add a button in our frame so we create a button variable

    JButton button;

    // if we create a checkBox

    JCheckBox checkBox;

    // we make a boolean variable to change the color if we hit again this conditon

    boolean change = false;





    // then we create a constructor


    learnJavaSwing(){


        // If we not creating the variables so what we do

//        myFrame = new JFrame("This is my first window");
//
//        // This keyword we creating an window in our desktop
//
//        myFrame.setVisible(true);



        // this is the new method to creeting a window withour creating an variable

        // set the titie

        setTitle("This is our first Desktop page");


        // set layout

        setLayout(null);


        // button

        button = new JButton("Button");


        // check box

        checkBox = new JCheckBox("checkBox");

        // check box size

        checkBox.setSize(20,20);

        // set checkbox location

        checkBox.setLocation(20,20);

        // set checkBox background color

        checkBox.setBackground(Color.red);

        // Action

        checkBox.addActionListener(this);

        // add checkbox in our app

        add(checkBox);



        // set size of button

        button.setSize(100, 50);

        // Set location of the button

//        button.setLocation(250,170);

        button.setLocation(250,175);


        // If we click this button this will go directly in our method

        button.addActionListener(this);

        // then add in our frame

        add(button);






        // Set the size and width

        // If we give any size mean width or height it will always start from top left mean [0,0]

        setSize(680, 400); // Height and width is always in pixels


        // If i use this keyword we dont maximize our page only minimize

        setResizable(false);

        // For visible the page

        setVisible(true);


        // set the background color of our page

        getContentPane().setBackground((Color.red));







    }


    public static void main(String[] args) {

        // creating an 0bject

        learnJavaSwing obj = new learnJavaSwing();

    }


    // then it perfroms the methods

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        // then we store the information or what i do after clicking that button

        String e = actionEvent.getActionCommand(); // we will give a command if anyone hit the button

        if(e.equals("Button") && change == false)
        {

            getContentPane().setBackground(Color.blue);

            change = true;
        }

        else {

            getContentPane().setBackground(Color.red);

            change = false;
        }

        String l = actionEvent.getActionCommand();

        if(l.equals("checkBox") )
        {

            getContentPane().setBackground(Color.black);

            ;
        }



    }
}
