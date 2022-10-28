package practice12_15.task2;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String part;
    private String flat;

    public void setData(String data) {
        StringTokenizer tokenizer = new StringTokenizer(data, ",.;-/");

        country = tokenizer.nextToken().trim();
        region = tokenizer.nextToken().trim();
        city = tokenizer.nextToken().trim();
        street = tokenizer.nextToken().trim();
        house = tokenizer.nextToken().trim();
        part = tokenizer.nextToken().trim();
        flat = tokenizer.nextToken().trim();
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getPart() {
        return part;
    }

    public String getFlat() {
        return flat;
    }

    @Override
    public String toString() {
        return country + " " + region + " " + city + " " + street + " " + house + " " + part + " " + flat;
    }
}
