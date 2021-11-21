
import javax.swing.text.View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niloofaryazdani
 */
public class app
{
    public static void main(String[] args)
    {
        Model model = new Model();
        NavView view = new NavView();
        Controller controller = new Controller(model, view);
    }
    
}
