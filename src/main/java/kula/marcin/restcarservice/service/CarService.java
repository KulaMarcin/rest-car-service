package kula.marcin.restcarservice.service;

import java.util.List;

import kula.marcin.restcarservice.entity.Car;

public interface CarService {

	public List<Car> getCars();
	
	public List<Car> getCarsByColor(String color);
	
	public List<Car> getCarsByBrand(String brand);
	
	public List<Car> getCarsByModel(String model);
	
	public List<Car> getCarsByYearOfManufacture(int yearOfManufacture);
	
	public List<Car> getCarsByMinYearOfManufacture(int minYearOfManufacture);
	
	public List<Car> getCarsByMaxYearOfManufacture(int maxYearOfManufacture);
	
	public List<Car> getCarsByPower(int power);
	
	public List<Car> getCarsByMinPower(int minPower);
	
	public List<Car> getCarsByMaxPower(int maxPower);
	
	public List<Car> getCarsByBrandAndModelAndColorAndYearOfManufactureAndPowerAndVinNumber(String brand, String model, String color, int yearOfManufacture, int power, String vinNumber);
	
	public List<Car> getCarsByBrandAndModelAndColorAndYearOfManufactureAndPower(String brand, String model, String color, int yearOfManufacture, int power);
	
	public List<Car> getCarsByBrandAndModelAndColorAndYearOfManufacture(String brand, String model, String color, int yearOfManufacture);
	
	public List<Car> getCarsByBrandAndModelAndColor(String brand, String model, String color);
	
	public List<Car> getCarsByBrandAndModel(String brand, String model);
	
	public void saveCar(Car car);

	public Car getCar(int id);

	public void deleteCar(int id);
	
	public void deleteCarsByBrand(String brand);
	
	public void deleteCarsByModel(String model);
	
	public void deleteCarsByYearOfManufacture(int yearOfManufacture);
	
	public void deleteCarsByMinYearOfManufacture(int minYearOfManufacture);
	
	public void deleteCarsByMaxYearOfManufacture(int maxYearOfManufacture);
	
	public void deleteCarsByColor(String color);
	
	public void deleteCarsByPower(int power); 
	
	public void deleteCarsByMinPower(int minPower);
	
	public void deleteCarsByMaxPower(int maxPower);
}
