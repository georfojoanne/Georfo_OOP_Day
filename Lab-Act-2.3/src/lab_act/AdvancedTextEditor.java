
package lab_act;


public class AdvancedTextEditor extends TextEditor {
    
    public AdvancedTextEditor(String text){
        super(text);
    }
    
    public void undo(){
        History--;
        
        setText(prevText[History]);
    }
}
