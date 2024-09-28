import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviationsMap;

    public Abbreviations() {
        this.abbreviationsMap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviationsMap.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviationsMap.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        if (hasAbbreviation(abbreviation)) {
            return this.abbreviationsMap.get(abbreviation);
        } else {
            return null;
        }
    }
}
    