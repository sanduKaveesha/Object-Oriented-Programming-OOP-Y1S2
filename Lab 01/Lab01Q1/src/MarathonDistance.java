public class MarathonDistance {

    int miles;
    int yards;
    double kilometers;

     public void calculateKilometers(){

         double totalMiles = miles + (yards/1760.0);
         kilometers = totalMiles * 1.609;

     }

}
