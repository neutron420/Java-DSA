public class LL2 {
    public static LL merge(LL first, first second) {
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();
        while (f != null && s != null) {
            if (f.val < s.val) {
                ans.insertLast(f.val);
                f = f.next;
            } else {
                ans.insertLast(s.val);
                s = s.next;
            }
        }
        while (f != null) {
            ans.insertLast(f.val);
            f = f.next;
        }
        while (s != null) {
            ans.insertLast(s.val);
            s = s.next;
        }
        return ans;
    }
}
