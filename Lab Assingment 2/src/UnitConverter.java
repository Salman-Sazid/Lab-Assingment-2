public class UnitConverter {
    static double INCHES = 0.0254001;
    static double FEET =  0.3048;
    static double MILES = 1609.35;
    static double MILLIMETERS = 0.001;
    static double CENTIMETERS = 0.01;
    static double METERS = 1;
    static double KILOMETERS = 1000;

    static double LITRE = 1;

    static double FLUIDOUNCE = 0.0296;

    static double MILLILITRE = 0.001;

    static double GALLON = 4.546;

    static double KILOGRAM = 1;

    static double GRAM = 0.001;

    static double POUND = 0.454;

    static double OUNCE = 0.0283;

    private double val ,values,converted;
    String fromUnit, toUnit;

    public UnitConverter(String afromUnit)
    {
        fromUnit = afromUnit;
        toUnit = afromUnit;
    }

    public double toValue(double val)
    {
        if(toUnit.equals("in"))
        {
            values = (val*INCHES);
        }
        else if(toUnit.equals("ft"))
        {
            values = (val*FEET);
        }
        else if(toUnit.equals("mi"))
        {
            values = (val*MILES);
        }
        else if(toUnit.equals("mm"))
        {
            values = (val*MILLIMETERS);
        }
        else if(toUnit.equals("cm"))
        {
            values = (val*CENTIMETERS);
        }
        else if(toUnit.equals("m"))
        {
            values = (val*METERS);
        }
        else if(toUnit.equals("km"))
        {
            values = (val*KILOMETERS);
        }
        else if(toUnit.equals("l"))
        {
            values = (val*LITRE);
        }
        else if(toUnit.equals("fl_oz"))
        {
            values = (val*FLUIDOUNCE);
        }
        else if(toUnit.equals("ml"))
        {
            values = (val*MILLILITRE);
        }
        else if(toUnit.equals("gal"))
        {
            values = (val*GALLON);
        }
        else if(toUnit.equals("kg"))
        {
            values = (val*KILOGRAM);
        }
        else if(toUnit.equals("g"))
        {
            values = (val*GRAM);
        }
        else if(toUnit.equals("lb"))
        {
            values = (val*POUND);
        }
        else if(toUnit.equals("oz"))
        {
            values = (val*OUNCE);
        }
        return values;
    }

    public double fromMeters(double unit)
    {
        if(fromUnit.equals("in"))
        {
            converted = Math.round(unit*39.36992374);
        }
        else if(fromUnit.equals("ft"))
        {
            converted = Math.round(unit*3.280839895);
        }
        else if(fromUnit.equals("mi"))
        {
            converted = Math.round(unit*1609.34);
        }
        else if(fromUnit.equals("mm"))
        {
            converted = Math.round(unit*1000);
        }
        else if(fromUnit.equals("cm"))
        {
            converted = Math.round(unit*100);
        }
        else if(fromUnit.equals("m"))
        {
            converted = Math.round(unit*1);
        }
        else if(fromUnit.equals("km"))
        {
            converted = Math.round(unit*0.001);
        }
        else if(fromUnit.equals("l"))
        {
            converted = Math.round(unit*1);
        }
        else if(fromUnit.equals("fl_oz"))
        {
            converted = Math.round(unit*33.814);
        }
        else if(fromUnit.equals("gal"))
        {
            converted = Math.round(unit*0.264);
        }
        else if(fromUnit.equals("ml"))
        {
            converted = Math.round(unit*1000);
        }
        else if(fromUnit.equals("kg"))
        {
            converted = Math.round(unit*1);
        }
        else if(fromUnit.equals("g"))
        {
            converted = Math.round(unit*1000);
        }
        else if(fromUnit.equals("lb"))
        {
            converted = Math.round(unit*2.205);
        }
        else if(fromUnit.equals("oz"))
        {
            converted= Math.round(unit*35.274);
        }
        return converted;
    }
}
