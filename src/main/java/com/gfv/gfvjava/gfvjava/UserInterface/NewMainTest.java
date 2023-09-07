package com.gfv.gfvjava.gfvjava.UserInterface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.gfv.gfvjava.gfvjava.Models.Service.DAO.Mapping.ClienteMap.CadastrarClienteMapping;
import com.gfv.gfvjava.gfvjava.Models.Service.ServiceLayer.CClienteSL;
import com.gfv.gfvjava.gfvjava.Models.Service.DTO.CadastrarCliente;

public class NewMainTest extends JFrame {
    private JTextField nomeField;
    private JTextField cpfField;
    private JTextField cnhField;
    private JTextField emailField;
    private JPasswordField senhaField;

    public NewMainTest() {
        setTitle("Cadastro de Cliente");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(6, 2));

        panel.add(new JLabel("Nome:"));
        nomeField = new JTextField();
        panel.add(nomeField);

        panel.add(new JLabel("CPF:"));
        cpfField = new JTextField();
        panel.add(cpfField);

        panel.add(new JLabel("CNH:"));
        cnhField = new JTextField();
        panel.add(cnhField);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Senha:"));
        senhaField = new JPasswordField();
        panel.add(senhaField);

        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarCliente();
            }
        });
        panel.add(cadastrarButton);

        getContentPane().add(panel);
    }

    private void cadastrarCliente() {
        String nome = nomeField.getText();
        String cpf = cpfField.getText();
        String cnh = cnhField.getText();
        String email = emailField.getText();
        String senha = new String(senhaField.getPassword());

        // Validar os campos antes de inserir no banco de dados

        // Criar um objeto CadastrarCliente com as informações coletadas
        CadastrarCliente cliente = new CadastrarCliente(nome, cpf, cnh, email, senha);

        // Chamar o método para inserir o cliente no banco de dados
        CadastrarClienteMapping mapping = new CadastrarClienteMapping();
        mapping.inserirCliente(nome, cpf, cnh, email, senha);

        // Limpar os campos após o cadastro
        nomeField.setText("");
        cpfField.setText("");
        cnhField.setText("");
        emailField.setText("");
        senhaField.setText("");

        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                NewMainTest frame = new NewMainTest();
                frame.setVisible(true);
            }
        });
    }
}

