package driver;

import autoRacing.Bus;
import autoRacing.UnsuitableDriverLicenseException;

public class DriverD extends Driver<Bus>{
    public DriverD(String lastNameFirstNamePatronymic, String driverLicense, int experience) throws UnsuitableDriverLicenseException {
        super(lastNameFirstNamePatronymic, driverLicense, experience);
        if (null == getDriverLicense() || getDriverLicense().isEmpty() || getDriverLicense().isBlank() ) {
            throw new UnsuitableDriverLicenseException("Необходимо указать тип прав");
        } else if (driverLicense != "D") {
            throw new UnsuitableDriverLicenseException("Категория прав не подходит");
        } else {
            driverLicense=driverLicense;
        }
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
