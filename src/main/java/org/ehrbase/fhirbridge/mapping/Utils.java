package org.ehrbase.fhirbridge.mapping;

import java.util.HashMap;

public class Utils {

    //TODO where do we put this
    private static final HashMap<String, Object> loincCodes = new HashMap<String, Object>(){{
        put("LA6255-9", "Allein wohnend");
        put("LA9996-5", "Wohnt mit anderen zusammen");
        put("LA33-6", "Ja");
        put("LA32-8", "Nein");
        put("LA46-8", "Other");
        put("LA15173-0", "Pregnant"); //Pregnant
        put("LA26683-5", "Not pregnant"); //Not pregnant
        put("LA12688-0", "Ich weiß es nicht");
     //   put("LA4489/6", "unbekannt");
    }};

    //Kept codes without direct Boolean mappings in order to allow the strings as values in the future
    private static final HashMap<String, Boolean> stringToBooleanMap = new HashMap<>(){{
        put("Ja", Boolean.TRUE);
        put("Yes", Boolean.TRUE);
        put("Pregnant", Boolean.TRUE); //TODO change in future
        put("Nein", Boolean.FALSE);
        put("No", Boolean.FALSE);
        put("Ich weiß es nicht", Boolean.FALSE); //TODO change in future
        put("Not pregnant", Boolean.FALSE); //TODO change in future
        put(" ", Boolean.FALSE); //TODO change in future
    }};

    private static final HashMap<String, String> fhirCodes = new HashMap<String, String>(){{
        //TODO code value list alter
        put("medical", "im medizinischen Bereich(Pflege, Arztpraxis oder Krankenhaus)");
        put("community", "in einer Gemeinschaftseinrichtung(Schule, Kita, Universität, Heim etc.)");
        put("Other", "Nein, in keinem der genannten Bereiche");
    }};




    public static boolean isLoincCode(String code){
        return loincCodes.containsKey(code);
    }


    public static Object decodeLOINCCode(String code){
            return loincCodes.get(code);
    }

    public static boolean isFhirCode(String code){
        return fhirCodes.containsKey(code);
    }

    public static Object decodeFhirCode(String code){
        return fhirCodes.get(code);
    }

    public static Boolean parseStringToBoolean(String code){
        if(stringToBooleanMap.containsKey(code))
            return stringToBooleanMap.get(code);
        throw new ClassCastException( "\""+ code + "\" cannot be mapped to boolean, mapping not defined");
/*        if(code.equals("Ja") || code.equals("Yes") || code.equals("Pregnant")){
            return Boolean.TRUE;
        }else if(code.equals("Nein") || code.equals("No") || code.equals("Ich weiß es nicht") || code.equals("Not pregnant") || code.equals(" ")){
            return Boolean.FALSE;
        }else {*/


    }

}
