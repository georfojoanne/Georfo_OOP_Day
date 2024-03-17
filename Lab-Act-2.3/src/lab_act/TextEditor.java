
package lab_act;


public class TextEditor {
    
    private String text;
    public String prevText[] = new String[99];
    public int History = 0;
    
    public TextEditor(String Text){
        prevText[History] = text;
        History++;
        
        this.text = Text;
    }

    public String getText() {
        return text;
    }

    public void setText(String newtext) {
        this.text = newtext;
    }
    
    public void append(String newtext){
        prevText[History] = text;
        History++;
        this.text += newtext;
    }
    
    public void delete(int n){
        
        prevText[History] = text;
        History++;
        if(n >= 0 && n <= text.length()){
            this.text = this.text.substring(0, text.length() - n);
        }
    }
}