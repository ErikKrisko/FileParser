import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener {

    JLabel  file = new JLabel("File:");
    JLabel  info = new JLabel("Info:");

    //Buttons
    JButton browse = new JButton("Browse");
    JButton run = new JButton("Run");

    //TextFields
    JTextField fileField = new JTextField();

    //Info Text Area
    TextArea infoField = new TextArea();

    LiveRegisterDirectory lrg;
    File fileObject;

    public GUI() {

        this.setLayout(null);

        file.setBounds(50, 40, 200, 25);
        fileField.setBounds(100, 40, 220, 25);
        browse.setBounds(340, 40, 80, 25);
        run.setBounds(430, 40, 80, 25);

        info.setBounds(50, 160, 40, 25);
        infoField.setBounds(100, 160, 440, 250);

        this.add(file);
        this.add(info);
        this.add(fileField);
        this.add(infoField);
        this.add(browse);
        this.add(run);

        run.addActionListener(this);
        browse.addActionListener(this);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        //This checks which button is clicked. Could easily be a bunch of else if statements but I dont think this way causes any real issues.
        Object target = e.getSource();
        if(target == browse ) {
            //Opens file explorer and sets name of the file into the file text field
            openFile();
            fileField.setText(fileObject.getName());
            lrg = new LiveRegisterDirectory(fileObject);
        }
        if(fileField.getText().equals("")) {
            //When button is clicked without choosing a file
            infoField.setText("Please Browse for a csv file");
        }
        if(target == run) {
            infoField.setText(lrg.outputData());
        }
    }

    //File Explorer
    private void openFile() {
        //  Open file chooser directed at resources folder
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File((".\\")));
        //  File selection
        int result = fileChooser.showOpenDialog(new JFrame());
        if (result == JFileChooser.APPROVE_OPTION){
            fileObject = fileChooser.getSelectedFile();
        }
    }
}



