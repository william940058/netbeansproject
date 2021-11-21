
/**
 *
 * @author jrimland
 */
import java.awt.event.*;


public class RandomWordController {
    private RandomWordArrayListModel list;
    private SimpleRandomWordView view;
    private RandomWordLinkedListModel lists;
    private FancyRandomWordView views;
    
    RandomWordController(RandomWordArrayListModel list, SimpleRandomWordView view) {
        this.view = view;
        this.list = list;
         
        
        // Note the inner ButtonListener class.
        // This is used so we can access private members of RandomWordController
        // and allow the Controller to specify behavior of the View.
        
        class ButtonListener implements ActionListener {            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                view.setCurrentWord(list.getWord());
                
            }
        }
        class newButtonListener implements ActionListener {            
            @Override
            public void actionPerformed(ActionEvent e)
            {
               
                list.putWord(view.newSetCurrentWord());
               
            }
        }
        
        view.addWordButtonListener(new ButtonListener());
        view.newAddWordButtonListener(new newButtonListener());
    } 
    RandomWordController(RandomWordLinkedListModel lists, SimpleRandomWordView view) {
        this.view = view;
        this.lists = lists;
         
        
        // Note the inner ButtonListener class.
        // This is used so we can access private members of RandomWordController
        // and allow the Controller to specify behavior of the View.
        
        class ButtonListener implements ActionListener {            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                view.setCurrentWord(lists.getWord());
                
            }
        }
        class newButtonListener implements ActionListener {            
            @Override
            public void actionPerformed(ActionEvent e)
            {
               
                lists.putWord(view.newSetCurrentWord());
               
            }
        }
        
        view.addWordButtonListener(new ButtonListener());
        view.newAddWordButtonListener(new newButtonListener());
    } 
    RandomWordController(RandomWordArrayListModel list, FancyRandomWordView views) {
        this.views = views;
        this.list = list;
         
        
        // Note the inner ButtonListener class.
        // This is used so we can access private members of RandomWordController
        // and allow the Controller to specify behavior of the View.
        
        class ButtonListener implements ActionListener {            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                views.setCurrentWord(list.getWord());
                
            }
        }
        class newButtonListener implements ActionListener {            
            @Override
            public void actionPerformed(ActionEvent e)
            {
               
                list.putWord(views.newSetCurrentWord());
               
            }
        }
        
        views.addWordButtonListener(new ButtonListener());
        views.newAddWordButtonListener(new newButtonListener());
    }
    RandomWordController(RandomWordLinkedListModel lists, FancyRandomWordView views) {
        this.views = views;
        this.lists = lists;
         
        
        // Note the inner ButtonListener class.
        // This is used so we can access private members of RandomWordController
        // and allow the Controller to specify behavior of the View.
        
        class ButtonListener implements ActionListener {            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                views.setCurrentWord(lists.getWord());
                
            }
        }
        class newButtonListener implements ActionListener {            
            @Override
            public void actionPerformed(ActionEvent e)
            {
               
                lists.putWord(views.newSetCurrentWord());
               
            }
        }
        
        views.addWordButtonListener(new ButtonListener());
        views.newAddWordButtonListener(new newButtonListener());
    }
}
