class char_dig_spe{
    public static void main(String[] args) {
        int num = '/';
        String Result = num>=0 && num<=9 ? "Digit":
                        num>='A' && num<='Z'||num>='a' && num<='z'?"Character":
                        "Special Character";
        System.out.println(Result);
    }
}