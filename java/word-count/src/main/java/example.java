/*
import static java.util.stream.Collectors.*;

public class WordCount {

  private final Pattern TOKENS = Pattern.compile("[\\w]+('[\\w]+)*");

  public Map<String, Integer> phrase(String ph) {

    return TOKENS.matcher(ph)

        .results()

        .map(MatchResult::group)

        .map(String::toLowerCase)

        .collect(groupingBy(identity(), summingInt(v -> 1)));

  }

}
*/