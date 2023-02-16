class ResistorColor {

    // Black: 0
    // Brown: 1
    // Red: 2
    // Orange: 3
    // Yellow: 4
    // Green: 5
    // Blue: 6
    // Violet: 7
    // Grey: 8
    // White: 9

    int colorCode(String color) {
        String[] colors = colors();
        for (int i = 0; i < colors.length; i++) {
            if (color.toLowerCase() == colors[i].toLowerCase()) {
                return i;
            }
        }
        throw new IllegalArgumentException(
                "colors possible black, brown, red, orange, yellow, green, blue, violet, grey, white");

    }

    String[] colors() {
        String[] colors = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
        return colors;
    }
}
