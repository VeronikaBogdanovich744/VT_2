package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;
/**
 * Implementation of printing in console
 */
public class PrintApplianceInfo {
	
	public static void print(Appliance appliance) {
		if(appliance!=null) {
			System.out.println(appliance.toString());
		}
	}

	public static void printList(List<Appliance> appliances) {
		for (Appliance app:
			 appliances) {
			System.out.println(app.toString());
		}
	}
}
