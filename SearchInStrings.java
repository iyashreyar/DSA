public class SearchInStrings {
    public static void main(String[] args) {
        // boolean ans = Search("YashReyar", 'y');
        boolean ans = Search2("YashReyar", 'p');
        System.out.println(ans);
    }
    static boolean Search(String name, char target){
        for (int i = 0; i < name.length(); i++) {
            if (name.length() == 0){
                return false;
            }
            if (name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    static boolean Search2(String name, int target){
        if(name.length() == 0){
            return false;
        }
        for(char ch : name.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
