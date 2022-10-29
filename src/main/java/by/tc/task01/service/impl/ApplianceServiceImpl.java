package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{
	@Override
	public List<Appliance> find(Criteria criteria) throws IOException {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> appliances = applianceDAO.find(criteria);
		return appliances;
	}

	@Override
	public Appliance findTheCheapest() throws IOException {

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> appliances=  applianceDAO.find();
		return TheCheapest(appliances);
	}

	private Appliance TheCheapest(List<Appliance> list) throws IOException {
		if(list.size()==0){
			return null;
		}

		Appliance app=list.get(0);
		int minPrice=app.price;
		for (Appliance currApp: list
		) {
			if(minPrice>currApp.price) {
				minPrice = currApp.price;
				app=currApp;
			}
		}
		return app;
	}

}

