class SpaceRemoving{
    public static void main(String[] args){
    Space s = new Space();
        String ip= "  hello world  ";
        String or = s.removeSpace(ip);
        System .out.println(or);
        System.out.println(s.rev(or));
    }

}
class Space {
    String removeSpace(String str) {

        return str.trim().replaceAll("//s", " ");
    }

    String rev(String str2) {
        String ans = "";
        for (int i = str2.length()-1; i >= 0; i--) {
            ans = ans + str2.charAt(i);
        }
        return ans;
    }
}