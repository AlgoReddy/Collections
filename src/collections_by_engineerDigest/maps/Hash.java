package collections_by_engineerDigest.maps;

public class Hash {
    public static void main(String[] args) {

    }

    public static int simpleHash(String key) {
        int sum = 0;
        for (char c : key.toCharArray()) {
            sum += (int) c;
        }
        return sum % 10;
    }
}
