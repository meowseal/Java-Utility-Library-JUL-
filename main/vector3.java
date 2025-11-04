public class vector3 
{
    // initialize data & types
    public double x,y,z;

    // Set values and attributes
    public vector3(double a, double b, double c)
    {
        x = a;        
        y = b;
        z = c;
    }

    // return modified vector3 as int
    public vector3 toInt()
    {
        vector3 intVector = new vector3((int)x,(int)y,(int)z);
        return intVector;
    }


}