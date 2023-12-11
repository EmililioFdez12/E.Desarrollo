import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;

public class Calc extends JFrame {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JLabel lblResultadoPantalla = new JLabel("");
  private JButton btn0 = new JButton("0");
  private JButton btn1 = new JButton("1");
  private JButton btn2 = new JButton("2");
  private JButton btn3 = new JButton("3");
  private JButton btn4 = new JButton("4");
  private JButton btn5 = new JButton("5");
  private JButton btn6 = new JButton("6");
  private JButton btn7 = new JButton("7");
  private JButton btn8 = new JButton("8");
  private JButton btn9 = new JButton("9");
  
  
  

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Calc frame = new Calc();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public Calc() {
    setTitle("Calculadora");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 449);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    btn0 = new JButton("0");
    btn0.setBackground(Color.WHITE);
    btn0.setFont(new Font("Cinzel", Font.BOLD, 40));
    btn0.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnPulsacion0();
      }
    });
    btn0.setBounds(34, 320, 69, 62);
    contentPane.add(btn0);
    
    JButton btnC = new JButton("C");
    btnC.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    btnC.setBackground(Color.WHITE);
    btnC.setFont(new Font("Cinzel", Font.BOLD, 40));
    btnC.setBounds(113, 320, 69, 62);
    contentPane.add(btnC);
    
    JButton btnCE = new JButton("CE");
    btnCE.setBackground(Color.WHITE);
    btnCE.setForeground(Color.BLACK);
    btnCE.setFont(new Font("Cinzel", Font.BOLD, 24));
    btnCE.setBounds(192, 320, 69, 62);
    contentPane.add(btnCE);
    
    btn1 = new JButton("1");
    btn1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnPulsacion1();
      }
    });
    btn1.setBackground(Color.WHITE);
    btn1.setFont(new Font("Cinzel", Font.BOLD, 40));
    btn1.setBounds(34, 247, 69, 62);
    contentPane.add(btn1);
    
    btn2 = new JButton("2");
    btn2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnPulsacion2();
      }
    });
    btn2.setBackground(Color.WHITE);
    btn2.setFont(new Font("Cinzel", Font.BOLD, 40));
    btn2.setBounds(113, 247, 69, 62);
    contentPane.add(btn2);
    
    btn3 = new JButton("3");
    btn3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    btn3.setBackground(Color.WHITE);
    btn3.setFont(new Font("Cinzel", Font.BOLD, 40));
    btn3.setBounds(192, 247, 69, 62);
    contentPane.add(btn3);
    
    btn4 = new JButton("4");
    btn4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    btn4.setBackground(Color.WHITE);
    btn4.setFont(new Font("Cinzel", Font.BOLD, 40));
    btn4.setBounds(34, 174, 69, 62);
    contentPane.add(btn4);
    
    btn5 = new JButton("5");
    btn5.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    btn5.setBackground(Color.WHITE);
    btn5.setFont(new Font("Cinzel", Font.BOLD, 40));
    btn5.setBounds(113, 174, 69, 62);
    contentPane.add(btn5);
    
    btn6 = new JButton("6");
    btn6.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    btn6.setBackground(Color.WHITE);
    btn6.setFont(new Font("Cinzel", Font.BOLD, 40));
    btn6.setBounds(192, 174, 69, 62);
    contentPane.add(btn6);
    
    btn7 = new JButton("7");
    btn7.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    btn7.setBackground(Color.WHITE);
    btn7.setFont(new Font("Cinzel", Font.BOLD, 40));
    btn7.setBounds(34, 101, 69, 62);
    contentPane.add(btn7);
    
    btn8 = new JButton("8");
    btn8.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    btn8.setBackground(Color.WHITE);
    btn8.setFont(new Font("Cinzel", Font.BOLD, 40));
    btn8.setBounds(113, 101, 69, 62);
    contentPane.add(btn8);
    
    btn9 = new JButton("9");
    btn9.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    btn9.setBackground(Color.WHITE);
    btn9.setFont(new Font("Cinzel", Font.BOLD, 40));
    btn9.setBounds(192, 101, 69, 62);
    contentPane.add(btn9);
    
    lblResultadoPantalla = new JLabel("");
    lblResultadoPantalla.setFont(new Font("Cinzel", Font.BOLD, 40));
    lblResultadoPantalla.setBounds(34, 29, 378, 51);
    contentPane.add(lblResultadoPantalla);
    
    JButton btnSumar = new JButton("+");
    btnSumar.setBackground(Color.WHITE);
    btnSumar.setFont(new Font("Cinzel", Font.BOLD, 40));
    btnSumar.setBounds(271, 174, 69, 62);
    contentPane.add(btnSumar);
    
    JButton btnRestar = new JButton("-");
    btnRestar.setBackground(Color.WHITE);
    btnRestar.setFont(new Font("Cinzel", Font.BOLD, 40));
    btnRestar.setBounds(355, 174, 69, 62);
    contentPane.add(btnRestar);
    
    JButton btnDividir = new JButton("/");
    btnDividir.setBackground(Color.WHITE);
    btnDividir.setFont(new Font("Cinzel", Font.BOLD, 40));
    btnDividir.setBounds(355, 247, 69, 62);
    contentPane.add(btnDividir);
    
    JButton btnMultiplicar = new JButton("x");
    btnMultiplicar.setBackground(Color.WHITE);
    btnMultiplicar.setFont(new Font("Cinzel", Font.BOLD, 25));
    btnMultiplicar.setBounds(271, 247, 69, 62);
    contentPane.add(btnMultiplicar);
    
    JButton btnSolucion = new JButton("=");
    btnSolucion.setBackground(Color.WHITE);
    btnSolucion.setFont(new Font("Cinzel", Font.BOLD, 70));
    btnSolucion.setBounds(271, 320, 153, 62);
    contentPane.add(btnSolucion);
  }

  protected void btnPulsacion0() {
    String texto = btn0.getText();
    lblResultadoPantalla.setText(texto);   
  }
  
  protected void btnPulsacion1() {
    String texto = btn1.getText();
    lblResultadoPantalla.setText(texto);   
  }
  
  protected void btnPulsacion2() {
    String texto = btn2.getText();
    lblResultadoPantalla.setText(texto);   
  }
  
  protected void btnPulsacion3() {
    String texto = btn3.getText();
    lblResultadoPantalla.setText(texto);   
  }
  
  protected void btnPulsacion4() {
    String texto = btn4.getText();
    lblResultadoPantalla.setText(texto);   
  }
  
  protected void btnPulsacion5() {
    String texto = btn5.getText();
    lblResultadoPantalla.setText(texto);   
  }
  
  protected void btnPulsacion6() {
    String texto = btn6.getText();
    lblResultadoPantalla.setText(texto);   
  }
  
  protected void btnPulsacion7() {
    String texto = btn7.getText();
    lblResultadoPantalla.setText(texto);   
  }
  
  protected void btnPulsacion8() {
    String texto = btn8.getText();
    lblResultadoPantalla.setText(texto);   
  }
  
  protected void btnPulsacion9() {
    String texto = btn9.getText();
    lblResultadoPantalla.setText(texto);   
  }
}
