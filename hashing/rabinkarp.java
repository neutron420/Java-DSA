package hashing;

public class rabinkarp {
    private final int PRIME = 101;

    private long calculateHash(String str){
        long hash = 0;
        for(int i = 0; i < str.length(); i++){
            hash = hash + str.charAt(i) * (long)Math.pow(PRIME, i);
        }
        return hash;
    }

    private long updateHash(long prevHash , char oldChar , char newChar, int patternLength) {
        // Example rolling hash update formula for Rabin-Karp
        long newHash = prevHash - oldChar;
        newHash = newHash / PRIME;
        newHash = newHash + newChar * (long)Math.pow(PRIME, patternLength - 1);
        return newHash;
    }

    public void search(String text , String pattern){
        int m = pattern.length();
        int n = text.length();
        long patternHash = calculateHash(pattern);
        long textHash = calculateHash(text.substring(0, m));

        for(int i = 0; i <= n - m; i++){
            if(patternHash == textHash){
                // Potential match found, verify characters
                if(text.substring(i, i + m).equals(pattern)){
                    System.out.println("Pattern found at index: " + i);
                }
            }
            // Update hash for next substring
            if(i < n - m){
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + m), m);
            }
        }
    }
    public static void main(String[] args) {
        rabinkarp rk = new rabinkarp();
        String text = "RiteshKunalRahul";
        String pattern = "Rahul";
        rk.search(text, pattern);
    }
}
