import javax.swing.*;

public class ReceitasFrame extends JFrame {
    public ReceitasFrame() {
        setSize(400,175);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Receitas");
        setLayout(null);

        JLabel lblNome = new JLabel("Digite seu nome:");
        lblNome.setBounds(50, 10, 300, 20);
        add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(50, 50, 300, 30);
        add(txtNome);

        JButton btnCliqueAqui = new JButton("Clique aqui!");
        btnCliqueAqui.setBounds(125, 100, 150, 30);
        add(btnCliqueAqui);
    }

    public static void main(String[] args) {
        new ReceitasFrame().setVisible(true);
    }
}
