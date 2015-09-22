import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SentenceJ extends JFrame implements ActionListener
{
    private JtextField tbxName;
    private JTextField tbxVerb;
    private JtextField tbxOutput;
    private Jbutton btCreate

    public SentenceJ()
    {
        this.setTitle("SentenceJ");

        Container pane=this.getContentPane();
        pane.setLayout(new FlowLayout());

        //_______________________________ tbx Name
        tbxName=new JtextField(10);
        pane.add(tbxName);

        //_______________________________ likes
        pane.add(new JLabel("likes"));

        //________________________________ tbx Verb
        tbxVerb=new JtextField(10);
        pane.add(tbxVerb);

        //_________________________________ btCreate
        btCreate = new JButton("Create");
        pane.add(btCreate);
        btCreate.addActionListener(this);

        //__________________________________ tbxOutput
        tbxOutput= new JTextField(20);
        pane.add(tbxOutput);
    }

    public void actionPerformed(ActionEvent e)
{
    if(e.get-source()==btCreate)
    {
        final String name= this.tbxName.getText();
        final String verb= this.tbxVerb.getText();
        String sentence= name + "likes" + verb;
        tbxOutput.setText(sentence);
    }
}
public static void main (String[] args)
{
    SentenceJ frame= new SentenceJ();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}
}
