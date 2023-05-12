import java.util.Scanner;

public class ForceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mass of the object in kilograms: ");
        double mass = scanner.nextDouble();

        System.out.print("Enter the acceleration of the object in meters per second squared: ");
        double acceleration = scanner.nextDouble();

        double force = mass * acceleration;

        System.out.println("The force on the object is " + force + " newtons.");
    }
}

import java.util.Scanner;

public class KineticEnergy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mass, velocity, kineticEnergy;

        System.out.print("Enter mass (kg): ");
        mass = sc.nextDouble();

        System.out.print("Enter velocity (m/s): ");
        velocity = sc.nextDouble();

        kineticEnergy = 0.5 * mass * velocity * velocity;

        System.out.println("Kinetic Energy = " + kineticEnergy + " J");
    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForceCalculatorGUI extends JFrame implements ActionListener {
    private JTextField massField;
    private JTextField accelerationField;
    private JLabel resultLabel;

    public ForceCalculatorGUI() {
        setTitle("Force Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

        JLabel massLabel = new JLabel("Mass (kg):");
        massField = new JTextField(10);

        JLabel accelerationLabel = new JLabel("Acceleration (m/s^2):");
        accelerationField = new JTextField(10);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);

        resultLabel = new JLabel("");

        add(massLabel);
        add(massField);
        add(accelerationLabel);
        add(accelerationField);
        add(calculateButton);
        add(resultLabel);
    }

    public void actionPerformed(ActionEvent e) {
        double mass = Double.parseDouble(massField.getText());
        double acceleration = Double.parseDouble(accelerationField.getText());
        double force = mass * acceleration;
        resultLabel.setText("The force on the object is " + force + " newtons.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ForceCalculatorGUI calculatorGUI = new ForceCalculatorGUI();
            calculatorGUI.setVisible(true);
        });
    }
}
