package FormSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FormSwing {

    private JFrame frame;
    private JTextField nameField;
    private JTextField surnameField;
    private JLabel dynamicLabel;
    private JTextField dynamicField;
    private JComboBox<String> userTypeComboBox;

    private ArrayList<Studente> studenti;
    private ArrayList<Professore> professori;

    public FormSwing() {
        studenti = new ArrayList<>();
        professori = new ArrayList<>();

        frame = new JFrame("Modulo Utente");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());


        // Pannello per la selezione Studente/Professore
        JPanel selectionPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        String[] userTypes = {"Studente", "Professore"};
        userTypeComboBox = new JComboBox<>(userTypes);
        selectionPanel.add(new JLabel("Seleziona Tipo:"));
        selectionPanel.add(userTypeComboBox);
        frame.add(selectionPanel, BorderLayout.NORTH);


        // Pannello principale per i campi di input
        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 10, 10));

        inputPanel.add(new JLabel("Nome:"));
        nameField = new JTextField(20);
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Cognome:"));
        surnameField = new JTextField(20);
        inputPanel.add(surnameField);

        dynamicLabel = new JLabel("Matricola:");
        dynamicField = new JTextField(20);
        inputPanel.add(dynamicLabel);
        inputPanel.add(dynamicField);

        userTypeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedType = (String) userTypeComboBox.getSelectedItem();
                if ("Studente".equals(selectedType)) {
                    dynamicLabel.setText("Matricola:");
                } else if ("Professore".equals(selectedType)) {
                    dynamicLabel.setText("Dipartimento:");
                }
                dynamicField.setText("");
            }
        });

        // Bottone per caricare le informazioni
        JButton caricaButton = new JButton("Carica Informazioni");
        caricaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nameField.getText();
                String cognome = surnameField.getText();
                String dynamicValue = dynamicField.getText();
                String selectedType = (String) userTypeComboBox.getSelectedItem();

                if (nome.isEmpty() || cognome.isEmpty() || dynamicValue.isEmpty()) {
                    JOptionPane.showMessageDialog(frame,
                            "Per favore, compila tutti i campi.",
                            "Errore di Input",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }

                if ("Studente".equals(selectedType)) {
                    Studente nuovoStudente = new Studente(nome, cognome, dynamicValue);
                    studenti.add(nuovoStudente);
                    System.out.println("Studente aggiunto: " + nuovoStudente);
                    System.out.println("Numero totale di studenti: " + studenti.size());
                } else if ("Professore".equals(selectedType)) {
                    Professore nuovoProfessore = new Professore(nome, cognome, dynamicValue);
                    professori.add(nuovoProfessore);
                    System.out.println("Professore aggiunto: " + nuovoProfessore);
                    System.out.println("Numero totale di professori: " + professori.size());
                }

                JOptionPane.showMessageDialog(frame,
                        "Informazioni caricate con successo!",
                        "Successo",
                        JOptionPane.INFORMATION_MESSAGE);

                nameField.setText("");
                surnameField.setText("");
                dynamicField.setText("");
            }
        });

        inputPanel.add(new JPanel());
        inputPanel.add(caricaButton);

        frame.add(inputPanel, BorderLayout.CENTER);
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}