package Pertemuan7;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

class latihan4 extends JFrame implements ActionListener {

    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 250;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final String EMPTY_STRING ="";
    private static final String NEWLINE =System.getProperty("line.separator");
    private JButton clearButton;
    private JButton addButton;
    private JTextField inputLine;
    private JTextArea textArea;


public static void main(String[]args){    
    
latihan4 frame = new latihan4();
frame.setVisible(true);

}

public latihan4(){
    Container contentPane;
    
    setSize(FRAME_WIDTH,FRAME_HEIGHT);
    setResizable(false);
    setTitle("Program Latihan 4");
    setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
    contentPane = getContentPane();
    contentPane.setLayout(new FlowLayout());
    textArea = new JTextArea();
    textArea.setColumns(22);
    textArea.setRows(8);
    textArea.setBorder(BorderFactory.createLineBorder(Color.RED));
    textArea.setEditable(false);
    contentPane.add(textArea);
    
    inputLine =new JTextField();
    inputLine.setColumns(22);
    contentPane.add(inputLine);
    inputLine.addActionListener(this);
    
    addButton=new JButton("ADD");
    contentPane.add(addButton);
    
    clearButton=new JButton("CLEAR");
    contentPane.add(clearButton);
    
    clearButton.addActionListener(this);
    addButton.addActionListener(this);
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent event){
    if(event.getSource()instanceof JButton){
        JButton clickedButton=(JButton)event.getSource();
        if(clickedButton==addButton){
            addText(inputLine.getText());
        }else{
            clearText();
        }
    }else{
        addText(inputLine.getText());
    }
}


private void addText(String newline){
    textArea.append(newline+NEWLINE);
    inputLine.setText("")    ;
}

private void clearText(){
    textArea.setText(EMPTY_STRING);
    inputLine.setText(EMPTY_STRING);
}

}
