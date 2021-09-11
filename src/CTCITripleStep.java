public class CTCITripleStep {
    public static void main(String[] args) {
        try
        {
            CTCITripleStep obj = new CTCITripleStep();
            obj.run (args);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }
    public void run(String[] args){
        //Prints out how many ways the stairs can be climbed
        System.out.println(howManyPaths(21));
    }
    public int howManyPaths(int numOfSteps){
        int a = 1;
        int b = 1;
        int c = 2;
        if(numOfSteps == 0 || numOfSteps == 1){
            return 1;
        }else if(numOfSteps == 2){
            return 2;
        }else{
            for(int x=3;x<=numOfSteps;x++){
                int d = a+b+c;
                a = b;
                b = c;
                c = d;
            }
        }
        return c;
    }
}
