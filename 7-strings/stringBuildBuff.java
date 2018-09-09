// Sample code for using stringBuilder and
// stringBuffer classes. Both have identical API.
// use stringBuilder, since its newer. stringBuffer
// slower because  it is synchronous
class stringBuildBuff {
    public static void main(String[] args) {
        String s = "hello world!";
        StringBuilder sb = new StringBuilder(s);
        sb.append(" good").append(" morning :)");
        System.out.println("sb: "+sb.toString());
        System.out.println("sb.length: "+sb.length());
        sb.delete(1,5);
        System.out.println("sb: "+sb.toString());
        System.out.println("sb.length: "+sb.length());
        sb.insert(1, "ey");        
        System.out.println("sb: "+sb.toString());
        System.out.println("sb.length: "+sb.length());
    }
}