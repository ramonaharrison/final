package states;

import java.util.HashMap;
import java.util.Map;

public class USStates {

    /**
     * Count states by their first letter.
     *
     * @return
     *   A map from the initial (capital) letter to the number of states whose
     *   names start with that letter.  The map should have exactly 26 keys, one
     *   for each letter of the alphabet.  For example, 'A' should be a key with
     *   value 4 (Alabama, Alaska, Arizona, Arkansas), and 'B' should be a key
     *   with value 0.
     */
    public static Map<Character, Integer> countStatesByFirstLetter() {
        // TODO: Write this method.
        Map<Character, Integer> stateMap = new HashMap<Character, Integer>();
        for (int i = 65; i < 91; i++) {
            stateMap.put((char) i, 0);
        }

        for (int i = 0; i < STATE_NAMES.length; i++) {
            Character c = STATE_NAMES[i].charAt(0);
            Integer count = stateMap.get(c);
            stateMap.put(c, count + 1);
        }
        return stateMap;
    }

    public static void main(String[] args) {
        Map<Character, Integer> counts = countStatesByFirstLetter();
        // Do some simple tests.  Feel free to add your own.
        if (counts.size() != 26) throw new AssertionError();
        if (!counts.containsKey('A')) throw new AssertionError();
        if (counts.get('A') != 4) throw new AssertionError();
        if (!counts.containsKey('B')) throw new AssertionError();
        if (counts.get('B') != 0) throw new AssertionError();
    }

    public static final String[] STATE_NAMES = {
            "Alabama",
            "Alaska",
            "Arizona",
            "Arkansas",
            "California",
            "Colorado",
            "Connecticut",
            "Delaware",
            "Florida",
            "Georgia",
            "Hawaii",
            "Idaho",
            "Illinois",
            "Indiana",
            "Iowa",
            "Kansas",
            "Kentucky",
            "Louisiana",
            "Maine",
            "Maryland",
            "Massachusetts",
            "Michigan",
            "Minnesota",
            "Mississippi",
            "Missouri",
            "Montana",
            "Nebraska",
            "Nevada",
            "New Hampshire",
            "New Jersey",
            "New Mexico",
            "New York",
            "North Carolina",
            "North Dakota",
            "Ohio",
            "Oklahoma",
            "Oregon",
            "Pennsylvania",
            "Rhode Island",
            "South Carolina",
            "South Dakota",
            "Tennessee",
            "Texas",
            "Utah",
            "Vermont",
            "Virginia",
            "Washington",
            "West Virginia",
            "Wisconsin",
            "Wyoming",
    };
}
