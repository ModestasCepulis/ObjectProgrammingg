public class MyPoint {

    private int xVal;
    private int yVal;

    public void setXVal(int xVal){this.xVal = xVal;}
    public int getXVAL(){return xVal;}

    public void setYVAL(int yVal){this.yVal = yVal;}
    public int getYVAL(){return yVal;}

    public MyPoint()
    {
        this.yVal = 0;
        this.xVal = 0;
    }

    public MyPoint(int yVal, int xVal)
    {
        setXVal(xVal);
        setYVAL(yVal);
    }

    public String toString()
    {
        return "The X value: \n" + getXVAL() + "\nThe Y Value: \n" + getYVAL();
    }
}
