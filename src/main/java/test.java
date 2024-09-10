public class test {
    public static void main(String[] args){

        HelloJava test = new HelloJava("BlueJ", "Nul a chier");

        
        System.out.println( test.getComment() + " " +  test.getIde());
        test.setIde("Eclipse");
        test.setComment("ça va");

        System.out.println( test.getComment() +" "+ test.getIde());

        test.setIde("IntelliJ");
        test.setComment("Banger");
        System.out.println(test.getComment() + " "+ test.getIde());
    }
}
