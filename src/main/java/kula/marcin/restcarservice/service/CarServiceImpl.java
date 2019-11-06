package kula.marcin.restcarservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kula.marcin.restcarservice.dao.CarDAO;
import kula.marcin.restcarservice.entity.Car;

@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarDAO carDao;
	
	@Override
	@Transactional
	public List<Car> getCars() {
		
		return carDao.getCars();
		
	}
	
	@Override
	@Transactional
	public List<Car> getCarsByColor(String color) {

		return carDao.getCarsByColor(color);
	}
	
	@Override
	@Transactional
	public List<Car> getCarsByBrand(String brand) {
		
		return carDao.getCarsByBrand(brand);
	}
	
	@Override
	@Transactional
	public List<Car> getCarsByModel(String model) {
		
		return carDao.getCarsByModel(model);
	}
	

	@Override
	@Transactional
	public List<Car> getCarsByYearOfManufacture(int yearOfManufacture) {
		
		return carDao.getCarsByYearOfManufacture(yearOfManufacture);
	}
	
	@Override
	@Transactional
	public List<Car> getCarsByMinYearOfManufacture(int minYearOfManufacture) {
		
		return carDao.getCarsByMinYearOfManufacture(minYearOfManufacture);
	}
	
	@Override
	@Transactional
	public List<Car> getCarsByMaxYearOfManufacture(int maxYearOfManufacture) {
		
		return carDao.getCarsByMaxYearOfManufacture(maxYearOfManufacture);
	}
	
	@Override
	@Transactional
	public List<Car> getCarsByPower(int power) {
		
		return carDao.getCarsByPower(power);
	}

	@Override
	@Transactional
	public List<Car> getCarsByMinPower(int minPower) {
	
		return carDao.getCarsByMinPower(minPower);
	}
	
	@Override
	@Transactional
	public List<Car> getCarsByMaxPower(int maxPower) {
		
		return carDao.getCarsByMaxPower(maxPower);
	}
	
	@Override
	@Transactional
	public List<Car> getCarsByBrandAndModelAndColorAndYearOfManufactureAndPowerAndVinNumber(String brand, String model,
			String color, int yearOfManufacture, int power, String vinNumber) {
		
		return carDao.getCarsByBrandAndModelAndColorAndYearOfManufactureAndPowerAndVinNumber(brand, model, color, yearOfManufacture, power, vinNumber);
	}
	
	@Override
	@Transactional
	public List<Car> getCarsByBrandAndModelAndColorAndYearOfManufactureAndPower(String brand, String model,
			String color, int yearOfManufacture, int power) {
		
		return carDao.getCarsByBrandAndModelAndColorAndYearOfManufactureAndPower(brand, model, color, yearOfManufacture, power);
	}
	
	
	@Override
	@Transactional
	public List<Car> getCarsByBrandAndModelAndColorAndYearOfManufacture(String brand, String model, String color,
			int yearOfManufacture) {
		
		return carDao.getCarsByBrandAndModelAndColorAndYearOfManufacture(brand, model, color, yearOfManufacture);
	}
	
	@Override
	@Transactional
	public List<Car> getCarsByBrandAndModelAndColor(String brand, String model, String color) {
		
		return carDao.getCarsByBrandAndModelAndColor(brand, model, color);
	}
	
	@Override
	@Transactional
	public List<Car> getCarsByBrandAndModel(String brand, String model) {
		
		return carDao.getCarsByBrandAndModel(brand, model);
	}
	
	@Override
	@Transactional
	public void saveCar(Car car) {
		
		carDao.saveCar(car);

	}

	@Override
	@Transactional
	public Car getCar(int id) {
		
		return carDao.getCar(id);
		
	}

	@Override
	@Transactional
	public void deleteCar(int id) {
		
		carDao.deleteCar(id);

	}
	
	@Override
	@Transactional
	public void deleteCarsByBrand(String brand) {
		
		carDao.deleteCarsByBrand(brand);
		
	}
	
	@Override
	@Transactional
	public void deleteCarsByModel(String model) {
		
		carDao.deleteCarsByModel(model);
		
	}
	
	@Override
	@Transactional
	public void deleteCarsByYearOfManufacture(int yearOfManufacture) {
		
		carDao.deleteCarsByYearOfManufacture(yearOfManufacture);
	}
	
	@Override
	@Transactional
	public void deleteCarsByMinYearOfManufacture(int minYearOfManufacture) {
		
		carDao.deleteCarsByMinYearOfManufacture(minYearOfManufacture);
	}

	@Override
	@Transactional
	public void deleteCarsByMaxYearOfManufacture(int maxYearOfManufacture) {
		
		carDao.deleteCarsByMaxYearOfManufacture(maxYearOfManufacture);
	}
	
	@Override
	@Transactional
	public void deleteCarsByColor(String color) {
		
		carDao.deleteCarsByColor(color);
		
	}

	@Override
	@Transactional
	public void deleteCarsByPower(int power) {

		carDao.deleteCarsByPower(power);
		
	}

	@Override
	@Transactional
	public void deleteCarsByMinPower(int minPower) {
		
		carDao.deleteCarsByMinPower(minPower);
		
	}

	@Override
	@Transactional
	public void deleteCarsByMaxPower(int maxPower) {
		
		carDao.deleteCarsByMaxPower(maxPower);
		
	}

	









	

	

	


	
}
