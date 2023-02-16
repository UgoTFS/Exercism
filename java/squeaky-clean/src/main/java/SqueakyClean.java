
class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < identifier.length(); i++ ) {
            if ( identifier.charAt(i) == ' '){
                sb.append('_');
            }
            //else if (identifier.charAt(i) <= 32 || identifier.charAt(i) == 127 || identifier.charAt(i) == '\u007F' ){
            else if (Character.isISOControl(identifier.charAt(i))){
                sb.append("CTRL");
            }
            else if(identifier.charAt(i) == '-'){
                i++;
                if (Character.isLowerCase(identifier.charAt(i))){
                    sb.append(Character.toUpperCase(identifier.charAt(i)));
                }
            }
            else if(!Character.isAlphabetic(identifier.charAt(i))){
                
            }
            else if (identifier.charAt(i) >= '\u03B1' && identifier.charAt(i) <= '\u03FC'){
            
            }
            else {
                sb.append(identifier.charAt(i));
            }
        }
        return sb.toString();
    }
}
