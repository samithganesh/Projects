// Samith Ganesh

public class Country 
{
    // Instance Variables
    private String countryName;
    private int countryArea;
    private int countryPopulation;

    // Constructor Methods
    public Country()
    {

    }

    public Country(String name)
    {
        countryName = name;
    }

    // Getter Methods
    public String getName()
    {
        return countryName;
    }

    public int getArea()
    {
        return countryArea;
    }

    public int getPopulation()
    {
        return countryPopulation;
    }

    // Setter Methods
    public void setName(String name)
    {
        countryName = name;
    }

    public void setArea(int area)
    {
        countryArea = area;
    }

    public void setPopulation(int population)
    {
        countryPopulation = population;
    }

    // toString Methods
    public String toString()
    {
        return "Country Name: " + getName() + " | Country Area: " + getArea() + " | Country Population: " + getPopulation();
    }

    // Other Methods
    public void updatePopulation(int births, int deaths)
    {
        countryPopulation += births;
        countryPopulation -= deaths;
    }

    public void calculateDensity()
    {
        double density = countryPopulation / countryArea;
    }


    public static void main(String[] args)
    {
        Country country1 = new Country();
        Country country2 = new Country("Jamaica");

        country1.updatePopulation(1000000000, 500000);
        country1.setArea(2000000);
        country1.setName("India");

        country2.setArea(1000000);
        country2.setPopulation(2500000);

        System.out.println(country1);
        System.out.println(country2);
    }

}
