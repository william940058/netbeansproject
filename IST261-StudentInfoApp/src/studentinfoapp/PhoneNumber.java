package studentinfoapp;

/**
 *
 * @author
 */
public class PhoneNumber {

    private Double areaCode;
    private Double prefix;
    private Double lineNum;

    PhoneNumber(String phoneNumber) {
        String[] splitLine = phoneNumber.split("-");
        this.areaCode = Double.parseDouble(splitLine[0]);
        this.prefix = Double.parseDouble(splitLine[1]);
        this.lineNum = Double.parseDouble(splitLine[2]);
    }

    @Override
    public String toString() {
        return String.format("%.0f", this.areaCode) + "-" + String.format("%.0f", this.prefix) + "-" + String.format("%.0f", this.lineNum);
    }

}
