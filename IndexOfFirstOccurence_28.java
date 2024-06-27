public class IndexOfFirstOccurence_28 {
    public static void main(String[] args) {
        String str = "hubsad";
        String sub = "sad";
        IndexOfFirstOccurence_28 I = new IndexOfFirstOccurence_28();
        int ans = I.index(str,sub);
        System.out.println(ans);
    }

    public int index(String hastag, String needle){
        int hlen = hastag.length();
        int nlen = needle.length();

        if (hlen >= nlen){
            return hastag.indexOf(needle);
        }
        return -1;
    }
}
