package radiobutton;

/**
 * Access Code 2.1
 * Ramona Harrison
 * RadioButton.java
 */

public class RadioButton {
    private boolean selected;

    public RadioButton(boolean selected) {
        this.selected = selected;
    }

    public boolean isSelected() {
        return selected;
    }

    public void select() {
        this.selected = true;
    }

    public void unselect() {
        this.selected = false;
    }
}

