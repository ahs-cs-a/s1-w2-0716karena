public class BodyOfWater{
    private String name;
    private int largestDiameter;
    private int avgDepth;
    private boolean isSaltWater;
    public BodyOfWater(String n, int l, int d, boolean s){

        name=n;
        largestDiameter=l;
        avgDepth=d;
        isSaltWater=s;

    }
    public BodyOfWater(String n, int d){
        name=n;
        avgDepth=d;
    }
    public void printState(){
        System.out.println("Name: " + name);
        System.out.println("largest diameter: " + largestDiameter);
    }
}
    //attributes: name, largestDiameter, avgDepth, isSaltWater




