
package hashing;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

class Solution {
  public List<String> findRepeatedDnaSequences(String s) {
    Set<String> ans = new HashSet<>();
    Set<String> seen = new HashSet<>();

    for (int i = 0; i + 10 <= s.length(); ++i) {
      final String seq = s.substring(i, i + 10);
      if (seen.contains(seq))
        ans.add(seq);
      seen.add(seq);
    }

    return new ArrayList<>(ans);
  }
  // Rabin-Karp style pattern matcher
  public static String matchPattern(String text, String pattern) {
    final int PRIME = 101;
    int m = pattern.length();
    int n = text.length();
    long patternHash = 0, textHash = 0;
    long pow = 1;
    for (int i = 0; i < m; i++) {
      patternHash += pattern.charAt(i) * pow;
      textHash += text.charAt(i) * pow;
      if (i < m - 1) pow *= PRIME;
    }
    StringBuilder result = new StringBuilder();
    for (int i = 0; i <= n - m; i++) {
      if (patternHash == textHash) {
        if (text.substring(i, i + m).equals(pattern)) {
          result.append("Pattern found at index: ").append(i).append("\n");
        }
      }
      if (i < n - m) {
        textHash = textHash - text.charAt(i);
        textHash = textHash / PRIME;
        textHash = textHash + text.charAt(i + m) * pow;
      }
    }
    if (result.length() == 0) {
      return "Pattern not found";
    }
    return result.toString();
  }
  public static void main(String[] args) {
    // Demonstrate repeated DNA sequence logic
    Solution sol = new Solution();
    String dna = "AAAAACCCCCAAAAACCCCCAAAAAAGGGTTT";
    System.out.println("Repeated 10-letter sequences:");
    for (String seq : sol.findRepeatedDnaSequences(dna)) {
      System.out.println(seq);
    }
    // Optionally, keep the pattern matcher demo
    String[] patterns = {"AAAAACCCCC", "CCCCCAAAAA"};
    for (String pattern : patterns) {
      System.out.print("Pattern: " + pattern + "\n" + matchPattern(dna, pattern));
    }
  }
}
