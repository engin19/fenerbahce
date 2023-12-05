package groupProject;

public class E10 {
    public static void main(String[] args) {
        String[][] cars={
                {"Ford","Honda","Lexus","Ford","Acura"},
                {"Acura","Ford","Mazda","Mercedes"},
                {"Acura","Honda","Toyota"}
        };int number=0;
        for (int i=0; i<cars.length;i++){
            for (int j=0; j<cars[i].length;j++){
                if (cars[i][j].equals("Acura")){
                    number++;
                }
            }
        }
        System.out.println("There are "+number+" people drives Acura in this office ");
    }
}
