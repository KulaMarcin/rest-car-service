package kula.marcin.restcarservice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kula.marcin.restcarservice.entity.Car;
import kula.marcin.restcarservice.service.CarService;

@RestController
@RequestMapping("/api")
public class CarRestController {
	
	@Autowired
	private CarService carService;
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET)
	public List<Car> getCars(){
		
		return carService.getCars();
		
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET, params = {"id"})
	public Car getCarById(@RequestParam int id){
			
		Car car = carService.getCar(id);
		
		if(car == null)
			throw new CarNotFoundException("Car id not found - " + id);
		
		return car;
	}
	
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET, params = {"color"})
	public List<Car> getCarsByColor(@RequestParam String color){
		
		List<Car> cars = carService.getCarsByColor(color);
		
		if(cars.size() == 0)
			throw new CarNotFoundException("Car color not found - " + color);
		
		return cars;
	}
	
	
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET, params = {"brand"})
	public List<Car> getCarsByBrand(@RequestParam String brand){
		
		List<Car> cars = carService.getCarsByBrand(brand);
		
		if(cars.size() == 0)
			throw new CarNotFoundException("Car brand not found - " + brand);
		
		return cars;
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET, params = {"model"})
	public List<Car> getCarsByModel(@RequestParam String model){
		
		List<Car> cars = carService.getCarsByModel(model);
		
		if(cars.size() == 0)
			throw new CarNotFoundException("Car model not found - " + model);
		
		return cars;
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET, params = {"yearOfManufacture"})
	public List<Car> getCarsByYearOfManufacture(@RequestParam int yearOfManufacture){
		
		List<Car> cars = carService.getCarsByYearOfManufacture(yearOfManufacture);
		
		if(cars.size() == 0)
			throw new CarNotFoundException("Car year of manufacture not found - " + yearOfManufacture);
		
		return cars;
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET, params = {"minYearOfManufacture"})
	public List<Car> getCarsByMinYearOfManufacture(@RequestParam int minYearOfManufacture){
		
		List<Car> cars = carService.getCarsByMinYearOfManufacture(minYearOfManufacture);
		
		if(cars.size() == 0)
			throw new CarNotFoundException("Car min year of manufacture not found - " + minYearOfManufacture);
		
		return cars;
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET, params = {"maxYearOfManufacture"})
	public List<Car> getCarsByMaxYearOfManufacture(@RequestParam int maxYearOfManufacture){
		
		List<Car> cars = carService.getCarsByMaxYearOfManufacture(maxYearOfManufacture);
		
		if(cars.size() == 0)
			throw new CarNotFoundException("Car max year of manufacture not found - " + maxYearOfManufacture);
		
		return cars;
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET, params = {"power"})
	public List<Car> getCarsByPower(@RequestParam int power){
		
		List<Car> cars = carService.getCarsByPower(power);
		
		if(cars.size() == 0)
			throw new CarNotFoundException("Car power not found - " + power);
		
		return cars;
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET, params = {"minPower"})
	public List<Car> getCarsByMinPower(@RequestParam int minPower){
		
		List<Car> cars = carService.getCarsByMinPower(minPower);
		
		if(cars.size() == 0)
			throw new CarNotFoundException("Car min power not found - " + minPower);
		
		return cars;
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET, params = {"maxPower"})
	public List<Car> getCarsByMaxPower(@RequestParam int maxPower){
		
		List<Car> cars = carService.getCarsByMaxPower(maxPower);
		
		if(cars.size() == 0)
			throw new CarNotFoundException("Car max power not found - " + maxPower);
		
		return cars;
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET, params = {"brand", "model", "color", "yearOfManufacture", "power", "vinNumber"})
	public List<Car> getCarsByBrandAndModelAndColorAndYearOfManufactureAndPowerAndVinNumber(@RequestParam String brand, @RequestParam String model, @RequestParam String color, @RequestParam int yearOfManufacture, @RequestParam int power, @RequestParam String vinNumber){
		
		List<Car> cars = carService.getCarsByBrandAndModelAndColorAndYearOfManufactureAndPowerAndVinNumber(brand, model, color, yearOfManufacture, power, vinNumber);
		
		if(cars.size() == 0)
			throw new CarNotFoundException("Car brand, model, color, yearOfManufacture, power and vinNumber not found - " + brand + ", " + model + ", " + color + ", " + yearOfManufacture + ", " + power + ", " + vinNumber);
		
		return cars;
		
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET, params = {"brand", "model", "color", "yearOfManufacture", "power"})
	public List<Car> getCarsByBrandAndModelAndColorAndYearOfManufactureAndPower(@RequestParam String brand, @RequestParam String model, @RequestParam String color, @RequestParam int yearOfManufacture, @RequestParam int power){
		
		List<Car> cars = carService.getCarsByBrandAndModelAndColorAndYearOfManufactureAndPower(brand, model, color, yearOfManufacture, power);
		
		if(cars.size() == 0)
			throw new CarNotFoundException("Car brand, model, color, yearOfManufacture and power not found - " + brand + ", " + model + ", " + color + ", " + yearOfManufacture + ", " + power);
		
		return cars;
		
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET, params = {"brand", "model", "color", "yearOfManufacture"})
	public List<Car> getCarsByBrandAndModelAndColorAndYearOfManufacture(@RequestParam String brand, @RequestParam String model, @RequestParam String color, @RequestParam int yearOfManufacture){
		
		List<Car> cars = carService.getCarsByBrandAndModelAndColorAndYearOfManufacture(brand, model, color, yearOfManufacture);
		
		if(cars.size() == 0)
			throw new CarNotFoundException("Car brand, model, color and yearOfManufacture not found - " + brand + ", " + model + ", " + color + ", " + yearOfManufacture);
		
		return cars;
		
	}
	
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET, params = {"brand", "model", "color"})
	public List<Car> getCarsByBrandAndModelAndColor(@RequestParam String brand, @RequestParam String model, @RequestParam String color){
		
		List<Car> cars = carService.getCarsByBrandAndModelAndColor(brand, model, color);
		
		if(cars.size() == 0)
			throw new CarNotFoundException("Car brand, model and color - " + brand + ", " + model + ", " + color);
		
		return cars;
		
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.GET, params = {"brand", "model"})
	public List<Car> getCarsByBrandAndModel(@RequestParam String brand, @RequestParam String model){
		
		List<Car> cars = carService.getCarsByBrandAndModel(brand, model);
		
		if(cars.size() == 0)
			throw new CarNotFoundException("Car brand and model - " + brand + ", " + model);
		
		return cars;
		
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.POST)
	public Car addCar(@RequestBody Car car) {
		
		car.setId(0);
		carService.saveCar(car);
		
		return car;
	}
	
	
	@RequestMapping(value = "/cars", method = RequestMethod.PUT)
	public Car updateCustomer(@RequestBody Car car) {
		carService.saveCar(car);
		return car;
	}
	
	
	@RequestMapping(value = "/cars", method = RequestMethod.DELETE, params = {"id"})
	public String deleteCar(@RequestParam int id){
		
		carService.deleteCar(id);
		
		return "Deleted car id - " + id;
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.DELETE, params = {"brand"})
	public String deleteCarsByBrand(@RequestParam String brand){
		
		carService.deleteCarsByBrand(brand);
		
		return "Deleted cars with brand - " + brand;
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.DELETE, params = {"model"})
	public String deleteCarsByModel(@RequestParam String model){
		
		carService.deleteCarsByModel(model);
		
		return "Deleted cars with model - " + model;
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.DELETE, params = {"yearOfManufacture"})
	public String deleteCarsByYearOfManufacture(@RequestParam int yearOfManufacture){
		
		carService.deleteCarsByYearOfManufacture(yearOfManufacture);
		
		return "Deleted cars with year of manufacture - " + yearOfManufacture;
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.DELETE, params = {"minYearOfManufacture"})
	public String deleteCarsByMinYearOfManufacture(@RequestParam int minYearOfManufacture){
		
		carService.deleteCarsByMinYearOfManufacture(minYearOfManufacture);
		
		return "Deleted cars with min year of manufacture - " + minYearOfManufacture;
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.DELETE, params = {"maxYearOfManufacture"})
	public String deleteCarsByMaxYearOfManufacture(@RequestParam int maxYearOfManufacture){
		
		carService.deleteCarsByMaxYearOfManufacture(maxYearOfManufacture);
		
		return "Deleted cars with max year of manufacture - " + maxYearOfManufacture;
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.DELETE, params = {"color"})
	public String deleteCarsByColor(@RequestParam String color){
		
		carService.deleteCarsByColor(color);
		
		return "Deleted cars with color - " + color;
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.DELETE, params = {"power"})
	public String deleteCarsByPower(@RequestParam int power){
		
		carService.deleteCarsByPower(power);
		
		return "Deleted cars with power - " + power;
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.DELETE, params = {"minPower"})
	public String deleteCarsByMinPower(@RequestParam int minPower){
		
		carService.deleteCarsByMinPower(minPower);
		
		return "Deleted cars with min power - " + minPower;
	}
	
	@RequestMapping(value = "/cars", method = RequestMethod.DELETE, params = {"maxPower"})
	public String deleteCarsByMaxPower(@RequestParam int maxPower){
		
		carService.deleteCarsByMaxPower(maxPower);
		
		return "Deleted cars with max power - " + maxPower;
	}
	
}
