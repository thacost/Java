public class Projeto {
    public static void main(String[] args){

        Video v[] = new Video[3];
        v[0] = new Video("Aula1 de POOO");
        v[1] = new Video("Aula1 de PHP");
        v[2] = new Video("Aula1 de JAVA");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 28, "F", "creuzita");

        Visualizacao visu[] = new Visualizacao[5];
        visu [0] = new Visualizacao(g[0], v[2]); // Jubileu asst JAVA
        visu[0].avaliar();
        visu [1] = new Visualizacao(g[1], v[2]); // Creuza asst JAVA
        visu[1].avaliar(7);
        visu [2] = new Visualizacao(g[0], v[1]); // Jubileu asst PHP
        visu[2].avaliar(12.5f);
        visu [3] = new Visualizacao(g[1], v[1]);
        visu [4] = new Visualizacao(g[1], v[0]);

        System.out.println(visu[0].toString());
        System.out.println(visu[1].toString());
        System.out.println(visu[2].toString());
        System.out.println(visu[3].toString());
        System.out.println(visu[4].toString());

        /* System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());*/




    }
    
}
