import java.awt.*;
import java.awt.event.*;

class Eventhandling extends Frame implements ActionListener {

    TextField textField;

    Eventhandling()
    {
        
        textField = new TextField();

       
        textField.setBounds(60, 50, 180, 25);
        Button button = new Button("click Here");
        button.setBounds(100, 120, 80, 30);

        
        button.addActionListener(this);

        
        add(textField);
        add(button);

        setVisible(true);
    }
  
    public void actionPerformed(ActionEvent e)
    {
        
        textField.setText("HEHEHEHEHE");
    }
  
    public static void main(String[] args)
    {
      new Eventhandling(); 
    }
}