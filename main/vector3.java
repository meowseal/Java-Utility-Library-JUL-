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

    /**
    * Method returns what the vector3 would be if it was converted to int.
    * It doesn't directly convert the data into int due to initializer type naming.
    * Please fix to it directly turning it into any type using Object type.
    */

    public vector3 toInt()
    {
        vector3 intVector = new vector3((int)x,(int)y,(int)z);
        return intVector;
    }

    /**
    * Method sets data to new data when inputed
    * Doesn't return data so you have to print it manually by calling for the variables.
    */

    public void replace(double a, double b, double c)
    {
        x = a;        
        y = b;
        z = c;        
    }

}