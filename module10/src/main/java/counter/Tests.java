package counter;

import java.util.List;

import static counter.WordFrequencyCounter.countWordFrequency;

public class Tests {
    public static void main(String[] args) {
        List<String> frequencyResult = countWordFrequency("words.txt");
        for (String item : frequencyResult) {
            System.out.println(item);
        }
    }
}
