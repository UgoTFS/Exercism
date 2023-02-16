import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
public class Robot {
  
  private static final Set<String> registeredNames = new HashSet<String>();
  private static final Random random = new Random();
  private String name;

  public Robot(){
    reset();
  }

  private static String generateString(char fromChar, char toChar, int length){
    return random
            .ints(fromChar, toChar + 1)
            .limit(length)
            .mapToObj( ch -> Character.toString((char) ch ))
            .collect(Collectors.joining());
  }

  private static String generateName(){
    return generateString('A', 'Z', 2) + generateString('0', '9', 3);
  }
  
  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public void reset(){
    String newName;
    
    registeredNames.remove(getName());
    while (registeredNames.contains(newName = generateName())) {
      continue;
    }

    setName(newName);
    registeredNames.add(getName());
  }

}