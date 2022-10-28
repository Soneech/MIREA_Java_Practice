package practice12_15.task4;

public class NumberFormat {
    private String countryCode;
    private String mainPart;
    public String numberFormat(String number) {
        if (number.charAt(0) == '8') {
            countryCode = "7";
            mainPart = number.substring(1);
        }
        else {
            countryCode = number.substring(1, number.length() - 10);
            mainPart = number.substring(number.length() - 10);
        }

        StringBuilder result = new StringBuilder();
        result.append("+");
        result.append(countryCode);
        result.append(mainPart, 0, 3).append("-");
        result.append(mainPart, 3, 6).append("-");
        result.append(mainPart, 6, mainPart.length());
        return result.toString();
    }
}
