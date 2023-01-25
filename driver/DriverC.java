package driver;

import autoRacing.Competing;
import autoRacing.Trucks;
import autoRacing.UnsuitableDriverLicenseException;

public class DriverC extends Driver<Trucks> {
    public DriverC(String lastNameFirstNamePatronymic, String driverLicense, int experience) throws UnsuitableDriverLicenseException {
        super(lastNameFirstNamePatronymic, driverLicense, experience);
        if (null == getDriverLicense() || getDriverLicense().isEmpty() || getDriverLicense().isBlank() ) {
            throw new UnsuitableDriverLicenseException("Необходимо указать тип прав");
        } else if (driverLicense != "C") {
            throw new UnsuitableDriverLicenseException("Категория прав не подходит");
        } else {
          driverLicense=driverLicense;
        }
    }


    @Override
    public String toString() {
        return "Водитель " + getLastNameFirstNamePatronymic() + " водительское удостоверение "+getDriverLicense();
    }
}

