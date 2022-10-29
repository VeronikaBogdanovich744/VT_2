package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.io.IOException;
/**
 * This is a program for finding all ovens and the cheapiest appliance
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Appliance appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();


		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		var apps = service.find(criteriaOven);
		PrintApplianceInfo.printList(apps);
		System.out.println("The cheapest: ");
		var app = service.findTheCheapest();
		PrintApplianceInfo.print(app);
	}

}
