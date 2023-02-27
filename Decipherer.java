class Decipherer {
    public static void main(String[] args){
        System.out.println(decipher("0@sn9sirppa@#?ia'jgtvryko1")); 
        System.out.println(decipher("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj"));
        System.out.println(decipher("aopi?sedohtém@#?sedhtmg+p9l!"));
    }

    public static String decipher(String string){
        int keyNumber = (string.length())/2;
        String substring = string.substring(5, 5 + keyNumber);
        substring = substring.replace("@#?", " ");
        return new StringBuilder(substring).reverse().toString();
    }
}