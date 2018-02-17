import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.HuangsHotelReservation.model.business.AllBusinessTests;
import com.HuangsHotelReservation.model.services.AllServiceTests;
import com.HuangsHotelReservation.model.domain.AllDomainTests;

@RunWith(Suite.class)
@SuiteClasses({AllBusinessTests.class,
	AllServiceTests.class,AllDomainTests.class})
public class ApplicationTestSuite {

}
