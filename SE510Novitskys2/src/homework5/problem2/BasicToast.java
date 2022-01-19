package homework5.problem2;

public class BasicToast implements Toast{
	private String text;
    @Override
    public void setText(String text) {
        this.text = text;
    }
    @Override
    public void display() {
        System.out.println(text);
    }
}
