package org.ehrbase.fhirbridge.config.util;

import java.io.InputStream;
import java.util.Arrays;

public enum OperationalTemplateData {

    CORONA_DIAGNOSIS("", "Diagnose.opt", "Diagnose"),
    CORONA_TEMP("", "Intensivmedizinisches Monitoring Körpertemperatur.opt", "Intensivmedizinisches Monitoring Körpertemperatur"),
    CORONA_QUESTIONNAIRE("", "D4L_questionnaire.opt", "D4L_questionnaire"),
    CORONA_TEST("", "Kennzeichnung Erregernachweis SARS-CoV-2.opt", "Kennzeichnung Erregernachweis SARS-CoV-2"),
    CORONA_LAB("", "Laborbefund.opt", "Laborbefund");

    private final String filename;
    private final String templateId;
    private final String description;

    OperationalTemplateData(String description, String filename, String templateId) {
        this.filename = filename;
        this.description = description;
        this.templateId = templateId;
    }

    public InputStream getStream() {
        return getClass().getResourceAsStream("/opt/" + filename);
    }

    public static OperationalTemplateData findByTemplateId(String templateId) {
        return Arrays.stream(OperationalTemplateData.values())
                .filter(o -> o.getTemplateId().equals(templateId))
                .findAny()
                .orElse(null);
    }

    public String getTemplateId() {
        return templateId;
    }
}
