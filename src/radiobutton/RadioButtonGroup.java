package radiobutton;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a group of "radio buttons": toggle buttons for which exactly one is selected
 * at a given time. If a different button is selected, the previously-selected button is
 * automatically unselected.
 *
 * Buttons are numbered from 0 to one less than the number of buttons. For example, if the
 * button group has 4 buttons, they are numbered 0, 1, 2, and 3.
 */
public class RadioButtonGroup {

    private List<RadioButton> buttonGroup;

    /**
     * Creates a group of radio buttons.
     *
     * @param numButtons
     *   The number of buttons in the group.
     * @param initial
     *   The button number that is initially selected.
     * @raise RuntimeException
     *   The initial button number is invalid.
     */
    public RadioButtonGroup(int numButtons, int initial) {
        this.buttonGroup = new ArrayList<RadioButton>(numButtons);

        for (int i = 0; i < numButtons; i++) {
            if (i == initial) {
                this.buttonGroup.add(new RadioButton(true));
            } else {
                this.buttonGroup.add(new RadioButton(false));
            }
        }
    }

    /**
     * Creates a group of radio buttons. Button 0 is initially selected.
     */
    public RadioButtonGroup(int numButtons) {
        this(numButtons, 0);
    }

    /**
     * Selects a button, unselecting the button that was previously selected.
     * @param button
     *   The button number to select.
     * @raise RuntimeException
     *   The button number is invalid.
     */
    public void select(int button) {
        for (int i = 0; i < buttonGroup.size(); i++) {
            if (i == button) {
                buttonGroup.get(i).select();
            } else {
                buttonGroup.get(i).unselect();
            }
        }
    }

    /**
     * Returns whether a given button is selected.
     * @param button
     *   The button number to check.
     * @raise RuntimeException
     *   The button number is invalid.
     */
    public boolean isSelected(int button) {
        return buttonGroup.get(button).isSelected();
    }

    public void printButtonGroupStatus() {
        for (RadioButton button: buttonGroup) {
            if (button.isSelected()) {
                System.out.println("On");
            } else {
                System.out.println("Off");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        RadioButtonGroup group = new RadioButtonGroup(5);
        group.printButtonGroupStatus();
        group.select(4);
        group.printButtonGroupStatus();
        group.select(2);
        group.printButtonGroupStatus();
        group.select(3);
        group.printButtonGroupStatus();
    }
}
