package org.ehrbase.fhirbridge.mapping;

import java.util.HashMap;

public class Utils {

    //TODO where do we put this
    private static final HashMap<String, Object> loincCodes = new HashMap<String, Object>(){{
        put("LA6255-9", "Allein wohnend");
        put("LA9996-5", "Wohnt mit anderen zusammen");
        put("LA33-6", Boolean.TRUE);
        put("LA32-8", Boolean.FALSE);
        put("LA46-8", "Other");
        put("LA15173-0", Boolean.TRUE);
        put("LA26683-5", Boolean.FALSE);
        put("LA12688-0", "Ich weiß es nicht");
     //   put("LA4489/6", "unbekannt");
    }};

    private static final HashMap<String, String> fhirCodes = new HashMap<String, String>(){{
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

}
