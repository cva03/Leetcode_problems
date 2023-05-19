package puzzle;

public class LCP {
    public static void main(String[] args) {
        System.out.println(findLcp(new String[]{"technique", "technician", "technology", "technical"}));
    }

    static String findLcp(String[] strings) {
        String result = "";
        int index = 0;
        while (true) {
            char ch = strings[0].charAt(index);
            boolean condition = true;
            for (String str : strings) {
                if(index >= str.length())
                    return result;
                if(str.charAt(index) != ch) {
                    condition = false;
                    break;
                }
            }
            if (condition)
                result += ch;
            else
                return result;
            index++;
        }
    }
}
