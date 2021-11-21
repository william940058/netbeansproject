package studentinfogsonapp;

public class PhoneNumber {
    
    private int areaCode;
    private int prefix;
    private int numLine;
    
    PhoneNumber(int areaCode, int prefix, int lineNumber){
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.numLine = lineNumber;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getPrefix() {
        return prefix;
    }

    public int getNumLine() {
        return numLine;
    }

}
