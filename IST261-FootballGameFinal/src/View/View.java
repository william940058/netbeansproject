package View;

public class View
{

    private InitialFrame iframe;

    public View()
    {
        iframe = new InitialFrame();
    }

    public void initialSetup()
    {
        iframe.repaint();
        //add or update whatever is needed to the initial setup of the graphics
    }

    public InitialFrame getInitialframe()
    {
        return iframe;
    }

    public void setInitialframe(InitialFrame iframe)
    {
        this.iframe = iframe;
    }


}
