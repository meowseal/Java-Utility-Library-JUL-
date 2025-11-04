public class vector2 
{
    // initialize data & types
    public double x,y;

    // Set values and attributes
    public vector2(double a, double b)
    {
        x = a;        
        y = b;

    }

    /**
    * Method returns what the vector2 would be if it was converted to int.
    * It doesn't directly convert the data into int due to initializer type naming.
    * Please fix to it directly turning it into any type using Object type.
    */

    public vector2 toInt()
    {
        vector2 intVector = new vector2((int)x,(int)y);
        return intVector;
    }

    /**
    * Method sets data to new data when inputed
    * Doesn't return data so you have to print it manually by calling for the variables.
    */

    public void replace(double a, double b)
    {
        x = a;        
        y = b;      
    }

}
