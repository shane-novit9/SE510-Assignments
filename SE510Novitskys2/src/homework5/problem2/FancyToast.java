package homework5.problem2;

public class FancyToast implements Toast{
	private String text;
    @Override
    public void setText(String text) {
        // trim all leading and trailing spaces
        this.text = text.replaceAll("^\\s+|\\s+$", "");
    }
    @Override
    public void display() {
        System.out.println("==Fancy==  " + text + "  ==Fancy==");
    }
}
