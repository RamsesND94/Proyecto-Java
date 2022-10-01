import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Terminos extends JFrame implements ActionListener{

    private JLabel label1,label2;
    private JTextArea txtarea;
    private JButton boton1, boton2;
    private JScrollPane scroll;

    public Terminos(String string) {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        getContentPane().setBackground(new Color(184,36,21));

        label1 = new JLabel("TERMINOS Y CONDICIONES");
        label1.setBounds(265,5,220,35);
        label1.setFont(new Font("Andale Mono", 2, 15));
        label1.setForeground(new Color(255,255,255));
        add(label1);
        
        txtarea = new JTextArea();
        txtarea.setBackground(new Color(224,224,224));
        txtarea.setFont(new Font("Times New Roman", 1, 12));
        txtarea.setEditable(false);
        txtarea.setText("\n\t\t\t   Terminos y Condiciones \n\n 1. Prohibida su venta \n        • Este software es de uso libre y codigo abierto publicado por Ramses Rojas en Github.io");
        scroll = new JScrollPane(txtarea);
        scroll.setBounds(25,50,685,300);
        add(scroll);

        label2 = new JLabel("Al dar click en Siguiente confirma que ha leído y está de acuerdo con los Terminos y condiciones");
        label2.setBounds(25,320,600,100);
        add(label2);
    }

    public static void main(String[] args) {
        Terminos term = new Terminos("Andale Mono");
        term.setBounds(0,0,750,500);
        term.setVisible(true);
        term.setLocationRelativeTo(null);
        term.setResizable(false);
    }
}
