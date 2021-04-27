public class LRGStat {
    private int code;
    private String name;
    private String IGX;
    private String IGY;
    private String county;

    public LRGStat(String line) {
        String[] lineStrings = line.split(",");

        code = Integer.parseInt(lineStrings[0]);
        name = lineStrings[1];
        IGX = lineStrings[2];
        IGY = lineStrings[3];
        county = lineStrings[4];
    }

    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getIGX() { return IGX; }
    public void setIGX(String IGX) { this.IGX = IGX; }
    public String getIGY() { return IGY; }
    public void setIGY(String IGY) { this.IGY = IGY; }
    public String getCounty() { return county; }
    public void setCounty(String county) { this.county = county; }

    @Override
    public String toString() {
        return "LRGStat{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", IGX='" + IGX + '\'' +
                ", IGY='" + IGY + '\'' +
                ", county='" + county + '\'' +
                '}';
    }
}
