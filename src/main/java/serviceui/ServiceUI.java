package serviceui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import clientui.UIConstants;

public class ServiceUI extends JFrame implements Printer {

    protected JPanel panel;
    protected JTextArea pane = new JTextArea();
    protected JScrollPane scroll = new JScrollPane();
    private static final long serialVersionUID = -4512962459244007477L;

    public ServiceUI(final String title) {
        super(title);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // TODO
//                a.deRegister();
                System.exit(0);
            }
        });
        init();
    }

    public void init() {
        setResizable(false);
        pack();
        setSize(UIConstants.UIWIDTH, 300);
        setLocation(setPosition(this));
        panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
        panel.setBounds(0, 0, UIConstants.UIWIDTH - 1, UIConstants.UIWIDTH - 1);
        setVisible(true);
        update(this.getGraphics());
        scroll.setBounds(5, 5, UIConstants.UIWIDTH - 10, 268);
        scroll.setViewportView(pane);
        panel.add(scroll);
    }

    public static Point setPosition(Component c) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - c.getWidth()) / 2);
        return new Point(x, 0);
    }

    public void append(String string) {
        pane.append("\n" + string);
    }

    public void clear() {
        pane.setText("");
    }

}
