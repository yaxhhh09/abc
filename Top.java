import java.awt.*;

public class Top extends Frame
{
    Top()
    {
        Button b = new Button("clickme");

        b.setBounds(100, 200, 300, 40);

        add(b);

        setSize(400, 600);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        Top t = new Top();
    }
}