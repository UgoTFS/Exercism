import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

class WordCount {

    Map<String, Integer> wordCount;
    List<String> wordList;
    List<String> cleanWordList = new ArrayList<String>();

    private String textLower(String text) {
        return text.toLowerCase();
    }

    private List<String> getWords(String text) {
        String delimiter = "\\s+|,|^'$'|^\"$\"|:|\\n";
        return Pattern.compile(delimiter).splitAsStream(textLower(text)).collect(Collectors.toList());
    }

    private String cleanString(String text) {
        String aux = "";
        Pattern pattern = Pattern.compile("[a-z]+('[a-z]{1})*|[0-9]+");
        Matcher match = pattern.matcher(text);
        while(match.find()){
            aux = text.substring(match.start(), match.end());
        }
        return aux;
    }

    public Map<String, Integer> phrase(String input) {
        this.wordList = getWords(input);
        /* get a clean list of the words */
        this.wordList.stream()
                .filter(entry -> (!entry.isBlank()))
                .forEach(word -> this.cleanWordList.add(cleanString(word)));

        /* map */
        this.wordCount = this.cleanWordList.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.summingInt(e -> 1)));
        System.out.println(this.wordCount);
        return this.wordCount;
    }
}
