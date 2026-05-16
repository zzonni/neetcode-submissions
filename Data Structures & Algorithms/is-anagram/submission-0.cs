public class Solution {
    public bool IsAnagram(string s, string t) {
        if (s.Length != t.Length) return false;
        char[] ss = s.ToCharArray();
        char[] tt = t.ToCharArray();
        
        Array.Sort(ss);
        Array.Sort(tt);
        
        return ss.SequenceEqual(tt);
    }
}
