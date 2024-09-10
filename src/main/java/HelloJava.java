
/**
 * Ceci est une classe de test qui ne fait pas grand chose
 *
 * @author JMB
 * @author LC
 */
class HelloJava {

    private String ideForJava = "";
    private String comment = "";
    public void afficherCancan() {
        System.out.println("test");

    }

    HelloJava(String ide , String comment){
        this.ideForJava = ide;
        this.comment = comment;
    }

    public String getIde(){
        return this.ideForJava;
    }

    public String setIde(String ide){
        return this.ideForJava = ide;
    }

    public String getComment(){
        return this.comment;
    }

    public String setComment(String comment){
        return this.comment = comment;
    }

   
}

