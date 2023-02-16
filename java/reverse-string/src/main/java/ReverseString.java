class ReverseString {

    String reverse(String inputString) {
        String aux = "";
        for (int i = 0; i < inputString.length(); i++) {
            aux = aux + inputString.charAt(inputString.length()-i-1);
        }
        return aux;
    }
}
