class RotationalCipher {

    int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        String stringBuilder = "";
        for (char c : data.toCharArray()) {
            int codeChar = c;
            if (Character.isLetter(c)){
                codeChar += this.shiftKey;
                if (codeChar > 122 && Character.isLowerCase(c)){
                    codeChar -= 26;
                }
                if (codeChar > 90 && Character.isUpperCase(c)){
                    codeChar -= 26;
                }
            }
            c = (char)(codeChar);
            stringBuilder += c;
        }
        return stringBuilder;
    }
}