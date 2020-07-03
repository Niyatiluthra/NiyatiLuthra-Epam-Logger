package org.example.constructionCost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.App;

public class ConstructionCost {

    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(ConstructionCost.class);
    private static final int lowQualityMaterialCost = 1200;
    private static final int mediumQualityMaterialCost = 1500;
    private static final int highQualityMaterialCost = 1800;
    private static final int automationCost = 2500;

    enum Material
    {
        Low_Quality_Material,
        Medium_Quality_Material,
        High_Quality_Material
    }

    public static double calculateCost(String selectedMaterial, double area, boolean requireAutomation )
    {
        if (area == 0) {
            logger.error("Area cant be zero");
        }
        else if((String.valueOf(Material.Low_Quality_Material)).equalsIgnoreCase(selectedMaterial)) {
            if(requireAutomation){
                return area*(lowQualityMaterialCost+automationCost);
            }
            return area*lowQualityMaterialCost;
        }
        else if((String.valueOf(Material.Medium_Quality_Material)).equalsIgnoreCase(selectedMaterial)) {
            if(requireAutomation){
                return area*(mediumQualityMaterialCost+automationCost);
            }
            return area*mediumQualityMaterialCost;
        }
        else if ((String.valueOf(Material.High_Quality_Material)).equalsIgnoreCase(selectedMaterial)) {
            if(requireAutomation){
                return area*(highQualityMaterialCost+automationCost);
            }
            return area*highQualityMaterialCost;
        }
        logger.error("Selected material doesnt match any given option");
        return 0.0;
    }
}