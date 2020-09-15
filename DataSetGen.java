public class DataSetGen<T>
{
   private double sum;
   private Measurable maximum;
   private int count;

   /**
    * Constructs an empty data set
    */
   public DataSetGen()
   {
      sum = 0;
      count = 0;
      maximum = null;
   }

   /**
    * Adds a value to a data set
    * 
    * @param x Value to add
    */
   public void add(Measurable x)
   {
      sum = sum + x.getMeasure();

      if (count == 0 || maximum.getMeasure() < x.getMeasure()) {
         maximum = x; 
      }

      count++;
   }

   /**
    * Gets the average of a data set
    * 
    * @return Set average
    */
   public double getAverage()
   {
       return (count == 0 ? count : sum / count);
   }

   /**
    * Gets the largest value of a data set
    * 
    * @return T Largest value
    */
   @SuppressWarnings("unchecked")
   public T getMaximum()
   {
      return (T) maximum;
   }
}