package pl.sdacademy.gitara;


public class Main {
    public static void main(String[] args) {
        Gitara gitara1 = new Gitara(true, true, 4, "Sony");
        System.out.println("Nazwa: " + gitara1.getName());
        System.out.println("Elektryczna: " + gitara1.getElektryczna());
        System.out.println("Nastrojona: " + gitara1.getNastrojona());
        System.out.println("Struny: " + gitara1.getStruny());
        System.out.println(gitara1);
    }
}
