package kula.marcin.restcarservice.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kula.marcin.restcarservice.entity.Car;

@Repository
public class CarDAOImpl implements CarDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Car> getCars() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Car> query = currentSession.createQuery("from Car order by id", Car.class);
		List<Car> cars = query.getResultList();
		
		return cars;
	}
	
	@Override
	public List<Car> getCarsByColor(String color) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Car> query = currentSession.createQuery("from Car where color=:color", Car.class);
		query.setParameter("color", color);
		List<Car> cars = query.getResultList();
		
		return cars;
	}
	
	@Override
	public List<Car> getCarsByBrand(String brand) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Car> query = currentSession.createQuery("from Car where brand=:brand", Car.class);
		query.setParameter("brand", brand);
		List<Car> cars = query.getResultList();
		
		return cars;
	}
	
	@Override
	public List<Car> getCarsByModel(String model) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Car> query = currentSession.createQuery("from Car where model=:model", Car.class);
		query.setParameter("model", model);
		List<Car> cars = query.getResultList();
		
		return cars;
	}
	
	@Override
	public List<Car> getCarsByYearOfManufacture(int yearOfManufacture) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Car> query = currentSession.createQuery("from Car where year_of_manufacture=:yearOfManufacture", Car.class);
		query.setParameter("yearOfManufacture", yearOfManufacture);
		List<Car> cars = query.getResultList();
		
		return cars;
	}
	
	@Override
	public List<Car> getCarsByMinYearOfManufacture(int minYearOfManufacture) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Car> query = currentSession.createQuery("from Car where year_of_manufacture>=:minYearOfManufacture", Car.class);
		query.setParameter("minYearOfManufacture", minYearOfManufacture);
		List<Car> cars = query.getResultList();
		
		return cars;
	}
	
	@Override
	public List<Car> getCarsByMaxYearOfManufacture(int maxYearOfManufacture) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Car> query = currentSession.createQuery("from Car where year_of_manufacture<=:maxYearOfManufacture", Car.class);
		query.setParameter("maxYearOfManufacture", maxYearOfManufacture);
		List<Car> cars = query.getResultList();
		
		return cars;
	}
	
	@Override
	public List<Car> getCarsByPower(int power) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Car> query = currentSession.createQuery("from Car where power=:power", Car.class);
		query.setParameter("power", power);
		List<Car> cars = query.getResultList();
		
		return cars;
	}
	
	@Override
	public List<Car> getCarsByMinPower(int minPower) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Car> query = currentSession.createQuery("from Car where power>=:minPower", Car.class);
		query.setParameter("minPower", minPower);
		List<Car> cars = query.getResultList();
		
		return cars;
	}
	
	@Override
	public List<Car> getCarsByMaxPower(int maxPower) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Car> query = currentSession.createQuery("from Car where power<=:maxPower", Car.class);
		query.setParameter("maxPower", maxPower);
		List<Car> cars = query.getResultList();
		
		return cars;
	}
	
	@Override
	public List<Car> getCarsByBrandAndModelAndColorAndYearOfManufactureAndPowerAndVinNumber(String brand, String model,
			String color, int yearOfManufacture, int power, String vinNumber) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Car> query = currentSession.createQuery("from Car where brand=:brand and model=:model and color=:color and year_of_manufacture=:yearOfManufacture and power=:power and vin_number=:vinNumber", Car.class);
		
		query.setParameter("brand", brand);
		query.setParameter("model", model);
		query.setParameter("color", color);
		query.setParameter("yearOfManufacture", yearOfManufacture);
		query.setParameter("power", power);
		query.setParameter("vinNumber", vinNumber);
		List<Car> cars = query.getResultList();
			
		return cars;
		
	}
	
	@Override
	public List<Car> getCarsByBrandAndModelAndColorAndYearOfManufactureAndPower(String brand, String model,
			String color, int yearOfManufacture, int power) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Car> query = currentSession.createQuery("from Car where brand=:brand and model=:model and color=:color and year_of_manufacture=:yearOfManufacture and power=:power", Car.class);
		query.setParameter("brand", brand);
		query.setParameter("model", model);
		query.setParameter("color", color);
		query.setParameter("yearOfManufacture", yearOfManufacture);
		query.setParameter("power", power);
		List<Car> cars = query.getResultList();
		
		return cars;
	}
	
	@Override
	public List<Car> getCarsByBrandAndModelAndColorAndYearOfManufacture(String brand, String model, String color,
			int yearOfManufacture) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Car> query = currentSession.createQuery("from Car where brand=:brand and model=:model and color=:color and year_of_manufacture=:yearOfManufacture", Car.class);
		query.setParameter("brand", brand);
		query.setParameter("model", model);
		query.setParameter("color", color);
		query.setParameter("yearOfManufacture", yearOfManufacture);
		List<Car> cars = query.getResultList();
		
		return cars;
	}
	
	@Override
	public List<Car> getCarsByBrandAndModelAndColor(String brand, String model, String color) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Car> query = currentSession.createQuery("from Car where brand=:brand and model=:model and color=:color", Car.class);
		query.setParameter("brand", brand);
		query.setParameter("model", model);
		query.setParameter("color", color);
		List<Car> cars = query.getResultList();
		
		return cars;
	}

	@Override
	public List<Car> getCarsByBrandAndModel(String brand, String model) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Car> query = currentSession.createQuery("from Car where brand=:brand and model=:model", Car.class);
		query.setParameter("brand", brand);
		query.setParameter("model", model);
		List<Car> cars = query.getResultList();
		
		return cars;
	}
	
	@Override
	public void saveCar(Car car) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(car);

	}

	@Override
	public Car getCar(int id) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Car car = currentSession.get(Car.class, id);
				
		return car;
	}

	@Override
	public void deleteCar(int id) {

		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Car where id=:id");
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();		
	}
	
	@Override
	public void deleteCarsByBrand(String brand) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Car where brand=:brand");
		theQuery.setParameter("brand", brand);
		theQuery.executeUpdate();
	}
	
	@Override
	public void deleteCarsByModel(String model) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Car where model=:model");
		theQuery.setParameter("model", model);
		theQuery.executeUpdate();
	}
	
	@Override
	public void deleteCarsByYearOfManufacture(int yearOfManufacture) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Car where year_of_manufacture=:yearOfManufacture");
		theQuery.setParameter("yearOfManufacture", yearOfManufacture);
		theQuery.executeUpdate();
	}
	
	@Override
	public void deleteCarsByMinYearOfManufacture(int minYearOfManufacture) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Car where year_of_manufacture>=:minYearOfManufacture");
		theQuery.setParameter("minYearOfManufacture", minYearOfManufacture);
		theQuery.executeUpdate();
	}

	@Override
	public void deleteCarsByMaxYearOfManufacture(int maxYearOfManufacture) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Car where year_of_manufacture<=:maxYearOfManufacture");
		theQuery.setParameter("maxYearOfManufacture", maxYearOfManufacture);
		theQuery.executeUpdate();
	}
	
	@Override
	public void deleteCarsByColor(String color) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Car where color=:color");
		theQuery.setParameter("color", color);
		theQuery.executeUpdate();
	}

	@Override
	public void deleteCarsByPower(int power) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Car where power=:power");
		theQuery.setParameter("power", power);
		theQuery.executeUpdate();
	}

	@Override
	public void deleteCarsByMinPower(int minPower) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Car where power>=:minPower");
		theQuery.setParameter("minPower", minPower);
		theQuery.executeUpdate();
	}

	@Override
	public void deleteCarsByMaxPower(int maxPower) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from Car where power<=:maxPower");
		theQuery.setParameter("maxPower", maxPower);
		theQuery.executeUpdate();
		
	}

}
