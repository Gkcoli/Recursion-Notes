public class TowerniRyujen {
    
    public static String hanoi(int nDisks, int fromPeg, int toPeg){
        if(nDisks == 1){
            return fromPeg + " to " + toPeg + ";" ;//
        }
        else{
            String sol1, sol2, sol3;
            int helpPeg = 6 - fromPeg - toPeg;

            sol1 = hanoi(nDisks - 1, fromPeg, helpPeg);
            sol2 = fromPeg + " to " + toPeg + ";" ;
            sol3 = hanoi(nDisks - 1, helpPeg, toPeg);

            return sol1 + sol2 + sol3;
        }
  }
    
    public static void main(String[] args)  {
        int nDisks = 4;
        String StepsToSolution = hanoi(nDisks, 1, 3);

        for (String step : StepsToSolution.split(";")){
        System.out.println(step);

    
        }
    }
}
