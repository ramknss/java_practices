import java.awt.*;
import java.awt.event.*;

public class ComponentExample extends Frame {

    public ComponentExample() {
        // Set frame properties
        setTitle("Student Login Page");
        setSize(600, 500);
        setLayout(new FlowLayout());

        // Create components
        Label label = new Label("Name:");
		Label label1 = new Label("Course:");
        Button button = new Button("submit");
        TextField textField = new TextField(20);
		TextField textField1 = new TextField(20);

        // Set component properties
        label.setForeground(Color.BLUE);
        button.setBackground(Color.YELLOW);
        textField.setFont(new Font("Arial", Font.PLAIN, 12));

        // Add components to the frame
        add(label);
        
        add(textField);
		add(label1);
		 add(textField1);
		 add(button);

        // Register event listeners
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                textField.setText("You clicked the button: " + text);
            }
       
        });

        // Handle window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Terminate the program
            }
        });
        // Set frame visibility
        setVisible(true);
    }

    public static void main(String[] args) {
        ComponentExample c=new ComponentExample();
       
    }
}
